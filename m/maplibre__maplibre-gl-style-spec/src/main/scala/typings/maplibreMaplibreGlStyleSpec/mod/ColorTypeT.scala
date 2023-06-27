package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorTypeT
  extends StObject
     with _InterpolatedValueType
     with _Type {
  
  var kind: color
}
object ColorTypeT {
  
  inline def apply(): ColorTypeT = {
    val __obj = js.Dynamic.literal(kind = "color")
    __obj.asInstanceOf[ColorTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: color): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
