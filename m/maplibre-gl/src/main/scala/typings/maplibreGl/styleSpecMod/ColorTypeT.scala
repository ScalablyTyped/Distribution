package typings.maplibreGl.styleSpecMod

import typings.maplibreGl.maplibreGlStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorTypeT
  extends StObject
     with Type {
  
  var kind: color
}
object ColorTypeT {
  
  inline def apply(): ColorTypeT = {
    val __obj = js.Dynamic.literal(kind = "color")
    __obj.asInstanceOf[ColorTypeT]
  }
  
  extension [Self <: ColorTypeT](x: Self) {
    
    inline def setKind(value: color): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
