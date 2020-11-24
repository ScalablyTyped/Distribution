package typings.marko

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko/src/runtime/html", JSImport.Namespace)
@js.native
object htmlMod extends js.Object {
  
  def createWriter(writer: js.Any): AsyncStream = js.native
  
  def enableAsyncStackTrace(): Unit = js.native
  
  type AsyncStream = typings.marko.asyncStreamMod.AsyncStream
  
  type RenderResult = typings.marko.renderResultMod.RenderResult
  
  type Template = typings.marko.templateMod.Template
}
