package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberTypeT
  extends StObject
     with _InterpolatedValueType
     with _Type {
  
  var kind: number
}
object NumberTypeT {
  
  inline def apply(): NumberTypeT = {
    val __obj = js.Dynamic.literal(kind = "number")
    __obj.asInstanceOf[NumberTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: number): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
