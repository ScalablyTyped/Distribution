package typings.htmlToText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  var anchor: js.UndefOr[Formatter[_]] = js.undefined
  var heading: js.UndefOr[Formatter[_]] = js.undefined
  var horizontalLine: js.UndefOr[Formatter[_]] = js.undefined
  var image: js.UndefOr[LeafFormatter[_]] = js.undefined
  var lineBreak: js.UndefOr[Formatter[_]] = js.undefined
  var listItem: js.UndefOr[Formatter[_]] = js.undefined
  var orderedList: js.UndefOr[Formatter[_]] = js.undefined
  var paragraph: js.UndefOr[Formatter[_]] = js.undefined
  var table: js.UndefOr[Formatter[_]] = js.undefined
  var text: js.UndefOr[LeafFormatter[_]] = js.undefined
  var unorderedList: js.UndefOr[Formatter[_]] = js.undefined
}

object Formatters {
  @scala.inline
  def apply(
    anchor: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null,
    heading: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null,
    horizontalLine: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null,
    image: (_, /* options */ HtmlToTextOptions) => String = null,
    lineBreak: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null,
    listItem: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null,
    orderedList: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null,
    paragraph: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null,
    table: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null,
    text: (_, /* options */ HtmlToTextOptions) => String = null,
    unorderedList: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String = null
  ): Formatters = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(js.Any.fromFunction3(anchor))
    if (heading != null) __obj.updateDynamic("heading")(js.Any.fromFunction3(heading))
    if (horizontalLine != null) __obj.updateDynamic("horizontalLine")(js.Any.fromFunction3(horizontalLine))
    if (image != null) __obj.updateDynamic("image")(js.Any.fromFunction2(image))
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(js.Any.fromFunction3(lineBreak))
    if (listItem != null) __obj.updateDynamic("listItem")(js.Any.fromFunction3(listItem))
    if (orderedList != null) __obj.updateDynamic("orderedList")(js.Any.fromFunction3(orderedList))
    if (paragraph != null) __obj.updateDynamic("paragraph")(js.Any.fromFunction3(paragraph))
    if (table != null) __obj.updateDynamic("table")(js.Any.fromFunction3(table))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction2(text))
    if (unorderedList != null) __obj.updateDynamic("unorderedList")(js.Any.fromFunction3(unorderedList))
    __obj.asInstanceOf[Formatters]
  }
}

