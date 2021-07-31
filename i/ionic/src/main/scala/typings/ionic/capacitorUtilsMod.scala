package typings.ionic

import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capacitorUtilsMod {
  
  @JSImport("ionic/lib/integrations/capacitor/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generateOptionsForCapacitorBuild(inputs: CommandLineInputs, options: CommandLineOptions): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("generateOptionsForCapacitorBuild")(inputs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
}
