package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppCategoryTargetingOptionDetails extends StObject {
  
  /** Output only. The name of the app collection. */
  var displayName: js.UndefOr[String] = js.undefined
}
object AppCategoryTargetingOptionDetails {
  
  inline def apply(): AppCategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCategoryTargetingOptionDetails]
  }
  
  extension [Self <: AppCategoryTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
