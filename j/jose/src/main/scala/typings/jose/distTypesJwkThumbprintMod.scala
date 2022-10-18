package typings.jose

import typings.jose.distTypesTypesMod.JWK
import typings.jose.joseStrings.sha256
import typings.jose.joseStrings.sha384
import typings.jose.joseStrings.sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwkThumbprintMod {
  
  @JSImport("jose/dist/types/jwk/thumbprint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateJwkThumbprint(jwk: JWK): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprint")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def calculateJwkThumbprint(jwk: JWK, digestAlgorithm: sha256 | sha384 | sha512): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprint")(jwk.asInstanceOf[js.Any], digestAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def calculateJwkThumbprintUri(jwk: JWK): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprintUri")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def calculateJwkThumbprintUri(jwk: JWK, digestAlgorithm: sha256 | sha384 | sha512): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateJwkThumbprintUri")(jwk.asInstanceOf[js.Any], digestAlgorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
