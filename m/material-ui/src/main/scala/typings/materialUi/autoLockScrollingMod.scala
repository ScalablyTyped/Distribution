package typings.materialUi

import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoLockScrollingMod {
  
  @JSImport("material-ui/internal/AutoLockScrolling", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AutoLockScrollingProps, js.Object, Any]
  
  type AutoLockScrolling = Component[AutoLockScrollingProps, js.Object, Any]
  
  trait AutoLockScrollingProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var lock: Boolean
    
    var ref: js.UndefOr[LegacyRef[AutoLockScrolling]] = js.undefined
  }
  object AutoLockScrollingProps {
    
    inline def apply(lock: Boolean): AutoLockScrollingProps = {
      val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoLockScrollingProps]
    }
    
    extension [Self <: AutoLockScrollingProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setRef(value: LegacyRef[AutoLockScrolling]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ AutoLockScrolling | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
