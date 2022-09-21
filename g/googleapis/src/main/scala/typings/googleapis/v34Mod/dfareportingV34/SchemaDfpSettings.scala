package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDfpSettings extends StObject {
  
  /**
    * Ad Manager network code for this directory site.
    */
  var dfpNetworkCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ad Manager network name for this directory site.
    */
  var dfpNetworkName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this directory site accepts programmatic placements.
    */
  var programmaticPlacementAccepted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this directory site accepts publisher-paid tags.
    */
  var pubPaidPlacementAccepted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this directory site is available only via Publisher Portal.
    */
  var publisherPortalOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDfpSettings {
  
  inline def apply(): SchemaDfpSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDfpSettings]
  }
  
  extension [Self <: SchemaDfpSettings](x: Self) {
    
    inline def setDfpNetworkCode(value: String): Self = StObject.set(x, "dfpNetworkCode", value.asInstanceOf[js.Any])
    
    inline def setDfpNetworkCodeNull: Self = StObject.set(x, "dfpNetworkCode", null)
    
    inline def setDfpNetworkCodeUndefined: Self = StObject.set(x, "dfpNetworkCode", js.undefined)
    
    inline def setDfpNetworkName(value: String): Self = StObject.set(x, "dfpNetworkName", value.asInstanceOf[js.Any])
    
    inline def setDfpNetworkNameNull: Self = StObject.set(x, "dfpNetworkName", null)
    
    inline def setDfpNetworkNameUndefined: Self = StObject.set(x, "dfpNetworkName", js.undefined)
    
    inline def setProgrammaticPlacementAccepted(value: Boolean): Self = StObject.set(x, "programmaticPlacementAccepted", value.asInstanceOf[js.Any])
    
    inline def setProgrammaticPlacementAcceptedNull: Self = StObject.set(x, "programmaticPlacementAccepted", null)
    
    inline def setProgrammaticPlacementAcceptedUndefined: Self = StObject.set(x, "programmaticPlacementAccepted", js.undefined)
    
    inline def setPubPaidPlacementAccepted(value: Boolean): Self = StObject.set(x, "pubPaidPlacementAccepted", value.asInstanceOf[js.Any])
    
    inline def setPubPaidPlacementAcceptedNull: Self = StObject.set(x, "pubPaidPlacementAccepted", null)
    
    inline def setPubPaidPlacementAcceptedUndefined: Self = StObject.set(x, "pubPaidPlacementAccepted", js.undefined)
    
    inline def setPublisherPortalOnly(value: Boolean): Self = StObject.set(x, "publisherPortalOnly", value.asInstanceOf[js.Any])
    
    inline def setPublisherPortalOnlyNull: Self = StObject.set(x, "publisherPortalOnly", null)
    
    inline def setPublisherPortalOnlyUndefined: Self = StObject.set(x, "publisherPortalOnly", js.undefined)
  }
}
