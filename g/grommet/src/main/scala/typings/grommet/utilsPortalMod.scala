package typings.grommet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPortalMod {
  
  @JSImport("grommet/utils/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPortal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")().asInstanceOf[Unit]
  
  inline def expectPortal(portalId: String): ExpectPortalReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("expectPortal")(portalId.asInstanceOf[js.Any]).asInstanceOf[ExpectPortalReturn]
  
  trait ExpectPortalReturn extends StObject {
    
    def toMatchSnapshot(): Unit
  }
  object ExpectPortalReturn {
    
    inline def apply(toMatchSnapshot: () => Unit): ExpectPortalReturn = {
      val __obj = js.Dynamic.literal(toMatchSnapshot = js.Any.fromFunction0(toMatchSnapshot))
      __obj.asInstanceOf[ExpectPortalReturn]
    }
    
    extension [Self <: ExpectPortalReturn](x: Self) {
      
      inline def setToMatchSnapshot(value: () => Unit): Self = StObject.set(x, "toMatchSnapshot", js.Any.fromFunction0(value))
    }
  }
}
