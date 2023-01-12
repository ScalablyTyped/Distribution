package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.maplibreGlStrings.padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingTypeT
  extends StObject
     with Type {
  
  var kind: padding
}
object PaddingTypeT {
  
  inline def apply(): PaddingTypeT = {
    val __obj = js.Dynamic.literal(kind = "padding")
    __obj.asInstanceOf[PaddingTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: padding): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
