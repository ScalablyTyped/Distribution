package typings.hyperformula.pluginMod

import typings.hyperformula.anon.HLOOKUP
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "LookupPlugin")
@js.native
open class LookupPlugin protected ()
  extends typings.hyperformula.lookupPluginMod.LookupPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object LookupPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "LookupPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "LookupPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: HLOOKUP = js.native
  inline def implementedFunctions_=(x: HLOOKUP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
