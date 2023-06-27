package typings.lezerGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHashMod {
  
  @JSImport("@lezer/generator/dist/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hashString(h: Double, s: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hashString")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
}
