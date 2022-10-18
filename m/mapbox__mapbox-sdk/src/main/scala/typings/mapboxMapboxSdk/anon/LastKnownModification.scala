package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.servicesStylesMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastKnownModification extends StObject {
  
  var lastKnownModification: js.UndefOr[String | Double | js.Date] = js.undefined
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var style: Style
  
  var styleId: String
}
object LastKnownModification {
  
  inline def apply(style: Style, styleId: String): LastKnownModification = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastKnownModification]
  }
  
  extension [Self <: LastKnownModification](x: Self) {
    
    inline def setLastKnownModification(value: String | Double | js.Date): Self = StObject.set(x, "lastKnownModification", value.asInstanceOf[js.Any])
    
    inline def setLastKnownModificationUndefined: Self = StObject.set(x, "lastKnownModification", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
