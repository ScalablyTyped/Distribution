package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlChannel extends StObject {
  
  /**
    * Unique identifier of this URL channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsense#urlChannel.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL Pattern of this URL channel. Does not include "http://" or "https://". Example: www.example.com/home
    */
  var urlPattern: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlChannel {
  
  inline def apply(): SchemaUrlChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlChannel]
  }
  
  extension [Self <: SchemaUrlChannel](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    inline def setUrlPatternNull: Self = StObject.set(x, "urlPattern", null)
    
    inline def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
  }
}
