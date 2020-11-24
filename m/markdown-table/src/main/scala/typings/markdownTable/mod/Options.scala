package typings.markdownTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * One style for all columns (`string`), or styles for their respective columns (`string[]`).
    * Each style is either `'l'` (left), `'r'` (right), or `'c'` (center).
    * Other values are treated as `''`, which doesn't place the colon in the alignment row but does align left.
    * Only the lowercased first character is used, so `'Right'` is fine.
    */
  var align: js.UndefOr[String | js.Array[String]] = js.native
  
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
  var alignDelimiters: js.UndefOr[Boolean] = js.native
  
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
  var delimiterEnd: js.UndefOr[Boolean] = js.native
  
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
  var delimiterStart: js.UndefOr[Boolean] = js.native
  
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
  var padding: js.UndefOr[Boolean] = js.native
  
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
  var stringLength: js.UndefOr[js.Function1[/* s */ String, Double]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignVarargs(value: String*): Self = this.set("align", js.Array(value :_*))
    
    @scala.inline
    def setAlign(value: String | js.Array[String]): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAlignDelimiters(value: Boolean): Self = this.set("alignDelimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignDelimiters: Self = this.set("alignDelimiters", js.undefined)
    
    @scala.inline
    def setDelimiterEnd(value: Boolean): Self = this.set("delimiterEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiterEnd: Self = this.set("delimiterEnd", js.undefined)
    
    @scala.inline
    def setDelimiterStart(value: Boolean): Self = this.set("delimiterStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiterStart: Self = this.set("delimiterStart", js.undefined)
    
    @scala.inline
    def setPadding(value: Boolean): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStringLength(value: /* s */ String => Double): Self = this.set("stringLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStringLength: Self = this.set("stringLength", js.undefined)
  }
}
