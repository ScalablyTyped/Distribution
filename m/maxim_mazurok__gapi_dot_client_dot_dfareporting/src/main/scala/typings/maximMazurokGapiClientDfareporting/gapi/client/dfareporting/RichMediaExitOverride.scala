package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichMediaExitOverride extends StObject {
  
  /** Click-through URL of this rich media exit override. Applicable if the enabled field is set to true. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  
  /** Whether to use the clickThroughUrl. If false, the creative-level exit will be used. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** ID for the override to refer to a specific exit in the creative. */
  var exitId: js.UndefOr[String] = js.undefined
}
object RichMediaExitOverride {
  
  inline def apply(): RichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichMediaExitOverride]
  }
  
  extension [Self <: RichMediaExitOverride](x: Self) {
    
    inline def setClickThroughUrl(value: ClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExitId(value: String): Self = StObject.set(x, "exitId", value.asInstanceOf[js.Any])
    
    inline def setExitIdUndefined: Self = StObject.set(x, "exitId", js.undefined)
  }
}
