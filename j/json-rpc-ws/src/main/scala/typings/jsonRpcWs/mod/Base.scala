package typings.jsonRpcWs.mod

import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-rpc-ws", "Base")
@js.native
class Base[TConnection /* <: Connection */] () extends js.Object {
  
  /**
    * Connected event handler
    */
  def connected(socket: ^): Unit = js.native
  
  /**
    * Disconnected event handler
    */
  def disconnected(connection: TConnection): Unit = js.native
  
  /**
    * Add a handler function for a given method
    */
  def expose[ParamType, ParamCallbackType](eventName: String, handler: Handler[TConnection, ParamType, ParamCallbackType]): Unit = js.native
  
  /**
    * Get a connection by id
    */
  def getConnection(id: String): Connection = js.native
  
  /**
    * Get handler for a given method
    */
  def getHandler[ParamType, ParamCallbackType](method: String): Handler[TConnection, ParamType, ParamCallbackType] = js.native
  
  /**
    * Shut down all existing connections
    */
  def hangup(): Unit = js.native
  
  /**
    * Test if a handler exists for a given method
    */
  def hasHandler(method: String): Boolean = js.native
  
  def send[ParamType](eventName: String, params: ParamType): Unit = js.native
  /**
    * Send a method request through a specific connection
    */
  def send[ParamType, ParamCallbackType](eventName: String): Unit = js.native
  def send[ParamType, ParamCallbackType](eventName: String, params: ParamType, callback: ReplyCallback[ParamCallbackType]): Unit = js.native
  def send[ParamType, ParamCallbackType](eventName: String, params: js.UndefOr[scala.Nothing], callback: ReplyCallback[ParamCallbackType]): Unit = js.native
  @JSName("send")
  def send_ParamTypeParamCallbackType[ParamType, ParamCallbackType](eventName: String, params: ParamType): Unit = js.native
}
