package typings.jupyterlabExtensionmanager

import typings.jupyterlabServices.builderMod.Builder.IManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildHelperMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/build-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doBuild(builder: IManager): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("doBuild")(builder.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
