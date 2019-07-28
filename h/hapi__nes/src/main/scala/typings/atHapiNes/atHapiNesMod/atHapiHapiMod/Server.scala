package typings.atHapiNes.atHapiNesMod.atHapiHapiMod

import typings.atHapiNes.atHapiNesMod.ServerBroadcastOptions
import typings.atHapiNes.atHapiNesMod.ServerEachSocketOptions
import typings.atHapiNes.atHapiNesMod.ServerPublishOptions
import typings.atHapiNes.atHapiNesMod.ServerSubscriptionOptions
import typings.atHapiNes.atHapiNesMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  def broadcast(message: js.Any): Unit = js.native
  def broadcast(message: js.Any, options: ServerBroadcastOptions): Unit = js.native
  def eachSocket(each: js.Function1[/* socket */ Socket, Unit]): Unit = js.native
  def eachSocket(each: js.Function1[/* socket */ Socket, Unit], options: ServerEachSocketOptions): Unit = js.native
  def publish(path: String, message: js.Any): Unit = js.native
  def publish(path: String, message: js.Any, options: ServerPublishOptions): Unit = js.native
  def subscription(path: String): Unit = js.native
  def subscription(path: String, options: ServerSubscriptionOptions): Unit = js.native
}

