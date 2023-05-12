package typings.hapiHoek

import typings.hapiHoek.mod.Bench
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object libBenchMod {
  
  @JSImport("@hapi/hoek/lib/bench", JSImport.Namespace)
  @js.native
  open class ^ () extends Bench
  @JSImport("@hapi/hoek/lib/bench", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** The current time in milliseconds since the epoch. */
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
}
