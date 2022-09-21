package typings.mapboxMapboxSdk.anon

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var file: Blob | js.typedarray.ArrayBuffer | String
  
  var iconId: String
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var styleId: String
}
object File {
  
  inline def apply(file: Blob | js.typedarray.ArrayBuffer | String, iconId: String, styleId: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setFile(value: Blob | js.typedarray.ArrayBuffer | String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setIconId(value: String): Self = StObject.set(x, "iconId", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
