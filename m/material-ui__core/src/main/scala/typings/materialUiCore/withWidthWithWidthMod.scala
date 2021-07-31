package typings.materialUiCore

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.materialUiCore.mod.PropInjector
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withWidthWithWidthMod {
  
  @JSImport("@material-ui/core/withWidth/withWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  @scala.inline
  def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  
  @scala.inline
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait WithWidth extends StObject {
    
    var width: Breakpoint
  }
  object WithWidth {
    
    @scala.inline
    def apply(width: Breakpoint): WithWidth = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithWidth]
    }
    
    @scala.inline
    implicit class WithWidthMutableBuilder[Self <: WithWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithWidthOptions extends StObject {
    
    var initialWidth: js.UndefOr[Breakpoint] = js.undefined
    
    var noSSR: js.UndefOr[Boolean] = js.undefined
    
    var resizeInterval: js.UndefOr[Double] = js.undefined
    
    var withTheme: js.UndefOr[Boolean] = js.undefined
  }
  object WithWidthOptions {
    
    @scala.inline
    def apply(): WithWidthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithWidthOptions]
    }
    
    @scala.inline
    implicit class WithWidthOptionsMutableBuilder[Self <: WithWidthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      @scala.inline
      def setNoSSR(value: Boolean): Self = StObject.set(x, "noSSR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSSRUndefined: Self = StObject.set(x, "noSSR", js.undefined)
      
      @scala.inline
      def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
      
      @scala.inline
      def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/withWidth/withWidth.WithWidth> */
  trait WithWidthProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var width: js.UndefOr[Breakpoint] = js.undefined
  }
  object WithWidthProps {
    
    @scala.inline
    def apply(): WithWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithWidthProps]
    }
    
    @scala.inline
    implicit class WithWidthPropsMutableBuilder[Self <: WithWidthProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
