package typings.ionic

import typings.ionic.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsCordovaUtilsMod {
  
  @JSImport("ionic/lib/integrations/cordova/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterArgumentsForCordova(metadata: CommandMetadata, options: CommandLineOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArgumentsForCordova")(metadata.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def generateOptionsForCordovaBuild(metadata: CommandMetadata, inputs: CommandLineInputs, options: CommandLineOptions): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("generateOptionsForCordovaBuild")(metadata.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
}
