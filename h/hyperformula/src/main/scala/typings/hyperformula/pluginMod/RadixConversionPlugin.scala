package typings.hyperformula.pluginMod

import typings.hyperformula.anon.BASE
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "RadixConversionPlugin")
@js.native
open class RadixConversionPlugin protected ()
  extends typings.hyperformula.radixConversionPluginMod.RadixConversionPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object RadixConversionPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RadixConversionPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RadixConversionPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: BASE = js.native
  inline def implementedFunctions_=(x: BASE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
