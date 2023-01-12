package typings.markdownTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("markdown-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def markdownTable(table: js.Array[js.Array[js.UndefOr[String | Null]]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("markdownTable")(table.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def markdownTable(table: js.Array[js.Array[js.UndefOr[String | Null]]], options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("markdownTable")(table.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type MarkdownTableOptions = Options
  
  trait Options extends StObject {
    
    /**
      * One style for all columns, or styles for their respective columns.
      * Each style is either `'l'` (left), `'r'` (right), or `'c'` (center).
      * Other values are treated as `''`, which doesn’t place the colon in the
      * alignment row but does align left.
      * *Only the lowercased first character is used, so `Right` is fine.*
      */
    var align: js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null] = js.undefined
    
    /**
      * Whether to align the delimiters.
      * By default, they are aligned:
      *
      * ```markdown
      * | Alpha | B     |
      * | ----- | ----- |
      * | C     | Delta |
      * ```
      *
      * Pass `false` to make them staggered:
      *
      * ```markdown
      * | Alpha | B |
      * | - | - |
      * | C | Delta |
      * ```
      */
    var alignDelimiters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to end each row with the delimiter.
      *
      * > 👉 **Note**: please don’t use this: it could create fragile structures
      * > that aren’t understandable to some markdown parsers.
      *
      * When `true`, there are ending delimiters:
      *
      * ```markdown
      * | Alpha | B     |
      * | ----- | ----- |
      * | C     | Delta |
      * ```
      *
      * When `false`, there are no ending delimiters:
      *
      * ```markdown
      * | Alpha | B
      * | ----- | -----
      * | C     | Delta
      * ```
      */
    var delimiterEnd: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to begin each row with the delimiter.
      *
      * > 👉 **Note**: please don’t use this: it could create fragile structures
      * > that aren’t understandable to some markdown parsers.
      *
      * When `true`, there are starting delimiters:
      *
      * ```markdown
      * | Alpha | B     |
      * | ----- | ----- |
      * | C     | Delta |
      * ```
      *
      * When `false`, there are no starting delimiters:
      *
      * ```markdown
      * Alpha | B     |
      * ----- | ----- |
      * C     | Delta |
      * ```
      */
    var delimiterStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to add a space of padding between delimiters and cells.
      *
      * When `true`, there is padding:
      *
      * ```markdown
      * | Alpha | B     |
      * | ----- | ----- |
      * | C     | Delta |
      * ```
      *
      * When `false`, there is no padding:
      *
      * ```markdown
      * |Alpha|B    |
      * |-----|-----|
      * |C    |Delta|
      * ```
      */
    var padding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to detect the length of table cell content.
      * This is used when aligning the delimiters (`|`) between table cells.
      * Full-width characters and emoji mess up delimiter alignment when viewing
      * the markdown source.
      * To fix this, you can pass this function, which receives the cell content
      * and returns its “visible” size.
      * Note that what is and isn’t visible depends on where the text is displayed.
      *
      * Without such a function, the following:
      *
      * ```js
      * markdownTable([
      * ['Alpha', 'Bravo'],
      * ['中文', 'Charlie'],
      * ['👩‍❤️‍👩', 'Delta']
      * ])
      * ```
      *
      * Yields:
      *
      * ```markdown
      * | Alpha | Bravo |
      * | - | - |
      * | 中文 | Charlie |
      * | 👩‍❤️‍👩 | Delta |
      * ```
      *
      * With [`string-width`](https://github.com/sindresorhus/string-width):
      *
      * ```js
      * import stringWidth from 'string-width'
      *
      * markdownTable(
      * [
      * ['Alpha', 'Bravo'],
      * ['中文', 'Charlie'],
      * ['👩‍❤️‍👩', 'Delta']
      * ],
      * {stringLength: stringWidth}
      * )
      * ```
      *
      * Yields:
      *
      * ```markdown
      * | Alpha | Bravo   |
      * | ----- | ------- |
      * | 中文  | Charlie |
      * | 👩‍❤️‍👩    | Delta   |
      * ```
      */
    var stringLength: js.UndefOr[js.Function1[/* value */ String, Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: String | (js.Array[js.UndefOr[String | Null]])): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignDelimiters(value: Boolean): Self = StObject.set(x, "alignDelimiters", value.asInstanceOf[js.Any])
      
      inline def setAlignDelimitersUndefined: Self = StObject.set(x, "alignDelimiters", js.undefined)
      
      inline def setAlignNull: Self = StObject.set(x, "align", null)
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAlignVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "align", js.Array(value*))
      
      inline def setDelimiterEnd(value: Boolean): Self = StObject.set(x, "delimiterEnd", value.asInstanceOf[js.Any])
      
      inline def setDelimiterEndUndefined: Self = StObject.set(x, "delimiterEnd", js.undefined)
      
      inline def setDelimiterStart(value: Boolean): Self = StObject.set(x, "delimiterStart", value.asInstanceOf[js.Any])
      
      inline def setDelimiterStartUndefined: Self = StObject.set(x, "delimiterStart", js.undefined)
      
      inline def setPadding(value: Boolean): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStringLength(value: /* value */ String => Double): Self = StObject.set(x, "stringLength", js.Any.fromFunction1(value))
      
      inline def setStringLengthUndefined: Self = StObject.set(x, "stringLength", js.undefined)
    }
  }
}
