package typings.karmaViewport

import typings.karmaViewport.viewportMod.ViewportBreakpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
  trait PartialViewportConfigurat extends StObject {
    
    var breakpoints: js.UndefOr[js.Array[ViewportBreakpoint]] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
  }
  object PartialViewportConfigurat {
    
    inline def apply(): PartialViewportConfigurat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialViewportConfigurat]
    }
    
    extension [Self <: PartialViewportConfigurat](x: Self) {
      
      inline def setBreakpoints(value: js.Array[ViewportBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setBreakpointsVarargs(value: ViewportBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
  trait ReadonlyViewportConfigura extends StObject {
    
    val breakpoints: js.Array[ViewportBreakpoint]
    
    val context: String
  }
  object ReadonlyViewportConfigura {
    
    inline def apply(breakpoints: js.Array[ViewportBreakpoint], context: String): ReadonlyViewportConfigura = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyViewportConfigura]
    }
    
    extension [Self <: ReadonlyViewportConfigura](x: Self) {
      
      inline def setBreakpoints(value: js.Array[ViewportBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsVarargs(value: ViewportBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
