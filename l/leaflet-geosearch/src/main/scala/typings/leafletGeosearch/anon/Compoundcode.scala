package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compoundcode extends StObject {
  
  var compound_code: String
  
  var global_code: String
}
object Compoundcode {
  
  inline def apply(compound_code: String, global_code: String): Compoundcode = {
    val __obj = js.Dynamic.literal(compound_code = compound_code.asInstanceOf[js.Any], global_code = global_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compoundcode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compoundcode] (val x: Self) extends AnyVal {
    
    inline def setCompound_code(value: String): Self = StObject.set(x, "compound_code", value.asInstanceOf[js.Any])
    
    inline def setGlobal_code(value: String): Self = StObject.set(x, "global_code", value.asInstanceOf[js.Any])
  }
}
