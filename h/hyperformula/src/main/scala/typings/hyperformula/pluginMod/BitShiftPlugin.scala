package typings.hyperformula.pluginMod

import typings.hyperformula.anon.BITLSHIFT
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "BitShiftPlugin")
@js.native
open class BitShiftPlugin protected ()
  extends typings.hyperformula.bitShiftPluginMod.BitShiftPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object BitShiftPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "BitShiftPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "BitShiftPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: BITLSHIFT = js.native
  inline def implementedFunctions_=(x: BITLSHIFT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
