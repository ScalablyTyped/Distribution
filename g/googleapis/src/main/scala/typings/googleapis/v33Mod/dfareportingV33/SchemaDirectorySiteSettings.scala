package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site Settings
  */
trait SchemaDirectorySiteSettings extends StObject {
  
  /**
    * Whether this directory site has disabled active view creatives.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Directory site Ad Manager settings.
    */
  var dfpSettings: js.UndefOr[SchemaDfpSettings] = js.undefined
  
  /**
    * Whether this site accepts in-stream video ads.
    */
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this site accepts interstitial ads.
    */
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.undefined
}
object SchemaDirectorySiteSettings {
  
  inline def apply(): SchemaDirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteSettings]
  }
  
  extension [Self <: SchemaDirectorySiteSettings](x: Self) {
    
    inline def setActiveViewOptOut(value: Boolean): Self = StObject.set(x, "activeViewOptOut", value.asInstanceOf[js.Any])
    
    inline def setActiveViewOptOutUndefined: Self = StObject.set(x, "activeViewOptOut", js.undefined)
    
    inline def setDfpSettings(value: SchemaDfpSettings): Self = StObject.set(x, "dfpSettings", value.asInstanceOf[js.Any])
    
    inline def setDfpSettingsUndefined: Self = StObject.set(x, "dfpSettings", js.undefined)
    
    inline def setInstreamVideoPlacementAccepted(value: Boolean): Self = StObject.set(x, "instreamVideoPlacementAccepted", value.asInstanceOf[js.Any])
    
    inline def setInstreamVideoPlacementAcceptedUndefined: Self = StObject.set(x, "instreamVideoPlacementAccepted", js.undefined)
    
    inline def setInterstitialPlacementAccepted(value: Boolean): Self = StObject.set(x, "interstitialPlacementAccepted", value.asInstanceOf[js.Any])
    
    inline def setInterstitialPlacementAcceptedUndefined: Self = StObject.set(x, "interstitialPlacementAccepted", js.undefined)
  }
}
