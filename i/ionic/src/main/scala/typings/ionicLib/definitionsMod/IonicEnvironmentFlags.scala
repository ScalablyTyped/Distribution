package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicEnvironmentFlags extends js.Object {
  val confirm: scala.Boolean
  val interactive: scala.Boolean
}

object IonicEnvironmentFlags {
  @scala.inline
  def apply(confirm: scala.Boolean, interactive: scala.Boolean): IonicEnvironmentFlags = {
    val __obj = js.Dynamic.literal(confirm = confirm, interactive = interactive)
  
    __obj.asInstanceOf[IonicEnvironmentFlags]
  }
}

