package typings.json2md.json2mdMod.DefaultConverters

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converters
  extends /* converter */ StringDictionary[js.Any] {
  var blockquote: String | js.Array[String]
  var code: CodeInput
  var h1: String | js.Array[String]
  var h2: String | js.Array[String]
  var h3: String | js.Array[String]
  var h4: String | js.Array[String]
  var h5: String | js.Array[String]
  var h6: String | js.Array[String]
  var img: ImgInput | js.Array[ImgInput]
  var ol: js.Array[String]
  var p: String | js.Array[String]
  var table: TableInput
  var ul: js.Array[String]
}

object Converters {
  @scala.inline
  def apply(
    blockquote: String | js.Array[String],
    code: CodeInput,
    h1: String | js.Array[String],
    h2: String | js.Array[String],
    h3: String | js.Array[String],
    h4: String | js.Array[String],
    h5: String | js.Array[String],
    h6: String | js.Array[String],
    img: ImgInput | js.Array[ImgInput],
    ol: js.Array[String],
    p: String | js.Array[String],
    table: TableInput,
    ul: js.Array[String],
    StringDictionary: /* converter */ StringDictionary[js.Any] = null
  ): Converters = {
    val __obj = js.Dynamic.literal(blockquote = blockquote.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Converters]
  }
}

