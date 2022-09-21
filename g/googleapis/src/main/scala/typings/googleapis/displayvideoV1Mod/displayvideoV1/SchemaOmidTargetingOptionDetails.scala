package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOmidTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The type of Open Measurement enabled inventory.
    */
  var omid: js.UndefOr[String | Null] = js.undefined
}
object SchemaOmidTargetingOptionDetails {
  
  inline def apply(): SchemaOmidTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOmidTargetingOptionDetails]
  }
  
  extension [Self <: SchemaOmidTargetingOptionDetails](x: Self) {
    
    inline def setOmid(value: String): Self = StObject.set(x, "omid", value.asInstanceOf[js.Any])
    
    inline def setOmidNull: Self = StObject.set(x, "omid", null)
    
    inline def setOmidUndefined: Self = StObject.set(x, "omid", js.undefined)
  }
}
