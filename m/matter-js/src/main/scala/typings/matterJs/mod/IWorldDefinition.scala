package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorldDefinition extends ICompositeDefinition {
  var bounds: js.UndefOr[Bounds] = js.undefined
  var gravity: js.UndefOr[Gravity] = js.undefined
}

object IWorldDefinition {
  @scala.inline
  def apply(
    bodies: js.Array[Body] = null,
    bounds: Bounds = null,
    composites: js.Array[Composite] = null,
    constraints: js.Array[Constraint] = null,
    gravity: Gravity = null,
    id: js.UndefOr[Double] = js.undefined,
    isModified: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    parent: Composite = null,
    `type`: String = null
  ): IWorldDefinition = {
    val __obj = js.Dynamic.literal()
    if (bodies != null) __obj.updateDynamic("bodies")(bodies.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (composites != null) __obj.updateDynamic("composites")(composites.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isModified)) __obj.updateDynamic("isModified")(isModified.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorldDefinition]
  }
}

