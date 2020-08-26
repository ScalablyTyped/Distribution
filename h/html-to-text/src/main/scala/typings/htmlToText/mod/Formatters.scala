package typings.htmlToText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatters extends js.Object {
  var anchor: js.UndefOr[Formatter[_]] = js.native
  var blockquote: js.UndefOr[Formatter[_]] = js.native
  var heading: js.UndefOr[Formatter[_]] = js.native
  var horizontalLine: js.UndefOr[Formatter[_]] = js.native
  var image: js.UndefOr[LeafFormatter[_]] = js.native
  var lineBreak: js.UndefOr[Formatter[_]] = js.native
  var listItem: js.UndefOr[Formatter[_]] = js.native
  var orderedList: js.UndefOr[Formatter[_]] = js.native
  var paragraph: js.UndefOr[Formatter[_]] = js.native
  var table: js.UndefOr[Formatter[_]] = js.native
  var text: js.UndefOr[LeafFormatter[_]] = js.native
  var unorderedList: js.UndefOr[Formatter[_]] = js.native
}

object Formatters {
  @scala.inline
  def apply(): Formatters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatters]
  }
  @scala.inline
  implicit class FormattersOps[Self <: Formatters] (val x: Self) extends AnyVal {
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
    def setAnchor(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("anchor", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setBlockquote(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("blockquote", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBlockquote: Self = this.set("blockquote", js.undefined)
    @scala.inline
    def setHeading(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("heading", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setHorizontalLine(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("horizontalLine", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHorizontalLine: Self = this.set("horizontalLine", js.undefined)
    @scala.inline
    def setImage(value: (_, /* options */ HtmlToTextOptions) => String): Self = this.set("image", js.Any.fromFunction2(value))
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLineBreak(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("lineBreak", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLineBreak: Self = this.set("lineBreak", js.undefined)
    @scala.inline
    def setListItem(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("listItem", js.Any.fromFunction3(value))
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
    @scala.inline
    def setOrderedList(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("orderedList", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOrderedList: Self = this.set("orderedList", js.undefined)
    @scala.inline
    def setParagraph(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("paragraph", js.Any.fromFunction3(value))
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    @scala.inline
    def setTable(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("table", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setText(value: (_, /* options */ HtmlToTextOptions) => String): Self = this.set("text", js.Any.fromFunction2(value))
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUnorderedList(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = this.set("unorderedList", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUnorderedList: Self = this.set("unorderedList", js.undefined)
  }
  
}

