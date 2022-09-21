package typings.leven

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leven", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(first: String, second: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Double]
}
