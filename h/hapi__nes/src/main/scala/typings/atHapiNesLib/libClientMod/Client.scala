package typings
package atHapiNesLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/nes/lib/client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, options: atHapiNesLib.libClientMod.ClientNs.ClientOptions) = this()
  var id: js.Any = js.native
  def connect(): js.Promise[_] = js.native
  def connect(options: atHapiNesLib.libClientMod.ClientNs.ClientConnectOptions): js.Promise[_] = js.native
  def disconnect(): js.Promise[_] = js.native
  def message(message: js.Any): js.Promise[_] = js.native
  def onConnect(): scala.Unit = js.native
  def onDisconnect(willReconnect: scala.Boolean, log: atHapiNesLib.Anon_Code): scala.Unit = js.native
  def onError(err: js.Any): scala.Unit = js.native
  def onUpdate(message: js.Any): scala.Unit = js.native
  def overrideReconnectionAuth(auth: js.Any): scala.Unit = js.native
  def reauthenticate(auth: js.Any): js.Promise[atHapiNesLib.atHapiNesLibNumbers.`true`] = js.native
  def request(options: atHapiNesLib.libClientMod.ClientNs.ClientRequestOptions): js.Promise[_] = js.native
    // can be `null | number` but also the "socket" value from websocket message data.
  def request(options: java.lang.String): js.Promise[_] = js.native
  def subscribe(path: java.lang.String, handler: atHapiNesLib.libClientMod.ClientNs.Handler): js.Promise[_] = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
  def unsubscribe(path: java.lang.String): js.Promise[_] = js.native
  def unsubscribe(path: java.lang.String, handler: atHapiNesLib.libClientMod.ClientNs.Handler): js.Promise[_] = js.native
}

