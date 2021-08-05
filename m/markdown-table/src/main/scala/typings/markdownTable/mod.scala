package typings.markdownTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Turns a given matrix of strings (an array of arrays of strings) into a table.
    * @example
    * import table from 'markdown-table'
    *
    * table([
    *   ['Branch', 'Commit'],
    *   ['master', '0123456789abcdef'],
    *   ['staging', 'fedcba9876543210']
    * ])
    * // | Branch  | Commit           |
    * // | ------- | ---------------- |
    * // | master  | 0123456789abcdef |
    * // | staging | fedcba9876543210 |
    *
    * @example
    * table(
    *   [
    *     ['Beep', 'No.', 'Boop'],
    *     ['beep', '1024', 'xyz'],
    *     ['boop', '3388450', 'tuv'],
    *     ['foo', '10106', 'qrstuv'],
    *     ['bar', '45', 'lmno']
    *   ],
    *   {align: ['l', 'c', 'r']}
    * )
    * // | Beep |   No.   |   Boop |
    * // | :--- | :-----: | -----: |
    * // | beep |   1024  |    xyz |
    * // | boop | 3388450 |    tuv |
    * // | foo  |  10106  | qrstuv |
    * // | bar  |    45   |   lmno |
    */
  inline def apply(table: js.Array[js.Array[String]]): String = ^.asInstanceOf[js.Dynamic].apply(table.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(table: js.Array[js.Array[String]], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(table.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("markdown-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * One style for all columns (`string`), or styles for their respective columns (`string[]`).
      * Each style is either `'l'` (left), `'r'` (right), or `'c'` (center).
      * Other values are treated as `''`, which doesn't place the colon in the alignment row but does align left.
      * Only the lowercased first character is used, so `'Right'` is fine.
      */
    var align: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Whether to align the delimiters.
      *
      * By default, they are aligned:
      * ```
      * | Alpha | B     |
      * | ----- | ----- |
      * | C     | Delta |
      * ```
      *
      * Pass `false` to make them staggered:
      * ```
      * | Alpha | B |
      * | - | - |
      * | C | Delta |
      * ```
      *
      * @default true
      */
    var alignDelimiters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to end each row with the delimiter.
      * Note: please don't use this: it could create fragile structures that aren't understandable to some Markdown parsers.
      *
      * When `true`, there are ending delimiters:
      * ```
      * | Alpha | B     |
      * | ----- | ----- |
      * | C     | Delta |
      * ```
      *
      * When `false`, there are no ending delimiters:
      * ```
      * | Alpha | B
      * | ----- | -----
      * | C     | Delta
      * ```
      *
      * @default true
      */
    var delimiterEnd: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to begin each row with the delimiter.
      * Note: please don't use this: it could create fragile structures that aren't understandable to some Markdown parsers.
      *
      * When `true`, there are starting delimiters:
      * ```
      * | Alpha | B     |
      * | ----- | ----- |
      * | C     | Delta |
      * ```
      *
      * When `false`, there are no starting delimiters:
      * ```
      * Alpha | B     |
      * ----- | ----- |
      * C     | Delta |
      * ```
      *
      * @default true
      */
    var delimiterStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to add a space of padding between delimiters and cells.
      *
      * When `true`, there is padding:
      * ```
      * | Alpha | B     |
      * | ----- | ----- |
      * | C     | Delta |
      * ```
      *
      * When `false`, there is no padding:
      * ```
      * |Alpha|B    |
      * |-----|-----|
      * |C    |Delta|
      * ```
      *
      * @default true
      */
    var padding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Method to detect the length of a cell.
      *
      * Full-width characters and ANSI-sequences all mess up delimiter alignment when viewing the Markdown source.
      * To fix this, you have to pass in a `stringLength` option to detect the “visible” length of a cell
      * (note that what is and isn’t visible depends on your editor).
      *
      * Without such a function, the following:
      * ```
      * table([
      *   ['Alpha', 'Bravo'],
      *   ['中文', 'Charlie'],
      *   ['👩‍❤️‍👩', 'Delta']
      * ])
      * ```
      * Yields:
      * ```
      * | Alpha | Bravo |
      * | - | - |
      * | 中文 | Charlie |
      * | 👩‍❤️‍👩 | Delta |
      * ```
      *
      * With [`string-width`]{@link https://github.com/sindresorhus/string-width}:
      * ```
      * import width from 'string-width'
      *
      * table(
      *   [
      *     ['Alpha', 'Bravo'],
      *     ['中文', 'Charlie'],
      *     ['👩‍❤️‍👩', 'Delta']
      *   ],
      *   {stringLength: width}
      * )
      * ```
      * Yields:
      * ```
      * | Alpha | Bravo   |
      * | ----- | ------- |
      * | 中文  | Charlie |
      * | 👩‍❤️‍👩    | Delta   |
      * ```
      * @default s => s.length
      */
    var stringLength: js.UndefOr[js.Function1[/* s */ String, Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlign(value: String | js.Array[String]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignDelimiters(value: Boolean): Self = StObject.set(x, "alignDelimiters", value.asInstanceOf[js.Any])
      
      inline def setAlignDelimitersUndefined: Self = StObject.set(x, "alignDelimiters", js.undefined)
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAlignVarargs(value: String*): Self = StObject.set(x, "align", js.Array(value :_*))
      
      inline def setDelimiterEnd(value: Boolean): Self = StObject.set(x, "delimiterEnd", value.asInstanceOf[js.Any])
      
      inline def setDelimiterEndUndefined: Self = StObject.set(x, "delimiterEnd", js.undefined)
      
      inline def setDelimiterStart(value: Boolean): Self = StObject.set(x, "delimiterStart", value.asInstanceOf[js.Any])
      
      inline def setDelimiterStartUndefined: Self = StObject.set(x, "delimiterStart", js.undefined)
      
      inline def setPadding(value: Boolean): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStringLength(value: /* s */ String => Double): Self = StObject.set(x, "stringLength", js.Any.fromFunction1(value))
      
      inline def setStringLengthUndefined: Self = StObject.set(x, "stringLength", js.undefined)
    }
  }
}
