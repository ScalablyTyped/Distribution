package typings
package jsonDashRpcDashWsLib.jsonDashRpcDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var id: java.lang.String = js.native
  var parent: Base[_] = js.native
  var responseHandlers: org.scalablytyped.runtime.StringDictionary[ReplyCallback[_]] = js.native
  var socket: wsLib.wsMod.^ = js.native
  def close(): scala.Unit = js.native
  def close(error: js.Any): scala.Unit = js.native
  def hangup(): scala.Unit = js.native
  def hangup(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def message(data: js.Any): scala.Unit = js.native
  def processPayload[ParamType](payload: Payload[ParamType]): scala.Unit = js.native
  def sendError(error: js.Any): scala.Unit = js.native
  def sendError(error: js.Any, id: java.lang.String): scala.Unit = js.native
  def sendError(error: js.Any, id: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendMethod[ParamType, ParamCallbackType](method: java.lang.String, params: ParamType): scala.Unit = js.native
  def sendMethod[ParamType, ParamCallbackType](method: java.lang.String, params: ParamType, callback: ReplyCallback[ParamCallbackType]): scala.Unit = js.native
  def sendRaw[ParamType](payload: Payload[ParamType]): scala.Unit = js.native
  def sendResult(id: java.lang.String): scala.Unit = js.native
  def sendResult(id: java.lang.String, error: js.Any): scala.Unit = js.native
  def sendResult(id: java.lang.String, error: js.Any, result: js.Any): scala.Unit = js.native
}

