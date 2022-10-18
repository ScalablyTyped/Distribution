package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.EXP
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "ExpPlugin")
@js.native
open class ExpPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginExpPluginMod.ExpPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object ExpPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ExpPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ExpPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: EXP = js.native
  inline def implementedFunctions_=(x: EXP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
