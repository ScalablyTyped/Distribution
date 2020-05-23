package typings.jqueryPnotify

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyStack extends js.Object {
  var context: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  var dir1: js.UndefOr[String] = js.undefined
  var dir2: js.UndefOr[String] = js.undefined
  var firstpos1: js.UndefOr[Double] = js.undefined
  var firstpos2: js.UndefOr[Double] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var push: js.UndefOr[String] = js.undefined
  var spacing1: js.UndefOr[Double] = js.undefined
  var spacing2: js.UndefOr[Double] = js.undefined
}

object PNotifyStack {
  @scala.inline
  def apply(
    context: JQuery[HTMLElement] = null,
    dir1: String = null,
    dir2: String = null,
    firstpos1: js.UndefOr[Double] = js.undefined,
    firstpos2: js.UndefOr[Double] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    push: String = null,
    spacing1: js.UndefOr[Double] = js.undefined,
    spacing2: js.UndefOr[Double] = js.undefined
  ): PNotifyStack = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dir1 != null) __obj.updateDynamic("dir1")(dir1.asInstanceOf[js.Any])
    if (dir2 != null) __obj.updateDynamic("dir2")(dir2.asInstanceOf[js.Any])
    if (!js.isUndefined(firstpos1)) __obj.updateDynamic("firstpos1")(firstpos1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstpos2)) __obj.updateDynamic("firstpos2")(firstpos2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing1)) __obj.updateDynamic("spacing1")(spacing1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing2)) __obj.updateDynamic("spacing2")(spacing2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNotifyStack]
  }
}

