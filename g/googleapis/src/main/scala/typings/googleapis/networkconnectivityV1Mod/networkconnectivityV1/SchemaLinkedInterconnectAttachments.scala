package typings.googleapis.networkconnectivityV1Mod.networkconnectivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinkedInterconnectAttachments extends StObject {
  
  /**
    * A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
    */
  var siteToSiteDataTransfer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The URIs of linked interconnect attachment resources
    */
  var uris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaLinkedInterconnectAttachments {
  
  inline def apply(): SchemaLinkedInterconnectAttachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedInterconnectAttachments]
  }
  
  extension [Self <: SchemaLinkedInterconnectAttachments](x: Self) {
    
    inline def setSiteToSiteDataTransfer(value: Boolean): Self = StObject.set(x, "siteToSiteDataTransfer", value.asInstanceOf[js.Any])
    
    inline def setSiteToSiteDataTransferNull: Self = StObject.set(x, "siteToSiteDataTransfer", null)
    
    inline def setSiteToSiteDataTransferUndefined: Self = StObject.set(x, "siteToSiteDataTransfer", js.undefined)
    
    inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisNull: Self = StObject.set(x, "uris", null)
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value*))
  }
}
