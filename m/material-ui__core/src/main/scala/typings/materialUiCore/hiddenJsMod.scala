package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenJsMod extends Shortcut {
  
  @JSImport("@material-ui/core/Hidden/HiddenJs", JSImport.Default)
  @js.native
  val default: ComponentType[HiddenJsProps] = js.native
  
  @js.native
  trait HiddenJsProps extends StObject {
    
    var initialWidth: js.UndefOr[Breakpoint] = js.native
    
    var lgDown: js.UndefOr[Boolean] = js.native
    
    var lgUp: js.UndefOr[Boolean] = js.native
    
    var mdDown: js.UndefOr[Boolean] = js.native
    
    var mdUp: js.UndefOr[Boolean] = js.native
    
    var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.native
    
    var smDown: js.UndefOr[Boolean] = js.native
    
    var smUp: js.UndefOr[Boolean] = js.native
    
    var xlDown: js.UndefOr[Boolean] = js.native
    
    var xlUp: js.UndefOr[Boolean] = js.native
    
    var xsDown: js.UndefOr[Boolean] = js.native
    
    var xsUp: js.UndefOr[Boolean] = js.native
  }
  object HiddenJsProps {
    
    @scala.inline
    def apply(): HiddenJsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenJsProps]
    }
    
    @scala.inline
    implicit class HiddenJsPropsMutableBuilder[Self <: HiddenJsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      @scala.inline
      def setLgDown(value: Boolean): Self = StObject.set(x, "lgDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgDownUndefined: Self = StObject.set(x, "lgDown", js.undefined)
      
      @scala.inline
      def setLgUp(value: Boolean): Self = StObject.set(x, "lgUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUpUndefined: Self = StObject.set(x, "lgUp", js.undefined)
      
      @scala.inline
      def setMdDown(value: Boolean): Self = StObject.set(x, "mdDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdDownUndefined: Self = StObject.set(x, "mdDown", js.undefined)
      
      @scala.inline
      def setMdUp(value: Boolean): Self = StObject.set(x, "mdUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUpUndefined: Self = StObject.set(x, "mdUp", js.undefined)
      
      @scala.inline
      def setOnly(value: Breakpoint | js.Array[Breakpoint]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setOnlyVarargs(value: Breakpoint*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      @scala.inline
      def setSmDown(value: Boolean): Self = StObject.set(x, "smDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmDownUndefined: Self = StObject.set(x, "smDown", js.undefined)
      
      @scala.inline
      def setSmUp(value: Boolean): Self = StObject.set(x, "smUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUpUndefined: Self = StObject.set(x, "smUp", js.undefined)
      
      @scala.inline
      def setXlDown(value: Boolean): Self = StObject.set(x, "xlDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlDownUndefined: Self = StObject.set(x, "xlDown", js.undefined)
      
      @scala.inline
      def setXlUp(value: Boolean): Self = StObject.set(x, "xlUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUpUndefined: Self = StObject.set(x, "xlUp", js.undefined)
      
      @scala.inline
      def setXsDown(value: Boolean): Self = StObject.set(x, "xsDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsDownUndefined: Self = StObject.set(x, "xsDown", js.undefined)
      
      @scala.inline
      def setXsUp(value: Boolean): Self = StObject.set(x, "xsUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUpUndefined: Self = StObject.set(x, "xsUp", js.undefined)
    }
  }
  
  type _To = ComponentType[HiddenJsProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenJsMod.foo` */
  override def _to: ComponentType[HiddenJsProps] = default
}
