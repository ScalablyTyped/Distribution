package typings.jupyterlabSettingeditorExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The default setting editor extension.
    */
  @JSImport("@jupyterlab/settingeditor-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ISettingEditorTracker] = js.native
  
  type _To = JupyterFrontEndPlugin[ISettingEditorTracker]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[ISettingEditorTracker] = default
}
