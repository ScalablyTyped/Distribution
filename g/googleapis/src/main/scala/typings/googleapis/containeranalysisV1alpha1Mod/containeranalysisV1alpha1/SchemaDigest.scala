package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDigest extends StObject {
  
  /**
    * `SHA1`, `SHA512` etc.
    */
  var algo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value of the digest.
    */
  var digestBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaDigest {
  
  inline def apply(): SchemaDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDigest]
  }
  
  extension [Self <: SchemaDigest](x: Self) {
    
    inline def setAlgo(value: String): Self = StObject.set(x, "algo", value.asInstanceOf[js.Any])
    
    inline def setAlgoNull: Self = StObject.set(x, "algo", null)
    
    inline def setAlgoUndefined: Self = StObject.set(x, "algo", js.undefined)
    
    inline def setDigestBytes(value: String): Self = StObject.set(x, "digestBytes", value.asInstanceOf[js.Any])
    
    inline def setDigestBytesNull: Self = StObject.set(x, "digestBytes", null)
    
    inline def setDigestBytesUndefined: Self = StObject.set(x, "digestBytes", js.undefined)
  }
}
