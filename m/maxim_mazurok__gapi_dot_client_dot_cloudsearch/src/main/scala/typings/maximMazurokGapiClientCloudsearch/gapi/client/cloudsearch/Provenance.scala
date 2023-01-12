package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provenance extends StObject {
  
  /** Annotation blob from Annotation Service. */
  var annotationBlob: js.UndefOr[String] = js.undefined
  
  /** Canonical url of the retrieved_url, if one was resolved during retrieval, for example, if a rel="canonical" link tag was provided in the retrieved web page. */
  var canonicalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The url originally passed in the PRS request, which should be used to re-discover the content. Note that this URL may be a forwarding service or link shortener (bit.ly), so it
    * should not be assumed to be canonical, but should be used for navigation back to the original source of the itemscope.
    */
  var inputUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Contains exact types as parsed, whether or not we recognized that type at parse time. If an itemscope is created by merging SchemaOrg markup and open graph markup then the first
    * itemtype would be schemaorg type, the second would be open graph and so on. example: http://schema.org/VideoObject, og:video.movie Plain text; usually a URL
    */
  var itemtype: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The server retrieved timestamp (in msec). */
  var retrievedTimestampMsec: js.UndefOr[String] = js.undefined
  
  /** The final URL that was the actual source of the itemscope, after any redirects. */
  var retrievedUrl: js.UndefOr[String] = js.undefined
}
object Provenance {
  
  inline def apply(): Provenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Provenance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Provenance] (val x: Self) extends AnyVal {
    
    inline def setAnnotationBlob(value: String): Self = StObject.set(x, "annotationBlob", value.asInstanceOf[js.Any])
    
    inline def setAnnotationBlobUndefined: Self = StObject.set(x, "annotationBlob", js.undefined)
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setInputUrl(value: String): Self = StObject.set(x, "inputUrl", value.asInstanceOf[js.Any])
    
    inline def setInputUrlUndefined: Self = StObject.set(x, "inputUrl", js.undefined)
    
    inline def setItemtype(value: js.Array[String]): Self = StObject.set(x, "itemtype", value.asInstanceOf[js.Any])
    
    inline def setItemtypeUndefined: Self = StObject.set(x, "itemtype", js.undefined)
    
    inline def setItemtypeVarargs(value: String*): Self = StObject.set(x, "itemtype", js.Array(value*))
    
    inline def setRetrievedTimestampMsec(value: String): Self = StObject.set(x, "retrievedTimestampMsec", value.asInstanceOf[js.Any])
    
    inline def setRetrievedTimestampMsecUndefined: Self = StObject.set(x, "retrievedTimestampMsec", js.undefined)
    
    inline def setRetrievedUrl(value: String): Self = StObject.set(x, "retrievedUrl", value.asInstanceOf[js.Any])
    
    inline def setRetrievedUrlUndefined: Self = StObject.set(x, "retrievedUrl", js.undefined)
  }
}
