package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvenance extends StObject {
  
  /**
    * Annotation blob from Annotation Service.
    */
  var annotationBlob: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Canonical url of the retrieved_url, if one was resolved during retrieval, for example, if a rel="canonical" link tag was provided in the retrieved web page.
    */
  var canonicalUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The url originally passed in the PRS request, which should be used to re-discover the content. Note that this URL may be a forwarding service or link shortener (bit.ly), so it should not be assumed to be canonical, but should be used for navigation back to the original source of the itemscope.
    */
  var inputUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains exact types as parsed, whether or not we recognized that type at parse time. If an itemscope is created by merging SchemaOrg markup and open graph markup then the first itemtype would be schemaorg type, the second would be open graph and so on. example: http://schema.org/VideoObject, og:video.movie Plain text; usually a URL
    */
  var itemtype: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The server retrieved timestamp (in msec).
    */
  var retrievedTimestampMsec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The final URL that was the actual source of the itemscope, after any redirects.
    */
  var retrievedUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaProvenance {
  
  inline def apply(): SchemaProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvenance]
  }
  
  extension [Self <: SchemaProvenance](x: Self) {
    
    inline def setAnnotationBlob(value: String): Self = StObject.set(x, "annotationBlob", value.asInstanceOf[js.Any])
    
    inline def setAnnotationBlobNull: Self = StObject.set(x, "annotationBlob", null)
    
    inline def setAnnotationBlobUndefined: Self = StObject.set(x, "annotationBlob", js.undefined)
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlNull: Self = StObject.set(x, "canonicalUrl", null)
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setInputUrl(value: String): Self = StObject.set(x, "inputUrl", value.asInstanceOf[js.Any])
    
    inline def setInputUrlNull: Self = StObject.set(x, "inputUrl", null)
    
    inline def setInputUrlUndefined: Self = StObject.set(x, "inputUrl", js.undefined)
    
    inline def setItemtype(value: js.Array[String]): Self = StObject.set(x, "itemtype", value.asInstanceOf[js.Any])
    
    inline def setItemtypeNull: Self = StObject.set(x, "itemtype", null)
    
    inline def setItemtypeUndefined: Self = StObject.set(x, "itemtype", js.undefined)
    
    inline def setItemtypeVarargs(value: String*): Self = StObject.set(x, "itemtype", js.Array(value*))
    
    inline def setRetrievedTimestampMsec(value: String): Self = StObject.set(x, "retrievedTimestampMsec", value.asInstanceOf[js.Any])
    
    inline def setRetrievedTimestampMsecNull: Self = StObject.set(x, "retrievedTimestampMsec", null)
    
    inline def setRetrievedTimestampMsecUndefined: Self = StObject.set(x, "retrievedTimestampMsec", js.undefined)
    
    inline def setRetrievedUrl(value: String): Self = StObject.set(x, "retrievedUrl", value.asInstanceOf[js.Any])
    
    inline def setRetrievedUrlNull: Self = StObject.set(x, "retrievedUrl", null)
    
    inline def setRetrievedUrlUndefined: Self = StObject.set(x, "retrievedUrl", js.undefined)
  }
}
