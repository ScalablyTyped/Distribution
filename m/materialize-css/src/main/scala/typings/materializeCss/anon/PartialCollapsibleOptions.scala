package typings.materializeCss.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.CollapsibleOptions> */
trait PartialCollapsibleOptions extends js.Object {
  var accordion: js.UndefOr[Boolean] = js.undefined
  var inDuration: js.UndefOr[Double] = js.undefined
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var outDuration: js.UndefOr[Double] = js.undefined
}

object PartialCollapsibleOptions {
  @scala.inline
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    inDuration: js.UndefOr[Double] = js.undefined,
    onCloseEnd: js.ThisFunction1[PartialCollapsibleOptions, /* el */ Element, Unit] = null,
    onCloseStart: js.ThisFunction1[PartialCollapsibleOptions, /* el */ Element, Unit] = null,
    onOpenEnd: js.ThisFunction1[PartialCollapsibleOptions, /* el */ Element, Unit] = null,
    onOpenStart: js.ThisFunction1[PartialCollapsibleOptions, /* el */ Element, Unit] = null,
    outDuration: js.UndefOr[Double] = js.undefined
  ): PartialCollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inDuration)) __obj.updateDynamic("inDuration")(inDuration.get.asInstanceOf[js.Any])
    if (onCloseEnd != null) __obj.updateDynamic("onCloseEnd")(onCloseEnd.asInstanceOf[js.Any])
    if (onCloseStart != null) __obj.updateDynamic("onCloseStart")(onCloseStart.asInstanceOf[js.Any])
    if (onOpenEnd != null) __obj.updateDynamic("onOpenEnd")(onOpenEnd.asInstanceOf[js.Any])
    if (onOpenStart != null) __obj.updateDynamic("onOpenStart")(onOpenStart.asInstanceOf[js.Any])
    if (!js.isUndefined(outDuration)) __obj.updateDynamic("outDuration")(outDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCollapsibleOptions]
  }
}

