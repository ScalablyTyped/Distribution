package typings.ionic

import typings.ionic.coreMod.DeployCoreCommand
import typings.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manifestMod {
  
  @JSImport("ionic/commands/deploy/manifest", "DeployManifestCommand")
  @js.native
  class DeployManifestCommand protected () extends DeployCoreCommand {
    def this(namespace: INamespace) = this()
    
    var getFileAndSizeAndHashForFile: js.Any = js.native
    
    var getFilesAndSizesAndHashesForGlobPattern: js.Any = js.native
    
    var getIntegrity: js.Any = js.native
    
    var readFile: js.Any = js.native
    
    def run(): js.Promise[Unit] = js.native
  }
}
