package typings
package ldclientDashJsDashCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDFlagValue
  var previous: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDFlagValue
}

object Anon_Current {
  @scala.inline
  def apply(
    current: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDFlagValue,
    previous: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDFlagValue
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, previous = previous)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

