package typings.html2canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invariantMod {
  
  @JSImport("html2canvas/dist/types/invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invariant(assertion: Boolean, error: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(assertion.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
