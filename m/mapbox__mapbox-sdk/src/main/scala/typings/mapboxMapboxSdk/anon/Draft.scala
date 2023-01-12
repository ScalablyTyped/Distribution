package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draft extends StObject {
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var fresh: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[Boolean] = js.undefined
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var styleId: String
}
object Draft {
  
  inline def apply(styleId: String): Draft = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draft]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Draft] (val x: Self) extends AnyVal {
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
    
    inline def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
    
    inline def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
