package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathSegment extends StObject {
  
  /**
    * If specified, use the key to retrieve the value in a Struct.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaPathSegment {
  
  inline def apply(): SchemaPathSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathSegment]
  }
  
  extension [Self <: SchemaPathSegment](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
