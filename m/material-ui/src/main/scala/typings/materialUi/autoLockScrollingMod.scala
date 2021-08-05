package typings.materialUi

import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoLockScrollingMod {
  
  @JSImport("material-ui/internal/AutoLockScrolling", JSImport.Default)
  @js.native
  class default ()
    extends Component[AutoLockScrollingProps, js.Object, js.Any]
  
  @js.native
  trait AutoLockScrolling
    extends Component[AutoLockScrollingProps, js.Object, js.Any]
  
  trait AutoLockScrollingProps
    extends StObject
       with Props[AutoLockScrolling] {
    
    var lock: Boolean
  }
  object AutoLockScrollingProps {
    
    inline def apply(lock: Boolean): AutoLockScrollingProps = {
      val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoLockScrollingProps]
    }
    
    extension [Self <: AutoLockScrollingProps](x: Self) {
      
      inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    }
  }
}
