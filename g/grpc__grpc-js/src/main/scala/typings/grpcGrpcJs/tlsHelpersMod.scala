package typings.grpcGrpcJs

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tlsHelpersMod {
  
  @JSImport("@grpc/grpc-js/build/src/tls-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/tls-helpers", "CIPHER_SUITES")
  @js.native
  val CIPHER_SUITES: js.UndefOr[String] = js.native
  
  inline def getDefaultRootsData(): Buffer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRootsData")().asInstanceOf[Buffer | Null]
}
