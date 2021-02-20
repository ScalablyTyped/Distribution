package typings.materialUiCore

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.materialUiCore.mod.PropInjector
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withWidthWithWidthMod {
  
  @JSImport("@material-ui/core/withWidth/withWidth", JSImport.Default)
  @js.native
  def default(): PropInjector[WithWidth, WithWidthProps] = js.native
  @JSImport("@material-ui/core/withWidth/withWidth", JSImport.Default)
  @js.native
  def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = js.native
  
  @JSImport("@material-ui/core/withWidth/withWidth", "isWidthDown")
  @js.native
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = js.native
  @JSImport("@material-ui/core/withWidth/withWidth", "isWidthDown")
  @js.native
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = js.native
  
  @JSImport("@material-ui/core/withWidth/withWidth", "isWidthUp")
  @js.native
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = js.native
  @JSImport("@material-ui/core/withWidth/withWidth", "isWidthUp")
  @js.native
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = js.native
  
  @js.native
  trait WithWidth extends StObject {
    
    var width: Breakpoint = js.native
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
  
  @js.native
  trait WithWidthOptions extends StObject {
    
    var initialWidth: js.UndefOr[Breakpoint] = js.native
    
    var noSSR: js.UndefOr[Boolean] = js.native
    
    var resizeInterval: js.UndefOr[Double] = js.native
    
    var withTheme: js.UndefOr[Boolean] = js.native
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
  @js.native
  trait WithWidthProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
    
    var width: js.UndefOr[Breakpoint] = js.native
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
      def setInnerRef(value: Ref[_] | RefObject[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
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
