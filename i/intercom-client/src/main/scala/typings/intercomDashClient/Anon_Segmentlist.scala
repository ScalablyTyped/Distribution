package typings.intercomDashClient

import typings.intercomDashClient.intercomDashClientStrings.segmentDOTlist
import typings.intercomDashClient.userMod.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Segmentlist extends js.Object {
  var segments: js.Array[Segment]
  var `type`: segmentDOTlist
}

object Anon_Segmentlist {
  @scala.inline
  def apply(segments: js.Array[Segment], `type`: segmentDOTlist): Anon_Segmentlist = {
    val __obj = js.Dynamic.literal(segments = segments)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Segmentlist]
  }
}

