package typings
package kafkajsLib.kafkajsMod.AssignerProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAssignmentOptions extends js.Object {
  var assignment: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  var userData: js.UndefOr[nodeLib.Buffer] = js.undefined
  var version: scala.Double
}

object MemberAssignmentOptions {
  @scala.inline
  def apply(
    assignment: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]],
    version: scala.Double,
    userData: nodeLib.Buffer = null
  ): MemberAssignmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignment")(assignment)
    __obj.updateDynamic("version")(version)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[MemberAssignmentOptions]
  }
}

