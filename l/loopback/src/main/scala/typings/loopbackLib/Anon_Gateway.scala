package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gateway extends js.Object {
  var gateway: java.lang.String
  var port: scala.Double
}

object Anon_Gateway {
  @scala.inline
  def apply(gateway: java.lang.String, port: scala.Double): Anon_Gateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gateway")(gateway)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Anon_Gateway]
  }
}

