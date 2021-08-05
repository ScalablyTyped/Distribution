package typings.jsonrpcSerializer

import typings.jsonrpcSerializer.mod.PayloadType
import typings.jsonrpcSerializer.mod.err.ErrorName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonrpcSerializerStrings {
  
  @js.native
  sealed trait InvalidParamsError
    extends StObject
       with ErrorName
  inline def InvalidParamsError: InvalidParamsError = "InvalidParamsError".asInstanceOf[InvalidParamsError]
  
  @js.native
  sealed trait InvalidRequestError
    extends StObject
       with ErrorName
  inline def InvalidRequestError: InvalidRequestError = "InvalidRequestError".asInstanceOf[InvalidRequestError]
  
  @js.native
  sealed trait JsonRpcError
    extends StObject
       with ErrorName
  inline def JsonRpcError: JsonRpcError = "JsonRpcError".asInstanceOf[JsonRpcError]
  
  @js.native
  sealed trait MethodNotFoundError
    extends StObject
       with ErrorName
  inline def MethodNotFoundError: MethodNotFoundError = "MethodNotFoundError".asInstanceOf[MethodNotFoundError]
  
  @js.native
  sealed trait ParseError
    extends StObject
       with ErrorName
  inline def ParseError: ParseError = "ParseError".asInstanceOf[ParseError]
  
  @js.native
  sealed trait error
    extends StObject
       with PayloadType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait notification
    extends StObject
       with PayloadType
  inline def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait request
    extends StObject
       with PayloadType
  inline def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait success
    extends StObject
       with PayloadType
  inline def success: success = "success".asInstanceOf[success]
}
