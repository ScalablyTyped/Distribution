package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displayid extends StObject {
  
  var display_id: js.UndefOr[String] = js.undefined
}
object Displayid {
  
  inline def apply(): Displayid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Displayid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Displayid] (val x: Self) extends AnyVal {
    
    inline def setDisplay_id(value: String): Self = StObject.set(x, "display_id", value.asInstanceOf[js.Any])
    
    inline def setDisplay_idUndefined: Self = StObject.set(x, "display_id", js.undefined)
  }
}
