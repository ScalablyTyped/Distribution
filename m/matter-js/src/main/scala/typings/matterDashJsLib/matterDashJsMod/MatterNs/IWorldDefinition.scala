package typings
package matterDashJsLib.matterDashJsMod.MatterNs

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
    id: scala.Int | scala.Double = null,
    isModified: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    parent: Composite = null,
    `type`: java.lang.String = null
  ): IWorldDefinition = {
    val __obj = js.Dynamic.literal()
    if (bodies != null) __obj.updateDynamic("bodies")(bodies)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (composites != null) __obj.updateDynamic("composites")(composites)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isModified)) __obj.updateDynamic("isModified")(isModified)
    if (label != null) __obj.updateDynamic("label")(label)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IWorldDefinition]
  }
}

