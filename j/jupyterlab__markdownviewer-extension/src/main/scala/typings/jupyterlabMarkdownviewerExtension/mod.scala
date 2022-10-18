package typings.jupyterlabMarkdownviewerExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabMarkdownviewer.libTokensMod.IMarkdownViewerTracker
import typings.jupyterlabMarkdownviewerExtension.jupyterlabMarkdownviewerExtensionStrings.desktop
import typings.jupyterlabMarkdownviewerExtension.jupyterlabMarkdownviewerExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The markdown viewer plugin.
    */
  @JSImport("@jupyterlab/markdownviewer-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IMarkdownViewerTracker, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[IMarkdownViewerTracker, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IMarkdownViewerTracker, IShell, desktop | mobile] = default
}
