package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.maplibreGlStrings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullTypeT
  extends StObject
     with Type {
  
  var kind: `null`
}
object NullTypeT {
  
  inline def apply(): NullTypeT = {
    val __obj = js.Dynamic.literal(kind = "null")
    __obj.asInstanceOf[NullTypeT]
  }
  
  extension [Self <: NullTypeT](x: Self) {
    
    inline def setKind(value: `null`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
