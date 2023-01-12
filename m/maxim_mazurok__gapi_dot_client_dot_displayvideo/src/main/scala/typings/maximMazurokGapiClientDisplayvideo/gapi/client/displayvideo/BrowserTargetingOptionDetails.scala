package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the browser. */
  var displayName: js.UndefOr[String] = js.undefined
}
object BrowserTargetingOptionDetails {
  
  inline def apply(): BrowserTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
