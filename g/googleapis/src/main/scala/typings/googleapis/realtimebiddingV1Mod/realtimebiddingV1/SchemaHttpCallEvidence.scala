package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpCallEvidence extends StObject {
  
  /**
    * URLs of HTTP calls made by the creative.
    */
  var urls: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaHttpCallEvidence {
  
  inline def apply(): SchemaHttpCallEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpCallEvidence]
  }
  
  extension [Self <: SchemaHttpCallEvidence](x: Self) {
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsNull: Self = StObject.set(x, "urls", null)
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
