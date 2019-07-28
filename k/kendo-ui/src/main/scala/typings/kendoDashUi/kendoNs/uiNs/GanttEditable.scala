package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttEditable extends js.Object {
  var confirmation: js.UndefOr[Boolean] = js.undefined
  var create: js.UndefOr[Boolean] = js.undefined
  var dependencyCreate: js.UndefOr[Boolean] = js.undefined
  var dependencyDestroy: js.UndefOr[Boolean] = js.undefined
  var destroy: js.UndefOr[Boolean] = js.undefined
  var dragPercentComplete: js.UndefOr[Boolean] = js.undefined
  var move: js.UndefOr[Boolean] = js.undefined
  var reorder: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
}

object GanttEditable {
  @scala.inline
  def apply(
    confirmation: js.UndefOr[Boolean] = js.undefined,
    create: js.UndefOr[Boolean] = js.undefined,
    dependencyCreate: js.UndefOr[Boolean] = js.undefined,
    dependencyDestroy: js.UndefOr[Boolean] = js.undefined,
    destroy: js.UndefOr[Boolean] = js.undefined,
    dragPercentComplete: js.UndefOr[Boolean] = js.undefined,
    move: js.UndefOr[Boolean] = js.undefined,
    reorder: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    template: String | js.Function = null,
    update: js.UndefOr[Boolean] = js.undefined
  ): GanttEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confirmation)) __obj.updateDynamic("confirmation")(confirmation)
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(dependencyCreate)) __obj.updateDynamic("dependencyCreate")(dependencyCreate)
    if (!js.isUndefined(dependencyDestroy)) __obj.updateDynamic("dependencyDestroy")(dependencyDestroy)
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dragPercentComplete)) __obj.updateDynamic("dragPercentComplete")(dragPercentComplete)
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move)
    if (!js.isUndefined(reorder)) __obj.updateDynamic("reorder")(reorder)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[GanttEditable]
  }
}

