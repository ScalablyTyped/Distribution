package typings.langmap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var englishName: String
  var nativeName: String
}

object Language {
  @scala.inline
  def apply(englishName: String, nativeName: String): Language = {
    val __obj = js.Dynamic.literal(englishName = englishName.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

