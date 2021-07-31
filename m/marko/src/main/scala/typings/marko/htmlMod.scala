package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("marko/src/runtime/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createWriter(writer: js.Any): AsyncStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writer.asInstanceOf[js.Any]).asInstanceOf[AsyncStream]
  
  @scala.inline
  def enableAsyncStackTrace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAsyncStackTrace")().asInstanceOf[Unit]
  
  type AsyncStream = typings.marko.asyncStreamMod.AsyncStream
  
  type RenderResult = typings.marko.renderResultMod.RenderResult
  
  type Template = typings.marko.templateMod.Template
}
