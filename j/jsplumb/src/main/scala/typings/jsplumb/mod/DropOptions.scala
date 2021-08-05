package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropOptions extends StObject {
  
  var hoverClass: String
}
object DropOptions {
  
  inline def apply(hoverClass: String): DropOptions = {
    val __obj = js.Dynamic.literal(hoverClass = hoverClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropOptions]
  }
  
  extension [Self <: DropOptions](x: Self) {
    
    inline def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
  }
}
