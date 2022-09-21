package typings.hyperformula.pluginMod

import typings.hyperformula.anon.CLEAN
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "TextPlugin")
@js.native
open class TextPlugin protected ()
  extends typings.hyperformula.textPluginMod.TextPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object TextPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "TextPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "TextPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: CLEAN = js.native
  inline def implementedFunctions_=(x: CLEAN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
