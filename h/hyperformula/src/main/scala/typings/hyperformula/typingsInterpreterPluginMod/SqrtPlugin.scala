package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.SQRT
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "SqrtPlugin")
@js.native
open class SqrtPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginSqrtPluginMod.SqrtPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object SqrtPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "SqrtPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "SqrtPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: SQRT = js.native
  inline def implementedFunctions_=(x: SQRT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
