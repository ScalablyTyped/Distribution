package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var style: typings.mapboxMapboxSdk.stylesMod.Style
}
object Style {
  
  inline def apply(style: typings.mapboxMapboxSdk.stylesMod.Style): Style = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setStyle(value: typings.mapboxMapboxSdk.stylesMod.Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
