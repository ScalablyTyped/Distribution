package typings.ionic.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ports extends js.Object {
  var livereloadPort: Double
  var notificationPort: Double
  var port: Double
}

object Ports {
  @scala.inline
  def apply(livereloadPort: Double, notificationPort: Double, port: Double): Ports = {
    val __obj = js.Dynamic.literal(livereloadPort = livereloadPort.asInstanceOf[js.Any], notificationPort = notificationPort.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ports]
  }
}

