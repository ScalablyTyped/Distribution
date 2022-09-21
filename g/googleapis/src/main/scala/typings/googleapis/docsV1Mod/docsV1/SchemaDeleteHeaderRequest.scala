package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteHeaderRequest extends StObject {
  
  /**
    * The id of the header to delete. If this header is defined on DocumentStyle, the reference to this header is removed, resulting in no header of that type for the first section of the document. If this header is defined on a SectionStyle, the reference to this header is removed and the header of that type is now continued from the previous section.
    */
  var headerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteHeaderRequest {
  
  inline def apply(): SchemaDeleteHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteHeaderRequest]
  }
  
  extension [Self <: SchemaDeleteHeaderRequest](x: Self) {
    
    inline def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    inline def setHeaderIdNull: Self = StObject.set(x, "headerId", null)
    
    inline def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
  }
}
