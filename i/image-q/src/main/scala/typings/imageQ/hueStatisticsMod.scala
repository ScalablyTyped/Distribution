package typings.imageQ

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/utils/hueStatistics", JSImport.Namespace)
@js.native
object hueStatisticsMod extends js.Object {
  @js.native
  class HueStatistics protected () extends js.Object {
    def this(numGroups: Double, minCols: Double) = this()
    var _groupsFull: js.Any = js.native
    var _minCols: js.Any = js.native
    var _numGroups: js.Any = js.native
    var _stats: js.Any = js.native
    def check(i32: Double): Unit = js.native
    def injectIntoArray(histG: js.Array[String]): Unit = js.native
    def injectIntoDictionary(histG: StringDictionary[Double]): Unit = js.native
  }
  
}

