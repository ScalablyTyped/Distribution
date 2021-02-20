package typings.karmaViewport

import typings.karmaViewport.viewportMod.ViewportBreakpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
  @js.native
  trait PartialViewportConfigurat extends StObject {
    
    var breakpoints: js.UndefOr[js.Array[ViewportBreakpoint]] = js.native
    
    var context: js.UndefOr[String] = js.native
  }
  object PartialViewportConfigurat {
    
    @scala.inline
    def apply(): PartialViewportConfigurat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialViewportConfigurat]
    }
    
    @scala.inline
    implicit class PartialViewportConfiguratMutableBuilder[Self <: PartialViewportConfigurat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: js.Array[ViewportBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setBreakpointsVarargs(value: ViewportBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
  @js.native
  trait ReadonlyViewportConfigura extends StObject {
    
    val breakpoints: js.Array[ViewportBreakpoint] = js.native
    
    val context: String = js.native
  }
  object ReadonlyViewportConfigura {
    
    @scala.inline
    def apply(breakpoints: js.Array[ViewportBreakpoint], context: String): ReadonlyViewportConfigura = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyViewportConfigura]
    }
    
    @scala.inline
    implicit class ReadonlyViewportConfiguraMutableBuilder[Self <: ReadonlyViewportConfigura] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: js.Array[ViewportBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsVarargs(value: ViewportBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
