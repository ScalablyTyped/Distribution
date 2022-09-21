package typings.materialSnackbar

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/snackbar/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def announce(ariaEl: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("announce")(ariaEl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def announce(ariaEl: Element, labelEl: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("announce")(ariaEl.asInstanceOf[js.Any], labelEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
