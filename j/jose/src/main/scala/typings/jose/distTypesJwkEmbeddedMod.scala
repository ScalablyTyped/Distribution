package typings.jose

import typings.jose.distTypesTypesMod.FlattenedJWSInput
import typings.jose.distTypesTypesMod.JWSHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwkEmbeddedMod {
  
  @JSImport("jose/dist/types/jwk/embedded", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def EmbeddedJWK(protectedHeader: JWSHeaderParameters, token: FlattenedJWSInput): js.Promise[KeyLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeyLike]]
}
