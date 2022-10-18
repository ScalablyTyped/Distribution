package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONWebKeySet extends StObject {
  
  var keys: js.Array[JWK]
}
object JSONWebKeySet {
  
  inline def apply(keys: js.Array[JWK]): JSONWebKeySet = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONWebKeySet]
  }
  
  extension [Self <: JSONWebKeySet](x: Self) {
    
    inline def setKeys(value: js.Array[JWK]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: JWK*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
