package typings.hyperformula.pluginMod

import typings.hyperformula.anon.COUNTUNIQUE
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "CountUniquePlugin")
@js.native
open class CountUniquePlugin protected ()
  extends typings.hyperformula.countUniquePluginMod.CountUniquePlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object CountUniquePlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "CountUniquePlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "CountUniquePlugin.implementedFunctions")
  @js.native
  def implementedFunctions: COUNTUNIQUE = js.native
  inline def implementedFunctions_=(x: COUNTUNIQUE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
