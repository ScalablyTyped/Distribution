package typings.ldclientJsCommon.anon

import typings.ldclientJsCommon.mod.LDFlagValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: LDFlagValue
  var previous: LDFlagValue
}

object Current {
  @scala.inline
  def apply(current: LDFlagValue, previous: LDFlagValue): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

