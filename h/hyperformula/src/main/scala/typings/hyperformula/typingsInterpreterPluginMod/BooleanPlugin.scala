package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.AND
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "BooleanPlugin")
@js.native
open class BooleanPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginBooleanPluginMod.BooleanPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object BooleanPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "BooleanPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "BooleanPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: AND = js.native
  inline def implementedFunctions_=(x: AND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
