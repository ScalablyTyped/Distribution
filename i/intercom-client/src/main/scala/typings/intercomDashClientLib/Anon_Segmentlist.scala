package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Segmentlist extends js.Object {
  var segments: js.Array[intercomDashClientLib.userMod.Segment]
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.segmentDOTlist
}

object Anon_Segmentlist {
  @scala.inline
  def apply(
    segments: js.Array[intercomDashClientLib.userMod.Segment],
    `type`: intercomDashClientLib.intercomDashClientLibStrings.segmentDOTlist
  ): Anon_Segmentlist = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("segments")(segments)
    __obj.asInstanceOf[Anon_Segmentlist]
  }
}

