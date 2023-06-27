package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorTypeT
  extends StObject
     with _Type {
  
  var kind: error
}
object ErrorTypeT {
  
  inline def apply(): ErrorTypeT = {
    val __obj = js.Dynamic.literal(kind = "error")
    __obj.asInstanceOf[ErrorTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: error): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
