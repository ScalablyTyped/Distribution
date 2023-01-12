package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabSharedModels.anon.Delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextChange extends StObject {
  
  var sourceChange: js.UndefOr[Delta[String]] = js.undefined
}
object TextChange {
  
  inline def apply(): TextChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextChange] (val x: Self) extends AnyVal {
    
    inline def setSourceChange(value: Delta[String]): Self = StObject.set(x, "sourceChange", value.asInstanceOf[js.Any])
    
    inline def setSourceChangeUndefined: Self = StObject.set(x, "sourceChange", js.undefined)
    
    inline def setSourceChangeVarargs(value: Delete[String]*): Self = StObject.set(x, "sourceChange", js.Array(value*))
  }
}
