package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Possible result values from the function mock invocation.
  */
trait SchemaResult extends StObject {
  
  /**
    * The result is undefined, meaning the result could not be computed.
    */
  var undefined: js.UndefOr[SchemaEmpty] = js.undefined
  
  /**
    * The result is an actual value. The type of the value must match that of
    * the type declared by the service.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object SchemaResult {
  
  inline def apply(): SchemaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResult]
  }
  
  extension [Self <: SchemaResult](x: Self) {
    
    inline def setUndefined(value: SchemaEmpty): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    inline def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
