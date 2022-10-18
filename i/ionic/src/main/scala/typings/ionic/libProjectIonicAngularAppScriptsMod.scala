package typings.ionic

import typings.ionic.definitionsMod.CommandMetadataOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectIonicAngularAppScriptsMod {
  
  @JSImport("ionic/lib/project/ionic-angular/app-scripts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/project/ionic-angular/app-scripts", "APP_SCRIPTS_OPTIONS")
  @js.native
  val APP_SCRIPTS_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  inline def importAppScripts(projectDir: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("importAppScripts")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
