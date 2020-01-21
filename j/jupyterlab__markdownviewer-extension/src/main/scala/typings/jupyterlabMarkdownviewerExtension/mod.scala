package typings.jupyterlabMarkdownviewerExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The markdown viewer plugin.
    */
  val default: JupyterFrontEndPlugin[IMarkdownViewerTracker] = js.native
}

