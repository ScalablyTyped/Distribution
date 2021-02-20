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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenHiddenMod extends Shortcut {
  
  @JSImport("@material-ui/core/Hidden/Hidden", JSImport.Default)
  @js.native
  val default: ComponentType[HiddenProps] = js.native
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, never, never> */
  @js.native
  trait HiddenProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[Partial[ClassNameMap[scala.Nothing]]] = js.native
    
    var implementation: js.UndefOr[js_ | css] = js.native
    
    var initialWidth: js.UndefOr[Breakpoint] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
    
    var lgDown: js.UndefOr[Boolean] = js.native
    
    var lgUp: js.UndefOr[Boolean] = js.native
    
    var mdDown: js.UndefOr[Boolean] = js.native
    
    var mdUp: js.UndefOr[Boolean] = js.native
    
    var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.native
    
    var smDown: js.UndefOr[Boolean] = js.native
    
    var smUp: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var xlDown: js.UndefOr[Boolean] = js.native
    
    var xlUp: js.UndefOr[Boolean] = js.native
    
    var xsDown: js.UndefOr[Boolean] = js.native
    
    var xsUp: js.UndefOr[Boolean] = js.native
  }
  object HiddenProps {
    
    @scala.inline
    def apply(): HiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenProps]
    }
    
    @scala.inline
    implicit class HiddenPropsMutableBuilder[Self <: HiddenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: Partial[ClassNameMap[scala.Nothing]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setImplementation(value: js_ | css): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      @scala.inline
      def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_] | RefObject[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
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
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
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
  
  type _To = ComponentType[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenHiddenMod.foo` */
  override def _to: ComponentType[HiddenProps] = default
}
