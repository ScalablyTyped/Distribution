package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBrowserTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of the browser.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaBrowserTargetingOptionDetails {
  
  inline def apply(): SchemaBrowserTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowserTargetingOptionDetails]
  }
  
  extension [Self <: SchemaBrowserTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
