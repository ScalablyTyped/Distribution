package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedDocument extends StObject {
  
  /** Unique file ID. */
  var fileId: js.UndefOr[String] = js.undefined
  
  /** Justification to explain why this document is being suggested. */
  var justification: js.UndefOr[AppsDynamiteSharedJustification] = js.undefined
  
  /** Time the document was last modified. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  
  /** Used to determine which icon to render (e.g. docs, slides, sheets) */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** Title of the document. */
  var title: js.UndefOr[String] = js.undefined
  
  /** URL of the document. */
  var url: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedDocument {
  
  inline def apply(): AppsDynamiteSharedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedDocument] (val x: Self) extends AnyVal {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setJustification(value: AppsDynamiteSharedJustification): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
