package typings.materializeCss

import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.DropdownOptions> */
trait PartialDropdownOptions extends js.Object {
  var alignment: js.UndefOr[left | right] = js.undefined
  var autoTrigger: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var constrainWidth: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[Element] = js.undefined
  var coverTrigger: js.UndefOr[Boolean] = js.undefined
  var hover: js.UndefOr[Boolean] = js.undefined
  var inDuration: js.UndefOr[Double] = js.undefined
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var outDuration: js.UndefOr[Double] = js.undefined
}

object PartialDropdownOptions {
  @scala.inline
  def apply(
    alignment: left | right = null,
    autoTrigger: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    constrainWidth: js.UndefOr[Boolean] = js.undefined,
    container: Element = null,
    coverTrigger: js.UndefOr[Boolean] = js.undefined,
    hover: js.UndefOr[Boolean] = js.undefined,
    inDuration: Int | Double = null,
    onCloseEnd: js.ThisFunction1[PartialDropdownOptions, /* el */ Element, Unit] = null,
    onCloseStart: js.ThisFunction1[PartialDropdownOptions, /* el */ Element, Unit] = null,
    onOpenEnd: js.ThisFunction1[PartialDropdownOptions, /* el */ Element, Unit] = null,
    onOpenStart: js.ThisFunction1[PartialDropdownOptions, /* el */ Element, Unit] = null,
    outDuration: Int | Double = null
  ): PartialDropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(autoTrigger)) __obj.updateDynamic("autoTrigger")(autoTrigger.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainWidth)) __obj.updateDynamic("constrainWidth")(constrainWidth.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTrigger)) __obj.updateDynamic("coverTrigger")(coverTrigger.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inDuration != null) __obj.updateDynamic("inDuration")(inDuration.asInstanceOf[js.Any])
    if (onCloseEnd != null) __obj.updateDynamic("onCloseEnd")(onCloseEnd.asInstanceOf[js.Any])
    if (onCloseStart != null) __obj.updateDynamic("onCloseStart")(onCloseStart.asInstanceOf[js.Any])
    if (onOpenEnd != null) __obj.updateDynamic("onOpenEnd")(onOpenEnd.asInstanceOf[js.Any])
    if (onOpenStart != null) __obj.updateDynamic("onOpenStart")(onOpenStart.asInstanceOf[js.Any])
    if (outDuration != null) __obj.updateDynamic("outDuration")(outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDropdownOptions]
  }
}

