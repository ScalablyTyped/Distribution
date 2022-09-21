package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironmentVariable extends StObject {
  
  /**
    * Environment variable name as a JSON encoded string.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Environment variable value as a JSON encoded string.
    */
  var `val`: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnvironmentVariable {
  
  inline def apply(): SchemaEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentVariable]
  }
  
  extension [Self <: SchemaEnvironmentVariable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValNull: Self = StObject.set(x, "val", null)
    
    inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
  }
}
