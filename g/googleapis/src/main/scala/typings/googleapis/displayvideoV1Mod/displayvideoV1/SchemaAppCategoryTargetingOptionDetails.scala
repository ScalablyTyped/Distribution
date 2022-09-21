package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppCategoryTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The name of the app collection.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppCategoryTargetingOptionDetails {
  
  inline def apply(): SchemaAppCategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppCategoryTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAppCategoryTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
