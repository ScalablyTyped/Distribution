package typings.jupyterlabMathjax2Extension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabMathjax2Extension.jupyterlabMathjax2ExtensionStrings.desktop
import typings.jupyterlabMathjax2Extension.jupyterlabMathjax2ExtensionStrings.mobile
import typings.jupyterlabRendermime.libTokensMod.ILatexTypesetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The MathJax latexTypesetter plugin.
    */
  @JSImport("@jupyterlab/mathjax2-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ILatexTypesetter, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[ILatexTypesetter, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[ILatexTypesetter, IShell, desktop | mobile] = default
}
