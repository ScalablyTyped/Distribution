package typings.grpcGrpcJs

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tlsHelpersMod {
  
  @JSImport("@grpc/grpc-js/build/src/tls-helpers", "CIPHER_SUITES")
  @js.native
  val CIPHER_SUITES: js.UndefOr[String] = js.native
  
  @JSImport("@grpc/grpc-js/build/src/tls-helpers", "getDefaultRootsData")
  @js.native
  def getDefaultRootsData(): Buffer | Null = js.native
}
