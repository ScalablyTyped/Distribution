package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdClient extends StObject {
  
  /** Whether this ad client is opted in to ARC. */
  var arcOptIn: js.UndefOr[Boolean] = js.undefined
  
  /** Unique identifier of this ad client. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Kind of resource this is, in this case adsensehost#adClient. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** This ad client's product code, which corresponds to the PRODUCT_CODE report dimension. */
  var productCode: js.UndefOr[String] = js.undefined
  
  /** Whether this ad client supports being reported on. */
  var supportsReporting: js.UndefOr[Boolean] = js.undefined
}
object AdClient {
  
  @scala.inline
  def apply(): AdClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdClient]
  }
  
  @scala.inline
  implicit class AdClientMutableBuilder[Self <: AdClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArcOptIn(value: Boolean): Self = StObject.set(x, "arcOptIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcOptInUndefined: Self = StObject.set(x, "arcOptIn", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProductCode(value: String): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    @scala.inline
    def setSupportsReporting(value: Boolean): Self = StObject.set(x, "supportsReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsReportingUndefined: Self = StObject.set(x, "supportsReporting", js.undefined)
  }
}
