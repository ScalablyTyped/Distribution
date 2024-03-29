package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoFormatsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormatsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Video format collection.
    */
  var videoFormats: js.UndefOr[js.Array[SchemaVideoFormat]] = js.undefined
}
object SchemaVideoFormatsListResponse {
  
  inline def apply(): SchemaVideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFormatsListResponse]
  }
  
  extension [Self <: SchemaVideoFormatsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setVideoFormats(value: js.Array[SchemaVideoFormat]): Self = StObject.set(x, "videoFormats", value.asInstanceOf[js.Any])
    
    inline def setVideoFormatsUndefined: Self = StObject.set(x, "videoFormats", js.undefined)
    
    inline def setVideoFormatsVarargs(value: SchemaVideoFormat*): Self = StObject.set(x, "videoFormats", js.Array(value*))
  }
}
