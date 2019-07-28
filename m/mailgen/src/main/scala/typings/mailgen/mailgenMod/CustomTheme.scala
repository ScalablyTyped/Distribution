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
    val __obj = js.Dynamic.literal(path = path)
    if (plaintextPath != null) __obj.updateDynamic("plaintextPath")(plaintextPath)
    __obj.asInstanceOf[CustomTheme]
  }
}

