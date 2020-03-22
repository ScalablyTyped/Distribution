package typings.materializeCss

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
    enterDelay: Int | Double = null,
    exitDelay: Int | Double = null,
    html: String = null,
    inDuration: Int | Double = null,
    margin: Int | Double = null,
    outDuration: Int | Double = null,
    position: top | right | bottom | left = null,
    transitionMovement: Int | Double = null
  ): PartialTooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (exitDelay != null) __obj.updateDynamic("exitDelay")(exitDelay.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (inDuration != null) __obj.updateDynamic("inDuration")(inDuration.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (outDuration != null) __obj.updateDynamic("outDuration")(outDuration.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (transitionMovement != null) __obj.updateDynamic("transitionMovement")(transitionMovement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTooltipOptions]
  }
}

