package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconId extends StObject {
  
  var iconId: String
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var styleId: String
}
object IconId {
  
  @scala.inline
  def apply(iconId: String, styleId: String): IconId = {
    val __obj = js.Dynamic.literal(iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconId]
  }
  
  @scala.inline
  implicit class IconIdMutableBuilder[Self <: IconId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconId(value: String): Self = StObject.set(x, "iconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    @scala.inline
    def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
