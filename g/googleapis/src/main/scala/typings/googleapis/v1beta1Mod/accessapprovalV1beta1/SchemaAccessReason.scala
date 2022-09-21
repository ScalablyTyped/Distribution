package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessReason extends StObject {
  
  /**
    * More detail about certain reason types. See comments for each type above.
    */
  var detail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of access justification.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessReason {
  
  inline def apply(): SchemaAccessReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessReason]
  }
  
  extension [Self <: SchemaAccessReason](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
