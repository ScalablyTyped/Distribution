package typings.jose

import typings.jose.distTypesTypesMod.FlattenedJWSInput
import typings.jose.distTypesTypesMod.JSONWebKeySet
import typings.jose.distTypesTypesMod.JWSHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwksLocalMod {
  
  @JSImport("jose/dist/types/jwks/local", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jose/dist/types/jwks/local", "LocalJWKSet")
  @js.native
  open class LocalJWKSet[T /* <: KeyLike */] protected () extends StObject {
    def this(jwks: Any) = this()
    
    /* private */ var _cached: Any = js.native
    
    /* protected */ var _jwks: js.UndefOr[JSONWebKeySet] = js.native
    
    def getKey(): js.Promise[T] = js.native
    def getKey(protectedHeader: Unit, token: FlattenedJWSInput): js.Promise[T] = js.native
    def getKey(protectedHeader: JWSHeaderParameters): js.Promise[T] = js.native
    def getKey(protectedHeader: JWSHeaderParameters, token: FlattenedJWSInput): js.Promise[T] = js.native
  }
  
  inline def createLocalJWKSet[T /* <: KeyLike */](jwks: JSONWebKeySet): js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalJWKSet")(jwks.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ]]
  
  inline def isJWKSLike(jwks: Any): /* is jose.jose/dist/types/types.JSONWebKeySet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJWKSLike")(jwks.asInstanceOf[js.Any]).asInstanceOf[/* is jose.jose/dist/types/types.JSONWebKeySet */ Boolean]
}
