package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAgeRangeTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The age range of an audience.
    */
  var ageRange: js.UndefOr[String | Null] = js.undefined
}
object SchemaAgeRangeTargetingOptionDetails {
  
  inline def apply(): SchemaAgeRangeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAgeRangeTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAgeRangeTargetingOptionDetails](x: Self) {
    
    inline def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeNull: Self = StObject.set(x, "ageRange", null)
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
  }
}
