package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerId extends StObject {
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var styleId: String
}
object OwnerId {
  
  inline def apply(styleId: String): OwnerId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerId]
  }
  
  extension [Self <: OwnerId](x: Self) {
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
