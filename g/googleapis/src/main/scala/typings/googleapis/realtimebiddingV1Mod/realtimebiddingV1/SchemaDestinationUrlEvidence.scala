package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationUrlEvidence extends StObject {
  
  /**
    * The full landing page URL of the destination.
    */
  var destinationUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestinationUrlEvidence {
  
  inline def apply(): SchemaDestinationUrlEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationUrlEvidence]
  }
  
  extension [Self <: SchemaDestinationUrlEvidence](x: Self) {
    
    inline def setDestinationUrl(value: String): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    inline def setDestinationUrlNull: Self = StObject.set(x, "destinationUrl", null)
    
    inline def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
  }
}
