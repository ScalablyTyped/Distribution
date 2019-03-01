package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasePragma extends js.Object {
  var enableBundledMode: scala.Boolean
}

object DatabasePragma {
  @scala.inline
  def apply(enableBundledMode: scala.Boolean): DatabasePragma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enableBundledMode")(enableBundledMode)
    __obj.asInstanceOf[DatabasePragma]
  }
}

