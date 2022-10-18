package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.COUNTBLANK
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "CountBlankPlugin")
@js.native
open class CountBlankPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginCountBlankPluginMod.CountBlankPlugin {
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
