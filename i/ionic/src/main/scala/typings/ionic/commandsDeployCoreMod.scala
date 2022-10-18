package typings.ionic

import typings.ionic.anon.Appid
import typings.ionic.definitionsMod.INamespace
import typings.ionic.libCommandMod.Command
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeployCoreMod {
  
  /* note: abstract class */ @JSImport("ionic/commands/deploy/core", "DeployConfCommand")
  @js.native
  open class DeployConfCommand protected () extends DeployCoreCommand {
    def this(namespace: INamespace) = this()
    
    /* protected */ def addConfToAndroidString(options: CommandLineOptions): js.Promise[Boolean] = js.native
    
    /* protected */ def addConfToIosPlist(options: CommandLineOptions): js.Promise[Boolean] = js.native
    
    /* protected */ def checkDeployInstalled(): js.Promise[Boolean] = js.native
    
    /* protected */ def getAndroidCapString(): js.Promise[String] = js.native
    
    /* protected */ def getAppId(): js.Promise[js.UndefOr[String]] = js.native
    
    /* protected */ def getIosCapPlist(): js.Promise[String] = js.native
    
    /* protected */ val optionsToPlistKeys: Appid = js.native
    
    /* protected */ val optionsToStringXmlKeys: Appid = js.native
    
    /* protected */ def preRunCheckInputs(options: CommandLineOptions): js.Promise[Unit] = js.native
    
    /* protected */ def printPlistInstructions(options: CommandLineOptions): Unit = js.native
    
    /* protected */ def printStringXmlInstructions(options: CommandLineOptions): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("ionic/commands/deploy/core", "DeployCoreCommand")
  @js.native
  open class DeployCoreCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    /* protected */ def getAppIntegration(): js.Promise[js.UndefOr[String]] = js.native
    
    /* protected */ def requireNativeIntegration(): js.Promise[Unit] = js.native
  }
}
