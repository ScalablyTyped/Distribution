package typings.jose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactJWEHeaderParameters
  extends StObject
     with JWEHeaderParameters {
  
  @JSName("alg")
  var alg_CompactJWEHeaderParameters: String
  
  @JSName("enc")
  var enc_CompactJWEHeaderParameters: String
}
object CompactJWEHeaderParameters {
  
  inline def apply(alg: String, enc: String): CompactJWEHeaderParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], enc = enc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactJWEHeaderParameters]
  }
  
  extension [Self <: CompactJWEHeaderParameters](x: Self) {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setEnc(value: String): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
  }
}
