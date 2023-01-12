package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalVertical extends StObject {
  
  var horizontal: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[String] = js.undefined
}
object HorizontalVertical {
  
  inline def apply(): HorizontalVertical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalVertical]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorizontalVertical] (val x: Self) extends AnyVal {
    
    inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
