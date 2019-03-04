package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Splice[T]
  extends _ArraySpec[T, js.Any] {
  @JSName("$splice")
  var $splice: js.Array[
    (js.Tuple2[scala.Double, js.UndefOr[scala.Double]]) | (js.Array[scala.Double | T])
  ]
}

object Anon_Splice {
  @scala.inline
  def apply[T](
    $splice: js.Array[
      (js.Tuple2[scala.Double, js.UndefOr[scala.Double]]) | (js.Array[scala.Double | T])
    ]
  ): Anon_Splice[T] = {
    val __obj = js.Dynamic.literal($splice = $splice)
  
    __obj.asInstanceOf[Anon_Splice[T]]
  }
}

