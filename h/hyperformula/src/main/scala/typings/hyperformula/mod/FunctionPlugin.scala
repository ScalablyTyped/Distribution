package typings.hyperformula.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("hyperformula", "FunctionPlugin")
@js.native
open class FunctionPlugin protected ()
  extends typings.hyperformula.typingsInterpreterMod.FunctionPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object FunctionPlugin {
  
  @JSImport("hyperformula", "FunctionPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula", "FunctionPlugin.aliases")
  @js.native
  def aliases: js.UndefOr[StringDictionary[String]] = js.native
  inline def aliases_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
  
  /**
    * Dictionary containing functions implemented by specific plugin, along with function name translations.
    */
  @JSImport("hyperformula", "FunctionPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ImplementedFunctions = js.native
  inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
