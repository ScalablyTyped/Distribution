package typings.jupyterlabImageviewerExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabImageviewer.tokensMod.IImageTracker
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
  val default: JupyterFrontEndPlugin[IImageTracker] = js.native
  
  inline def addCommands(app: JupyterFrontEnd[IShell], tracker: IImageTracker): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommands")(app.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
