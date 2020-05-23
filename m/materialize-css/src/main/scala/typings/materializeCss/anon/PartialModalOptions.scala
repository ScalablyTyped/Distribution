package typings.materializeCss.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ModalOptions> */
trait PartialModalOptions extends js.Object {
  var dismissible: js.UndefOr[Boolean] = js.undefined
  var endingTop: js.UndefOr[String] = js.undefined
  var inDuration: js.UndefOr[Double] = js.undefined
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var outDuration: js.UndefOr[Double] = js.undefined
  var preventScrolling: js.UndefOr[Boolean] = js.undefined
  var startingTop: js.UndefOr[String] = js.undefined
}

object PartialModalOptions {
  @scala.inline
  def apply(
    dismissible: js.UndefOr[Boolean] = js.undefined,
    endingTop: String = null,
    inDuration: js.UndefOr[Double] = js.undefined,
    onCloseEnd: js.ThisFunction1[PartialModalOptions, /* el */ Element, Unit] = null,
    onCloseStart: js.ThisFunction1[PartialModalOptions, /* el */ Element, Unit] = null,
    onOpenEnd: js.ThisFunction1[PartialModalOptions, /* el */ Element, Unit] = null,
    onOpenStart: js.ThisFunction1[PartialModalOptions, /* el */ Element, Unit] = null,
    opacity: js.UndefOr[Double] = js.undefined,
    outDuration: js.UndefOr[Double] = js.undefined,
    preventScrolling: js.UndefOr[Boolean] = js.undefined,
    startingTop: String = null
  ): PartialModalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.get.asInstanceOf[js.Any])
    if (endingTop != null) __obj.updateDynamic("endingTop")(endingTop.asInstanceOf[js.Any])
    if (!js.isUndefined(inDuration)) __obj.updateDynamic("inDuration")(inDuration.get.asInstanceOf[js.Any])
    if (onCloseEnd != null) __obj.updateDynamic("onCloseEnd")(onCloseEnd.asInstanceOf[js.Any])
    if (onCloseStart != null) __obj.updateDynamic("onCloseStart")(onCloseStart.asInstanceOf[js.Any])
    if (onOpenEnd != null) __obj.updateDynamic("onOpenEnd")(onOpenEnd.asInstanceOf[js.Any])
    if (onOpenStart != null) __obj.updateDynamic("onOpenStart")(onOpenStart.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outDuration)) __obj.updateDynamic("outDuration")(outDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventScrolling)) __obj.updateDynamic("preventScrolling")(preventScrolling.get.asInstanceOf[js.Any])
    if (startingTop != null) __obj.updateDynamic("startingTop")(startingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialModalOptions]
  }
}

