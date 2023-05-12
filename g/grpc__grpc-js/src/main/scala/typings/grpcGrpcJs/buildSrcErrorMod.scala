package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcErrorMod {
  
  @JSImport("@grpc/grpc-js/build/src/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getErrorCode(error: Any): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorCode")(error.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def getErrorMessage(error: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessage")(error.asInstanceOf[js.Any]).asInstanceOf[String]
}
