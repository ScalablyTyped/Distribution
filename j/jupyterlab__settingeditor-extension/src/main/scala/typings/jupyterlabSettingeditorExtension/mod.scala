package typings.jupyterlabSettingeditorExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabSettingeditor.libTokensMod.IJSONSettingEditorTracker
import typings.jupyterlabSettingeditor.libTokensMod.ISettingEditorTracker
import typings.jupyterlabSettingeditorExtension.jupyterlabSettingeditorExtensionStrings.desktop
import typings.jupyterlabSettingeditorExtension.jupyterlabSettingeditorExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/settingeditor-extension", JSImport.Default)
  @js.native
  val default: js.Array[
    JupyterFrontEndPlugin[IJSONSettingEditorTracker | ISettingEditorTracker, IShell, desktop | mobile]
  ] = js.native
  
  type _To = js.Array[
    JupyterFrontEndPlugin[IJSONSettingEditorTracker | ISettingEditorTracker, IShell, desktop | mobile]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[
    JupyterFrontEndPlugin[IJSONSettingEditorTracker | ISettingEditorTracker, IShell, desktop | mobile]
  ] = default
}
