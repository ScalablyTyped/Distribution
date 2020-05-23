package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductType extends js.Object {
  var id: String
  var mode: String
  var name: String
  var short: String
}

object ProductType {
  @scala.inline
  def apply(id: String, mode: String, name: String, short: String): ProductType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductType]
  }
}

