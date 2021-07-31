package typings.ionic.definitionsMod

import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommand
  extends StObject
     with typings.ionicCliFramework.definitionsMod.ICommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  
  val env: IonicEnvironment = js.native
  
  def execute(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
  
  val project: js.UndefOr[IProject] = js.native
}
