package typings.marko.srcRuntimeHtmlTemplateMod

import typings.asyncDashWriter.asyncDashWriterMod.AsyncWriter
import typings.marko.srcRuntimeHtmlAsyncStreamMod.AsyncStream
import typings.marko.srcRuntimeHtmlRenderResultMod.RenderResult
import typings.marko.srcRuntimeVdomAsyncVDOMBuilderMod.AsyncVDOMBuilder
import typings.node.NodeJSNs.WritableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderable extends js.Object {
  var createOut: js.Any = js.native
  def render(): js.Promise[RenderResult] = js.native
  def render(data: js.Any): js.Promise[RenderResult] = js.native
  def render(data: js.Any, out: js.Function2[/* err */ js.Any, /* result */ RenderResult, Unit]): Unit = js.native
  def render(data: js.Any, out: AsyncWriter): Unit = js.native
  def render(data: js.Any, out: AsyncStream): Unit = js.native
  def render(data: js.Any, out: AsyncVDOMBuilder): Unit = js.native
  def render(data: js.Any, out: WritableStream): Unit = js.native
  def renderSync(): RenderResult = js.native
  def renderSync(data: js.Any): RenderResult = js.native
  def renderToString(): String = js.native
  def renderToString(data: js.Any): String = js.native
  def renderToString(data: js.Any, callback: js.Function2[/* err */ Error | Null, /* result */ String, Unit]): js.UndefOr[scala.Nothing] = js.native
}

