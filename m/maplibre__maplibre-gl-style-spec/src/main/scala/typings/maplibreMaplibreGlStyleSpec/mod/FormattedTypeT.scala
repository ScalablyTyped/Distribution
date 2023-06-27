package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.formatted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedTypeT
  extends StObject
     with _Type {
  
  var kind: formatted
}
object FormattedTypeT {
  
  inline def apply(): FormattedTypeT = {
    val __obj = js.Dynamic.literal(kind = "formatted")
    __obj.asInstanceOf[FormattedTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormattedTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: formatted): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
