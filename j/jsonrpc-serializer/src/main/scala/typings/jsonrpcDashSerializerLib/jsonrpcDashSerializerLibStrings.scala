package typings
package jsonrpcDashSerializerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsonrpcDashSerializerLibStrings {
  @js.native
  sealed trait InvalidParamsError extends js.Object
  
  @js.native
  sealed trait InvalidRequestError extends js.Object
  
  @js.native
  sealed trait JsonRpcError extends js.Object
  
  @js.native
  sealed trait MethodNotFoundError extends js.Object
  
  @js.native
  sealed trait ParseError extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait notification extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  def InvalidParamsError: InvalidParamsError = "InvalidParamsError".asInstanceOf[InvalidParamsError]
  def InvalidRequestError: InvalidRequestError = "InvalidRequestError".asInstanceOf[InvalidRequestError]
  def JsonRpcError: JsonRpcError = "JsonRpcError".asInstanceOf[JsonRpcError]
  def MethodNotFoundError: MethodNotFoundError = "MethodNotFoundError".asInstanceOf[MethodNotFoundError]
  def ParseError: ParseError = "ParseError".asInstanceOf[ParseError]
  def error: error = "error".asInstanceOf[error]
  def notification: notification = "notification".asInstanceOf[notification]
  def request: request = "request".asInstanceOf[request]
  def success: success = "success".asInstanceOf[success]
}

