package typings.materializeCss.anon

import typings.materializeCss.materializeCssStrings.bottom
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TooltipOptions> */
trait PartialTooltipOptions extends js.Object {
  var enterDelay: js.UndefOr[Double] = js.undefined
  var exitDelay: js.UndefOr[Double] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var inDuration: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var outDuration: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[top | right | bottom | left] = js.undefined
  var transitionMovement: js.UndefOr[Double] = js.undefined
}

object PartialTooltipOptions {
  @scala.inline
  def apply(
    enterDelay: js.UndefOr[Double] = js.undefined,
    exitDelay: js.UndefOr[Double] = js.undefined,
    html: String = null,
    inDuration: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    outDuration: js.UndefOr[Double] = js.undefined,
    position: top | right | bottom | left = null,
    transitionMovement: js.UndefOr[Double] = js.undefined
  ): PartialTooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enterDelay)) __obj.updateDynamic("enterDelay")(enterDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exitDelay)) __obj.updateDynamic("exitDelay")(exitDelay.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(inDuration)) __obj.updateDynamic("inDuration")(inDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outDuration)) __obj.updateDynamic("outDuration")(outDuration.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionMovement)) __obj.updateDynamic("transitionMovement")(transitionMovement.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTooltipOptions]
  }
}

