package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeListContextMod extends Shortcut {
  
  @JSImport("@material-ui/core/ListItem/MergeListContext", JSImport.Default)
  @js.native
  val default: ComponentType[MergeWithListContextProps] = js.native
  
  @js.native
  trait MergeWithListContextProps extends StObject {
    
    var dense: js.UndefOr[Boolean] = js.native
  }
  object MergeWithListContextProps {
    
    @scala.inline
    def apply(): MergeWithListContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeWithListContextProps]
    }
    
    @scala.inline
    implicit class MergeWithListContextPropsMutableBuilder[Self <: MergeWithListContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    }
  }
  
  type _To = ComponentType[MergeWithListContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `mergeListContextMod.foo` */
  override def _to: ComponentType[MergeWithListContextProps] = default
}
