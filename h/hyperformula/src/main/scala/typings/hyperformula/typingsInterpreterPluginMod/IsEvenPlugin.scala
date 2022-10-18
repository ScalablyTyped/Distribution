package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.ISEVEN
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "IsEvenPlugin")
@js.native
open class IsEvenPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginIsEvenPluginMod.IsEvenPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object IsEvenPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "IsEvenPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "IsEvenPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ISEVEN = js.native
  inline def implementedFunctions_=(x: ISEVEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
