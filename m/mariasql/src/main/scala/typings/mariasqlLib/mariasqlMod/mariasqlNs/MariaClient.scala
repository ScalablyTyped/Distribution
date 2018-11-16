package typings
package mariasqlLib.mariasqlMod.mariasqlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MariaClient extends js.Object {
  var connected: scala.Boolean = js.native
  var threadId: java.lang.String = js.native
  def connect(config: ClientConfig): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def escape(query: java.lang.String): java.lang.String = js.native
  def isMariaDB(): scala.Boolean = js.native
  def on(signal: java.lang.String, cb: MariaCallBackVoid): MariaClient = js.native
  @JSName("on")
  def on_close(signal: mariasqlLib.mariasqlLibStrings.close, cb: MariaCallBackObject): MariaClient = js.native
  @JSName("on")
  def on_connect(signal: mariasqlLib.mariasqlLibStrings.connect, cb: MariaCallBackVoid): MariaClient = js.native
  @JSName("on")
  def on_error(signal: mariasqlLib.mariasqlLibStrings.error, cb: MariaCallBackError): MariaClient = js.native
  def prepare(query: java.lang.String): MariaPreparedQuery = js.native
  def query(q: java.lang.String): MariaQuery = js.native
  def query(q: java.lang.String, placeHolders: js.Array[_]): MariaQuery = js.native
  def query(q: java.lang.String, placeHolders: js.Array[_], useArray: scala.Boolean): MariaQuery = js.native
  def query(q: java.lang.String, placeHolders: Dictionary): MariaQuery = js.native
  def query(q: java.lang.String, placeHolders: Dictionary, useArray: scala.Boolean): MariaQuery = js.native
  def query(q: java.lang.String, useArray: scala.Boolean): MariaQuery = js.native
}

