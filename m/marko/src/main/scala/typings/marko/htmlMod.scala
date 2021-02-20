package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("marko/src/runtime/html", "createWriter")
  @js.native
  def createWriter(writer: js.Any): AsyncStream = js.native
  
  @JSImport("marko/src/runtime/html", "enableAsyncStackTrace")
  @js.native
  def enableAsyncStackTrace(): Unit = js.native
  
  type AsyncStream = typings.marko.asyncStreamMod.AsyncStream
  
  type RenderResult = typings.marko.renderResultMod.RenderResult
  
  type Template = typings.marko.templateMod.Template
}
