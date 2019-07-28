package typings.kafkajs.kafkajsMod.AssignerProtocolNs

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAssignmentOptions extends js.Object {
  var assignment: StringDictionary[js.Array[Double]]
  var userData: js.UndefOr[Buffer] = js.undefined
  var version: Double
}

object MemberAssignmentOptions {
  @scala.inline
  def apply(assignment: StringDictionary[js.Array[Double]], version: Double, userData: Buffer = null): MemberAssignmentOptions = {
    val __obj = js.Dynamic.literal(assignment = assignment, version = version)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[MemberAssignmentOptions]
  }
}

