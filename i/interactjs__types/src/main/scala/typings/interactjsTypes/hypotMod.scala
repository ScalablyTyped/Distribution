package typings.interactjsTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hypotMod {
  
  @JSImport("@interactjs/utils/hypot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
}
