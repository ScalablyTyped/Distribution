package typings.atJupyterlabRendermime.atJupyterlabRendermimeMod

import typings.atJupyterlabRendermime.Anon_Math
import typings.atJupyterlabRendermime.libRenderersMod.renderHTMLNs.IOptions
import typings.atJupyterlabRendermime.libRenderersMod.renderImageNs.IRenderOptions
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ILatexTypesetter: Token[
    typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter
  ] = js.native
  val IRenderMimeRegistry: Token[typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry] = js.native
  val htmlRendererFactory: IRendererFactory = js.native
  val imageRendererFactory: IRendererFactory = js.native
  val javaScriptRendererFactory: IRendererFactory = js.native
  val latexRendererFactory: IRendererFactory = js.native
  val markdownRendererFactory: IRendererFactory = js.native
  val standardRendererFactories: js.Array[IRendererFactory] = js.native
  val svgRendererFactory: IRendererFactory = js.native
  val textRendererFactory: IRendererFactory = js.native
  def removeMath(text: String): Anon_Math = js.native
  def renderHTML(options: IOptions): js.Promise[Unit] = js.native
  def renderImage(options: IRenderOptions): js.Promise[Unit] = js.native
  def renderLatex(options: typings.atJupyterlabRendermime.libRenderersMod.renderLatexNs.IRenderOptions): js.Promise[Unit] = js.native
  def renderMarkdown(options: typings.atJupyterlabRendermime.libRenderersMod.renderMarkdownNs.IRenderOptions): js.Promise[Unit] = js.native
  def renderSVG(options: typings.atJupyterlabRendermime.libRenderersMod.renderSVGNs.IRenderOptions): js.Promise[Unit] = js.native
  def renderText(options: typings.atJupyterlabRendermime.libRenderersMod.renderTextNs.IRenderOptions): js.Promise[Unit] = js.native
  def replaceMath(text: String, math: js.Array[String]): String = js.native
}

