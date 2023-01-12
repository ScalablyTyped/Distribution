package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderHover extends StObject {
  
  var border: js.UndefOr[`17`] = js.undefined
  
  var hover: js.UndefOr[`18`] = js.undefined
}
object BorderHover {
  
  inline def apply(): BorderHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderHover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderHover] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: `17`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setHover(value: `18`): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
