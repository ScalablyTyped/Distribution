package typings.jsonDashRpcDashWs.jsonDashRpcDashWsMod

import org.scalablytyped.runtime.StringDictionary
import typings.ws.wsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var id: String = js.native
  var parent: Base[_] = js.native
  var responseHandlers: StringDictionary[ReplyCallback[_]] = js.native
  var socket: ^ = js.native
  def close(): Unit = js.native
  def close(error: js.Any): Unit = js.native
  def hangup(): Unit = js.native
  def hangup(callback: js.Function0[Unit]): Unit = js.native
  def message(data: js.Any): Unit = js.native
  def processPayload[ParamType](payload: Payload[ParamType]): Unit = js.native
  def sendError(error: js.Any): Unit = js.native
  def sendError(error: js.Any, id: String): Unit = js.native
  def sendError(error: js.Any, id: String, data: js.Any): Unit = js.native
  def sendMethod[ParamType, ParamCallbackType](method: String, params: ParamType): Unit = js.native
  def sendMethod[ParamType, ParamCallbackType](method: String, params: ParamType, callback: ReplyCallback[ParamCallbackType]): Unit = js.native
  def sendRaw[ParamType](payload: Payload[ParamType]): Unit = js.native
  def sendResult(id: String): Unit = js.native
  def sendResult(id: String, error: js.Any): Unit = js.native
  def sendResult(id: String, error: js.Any, result: js.Any): Unit = js.native
}

