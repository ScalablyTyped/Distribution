package typings.ldclientDashJsDashCommon

import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonMod.LDFlagValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: LDFlagValue
  var previous: LDFlagValue
}

object Anon_Current {
  @scala.inline
  def apply(current: LDFlagValue, previous: LDFlagValue): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Current]
  }
}

