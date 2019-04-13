package typings
package mailgenLib.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTheme extends js.Object {
  var path: java.lang.String
  var plaintextPath: js.UndefOr[java.lang.String] = js.undefined
}

object CustomTheme {
  @scala.inline
  def apply(path: java.lang.String, plaintextPath: java.lang.String = null): CustomTheme = {
    val __obj = js.Dynamic.literal(path = path)
    if (plaintextPath != null) __obj.updateDynamic("plaintextPath")(plaintextPath)
    __obj.asInstanceOf[CustomTheme]
  }
}

