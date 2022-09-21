package typings.hyperformula.pluginMod

import typings.hyperformula.anon.MAXPOOL
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "MatrixPlugin")
@js.native
open class MatrixPlugin protected ()
  extends typings.hyperformula.matrixPluginMod.MatrixPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object MatrixPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "MatrixPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "MatrixPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: MAXPOOL = js.native
  inline def implementedFunctions_=(x: MAXPOOL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
