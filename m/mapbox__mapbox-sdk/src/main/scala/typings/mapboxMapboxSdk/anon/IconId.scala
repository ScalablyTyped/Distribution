package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconId extends StObject {
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var iconId: String
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var styleId: String
}
object IconId {
  
  inline def apply(iconId: String, styleId: String): IconId = {
    val __obj = js.Dynamic.literal(iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconId] (val x: Self) extends AnyVal {
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setIconId(value: String): Self = StObject.set(x, "iconId", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
