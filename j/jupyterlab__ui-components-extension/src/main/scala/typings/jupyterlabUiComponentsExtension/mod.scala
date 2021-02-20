package typings.jupyterlabUiComponentsExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabUiComponents.tokensMod.ILabIconManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Placeholder for future extension that will provide an icon manager class
    * to assist with overriding/replacing particular sets of icons
    */
  @JSImport("@jupyterlab/ui-components-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ILabIconManager] = js.native
  
  type _To = JupyterFrontEndPlugin[ILabIconManager]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[ILabIconManager] = default
}
