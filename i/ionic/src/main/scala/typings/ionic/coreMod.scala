package typings.ionic

import typings.ionic.anon.Appid
import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("ionic/commands/deploy/core", "DeployConfCommand")
  @js.native
  abstract class DeployConfCommand protected () extends DeployCoreCommand {
    def this(namespace: INamespace) = this()
    
    /* protected */ def addConfToAndroidString(options: CommandLineOptions): js.Promise[Boolean] = js.native
    
    /* protected */ def addConfToIosPlist(options: CommandLineOptions): js.Promise[Boolean] = js.native
    
    /* protected */ def checkDeployInstalled(): js.Promise[Boolean] = js.native
    
    /* protected */ def getAndroidCapString(): js.Promise[String] = js.native
    
    /* protected */ def getAppId(): js.Promise[js.UndefOr[String]] = js.native
    
    /* protected */ def getIosCapPlist(): js.Promise[String] = js.native
    
    val optionsToPlistKeys: Appid = js.native
    
    val optionsToStringXmlKeys: Appid = js.native
    
    /* protected */ def preRunCheckInputs(options: CommandLineOptions): js.Promise[Unit] = js.native
    
    /* protected */ def printPlistInstructions(options: CommandLineOptions): Unit = js.native
    
    /* protected */ def printStringXmlInstructions(options: CommandLineOptions): Unit = js.native
  }
  
  @JSImport("ionic/commands/deploy/core", "DeployCoreCommand")
  @js.native
  abstract class DeployCoreCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    /* protected */ def getAppIntegration(): js.Promise[js.UndefOr[String]] = js.native
    
    /* protected */ def requireNativeIntegration(): js.Promise[Unit] = js.native
  }
}
