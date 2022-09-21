package typings.hyperformula.pluginMod

import typings.hyperformula.anon.MOD
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "ModuloPlugin")
@js.native
open class ModuloPlugin protected ()
  extends typings.hyperformula.moduloPluginMod.ModuloPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object ModuloPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ModuloPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ModuloPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: MOD = js.native
  inline def implementedFunctions_=(x: MOD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
