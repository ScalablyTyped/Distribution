package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the browser. */
  var displayName: js.UndefOr[String] = js.undefined
}
object BrowserTargetingOptionDetails {
  
  @scala.inline
  def apply(): BrowserTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class BrowserTargetingOptionDetailsMutableBuilder[Self <: BrowserTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
