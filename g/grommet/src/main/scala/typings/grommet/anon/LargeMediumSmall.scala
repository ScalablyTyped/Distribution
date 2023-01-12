package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargeMediumSmall extends StObject {
  
  var large: js.UndefOr[BorderPad] = js.undefined
  
  var medium: js.UndefOr[BorderPad] = js.undefined
  
  var small: js.UndefOr[BorderPad] = js.undefined
}
object LargeMediumSmall {
  
  inline def apply(): LargeMediumSmall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LargeMediumSmall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LargeMediumSmall] (val x: Self) extends AnyVal {
    
    inline def setLarge(value: BorderPad): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: BorderPad): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: BorderPad): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
