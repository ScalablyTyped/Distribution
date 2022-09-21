package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteUrlMetadata extends StObject {
  
  /** Domain for this url. If it's an IP address the address is returned. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** The signed GWS URL. */
  var gwsUrl: js.UndefOr[SafeUrlProto] = js.undefined
  
  /** The expiration timestamp for GWS URL, only set when gws_url is set. */
  var gwsUrlExpirationTimestamp: js.UndefOr[String] = js.undefined
  
  /** Dimensions of the image: height. This field is string to match with page render service response. Deprecated. Use int_image_height instead. */
  var imageHeight: js.UndefOr[String] = js.undefined
  
  /** Representative image of the website. */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /** Dimensions of the image: width. This field is string to match with page render service response. Deprecated. Use int_image_height instead. */
  var imageWidth: js.UndefOr[String] = js.undefined
  
  /** Dimensions of the image: height. */
  var intImageHeight: js.UndefOr[Double] = js.undefined
  
  /** Dimensions of the image: width. */
  var intImageWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Mime type of the content (Currently mapped from Page Render Service ItemType) Note that this is not necessarily the mime type of the http resource. For example a text/html from
    * youtube or vimeo may actually be classified as a video type. Then we shall mark it as video/ * since we don't know exactly what type of video it is. NEXT TAG : 16
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** The stable redirect URL pointing to frontend server. */
  var redirectUrl: js.UndefOr[SafeUrlProto] = js.undefined
  
  /** If the UrlMetadata is missing data for rendering a chip. Deprecated. Use Annotation.ChipRenderType instead. */
  var shouldNotRender: js.UndefOr[Boolean] = js.undefined
  
  /** Snippet/small description of the weblink. */
  var snippet: js.UndefOr[String] = js.undefined
  
  /** Title of the Weblink. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The original URL. */
  var url: js.UndefOr[SafeUrlProto] = js.undefined
}
object AppsDynamiteUrlMetadata {
  
  inline def apply(): AppsDynamiteUrlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteUrlMetadata]
  }
  
  extension [Self <: AppsDynamiteUrlMetadata](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setGwsUrl(value: SafeUrlProto): Self = StObject.set(x, "gwsUrl", value.asInstanceOf[js.Any])
    
    inline def setGwsUrlExpirationTimestamp(value: String): Self = StObject.set(x, "gwsUrlExpirationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setGwsUrlExpirationTimestampUndefined: Self = StObject.set(x, "gwsUrlExpirationTimestamp", js.undefined)
    
    inline def setGwsUrlUndefined: Self = StObject.set(x, "gwsUrl", js.undefined)
    
    inline def setImageHeight(value: String): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    inline def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setImageWidth(value: String): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    inline def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
    
    inline def setIntImageHeight(value: Double): Self = StObject.set(x, "intImageHeight", value.asInstanceOf[js.Any])
    
    inline def setIntImageHeightUndefined: Self = StObject.set(x, "intImageHeight", js.undefined)
    
    inline def setIntImageWidth(value: Double): Self = StObject.set(x, "intImageWidth", value.asInstanceOf[js.Any])
    
    inline def setIntImageWidthUndefined: Self = StObject.set(x, "intImageWidth", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setRedirectUrl(value: SafeUrlProto): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    inline def setShouldNotRender(value: Boolean): Self = StObject.set(x, "shouldNotRender", value.asInstanceOf[js.Any])
    
    inline def setShouldNotRenderUndefined: Self = StObject.set(x, "shouldNotRender", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: SafeUrlProto): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
