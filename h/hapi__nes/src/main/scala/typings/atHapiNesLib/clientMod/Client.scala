package typings
package atHapiNesLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var id: js.Any = js.native
  def connect(): js.Promise[_] = js.native
  def connect(options: ClientConnectOptions): js.Promise[_] = js.native
  def disconnect(): js.Promise[_] = js.native
  def message(message: js.Any): js.Promise[_] = js.native
  def onConnect(): scala.Unit = js.native
  def onDisconnect(willReconnect: scala.Boolean, log: atHapiNesLib.Anon_Code): scala.Unit = js.native
  def onError(err: js.Any): scala.Unit = js.native
  def onUpdate(message: js.Any): scala.Unit = js.native
  def overrideReconnectionAuth(auth: js.Any): scala.Unit = js.native
  def request(options: ClientRequestOptions): js.Promise[_] = js.native
    // can be `null | number` but also the "socket" value from websocket message data.
  def request(options: java.lang.String): js.Promise[_] = js.native
  def subscribe(path: java.lang.String, handler: Handler): js.Promise[_] = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
  def unsubscribe(path: java.lang.String, handler: Handler): js.Promise[_] = js.native
}

