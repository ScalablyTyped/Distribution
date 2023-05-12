package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.STDEV
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "NumericAggregationPlugin")
@js.native
open class NumericAggregationPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginNumericAggregationPluginMod.NumericAggregationPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object NumericAggregationPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "NumericAggregationPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "NumericAggregationPlugin.aliases")
  @js.native
  def aliases: STDEV = js.native
  inline def aliases_=(x: STDEV): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/interpreter/plugin", "NumericAggregationPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ImplementedFunctions = js.native
  inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
