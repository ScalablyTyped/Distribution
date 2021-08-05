package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.materialUiCore.materialUiCoreStrings.css
import typings.materialUiCore.materialUiCoreStrings.js_
import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenHiddenMod extends Shortcut {
  
  @JSImport("@material-ui/core/Hidden/Hidden", JSImport.Default)
  @js.native
  val default: ComponentType[HiddenProps] = js.native
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, never, never> */
  trait HiddenProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[Partial[ClassNameMap[scala.Nothing]]] = js.undefined
    
    var implementation: js.UndefOr[js_ | css] = js.undefined
    
    var initialWidth: js.UndefOr[Breakpoint] = js.undefined
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var lgDown: js.UndefOr[Boolean] = js.undefined
    
    var lgUp: js.UndefOr[Boolean] = js.undefined
    
    var mdDown: js.UndefOr[Boolean] = js.undefined
    
    var mdUp: js.UndefOr[Boolean] = js.undefined
    
    var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.undefined
    
    var smDown: js.UndefOr[Boolean] = js.undefined
    
    var smUp: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var xlDown: js.UndefOr[Boolean] = js.undefined
    
    var xlUp: js.UndefOr[Boolean] = js.undefined
    
    var xsDown: js.UndefOr[Boolean] = js.undefined
    
    var xsUp: js.UndefOr[Boolean] = js.undefined
  }
  object HiddenProps {
    
    inline def apply(): HiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenProps]
    }
    
    extension [Self <: HiddenProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: Partial[ClassNameMap[scala.Nothing]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setImplementation(value: js_ | css): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      inline def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
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
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
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
  
  type _To = ComponentType[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenHiddenMod.foo` */
  override def _to: ComponentType[HiddenProps] = default
}
