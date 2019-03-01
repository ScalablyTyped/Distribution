package typings
package json2mdLib.json2mdMod.json2mdNs.DefaultConvertersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converters
  extends /* converter */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var blockquote: java.lang.String | js.Array[java.lang.String]
  var code: CodeInput
  var h1: java.lang.String | js.Array[java.lang.String]
  var h2: java.lang.String | js.Array[java.lang.String]
  var h3: java.lang.String | js.Array[java.lang.String]
  var h4: java.lang.String | js.Array[java.lang.String]
  var h5: java.lang.String | js.Array[java.lang.String]
  var h6: java.lang.String | js.Array[java.lang.String]
  var img: ImgInput | js.Array[ImgInput]
  var ol: js.Array[java.lang.String]
  var p: java.lang.String | js.Array[java.lang.String]
  var table: TableInput
  var ul: js.Array[java.lang.String]
}

object Converters {
  @scala.inline
  def apply(
    blockquote: java.lang.String | js.Array[java.lang.String],
    code: CodeInput,
    h1: java.lang.String | js.Array[java.lang.String],
    h2: java.lang.String | js.Array[java.lang.String],
    h3: java.lang.String | js.Array[java.lang.String],
    h4: java.lang.String | js.Array[java.lang.String],
    h5: java.lang.String | js.Array[java.lang.String],
    h6: java.lang.String | js.Array[java.lang.String],
    img: ImgInput | js.Array[ImgInput],
    ol: js.Array[java.lang.String],
    p: java.lang.String | js.Array[java.lang.String],
    table: TableInput,
    ul: js.Array[java.lang.String],
    StringDictionary: /* converter */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Converters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockquote")(blockquote.asInstanceOf[js.Any])
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("h1")(h1.asInstanceOf[js.Any])
    __obj.updateDynamic("h2")(h2.asInstanceOf[js.Any])
    __obj.updateDynamic("h3")(h3.asInstanceOf[js.Any])
    __obj.updateDynamic("h4")(h4.asInstanceOf[js.Any])
    __obj.updateDynamic("h5")(h5.asInstanceOf[js.Any])
    __obj.updateDynamic("h6")(h6.asInstanceOf[js.Any])
    __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    __obj.updateDynamic("ol")(ol)
    __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    __obj.updateDynamic("table")(table)
    __obj.updateDynamic("ul")(ul)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Converters]
  }
}

