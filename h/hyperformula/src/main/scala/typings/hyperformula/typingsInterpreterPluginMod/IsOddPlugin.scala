package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.ISODD
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "IsOddPlugin")
@js.native
open class IsOddPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginIsOddPluginMod.IsOddPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object IsOddPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "IsOddPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "IsOddPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ISODD = js.native
  inline def implementedFunctions_=(x: ISODD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
