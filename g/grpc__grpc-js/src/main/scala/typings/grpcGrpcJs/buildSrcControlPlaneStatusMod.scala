package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.Code
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcControlPlaneStatusMod {
  
  @JSImport("@grpc/grpc-js/build/src/control-plane-status", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def restrictControlPlaneStatusCode(code: Status, details: String): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("restrictControlPlaneStatusCode")(code.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Code]
}
