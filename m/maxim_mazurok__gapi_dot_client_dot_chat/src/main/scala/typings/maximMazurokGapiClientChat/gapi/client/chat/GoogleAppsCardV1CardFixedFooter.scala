package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1CardFixedFooter extends StObject {
  
  /** The primary button of the fixed footer. The button must be a text button with text and color set. */
  var primaryButton: js.UndefOr[GoogleAppsCardV1Button] = js.undefined
  
  /** The secondary button of the fixed footer. The button must be a text button with text and color set. `primaryButton` must be set if `secondaryButton` is set. */
  var secondaryButton: js.UndefOr[GoogleAppsCardV1Button] = js.undefined
}
object GoogleAppsCardV1CardFixedFooter {
  
  inline def apply(): GoogleAppsCardV1CardFixedFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1CardFixedFooter]
  }
  
  extension [Self <: GoogleAppsCardV1CardFixedFooter](x: Self) {
    
    inline def setPrimaryButton(value: GoogleAppsCardV1Button): Self = StObject.set(x, "primaryButton", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonUndefined: Self = StObject.set(x, "primaryButton", js.undefined)
    
    inline def setSecondaryButton(value: GoogleAppsCardV1Button): Self = StObject.set(x, "secondaryButton", value.asInstanceOf[js.Any])
    
    inline def setSecondaryButtonUndefined: Self = StObject.set(x, "secondaryButton", js.undefined)
  }
}
