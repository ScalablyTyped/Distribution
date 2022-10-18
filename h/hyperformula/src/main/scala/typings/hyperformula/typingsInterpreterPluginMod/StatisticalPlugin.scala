package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.BESSELI
import typings.hyperformula.anon.BETADIST
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "StatisticalPlugin")
@js.native
open class StatisticalPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginStatisticalPluginMod.StatisticalPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object StatisticalPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "StatisticalPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "StatisticalPlugin.aliases")
  @js.native
  def aliases: BETADIST = js.native
  inline def aliases_=(x: BETADIST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/interpreter/plugin", "StatisticalPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: BESSELI = js.native
  inline def implementedFunctions_=(x: BESSELI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
