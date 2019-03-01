package typings
package kafkajsLib.kafkajsMod.AssignerProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignerProtocolStatic extends js.Object {
  var MemberAssignment: MemberAssignment
  var MemberMetadata: MemberMetadata
}

object AssignerProtocolStatic {
  @scala.inline
  def apply(MemberAssignment: MemberAssignment, MemberMetadata: MemberMetadata): AssignerProtocolStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MemberAssignment")(MemberAssignment)
    __obj.updateDynamic("MemberMetadata")(MemberMetadata)
    __obj.asInstanceOf[AssignerProtocolStatic]
  }
}

