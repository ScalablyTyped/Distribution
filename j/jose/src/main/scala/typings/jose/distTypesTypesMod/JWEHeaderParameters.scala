package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWEHeaderParameters
  extends StObject
     with JoseHeaderParameters
     with /** Any other JWS Header member. */
/* propName */ StringDictionary[Any] {
  
  /** JWE "alg" (Algorithm) Header Parameter. */
  var alg: js.UndefOr[String] = js.undefined
  
  /** JWE "crit" (Critical) Header Parameter. */
  var crit: js.UndefOr[js.Array[String]] = js.undefined
  
  /** JWE "enc" (Encryption Algorithm) Header Parameter. */
  var enc: js.UndefOr[String] = js.undefined
  
  /** JWE "zip" (Compression Algorithm) Header Parameter. */
  var zip: js.UndefOr[String] = js.undefined
}
object JWEHeaderParameters {
  
  inline def apply(): JWEHeaderParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWEHeaderParameters]
  }
  
  extension [Self <: JWEHeaderParameters](x: Self) {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
    
    inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
    
    inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value*))
    
    inline def setEnc(value: String): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
    
    inline def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
    
    inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
