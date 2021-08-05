package typings.jose.mod

import typings.jose.joseStrings.oct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWKOctKey
  extends StObject
     with BasicParameters
     with JSONWebKey
     with _ProduceKeyInput {
  
  var k: js.UndefOr[String] = js.undefined
  
  // no x5c
  var kty: oct
}
object JWKOctKey {
  
  inline def apply(): JWKOctKey = {
    val __obj = js.Dynamic.literal(kty = "oct")
    __obj.asInstanceOf[JWKOctKey]
  }
  
  extension [Self <: JWKOctKey](x: Self) {
    
    inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    inline def setKty(value: oct): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
  }
}
