package typings.json2md.mod.DefaultConverters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeInput extends js.Object {
  var content: String | js.Array[String]
  var language: js.UndefOr[String] = js.undefined
}

object CodeInput {
  @scala.inline
  def apply(content: String | js.Array[String], language: String = null): CodeInput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeInput]
  }
}

