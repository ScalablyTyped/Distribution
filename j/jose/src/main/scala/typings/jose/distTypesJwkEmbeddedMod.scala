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
  
  inline def EmbeddedJWK[T /* <: KeyLike */](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")().asInstanceOf[js.Promise[T]]
  inline def EmbeddedJWK[T /* <: KeyLike */](protectedHeader: Unit, token: FlattenedJWSInput): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def EmbeddedJWK[T /* <: KeyLike */](protectedHeader: JWSHeaderParameters): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def EmbeddedJWK[T /* <: KeyLike */](protectedHeader: JWSHeaderParameters, token: FlattenedJWSInput): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("EmbeddedJWK")(protectedHeader.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
