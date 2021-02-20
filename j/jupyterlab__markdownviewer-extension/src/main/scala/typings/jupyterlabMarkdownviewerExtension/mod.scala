package typings.jupyterlabMarkdownviewerExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The markdown viewer plugin.
    */
  @JSImport("@jupyterlab/markdownviewer-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IMarkdownViewerTracker] = js.native
  
  type _To = JupyterFrontEndPlugin[IMarkdownViewerTracker]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IMarkdownViewerTracker] = default
}
