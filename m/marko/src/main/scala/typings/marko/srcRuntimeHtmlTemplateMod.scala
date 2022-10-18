package typings.marko

import typings.asyncWriter.mod.AsyncWriter
import typings.marko.srcRuntimeHtmlAsyncStreamMod.AsyncStream
import typings.marko.srcRuntimeHtmlRenderResultMod.RenderResult
import typings.marko.srcRuntimeVdomAsyncVDOMBuilderMod.AsyncVDOMBuilder
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRuntimeHtmlTemplateMod {
  
  @JSImport("marko/src/runtime/html/Template", "Readable")
  @js.native
  open class Readable protected ()
    extends typings.node.streamMod.Readable {
    def this(template: Template, data: Any, options: Any) = this()
    
    var _d: Any = js.native
    
    var _rendered: Boolean = js.native
    
    var _shouldBuffer: Boolean = js.native
    
    var _t: Any = js.native
    
    def write(data: Any): Unit = js.native
  }
  
  @js.native
  trait Renderable extends StObject {
    
    var createOut: Any = js.native
    
    def render(): js.Promise[RenderResult] = js.native
    def render(data: Any): js.Promise[RenderResult] = js.native
    def render(data: Any, out: js.Function2[/* err */ Any, /* result */ RenderResult, Unit]): Unit = js.native
    def render(data: Any, out: AsyncWriter): Unit = js.native
    def render(data: Any, out: AsyncStream): Unit = js.native
    def render(data: Any, out: AsyncVDOMBuilder): Unit = js.native
    def render(data: Any, out: WritableStream): Unit = js.native
    
    def renderSync(): RenderResult = js.native
    def renderSync(data: Any): RenderResult = js.native
    
    def renderToString(): String = js.native
    def renderToString(data: Any): String = js.native
    def renderToString(data: Any, callback: js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]): Unit = js.native
  }
  
  @js.native
  trait Template
    extends StObject
       with Renderable {
    
    def apply(path: String, renderFunc: Any, options: Any): Template = js.native
    
    var ___shouldBuffer: Boolean = js.native
    
    @JSName("_")
    var _underscore: Any = js.native
    
    @JSName("createOut")
    def createOut_MTemplate(): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Any, writer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Any, writer: Any, parentOut: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Any, writer: Any, parentOut: Any, buffer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Any, writer: Any, parentOut: Unit, buffer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Any, writer: Unit, parentOut: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Any, writer: Unit, parentOut: Any, buffer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Any, writer: Unit, parentOut: Unit, buffer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Unit, writer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Unit, writer: Any, parentOut: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Unit, writer: Any, parentOut: Any, buffer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Unit, writer: Any, parentOut: Unit, buffer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Unit, writer: Unit, parentOut: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Unit, writer: Unit, parentOut: Any, buffer: Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: Unit, writer: Unit, parentOut: Unit, buffer: Any): AsyncStream = js.native
    
    var meta: Any = js.native
    
    var path: String = js.native
    
    def stream(data: Any): Readable = js.native
  }
}
