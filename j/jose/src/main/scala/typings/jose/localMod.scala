package typings.jose

import typings.jose.typesMod.FlattenedJWSInput
import typings.jose.typesMod.GetKeyFunction
import typings.jose.typesMod.JSONWebKeySet
import typings.jose.typesMod.JWSHeaderParameters
import typings.jose.typesMod.KeyLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localMod {
  
  @JSImport("jose/dist/types/jwks/local", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jose/dist/types/jwks/local", "LocalJWKSet")
  @js.native
  open class LocalJWKSet protected () extends StObject {
    def this(jwks: Any) = this()
    
    /* private */ var _cached: Any = js.native
    
    /* protected */ var _jwks: js.UndefOr[JSONWebKeySet] = js.native
    
    def getKey(protectedHeader: JWSHeaderParameters, token: FlattenedJWSInput): js.Promise[KeyLike] = js.native
  }
  
  inline def createLocalJWKSet(jwks: JSONWebKeySet): GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalJWKSet")(jwks.asInstanceOf[js.Any]).asInstanceOf[GetKeyFunction[JWSHeaderParameters, FlattenedJWSInput]]
  
  inline def isJWKSLike(jwks: Any): /* is jose.jose/dist/types/types.JSONWebKeySet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJWKSLike")(jwks.asInstanceOf[js.Any]).asInstanceOf[/* is jose.jose/dist/types/types.JSONWebKeySet */ Boolean]
}
