package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppServiceRegistration extends js.Object {
  var sender_localpart: String
}

@JSImport("matrix-appservice-bridge", "AppServiceRegistration")
@js.native
object AppServiceRegistration extends js.Object {
  def generateToken(): String = js.native
}

