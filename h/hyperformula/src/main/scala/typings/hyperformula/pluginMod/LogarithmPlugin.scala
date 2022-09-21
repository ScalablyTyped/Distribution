package typings.hyperformula.pluginMod

import typings.hyperformula.anon.LN
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "LogarithmPlugin")
@js.native
open class LogarithmPlugin protected ()
  extends typings.hyperformula.logarithmPluginMod.LogarithmPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object LogarithmPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "LogarithmPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "LogarithmPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: LN = js.native
  inline def implementedFunctions_=(x: LN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
