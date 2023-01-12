package typings.materialUiCore

import typings.materialUiCore.stylesCreateBreakpointsMod.Breakpoint
import typings.materialUiTypes.mod.PropInjector
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withWidthWithWidthMod {
  
  @JSImport("@material-ui/core/withWidth/withWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  inline def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  
  inline def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait WithWidth extends StObject {
    
    var width: Breakpoint
  }
  object WithWidth {
    
    inline def apply(width: Breakpoint): WithWidth = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithWidth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithWidth] (val x: Self) extends AnyVal {
      
      inline def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithWidthOptions extends StObject {
    
    var initialWidth: js.UndefOr[Breakpoint] = js.undefined
    
    var noSSR: js.UndefOr[Boolean] = js.undefined
    
    var resizeInterval: js.UndefOr[Double] = js.undefined
    
    var withTheme: js.UndefOr[Boolean] = js.undefined
  }
  object WithWidthOptions {
    
    inline def apply(): WithWidthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithWidthOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithWidthOptions] (val x: Self) extends AnyVal {
      
      inline def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      inline def setNoSSR(value: Boolean): Self = StObject.set(x, "noSSR", value.asInstanceOf[js.Any])
      
      inline def setNoSSRUndefined: Self = StObject.set(x, "noSSR", js.undefined)
      
      inline def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
      
      inline def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
      
      inline def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
      
      inline def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/withWidth/withWidth.WithWidth> */
  trait WithWidthProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var width: js.UndefOr[Breakpoint] = js.undefined
  }
  object WithWidthProps {
    
    inline def apply(): WithWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithWidthProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithWidthProps] (val x: Self) extends AnyVal {
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
