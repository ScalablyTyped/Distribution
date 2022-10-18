package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.RADIANS
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "RadiansPlugin")
@js.native
open class RadiansPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginRadiansPluginMod.RadiansPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object RadiansPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RadiansPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RadiansPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: RADIANS = js.native
  inline def implementedFunctions_=(x: RADIANS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
