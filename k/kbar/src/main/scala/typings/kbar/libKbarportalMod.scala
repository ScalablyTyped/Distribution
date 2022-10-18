package typings.kbar

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKbarportalMod {
  
  @JSImport("kbar/lib/KBarPortal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def KBarPortal(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("KBarPortal")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait Props extends StObject {
    
    var children: ReactNode
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
