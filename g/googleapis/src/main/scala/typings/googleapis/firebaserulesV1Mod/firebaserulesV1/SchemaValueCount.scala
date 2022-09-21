package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValueCount extends StObject {
  
  /**
    * The amount of times that expression returned.
    */
  var count: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The return value of the expression
    */
  var value: js.UndefOr[Any | Null] = js.undefined
}
object SchemaValueCount {
  
  inline def apply(): SchemaValueCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueCount]
  }
  
  extension [Self <: SchemaValueCount](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
