package typings.jupyterYdoc.libApiMod

import typings.jupyterYdoc.anon.Delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceChange extends StObject {
  
  /**
    * Text source change
    */
  var sourceChange: js.UndefOr[Delta[String]] = js.undefined
}
object SourceChange {
  
  inline def apply(): SourceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceChange] (val x: Self) extends AnyVal {
    
    inline def setSourceChange(value: Delta[String]): Self = StObject.set(x, "sourceChange", value.asInstanceOf[js.Any])
    
    inline def setSourceChangeUndefined: Self = StObject.set(x, "sourceChange", js.undefined)
    
    inline def setSourceChangeVarargs(value: Delete[String]*): Self = StObject.set(x, "sourceChange", js.Array(value*))
  }
}
