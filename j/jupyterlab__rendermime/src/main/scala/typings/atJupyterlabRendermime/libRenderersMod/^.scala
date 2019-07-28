package typings.atJupyterlabRendermime.libRenderersMod

import typings.atJupyterlabRendermime.libRenderersMod.renderHTMLNs.IOptions
import typings.atJupyterlabRendermime.libRenderersMod.renderImageNs.IRenderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/renderers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def renderHTML(options: IOptions): js.Promise[Unit] = js.native
  def renderImage(options: IRenderOptions): js.Promise[Unit] = js.native
  def renderLatex(options: typings.atJupyterlabRendermime.libRenderersMod.renderLatexNs.IRenderOptions): js.Promise[Unit] = js.native
  def renderMarkdown(options: typings.atJupyterlabRendermime.libRenderersMod.renderMarkdownNs.IRenderOptions): js.Promise[Unit] = js.native
  def renderSVG(options: typings.atJupyterlabRendermime.libRenderersMod.renderSVGNs.IRenderOptions): js.Promise[Unit] = js.native
  def renderText(options: typings.atJupyterlabRendermime.libRenderersMod.renderTextNs.IRenderOptions): js.Promise[Unit] = js.native
}

