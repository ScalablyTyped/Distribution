package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "BitwiseLogicOperationsPlugin")
@js.native
open class BitwiseLogicOperationsPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginBitwiseLogicOperationsPluginMod.BitwiseLogicOperationsPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object BitwiseLogicOperationsPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "BitwiseLogicOperationsPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "BitwiseLogicOperationsPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ImplementedFunctions = js.native
  inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
