package typings.hyperformula.pluginMod

import typings.hyperformula.anon.ISODD
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "IsOddPlugin")
@js.native
open class IsOddPlugin protected ()
  extends typings.hyperformula.isOddPluginMod.IsOddPlugin {
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
