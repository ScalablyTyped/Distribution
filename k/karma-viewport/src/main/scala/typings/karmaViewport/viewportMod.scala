package typings.karmaViewport

import typings.karmaViewport.adapterMod.global.Window
import typings.karmaViewport.anon.Height
import typings.karmaViewport.anon.ReadonlyViewportConfigura
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportMod {
  
  @JSImport("karma-viewport/dist/adapter/viewport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("karma-viewport/dist/adapter/viewport", "Viewport")
  @js.native
  open class Viewport protected () extends StObject {
    /**
      * Create viewport resizer
      *
      * @constructor
      *
      * @param config - Viewport configuration
      * @param parent - Initialization context
      */
    def this(config: ViewportConfiguration, parent: Window) = this()
    
    def between[T](first: String, last: String, cb: ViewportCallback[T]): Unit = js.native
    /**
      * Execute a callback for all breakpoints between the first and last given
      *
      * If the callback return value is a Promise, callback invocations will be
      * chained to guarantee sequential execution.
      *
      * @example
      *   viewport.between("mobile", "tablet", name => {
      *     ...
      *   })
      *
      * @param first - First breakpoint name
      * @param last - Last breakpoint name
      * @param cb - Callback to execute after resizing
      *
      * @return Promise resolving with no result
      */
    @JSName("between")
    def between_T_Promise[T /* <: js.Promise[Any] */](first: String, last: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
    
    /**
      * Viewport configuration
      */
    var config: ReadonlyViewportConfigura = js.native
    
    /**
      * Viewport context
      */
    var context: HTMLIFrameElement = js.native
    
    def each[T](cb: ViewportCallback[T]): Unit = js.native
    /**
      * Execute a callback for all breakpoints
      *
      * @example
      *   viewport.each(name => {
      *     ...
      *   })
      *
      * @param cb - Callback to execute after resizing
      *
      * @return Promise resolving with no result
      */
    @JSName("each")
    def each_T_Promise[T /* <: js.Promise[Any] */](cb: ViewportCallback[T]): js.Promise[Unit] = js.native
    
    def from[T](first: String, cb: ViewportCallback[T]): Unit = js.native
    /**
      * Execute a callback starting at the given breakpoint
      *
      * @example
      *   viewport.from("tablet", name => {
      *     ...
      *   })
      *
      * @param first - First breakpoint name
      * @param cb - Callback to execute after resizing
      *
      * @return Promise resolving with no result
      */
    @JSName("from")
    def from_T_Promise[T /* <: js.Promise[Any] */](first: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
    
    /**
      * Load and embed document into viewport
      *
      * @param url - URL of document to load
      *
      * @return Promise resolving with no result
      */
    def load(url: String): js.Promise[Unit] = js.native
    def load(url: String, cb: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * Change viewport offset (scroll within iframe)
      *
      * @param x - Horizontal offset
      * @param y - Vertical offset
      */
    def offset(x: Double): Unit = js.native
    def offset(x: Double, y: Double): Unit = js.native
    
    /**
      * Reset viewport
      */
    def reset(): Unit = js.native
    
    def set(breakpoint: String): Unit = js.native
    /**
      * Set viewport to width (and height) or breakpoint name
      *
      * @param widthOrBreakpoint - Width in pixels or breakpoint name
      * @param height - Height in pixels
      */
    def set(width: Double): Unit = js.native
    def set(width: Double, height: Double): Unit = js.native
    
    def to[T](last: String, cb: ViewportCallback[T]): Unit = js.native
    /**
      * Execute a callback ending at the given breakpoint
      *
      * @example
      *   viewport.to("tablet", name => {
      *     ...
      *   })
      *
      * @param last - Last breakpoint name
      * @param cb - Callback to execute after resizing
      *
      * @return Promise resolving with no result
      */
    @JSName("to")
    def to_T_Promise[T /* <: js.Promise[Any] */](last: String, cb: ViewportCallback[T]): js.Promise[Unit] = js.native
  }
  
  inline def range(breakpoints: js.Array[ViewportBreakpoint], first: String): js.Array[ViewportBreakpoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(breakpoints.asInstanceOf[js.Any], first.asInstanceOf[js.Any])).asInstanceOf[js.Array[ViewportBreakpoint]]
  inline def range(breakpoints: js.Array[ViewportBreakpoint], first: String, last: String): js.Array[ViewportBreakpoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(breakpoints.asInstanceOf[js.Any], first.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[js.Array[ViewportBreakpoint]]
  
  trait ViewportBreakpoint extends StObject {
    
    var name: String
    
    var size: Height
  }
  object ViewportBreakpoint {
    
    inline def apply(name: String, size: Height): ViewportBreakpoint = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportBreakpoint]
    }
    
    extension [Self <: ViewportBreakpoint](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type ViewportCallback[T] = js.Function1[/* breakpoint */ String, T]
  
  trait ViewportConfiguration extends StObject {
    
    var breakpoints: js.Array[ViewportBreakpoint]
    
    var context: String
  }
  object ViewportConfiguration {
    
    inline def apply(breakpoints: js.Array[ViewportBreakpoint], context: String): ViewportConfiguration = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportConfiguration]
    }
    
    extension [Self <: ViewportConfiguration](x: Self) {
      
      inline def setBreakpoints(value: js.Array[ViewportBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsVarargs(value: ViewportBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
