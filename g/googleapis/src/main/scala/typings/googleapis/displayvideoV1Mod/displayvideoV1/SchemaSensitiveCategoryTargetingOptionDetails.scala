package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSensitiveCategoryTargetingOptionDetails extends StObject {
  
  /**
    * Output only. An enum for the DV360 Sensitive category content classifier.
    */
  var sensitiveCategory: js.UndefOr[String | Null] = js.undefined
}
object SchemaSensitiveCategoryTargetingOptionDetails {
  
  inline def apply(): SchemaSensitiveCategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSensitiveCategoryTargetingOptionDetails]
  }
  
  extension [Self <: SchemaSensitiveCategoryTargetingOptionDetails](x: Self) {
    
    inline def setSensitiveCategory(value: String): Self = StObject.set(x, "sensitiveCategory", value.asInstanceOf[js.Any])
    
    inline def setSensitiveCategoryNull: Self = StObject.set(x, "sensitiveCategory", null)
    
    inline def setSensitiveCategoryUndefined: Self = StObject.set(x, "sensitiveCategory", js.undefined)
  }
}
