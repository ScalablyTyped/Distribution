package typings
package makerDotJsLib.MakerJsNs

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
  var pointMatchingDistance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional
    */
  var scalarMatchingDistance: js.UndefOr[scala.Double] = js.undefined
}

object ISimplifyOptions {
  @scala.inline
  def apply(
    pointMatchingDistance: scala.Int | scala.Double = null,
    scalarMatchingDistance: scala.Int | scala.Double = null
  ): ISimplifyOptions = {
    val __obj = js.Dynamic.literal()
    if (pointMatchingDistance != null) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.asInstanceOf[js.Any])
    if (scalarMatchingDistance != null) __obj.updateDynamic("scalarMatchingDistance")(scalarMatchingDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplifyOptions]
  }
}

