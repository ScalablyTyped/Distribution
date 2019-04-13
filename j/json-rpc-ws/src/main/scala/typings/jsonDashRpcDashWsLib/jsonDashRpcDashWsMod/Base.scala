package typings
package jsonDashRpcDashWsLib.jsonDashRpcDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rpc-ws", "Base")
@js.native
class Base[TConnection /* <: Connection */] () extends js.Object {
  /**
    * Connected event handler
    */
  def connected(socket: wsLib.wsMod.^): scala.Unit = js.native
  /**
    * Disconnected event handler
    */
  def disconnected(connection: TConnection): scala.Unit = js.native
  /**
    * Add a handler function for a given method
    */
  def expose[ParamType, ParamCallbackType](eventName: java.lang.String, handler: Handler[TConnection, ParamType, ParamCallbackType]): scala.Unit = js.native
  /**
    * Get a connection by id
    */
  def getConnection(id: java.lang.String): Connection = js.native
  /**
    * Get handler for a given method
    */
  def getHandler[ParamType, ParamCallbackType](method: java.lang.String): Handler[TConnection, ParamType, ParamCallbackType] = js.native
  /**
    * Shut down all existing connections
    */
  def hangup(): scala.Unit = js.native
  /**
    * Test if a handler exists for a given method
    */
  def hasHandler(method: java.lang.String): scala.Boolean = js.native
  def send[ParamType](eventName: java.lang.String, params: ParamType): scala.Unit = js.native
  /**
    * Send a method request through a specific connection
    */
  def send[ParamType, ParamCallbackType](eventName: java.lang.String): scala.Unit = js.native
  def send[ParamType, ParamCallbackType](eventName: java.lang.String, params: ParamType, callback: ReplyCallback[ParamCallbackType]): scala.Unit = js.native
  @JSName("send")
  def send_ParamTypeParamCallbackType[ParamType, ParamCallbackType](eventName: java.lang.String, params: ParamType): scala.Unit = js.native
}

