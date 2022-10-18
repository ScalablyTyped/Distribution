package typings.jupyterlabHtmlviewerExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabHtmlviewer.mod.IHTMLViewerTracker
import typings.jupyterlabHtmlviewerExtension.jupyterlabHtmlviewerExtensionStrings.desktop
import typings.jupyterlabHtmlviewerExtension.jupyterlabHtmlviewerExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The HTML file handler extension.
    */
  @JSImport("@jupyterlab/htmlviewer-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IHTMLViewerTracker, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[IHTMLViewerTracker, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IHTMLViewerTracker, IShell, desktop | mobile] = default
}
