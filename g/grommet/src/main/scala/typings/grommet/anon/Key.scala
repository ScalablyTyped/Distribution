package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var reduce: js.UndefOr[Boolean] = js.undefined
}
object Key {
  
  inline def apply(key: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setReduce(value: Boolean): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
  }
}
