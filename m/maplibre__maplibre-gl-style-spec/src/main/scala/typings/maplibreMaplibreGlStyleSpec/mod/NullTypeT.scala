package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullTypeT
  extends StObject
     with _Type {
  
  var kind: `null`
}
object NullTypeT {
  
  inline def apply(): NullTypeT = {
    val __obj = js.Dynamic.literal(kind = "null")
    __obj.asInstanceOf[NullTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: `null`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
