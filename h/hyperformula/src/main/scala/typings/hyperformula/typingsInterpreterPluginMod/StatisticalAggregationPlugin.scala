package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.CHITEST
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "StatisticalAggregationPlugin")
@js.native
open class StatisticalAggregationPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginStatisticalAggregationPluginMod.StatisticalAggregationPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object StatisticalAggregationPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "StatisticalAggregationPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "StatisticalAggregationPlugin.aliases")
  @js.native
  def aliases: CHITEST = js.native
  inline def aliases_=(x: CHITEST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/interpreter/plugin", "StatisticalAggregationPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ImplementedFunctions = js.native
  inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
