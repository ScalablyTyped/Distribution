package typings.materializeCss

import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.SidenavOptions> */
trait PartialSidenavOptions extends js.Object {
  var draggable: js.UndefOr[Boolean] = js.undefined
  var edge: js.UndefOr[left | right] = js.undefined
  var inDuration: js.UndefOr[Double] = js.undefined
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* elem */ Element, Unit]] = js.undefined
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* elem */ Element, Unit]] = js.undefined
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* elem */ Element, Unit]] = js.undefined
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* elem */ Element, Unit]] = js.undefined
  var outDuration: js.UndefOr[Double] = js.undefined
}

object PartialSidenavOptions {
  @scala.inline
  def apply(
    draggable: js.UndefOr[Boolean] = js.undefined,
    edge: left | right = null,
    inDuration: Int | Double = null,
    onCloseEnd: js.ThisFunction1[PartialSidenavOptions, /* elem */ Element, Unit] = null,
    onCloseStart: js.ThisFunction1[PartialSidenavOptions, /* elem */ Element, Unit] = null,
    onOpenEnd: js.ThisFunction1[PartialSidenavOptions, /* elem */ Element, Unit] = null,
    onOpenStart: js.ThisFunction1[PartialSidenavOptions, /* elem */ Element, Unit] = null,
    outDuration: Int | Double = null
  ): PartialSidenavOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (inDuration != null) __obj.updateDynamic("inDuration")(inDuration.asInstanceOf[js.Any])
    if (onCloseEnd != null) __obj.updateDynamic("onCloseEnd")(onCloseEnd.asInstanceOf[js.Any])
    if (onCloseStart != null) __obj.updateDynamic("onCloseStart")(onCloseStart.asInstanceOf[js.Any])
    if (onOpenEnd != null) __obj.updateDynamic("onOpenEnd")(onOpenEnd.asInstanceOf[js.Any])
    if (onOpenStart != null) __obj.updateDynamic("onOpenStart")(onOpenStart.asInstanceOf[js.Any])
    if (outDuration != null) __obj.updateDynamic("outDuration")(outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSidenavOptions]
  }
}

