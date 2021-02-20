package typings.mapboxMapboxSdk.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastKnownModification extends StObject {
  
  var lastKnownModification: js.UndefOr[String | Double | Date] = js.native
  
  var ownerId: js.UndefOr[String] = js.native
  
  var style: typings.mapboxMapboxSdk.stylesMod.Style = js.native
  
  var styleId: String = js.native
}
object LastKnownModification {
  
  @scala.inline
  def apply(style: typings.mapboxMapboxSdk.stylesMod.Style, styleId: String): LastKnownModification = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastKnownModification]
  }
  
  @scala.inline
  implicit class LastKnownModificationMutableBuilder[Self <: LastKnownModification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastKnownModification(value: String | Double | Date): Self = StObject.set(x, "lastKnownModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastKnownModificationUndefined: Self = StObject.set(x, "lastKnownModification", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    @scala.inline
    def setStyle(value: typings.mapboxMapboxSdk.stylesMod.Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
