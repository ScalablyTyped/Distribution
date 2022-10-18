package typings.ionic

import typings.ionic.commandsDeployCoreMod.DeployCoreCommand
import typings.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeployManifestMod {
  
  @JSImport("ionic/commands/deploy/manifest", "DeployManifestCommand")
  @js.native
  open class DeployManifestCommand protected () extends DeployCoreCommand {
    def this(namespace: INamespace) = this()
    
    /* private */ var getFileAndSizeAndHashForFile: Any = js.native
    
    /* private */ var getFilesAndSizesAndHashesForGlobPattern: Any = js.native
    
    /* private */ var getIntegrity: Any = js.native
    
    /* private */ var readFile: Any = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
}
