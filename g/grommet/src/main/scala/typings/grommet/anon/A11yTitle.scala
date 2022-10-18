package typings.grommet.anon

import typings.grommet.componentsVideoMod.controlsItems
import typings.grommet.utilsMod.A11yTitleType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A11yTitle
  extends StObject
     with controlsItems {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  
  var icon: js.UndefOr[ReactNode] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object A11yTitle {
  
  inline def apply(): A11yTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A11yTitle]
  }
  
  extension [Self <: A11yTitle](x: Self) {
    
    inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
    
    inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
    
    inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
