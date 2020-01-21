package typings.hellosignEmbedded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var order: Double
}

object AnonName {
  @scala.inline
  def apply(name: String, order: Double): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

