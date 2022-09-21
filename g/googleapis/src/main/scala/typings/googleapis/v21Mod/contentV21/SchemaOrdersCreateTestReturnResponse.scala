package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCreateTestReturnResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#ordersCreateTestReturnResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the newly created test order return.
    */
  var returnId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersCreateTestReturnResponse {
  
  inline def apply(): SchemaOrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnResponse]
  }
  
  extension [Self <: SchemaOrdersCreateTestReturnResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setReturnId(value: String): Self = StObject.set(x, "returnId", value.asInstanceOf[js.Any])
    
    inline def setReturnIdNull: Self = StObject.set(x, "returnId", null)
    
    inline def setReturnIdUndefined: Self = StObject.set(x, "returnId", js.undefined)
  }
}
