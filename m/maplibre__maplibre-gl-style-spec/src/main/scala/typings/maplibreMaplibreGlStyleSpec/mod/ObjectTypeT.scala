package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeT
  extends StObject
     with _Type {
  
  var kind: `object`
}
object ObjectTypeT {
  
  inline def apply(): ObjectTypeT = {
    val __obj = js.Dynamic.literal(kind = "object")
    __obj.asInstanceOf[ObjectTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: `object`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
