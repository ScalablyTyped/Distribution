package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategoryTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of the category.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaCategoryTargetingOptionDetails {
  
  inline def apply(): SchemaCategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategoryTargetingOptionDetails]
  }
  
  extension [Self <: SchemaCategoryTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
