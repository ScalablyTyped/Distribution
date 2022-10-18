package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.ARRAYCONSTRAIN
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "ArrayPlugin")
@js.native
open class ArrayPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginArrayPluginMod.ArrayPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object ArrayPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ArrayPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ArrayPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ARRAYCONSTRAIN = js.native
  inline def implementedFunctions_=(x: ARRAYCONSTRAIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
