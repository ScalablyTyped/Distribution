package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xsmall extends StObject {
  
  var large: js.UndefOr[IconPad] = js.undefined
  
  var medium: js.UndefOr[IconPad] = js.undefined
  
  var small: js.UndefOr[IconPad] = js.undefined
  
  var xlarge: js.UndefOr[IconPad] = js.undefined
  
  var xsmall: js.UndefOr[IconPad] = js.undefined
}
object Xsmall {
  
  inline def apply(): Xsmall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xsmall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xsmall] (val x: Self) extends AnyVal {
    
    inline def setLarge(value: IconPad): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: IconPad): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: IconPad): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setXlarge(value: IconPad): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
    
    inline def setXsmall(value: IconPad): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
    
    inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
  }
}
