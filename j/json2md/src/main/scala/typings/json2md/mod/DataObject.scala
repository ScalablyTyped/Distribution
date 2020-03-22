package typings.json2md.mod

import typings.json2md.mod.DefaultConverters.CodeInput
import typings.json2md.mod.DefaultConverters.ImgInput
import typings.json2md.mod.DefaultConverters.TableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ TConverter in keyof json2md.json2md.DefaultConverters.Converters ]:? json2md.json2md.DefaultConverters.Converters[TConverter]} */
trait DataObject extends js.Object {
  var blockquote: js.UndefOr[String | js.Array[String]] = js.undefined
  var code: js.UndefOr[CodeInput] = js.undefined
  var h1: js.UndefOr[String | js.Array[String]] = js.undefined
  var h2: js.UndefOr[String | js.Array[String]] = js.undefined
  var h3: js.UndefOr[String | js.Array[String]] = js.undefined
  var h4: js.UndefOr[String | js.Array[String]] = js.undefined
  var h5: js.UndefOr[String | js.Array[String]] = js.undefined
  var h6: js.UndefOr[String | js.Array[String]] = js.undefined
  var img: js.UndefOr[ImgInput | js.Array[ImgInput]] = js.undefined
  var ol: js.UndefOr[js.Array[String]] = js.undefined
  var p: js.UndefOr[String | js.Array[String]] = js.undefined
  var table: js.UndefOr[TableInput] = js.undefined
  var ul: js.UndefOr[js.Array[String]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    blockquote: String | js.Array[String] = null,
    code: CodeInput = null,
    h1: String | js.Array[String] = null,
    h2: String | js.Array[String] = null,
    h3: String | js.Array[String] = null,
    h4: String | js.Array[String] = null,
    h5: String | js.Array[String] = null,
    h6: String | js.Array[String] = null,
    img: ImgInput | js.Array[ImgInput] = null,
    ol: js.Array[String] = null,
    p: String | js.Array[String] = null,
    table: TableInput = null,
    ul: js.Array[String] = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (blockquote != null) __obj.updateDynamic("blockquote")(blockquote.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (h1 != null) __obj.updateDynamic("h1")(h1.asInstanceOf[js.Any])
    if (h2 != null) __obj.updateDynamic("h2")(h2.asInstanceOf[js.Any])
    if (h3 != null) __obj.updateDynamic("h3")(h3.asInstanceOf[js.Any])
    if (h4 != null) __obj.updateDynamic("h4")(h4.asInstanceOf[js.Any])
    if (h5 != null) __obj.updateDynamic("h5")(h5.asInstanceOf[js.Any])
    if (h6 != null) __obj.updateDynamic("h6")(h6.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (ol != null) __obj.updateDynamic("ol")(ol.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (ul != null) __obj.updateDynamic("ul")(ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

