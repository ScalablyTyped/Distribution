package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenCssMod extends Shortcut {
  
  @JSImport("@material-ui/core/Hidden/HiddenCss", JSImport.Default)
  @js.native
  val default: ComponentType[HiddenCssProps] = js.native
  
  trait HiddenCssProps extends StObject {
    
    var lgDown: js.UndefOr[Boolean] = js.undefined
    
    var lgUp: js.UndefOr[Boolean] = js.undefined
    
    var mdDown: js.UndefOr[Boolean] = js.undefined
    
    var mdUp: js.UndefOr[Boolean] = js.undefined
    
    var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.undefined
    
    var smDown: js.UndefOr[Boolean] = js.undefined
    
    var smUp: js.UndefOr[Boolean] = js.undefined
    
    var xlDown: js.UndefOr[Boolean] = js.undefined
    
    var xlUp: js.UndefOr[Boolean] = js.undefined
    
    var xsDown: js.UndefOr[Boolean] = js.undefined
    
    var xsUp: js.UndefOr[Boolean] = js.undefined
  }
  object HiddenCssProps {
    
    inline def apply(): HiddenCssProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenCssProps]
    }
    
    extension [Self <: HiddenCssProps](x: Self) {
      
      inline def setLgDown(value: Boolean): Self = StObject.set(x, "lgDown", value.asInstanceOf[js.Any])
      
      inline def setLgDownUndefined: Self = StObject.set(x, "lgDown", js.undefined)
      
      inline def setLgUp(value: Boolean): Self = StObject.set(x, "lgUp", value.asInstanceOf[js.Any])
      
      inline def setLgUpUndefined: Self = StObject.set(x, "lgUp", js.undefined)
      
      inline def setMdDown(value: Boolean): Self = StObject.set(x, "mdDown", value.asInstanceOf[js.Any])
      
      inline def setMdDownUndefined: Self = StObject.set(x, "mdDown", js.undefined)
      
      inline def setMdUp(value: Boolean): Self = StObject.set(x, "mdUp", value.asInstanceOf[js.Any])
      
      inline def setMdUpUndefined: Self = StObject.set(x, "mdUp", js.undefined)
      
      inline def setOnly(value: Breakpoint | js.Array[Breakpoint]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOnlyVarargs(value: Breakpoint*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      inline def setSmDown(value: Boolean): Self = StObject.set(x, "smDown", value.asInstanceOf[js.Any])
      
      inline def setSmDownUndefined: Self = StObject.set(x, "smDown", js.undefined)
      
      inline def setSmUp(value: Boolean): Self = StObject.set(x, "smUp", value.asInstanceOf[js.Any])
      
      inline def setSmUpUndefined: Self = StObject.set(x, "smUp", js.undefined)
      
      inline def setXlDown(value: Boolean): Self = StObject.set(x, "xlDown", value.asInstanceOf[js.Any])
      
      inline def setXlDownUndefined: Self = StObject.set(x, "xlDown", js.undefined)
      
      inline def setXlUp(value: Boolean): Self = StObject.set(x, "xlUp", value.asInstanceOf[js.Any])
      
      inline def setXlUpUndefined: Self = StObject.set(x, "xlUp", js.undefined)
      
      inline def setXsDown(value: Boolean): Self = StObject.set(x, "xsDown", value.asInstanceOf[js.Any])
      
      inline def setXsDownUndefined: Self = StObject.set(x, "xsDown", js.undefined)
      
      inline def setXsUp(value: Boolean): Self = StObject.set(x, "xsUp", value.asInstanceOf[js.Any])
      
      inline def setXsUpUndefined: Self = StObject.set(x, "xsUp", js.undefined)
    }
  }
  
  type _To = ComponentType[HiddenCssProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenCssMod.foo` */
  override def _to: ComponentType[HiddenCssProps] = default
}
