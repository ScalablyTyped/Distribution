package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHTTPHeader extends StObject {
  
  /**
    * The header field name
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The header field value
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaHTTPHeader {
  
  inline def apply(): SchemaHTTPHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTPHeader]
  }
  
  extension [Self <: SchemaHTTPHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
