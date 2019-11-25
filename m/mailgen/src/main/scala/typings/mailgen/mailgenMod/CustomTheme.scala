package typings.mailgen.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTheme extends js.Object {
  var path: String
  var plaintextPath: js.UndefOr[String] = js.undefined
}

object CustomTheme {
  @scala.inline
  def apply(path: String, plaintextPath: String = null): CustomTheme = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (plaintextPath != null) __obj.updateDynamic("plaintextPath")(plaintextPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTheme]
  }
}

