package typings.jsonrpcSerializer

import typings.jsonrpcSerializer.mod.PayloadType
import typings.jsonrpcSerializer.mod.err.ErrorName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonrpcSerializerStrings {
  
  @js.native
  sealed trait InvalidParamsError extends ErrorName
  @scala.inline
  def InvalidParamsError: InvalidParamsError = "InvalidParamsError".asInstanceOf[InvalidParamsError]
  
  @js.native
  sealed trait InvalidRequestError extends ErrorName
  @scala.inline
  def InvalidRequestError: InvalidRequestError = "InvalidRequestError".asInstanceOf[InvalidRequestError]
  
  @js.native
  sealed trait JsonRpcError extends ErrorName
  @scala.inline
  def JsonRpcError: JsonRpcError = "JsonRpcError".asInstanceOf[JsonRpcError]
  
  @js.native
  sealed trait MethodNotFoundError extends ErrorName
  @scala.inline
  def MethodNotFoundError: MethodNotFoundError = "MethodNotFoundError".asInstanceOf[MethodNotFoundError]
  
  @js.native
  sealed trait ParseError extends ErrorName
  @scala.inline
  def ParseError: ParseError = "ParseError".asInstanceOf[ParseError]
  
  @js.native
  sealed trait error extends PayloadType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait notification extends PayloadType
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait request extends PayloadType
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait success extends PayloadType
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}
