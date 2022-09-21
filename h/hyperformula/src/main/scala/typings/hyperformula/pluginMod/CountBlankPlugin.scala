package typings.hyperformula.pluginMod

import typings.hyperformula.anon.COUNTBLANK
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "CountBlankPlugin")
@js.native
open class CountBlankPlugin protected ()
  extends typings.hyperformula.countBlankPluginMod.CountBlankPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object CountBlankPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "CountBlankPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "CountBlankPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: COUNTBLANK = js.native
  inline def implementedFunctions_=(x: COUNTBLANK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
