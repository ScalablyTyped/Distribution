package typings.jsonrpcSerializer

import typings.jsonrpcSerializer.mod.PayloadType
import typings.jsonrpcSerializer.mod.err.ErrorName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsonrpcSerializerStrings {
  @js.native
  sealed trait InvalidParamsError extends ErrorName
  
  @js.native
  sealed trait InvalidRequestError extends ErrorName
  
  @js.native
  sealed trait JsonRpcError extends ErrorName
  
  @js.native
  sealed trait MethodNotFoundError extends ErrorName
  
  @js.native
  sealed trait ParseError extends ErrorName
  
  @js.native
  sealed trait error extends PayloadType
  
  @js.native
  sealed trait notification extends PayloadType
  
  @js.native
  sealed trait request extends PayloadType
  
  @js.native
  sealed trait success extends PayloadType
  
  @scala.inline
  def InvalidParamsError: InvalidParamsError = "InvalidParamsError".asInstanceOf[InvalidParamsError]
  @scala.inline
  def InvalidRequestError: InvalidRequestError = "InvalidRequestError".asInstanceOf[InvalidRequestError]
  @scala.inline
  def JsonRpcError: JsonRpcError = "JsonRpcError".asInstanceOf[JsonRpcError]
  @scala.inline
  def MethodNotFoundError: MethodNotFoundError = "MethodNotFoundError".asInstanceOf[MethodNotFoundError]
  @scala.inline
  def ParseError: ParseError = "ParseError".asInstanceOf[ParseError]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

