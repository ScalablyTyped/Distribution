package typings.marko

import typings.marko.srcRuntimeHtmlMod.AsyncStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html", JSImport.Namespace)
@js.native
object srcRuntimeHtmlMod extends js.Object {
  def createWriter(writer: js.Any): AsyncStream = js.native
  def enableAsyncStackTrace(): Unit = js.native
  type AsyncStream = typings.marko.srcRuntimeHtmlAsyncStreamMod.AsyncStream
  type RenderResult = typings.marko.srcRuntimeHtmlRenderResultMod.RenderResult
  type Template = typings.marko.srcRuntimeHtmlTemplateMod.Template
}

