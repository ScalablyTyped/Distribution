package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeListContextMod extends Shortcut {
  
  @JSImport("@material-ui/core/ListItem/MergeListContext", JSImport.Default)
  @js.native
  val default: ComponentType[MergeWithListContextProps] = js.native
  
  trait MergeWithListContextProps extends StObject {
    
    var dense: js.UndefOr[Boolean] = js.undefined
  }
  object MergeWithListContextProps {
    
    inline def apply(): MergeWithListContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeWithListContextProps]
    }
    
    extension [Self <: MergeWithListContextProps](x: Self) {
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    }
  }
  
  type _To = ComponentType[MergeWithListContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `mergeListContextMod.foo` */
  override def _to: ComponentType[MergeWithListContextProps] = default
}
