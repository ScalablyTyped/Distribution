package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.simplify()
  */
trait ISimplifyOptions extends js.Object {
  /**
    * Optional
    */
  var pointMatchingDistance: js.UndefOr[Double] = js.undefined
  /**
    * Optional
    */
  var scalarMatchingDistance: js.UndefOr[Double] = js.undefined
}

object ISimplifyOptions {
  @scala.inline
  def apply(
    pointMatchingDistance: js.UndefOr[Double] = js.undefined,
    scalarMatchingDistance: js.UndefOr[Double] = js.undefined
  ): ISimplifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pointMatchingDistance)) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalarMatchingDistance)) __obj.updateDynamic("scalarMatchingDistance")(scalarMatchingDistance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplifyOptions]
  }
}

