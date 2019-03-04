package typings
package json2mdLib.json2mdMod.json2mdNs.DefaultConvertersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeInput extends js.Object {
  var content: java.lang.String | js.Array[java.lang.String]
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object CodeInput {
  @scala.inline
  def apply(content: java.lang.String | js.Array[java.lang.String], language: java.lang.String = null): CodeInput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[CodeInput]
  }
}

