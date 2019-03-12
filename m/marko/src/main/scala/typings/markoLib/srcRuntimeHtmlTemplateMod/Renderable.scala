package typings
package markoLib.srcRuntimeHtmlTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderable extends js.Object {
  var createOut: js.Any = js.native
  def render(): js.Promise[markoLib.srcRuntimeHtmlRenderResultMod.RenderResult] = js.native
  def render(data: js.Any): js.Promise[markoLib.srcRuntimeHtmlRenderResultMod.RenderResult] = js.native
  def render(data: js.Any, out: asyncDashWriterLib.asyncDashWriterMod.AsyncWriter): scala.Unit = js.native
  def render(
    data: js.Any,
    out: js.Function2[
      /* err */ js.Any, 
      /* result */ markoLib.srcRuntimeHtmlRenderResultMod.RenderResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def render(data: js.Any, out: markoLib.srcRuntimeHtmlAsyncStreamMod.AsyncStream): scala.Unit = js.native
  def render(data: js.Any, out: markoLib.srcRuntimeVdomAsyncVDOMBuilderMod.AsyncVDOMBuilder): scala.Unit = js.native
  def render(data: js.Any, out: nodeLib.streamMod.Writable): scala.Unit = js.native
  def renderSync(): markoLib.srcRuntimeHtmlRenderResultMod.RenderResult = js.native
  def renderSync(data: js.Any): markoLib.srcRuntimeHtmlRenderResultMod.RenderResult = js.native
  def renderToString(): java.lang.String = js.native
  def renderToString(data: js.Any): java.lang.String = js.native
  def renderToString(
    data: js.Any,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ java.lang.String, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
}

