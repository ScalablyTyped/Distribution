package typings.graphlib.graphlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphOptions extends js.Object {
    // default: false.
  var compound: js.UndefOr[Boolean] = js.undefined
  var directed: js.UndefOr[Boolean] = js.undefined
    // default: true.
  var multigraph: js.UndefOr[Boolean] = js.undefined
}

object GraphOptions {
  @scala.inline
  def apply(
    compound: js.UndefOr[Boolean] = js.undefined,
    directed: js.UndefOr[Boolean] = js.undefined,
    multigraph: js.UndefOr[Boolean] = js.undefined
  ): GraphOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compound)) __obj.updateDynamic("compound")(compound)
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed)
    if (!js.isUndefined(multigraph)) __obj.updateDynamic("multigraph")(multigraph)
    __obj.asInstanceOf[GraphOptions]
  }
}

