package typings.mapboxSpritezero

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var svg: Buffer
}

object AnonId {
  @scala.inline
  def apply(id: String, svg: Buffer): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

