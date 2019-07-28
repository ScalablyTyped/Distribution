package typings.ionic.definitionsMod

import typings.ionic.Anon_Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevAppDetails extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var commPort: Double
  var interfaces: js.Array[Anon_Address]
  var port: Double
}

object DevAppDetails {
  @scala.inline
  def apply(commPort: Double, interfaces: js.Array[Anon_Address], port: Double, channel: String = null): DevAppDetails = {
    val __obj = js.Dynamic.literal(commPort = commPort, interfaces = interfaces, port = port)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    __obj.asInstanceOf[DevAppDetails]
  }
}

