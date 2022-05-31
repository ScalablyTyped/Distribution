package typings.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reportInstallError(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportInstallError")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def reportInstallError(name: String, errorMessage: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportInstallError")(name.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
