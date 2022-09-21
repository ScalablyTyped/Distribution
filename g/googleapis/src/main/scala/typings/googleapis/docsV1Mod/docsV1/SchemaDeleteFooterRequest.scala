package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteFooterRequest extends StObject {
  
  /**
    * The id of the footer to delete. If this footer is defined on DocumentStyle, the reference to this footer is removed, resulting in no footer of that type for the first section of the document. If this footer is defined on a SectionStyle, the reference to this footer is removed and the footer of that type is now continued from the previous section.
    */
  var footerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteFooterRequest {
  
  inline def apply(): SchemaDeleteFooterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteFooterRequest]
  }
  
  extension [Self <: SchemaDeleteFooterRequest](x: Self) {
    
    inline def setFooterId(value: String): Self = StObject.set(x, "footerId", value.asInstanceOf[js.Any])
    
    inline def setFooterIdNull: Self = StObject.set(x, "footerId", null)
    
    inline def setFooterIdUndefined: Self = StObject.set(x, "footerId", js.undefined)
  }
}
