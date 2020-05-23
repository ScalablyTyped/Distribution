package typings.looksSame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result obtained from the function.
*/
trait LooksSameResult extends js.Object {
  /**
    * diff bounds for not equal images
    */
  var diffBounds: js.UndefOr[CoordBounds] = js.undefined
  /**
    * diff clusters for not equal images
    */
  var diffClusters: js.UndefOr[js.Array[CoordBounds]] = js.undefined
  /**
    * true if images are equal, false - otherwise
    */
  var equal: js.UndefOr[Boolean] = js.undefined
}

object LooksSameResult {
  @scala.inline
  def apply(
    diffBounds: CoordBounds = null,
    diffClusters: js.Array[CoordBounds] = null,
    equal: js.UndefOr[Boolean] = js.undefined
  ): LooksSameResult = {
    val __obj = js.Dynamic.literal()
    if (diffBounds != null) __obj.updateDynamic("diffBounds")(diffBounds.asInstanceOf[js.Any])
    if (diffClusters != null) __obj.updateDynamic("diffClusters")(diffClusters.asInstanceOf[js.Any])
    if (!js.isUndefined(equal)) __obj.updateDynamic("equal")(equal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LooksSameResult]
  }
}

