package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Varargs extends StObject {
  
  var `type`: Type
}
object Varargs {
  
  inline def apply(`type`: Type): Varargs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Varargs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Varargs] (val x: Self) extends AnyVal {
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
