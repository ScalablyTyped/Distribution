package typings.intercomDashClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  val id: String
}

object Segment {
  @scala.inline
  def apply(id: String): Segment = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Segment]
  }
}

