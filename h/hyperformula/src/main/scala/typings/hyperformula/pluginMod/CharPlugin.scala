package typings.hyperformula.pluginMod

import typings.hyperformula.anon.CHAR
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "CharPlugin")
@js.native
open class CharPlugin protected ()
  extends typings.hyperformula.charPluginMod.CharPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object CharPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "CharPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "CharPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: CHAR = js.native
  inline def implementedFunctions_=(x: CHAR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
