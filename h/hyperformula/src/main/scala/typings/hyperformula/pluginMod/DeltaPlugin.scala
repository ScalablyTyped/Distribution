package typings.hyperformula.pluginMod

import typings.hyperformula.anon.DELTA
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "DeltaPlugin")
@js.native
open class DeltaPlugin protected ()
  extends typings.hyperformula.deltaPluginMod.DeltaPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object DeltaPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "DeltaPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "DeltaPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: DELTA = js.native
  inline def implementedFunctions_=(x: DELTA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
