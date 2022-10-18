package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRuntimeHtmlMod {
  
  @JSImport("marko/src/runtime/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWriter(writer: Any): AsyncStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writer.asInstanceOf[js.Any]).asInstanceOf[AsyncStream]
  
  inline def enableAsyncStackTrace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAsyncStackTrace")().asInstanceOf[Unit]
  
  type AsyncStream = typings.marko.srcRuntimeHtmlAsyncStreamMod.AsyncStream
  
  type RenderResult = typings.marko.srcRuntimeHtmlRenderResultMod.RenderResult
  
  type Template = typings.marko.srcRuntimeHtmlTemplateMod.Template
}
