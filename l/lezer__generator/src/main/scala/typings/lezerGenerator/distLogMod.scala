package typings.lezerGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLogMod {
  
  @JSImport("@lezer/generator/dist/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def time[T](label: String, f: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(label.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@lezer/generator/dist/log", "timing")
  @js.native
  val timing: Boolean = js.native
  
  @JSImport("@lezer/generator/dist/log", "verbose")
  @js.native
  val verbose: String = js.native
}
