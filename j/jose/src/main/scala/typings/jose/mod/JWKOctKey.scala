package typings.jose.mod

import typings.jose.joseStrings.oct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWKOctKey
  extends _ProduceKeyInput
     with BasicParameters
     with JSONWebKey {
  
  var k: js.UndefOr[String] = js.native
  
  // no x5c
  var kty: oct = js.native
}
object JWKOctKey {
  
  @scala.inline
  def apply(kty: oct): JWKOctKey = {
    val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKOctKey]
  }
  
  @scala.inline
  implicit class JWKOctKeyMutableBuilder[Self <: JWKOctKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    @scala.inline
    def setKty(value: oct): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
  }
}
