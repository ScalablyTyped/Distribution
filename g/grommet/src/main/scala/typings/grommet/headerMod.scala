package typings.grommet

import typings.grommet.boxMod.BoxExtendedProps
import typings.grommet.grommetStrings.scrollup
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("grommet/components/Header", "Header")
  @js.native
  val Header: FC[HeaderExtendedProps] = js.native
  
  trait HeaderExtendedProps
    extends StObject
       with BoxExtendedProps
       with HeaderProps
  object HeaderExtendedProps {
    
    inline def apply(): HeaderExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderExtendedProps]
    }
  }
  
  trait HeaderProps extends StObject {
    
    var sticky: js.UndefOr[scrollup] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    extension [Self <: HeaderProps](x: Self) {
      
      inline def setSticky(value: scrollup): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    }
  }
}
