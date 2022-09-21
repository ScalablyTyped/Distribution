package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribution extends StObject {
  
  var attribution: js.UndefOr[js.Array[Link]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var tilesetId: String
}
object Attribution {
  
  inline def apply(tilesetId: String): Attribution = {
    val __obj = js.Dynamic.literal(tilesetId = tilesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribution]
  }
  
  extension [Self <: Attribution](x: Self) {
    
    inline def setAttribution(value: js.Array[Link]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setAttributionVarargs(value: Link*): Self = StObject.set(x, "attribution", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setTilesetId(value: String): Self = StObject.set(x, "tilesetId", value.asInstanceOf[js.Any])
  }
}
