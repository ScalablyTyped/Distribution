package typings.hyperformula.pluginMod

import typings.hyperformula.anon.ACOS
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "TrigonometryPlugin")
@js.native
open class TrigonometryPlugin protected ()
  extends typings.hyperformula.trigonometryPluginMod.TrigonometryPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object TrigonometryPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "TrigonometryPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "TrigonometryPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ACOS = js.native
  inline def implementedFunctions_=(x: ACOS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
