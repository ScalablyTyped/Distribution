package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationTransferParam extends StObject {
  
  /**
    * The type of the transfer parameter. eg: 'PRIVACY_LEVEL'
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the corresponding transfer parameter. eg: 'PRIVATE' or 'SHARED'
    */
  var value: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaApplicationTransferParam {
  
  inline def apply(): SchemaApplicationTransferParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationTransferParam]
  }
  
  extension [Self <: SchemaApplicationTransferParam](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
