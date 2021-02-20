package typings.jupyterlabHtmlviewerExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabHtmlviewer.mod.IHTMLViewerTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The HTML file handler extension.
    */
  @JSImport("@jupyterlab/htmlviewer-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IHTMLViewerTracker] = js.native
  
  type _To = JupyterFrontEndPlugin[IHTMLViewerTracker]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IHTMLViewerTracker] = default
}
