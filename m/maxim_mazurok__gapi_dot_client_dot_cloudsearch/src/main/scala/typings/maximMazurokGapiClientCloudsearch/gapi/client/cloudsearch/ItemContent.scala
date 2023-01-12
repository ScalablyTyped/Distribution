package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemContent extends StObject {
  
  /** Upload reference ID of a previously uploaded content via write method. */
  var contentDataRef: js.UndefOr[UploadItemRef] = js.undefined
  
  var contentFormat: js.UndefOr[String] = js.undefined
  
  /** Hashing info calculated and provided by the API client for content. Can be used with the items.push method to calculate modified state. The maximum length is 2048 characters. */
  var hash: js.UndefOr[String] = js.undefined
  
  /** Content that is supplied inlined within the update method. The maximum length is 102400 bytes (100 KiB). */
  var inlineContent: js.UndefOr[String] = js.undefined
}
object ItemContent {
  
  inline def apply(): ItemContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemContent] (val x: Self) extends AnyVal {
    
    inline def setContentDataRef(value: UploadItemRef): Self = StObject.set(x, "contentDataRef", value.asInstanceOf[js.Any])
    
    inline def setContentDataRefUndefined: Self = StObject.set(x, "contentDataRef", js.undefined)
    
    inline def setContentFormat(value: String): Self = StObject.set(x, "contentFormat", value.asInstanceOf[js.Any])
    
    inline def setContentFormatUndefined: Self = StObject.set(x, "contentFormat", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setInlineContent(value: String): Self = StObject.set(x, "inlineContent", value.asInstanceOf[js.Any])
    
    inline def setInlineContentUndefined: Self = StObject.set(x, "inlineContent", js.undefined)
  }
}
