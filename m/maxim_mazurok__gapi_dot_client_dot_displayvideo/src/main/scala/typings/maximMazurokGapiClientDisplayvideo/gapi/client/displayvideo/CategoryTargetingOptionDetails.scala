package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the category. */
  var displayName: js.UndefOr[String] = js.undefined
}
object CategoryTargetingOptionDetails {
  
  inline def apply(): CategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryTargetingOptionDetails]
  }
  
  extension [Self <: CategoryTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
