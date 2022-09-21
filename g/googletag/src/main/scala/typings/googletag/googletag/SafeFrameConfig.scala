package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration object for [SafeFrame](https://support.google.com/admanager/answer/6023110) containers.
  *
  * **See also**
  * - {@link PubAdsService.setSafeFrameConfig}
  */
trait SafeFrameConfig extends StObject {
  
  /**
    * Whether SafeFrame should allow ad content to expand by overlaying page content.
    */
  var allowOverlayExpansion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether SafeFrame should allow ad content to expand by pushing page content.
    */
  var allowPushExpansion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether SafeFrame should use the HTML5 sandbox attribute to prevent top level navigation without user interaction.
    * The only valid value is `true` (cannot be forced to `false`). Note that the sandbox attribute disables plugins (e.g. Flash).
    */
  var sandbox: js.UndefOr[Boolean] = js.undefined
}
object SafeFrameConfig {
  
  inline def apply(): SafeFrameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeFrameConfig]
  }
  
  extension [Self <: SafeFrameConfig](x: Self) {
    
    inline def setAllowOverlayExpansion(value: Boolean): Self = StObject.set(x, "allowOverlayExpansion", value.asInstanceOf[js.Any])
    
    inline def setAllowOverlayExpansionUndefined: Self = StObject.set(x, "allowOverlayExpansion", js.undefined)
    
    inline def setAllowPushExpansion(value: Boolean): Self = StObject.set(x, "allowPushExpansion", value.asInstanceOf[js.Any])
    
    inline def setAllowPushExpansionUndefined: Self = StObject.set(x, "allowPushExpansion", js.undefined)
    
    inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
  }
}
