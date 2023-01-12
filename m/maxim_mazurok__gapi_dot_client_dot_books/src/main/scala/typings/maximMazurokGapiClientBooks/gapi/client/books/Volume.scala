package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.AccessViewStatus
import typings.maximMazurokGapiClientBooks.anon.AcquiredTime
import typings.maximMazurokGapiClientBooks.anon.AllowAnonLogging
import typings.maximMazurokGapiClientBooks.anon.BuyLink
import typings.maximMazurokGapiClientBooks.anon.Explanation
import typings.maximMazurokGapiClientBooks.anon.Layers
import typings.maximMazurokGapiClientBooks.anon.TextSnippet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /**
    * Any information about a volume related to reading or obtaining that volume text. This information can depend on country (books may be public domain in one country but not in
    * another, e.g.).
    */
  var accessInfo: js.UndefOr[AccessViewStatus] = js.undefined
  
  /** Opaque identifier for a specific version of a volume resource. (In LITE projection) */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for a volume. (In LITE projection.) */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource type for a volume. (In LITE projection.) */
  var kind: js.UndefOr[String] = js.undefined
  
  /** What layers exist in this volume and high level information about them. */
  var layerInfo: js.UndefOr[Layers] = js.undefined
  
  /** Recommendation related information for this volume. */
  var recommendedInfo: js.UndefOr[Explanation] = js.undefined
  
  /**
    * Any information about a volume related to the eBookstore and/or purchaseability. This information can depend on the country where the request originates from (i.e. books may not be
    * for sale in certain countries).
    */
  var saleInfo: js.UndefOr[BuyLink] = js.undefined
  
  /** Search result information related to this volume. */
  var searchInfo: js.UndefOr[TextSnippet] = js.undefined
  
  /** URL to this resource. (In LITE projection.) */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** User specific information related to this volume. (e.g. page this user last read or whether they purchased this book) */
  var userInfo: js.UndefOr[AcquiredTime] = js.undefined
  
  /** General volume information. */
  var volumeInfo: js.UndefOr[AllowAnonLogging] = js.undefined
}
object Volume {
  
  inline def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    inline def setAccessInfo(value: AccessViewStatus): Self = StObject.set(x, "accessInfo", value.asInstanceOf[js.Any])
    
    inline def setAccessInfoUndefined: Self = StObject.set(x, "accessInfo", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayerInfo(value: Layers): Self = StObject.set(x, "layerInfo", value.asInstanceOf[js.Any])
    
    inline def setLayerInfoUndefined: Self = StObject.set(x, "layerInfo", js.undefined)
    
    inline def setRecommendedInfo(value: Explanation): Self = StObject.set(x, "recommendedInfo", value.asInstanceOf[js.Any])
    
    inline def setRecommendedInfoUndefined: Self = StObject.set(x, "recommendedInfo", js.undefined)
    
    inline def setSaleInfo(value: BuyLink): Self = StObject.set(x, "saleInfo", value.asInstanceOf[js.Any])
    
    inline def setSaleInfoUndefined: Self = StObject.set(x, "saleInfo", js.undefined)
    
    inline def setSearchInfo(value: TextSnippet): Self = StObject.set(x, "searchInfo", value.asInstanceOf[js.Any])
    
    inline def setSearchInfoUndefined: Self = StObject.set(x, "searchInfo", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUserInfo(value: AcquiredTime): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    
    inline def setVolumeInfo(value: AllowAnonLogging): Self = StObject.set(x, "volumeInfo", value.asInstanceOf[js.Any])
    
    inline def setVolumeInfoUndefined: Self = StObject.set(x, "volumeInfo", js.undefined)
  }
}
