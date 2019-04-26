package typings
package atHapiNesLib.atHapiNesMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  def broadcast(message: js.Any): scala.Unit = js.native
  def broadcast(message: js.Any, options: atHapiNesLib.atHapiNesMod.ServerBroadcastOptions): scala.Unit = js.native
  def eachSocket(each: js.Function1[/* socket */ atHapiNesLib.atHapiNesMod.Socket, scala.Unit]): scala.Unit = js.native
  def eachSocket(
    each: js.Function1[/* socket */ atHapiNesLib.atHapiNesMod.Socket, scala.Unit],
    options: atHapiNesLib.atHapiNesMod.ServerEachSocketOptions
  ): scala.Unit = js.native
  def publish(path: java.lang.String, message: js.Any): scala.Unit = js.native
  def publish(path: java.lang.String, message: js.Any, options: atHapiNesLib.atHapiNesMod.ServerPublishOptions): scala.Unit = js.native
  def subscription(path: java.lang.String): scala.Unit = js.native
  def subscription(path: java.lang.String, options: atHapiNesLib.atHapiNesMod.ServerSubscriptionOptions): scala.Unit = js.native
}

