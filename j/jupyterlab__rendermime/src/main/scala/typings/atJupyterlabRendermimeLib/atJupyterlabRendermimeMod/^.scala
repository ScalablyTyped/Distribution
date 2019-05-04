package typings
package atJupyterlabRendermimeLib.atJupyterlabRendermimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ILatexTypesetter: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[
    atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter
  ] = js.native
  val IRenderMimeRegistry: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[atJupyterlabRendermimeLib.libRegistryMod.IRenderMimeRegistry] = js.native
  val htmlRendererFactory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory = js.native
  val imageRendererFactory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory = js.native
  val javaScriptRendererFactory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory = js.native
  val latexRendererFactory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory = js.native
  val markdownRendererFactory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory = js.native
  val standardRendererFactories: js.Array[
    atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory
  ] = js.native
  val svgRendererFactory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory = js.native
  val textRendererFactory: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererFactory = js.native
  def removeMath(text: java.lang.String): atJupyterlabRendermimeLib.Anon_Math = js.native
  def renderHTML(options: atJupyterlabRendermimeLib.libRenderersMod.renderHTMLNs.IOptions): js.Promise[scala.Unit] = js.native
  def renderImage(options: atJupyterlabRendermimeLib.libRenderersMod.renderImageNs.IRenderOptions): js.Promise[scala.Unit] = js.native
  def renderLatex(options: atJupyterlabRendermimeLib.libRenderersMod.renderLatexNs.IRenderOptions): js.Promise[scala.Unit] = js.native
  def renderMarkdown(options: atJupyterlabRendermimeLib.libRenderersMod.renderMarkdownNs.IRenderOptions): js.Promise[scala.Unit] = js.native
  def renderSVG(options: atJupyterlabRendermimeLib.libRenderersMod.renderSVGNs.IRenderOptions): js.Promise[scala.Unit] = js.native
  def renderText(options: atJupyterlabRendermimeLib.libRenderersMod.renderTextNs.IRenderOptions): js.Promise[scala.Unit] = js.native
  def replaceMath(text: java.lang.String, math: js.Array[java.lang.String]): java.lang.String = js.native
}

