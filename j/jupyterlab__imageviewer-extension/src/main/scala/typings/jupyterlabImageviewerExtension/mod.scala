package typings.jupyterlabImageviewerExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabImageviewer.libTokensMod.IImageTracker
import typings.jupyterlabImageviewerExtension.jupyterlabImageviewerExtensionStrings.desktop
import typings.jupyterlabImageviewerExtension.jupyterlabImageviewerExtensionStrings.mobile
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/imageviewer-extension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The image file handler extension.
    */
  @JSImport("@jupyterlab/imageviewer-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IImageTracker, IShell, desktop | mobile] = js.native
  
  inline def addCommands(app: JupyterFrontEnd[IShell, desktop | mobile], tracker: IImageTracker, translator: ITranslator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommands")(app.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
