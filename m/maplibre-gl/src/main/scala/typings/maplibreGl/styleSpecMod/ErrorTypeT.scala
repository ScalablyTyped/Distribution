package typings.maplibreGl.styleSpecMod

import typings.maplibreGl.maplibreGlStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorTypeT
  extends StObject
     with Type {
  
  var kind: error
}
object ErrorTypeT {
  
  inline def apply(): ErrorTypeT = {
    val __obj = js.Dynamic.literal(kind = "error")
    __obj.asInstanceOf[ErrorTypeT]
  }
  
  extension [Self <: ErrorTypeT](x: Self) {
    
    inline def setKind(value: error): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
