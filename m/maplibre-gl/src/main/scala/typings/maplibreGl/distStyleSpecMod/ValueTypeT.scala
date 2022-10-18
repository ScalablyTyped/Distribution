package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.maplibreGlStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueTypeT
  extends StObject
     with Type {
  
  var kind: value
}
object ValueTypeT {
  
  inline def apply(): ValueTypeT = {
    val __obj = js.Dynamic.literal(kind = "value")
    __obj.asInstanceOf[ValueTypeT]
  }
  
  extension [Self <: ValueTypeT](x: Self) {
    
    inline def setKind(value: value): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
