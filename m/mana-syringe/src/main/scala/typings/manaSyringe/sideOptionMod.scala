package typings.manaSyringe

import typings.manaSyringe.coreMod.Syringe.InjectOption
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideOptionMod {
  
  @JSImport("mana-syringe/lib/side-option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mana-syringe/lib/side-option", "OptionSymbol")
  @js.native
  val OptionSymbol: js.Symbol = js.native
  
  inline def registerSideOption[T /* <: Record[Any, Any] */, R](option: InjectOption[R], target: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSideOption")(option.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
