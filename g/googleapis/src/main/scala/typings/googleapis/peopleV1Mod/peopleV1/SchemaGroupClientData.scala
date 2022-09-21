package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupClientData extends StObject {
  
  /**
    * The client specified key of the client data.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The client specified value of the client data.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroupClientData {
  
  inline def apply(): SchemaGroupClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupClientData]
  }
  
  extension [Self <: SchemaGroupClientData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
