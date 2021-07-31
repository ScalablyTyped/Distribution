package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scale {
  
  @JSImport("jointjs", "g.scale")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def linear(domain: js.Tuple2[Double, Double], range: js.Tuple2[Double, Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linear")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
}
