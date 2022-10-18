package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStatisticsMod {
  
  @JSImport("lib0/dist/statistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def average(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def median(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("median")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
}
