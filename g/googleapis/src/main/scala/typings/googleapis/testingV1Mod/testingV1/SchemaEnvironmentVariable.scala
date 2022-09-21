package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironmentVariable extends StObject {
  
  /**
    * Key for the environment variable.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value for the environment variable.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnvironmentVariable {
  
  inline def apply(): SchemaEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentVariable]
  }
  
  extension [Self <: SchemaEnvironmentVariable](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
