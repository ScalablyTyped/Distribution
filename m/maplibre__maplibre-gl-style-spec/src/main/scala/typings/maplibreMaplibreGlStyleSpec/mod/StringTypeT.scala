package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTypeT
  extends StObject
     with _Type {
  
  var kind: string
}
object StringTypeT {
  
  inline def apply(): StringTypeT = {
    val __obj = js.Dynamic.literal(kind = "string")
    __obj.asInstanceOf[StringTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: string): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
