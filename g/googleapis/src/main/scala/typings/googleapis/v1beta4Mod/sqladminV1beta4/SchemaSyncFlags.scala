package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSyncFlags extends StObject {
  
  /**
    * The name of the flag.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the flag. This field must be omitted if the flag doesn't take a value.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaSyncFlags {
  
  inline def apply(): SchemaSyncFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncFlags]
  }
  
  extension [Self <: SchemaSyncFlags](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
