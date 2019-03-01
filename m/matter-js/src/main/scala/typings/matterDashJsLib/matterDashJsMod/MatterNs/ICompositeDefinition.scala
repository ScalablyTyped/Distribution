package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeDefinition extends js.Object {
  /**
    * An array of `Body` that are _direct_ children of this composite.
    * To add or remove bodies you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allBodies` method.
    *
    * @property bodies
    * @type body[]
    * @default []
    */
  var bodies: js.UndefOr[js.Array[Body]] = js.undefined
  /**
    * An array of `Composite` that are _direct_ children of this composite.
    * To add or remove composites you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allComposites` method.
    *
    * @property composites
    * @type composite[]
    * @default []
    */
  var composites: js.UndefOr[js.Array[Composite]] = js.undefined
  /**
    * An array of `Constraint` that are _direct_ children of this composite.
    * To add or remove constraints you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allConstraints` method.
    *
    * @property constraints
    * @type constraint[]
    * @default []
    */
  var constraints: js.UndefOr[js.Array[Constraint]] = js.undefined
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
    * A flag that specifies whether the composite has been modified during the current step.
    * Most `Matter.Composite` methods will automatically set this flag to `true` to inform the engine of changes to be handled.
    * If you need to change it manually, you should use the `Composite.setModified` method.
    *
    * @property isModified
    * @type boolean
    * @default false
    */
  var isModified: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An arbitrary `String` name to help the user identify and manage composites.
    *
    * @property label
    * @type string
    * @default "Composite"
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The `Composite` that is the parent of this composite. It is automatically managed by the `Matter.Composite` methods.
    *
    * @property parent
    * @type composite
    * @default null
    */
  var parent: js.UndefOr[Composite] = js.undefined
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "composite"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ICompositeDefinition {
  @scala.inline
  def apply(
    bodies: js.Array[Body] = null,
    composites: js.Array[Composite] = null,
    constraints: js.Array[Constraint] = null,
    id: scala.Int | scala.Double = null,
    isModified: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    parent: Composite = null,
    `type`: java.lang.String = null
  ): ICompositeDefinition = {
    val __obj = js.Dynamic.literal()
    if (bodies != null) __obj.updateDynamic("bodies")(bodies)
    if (composites != null) __obj.updateDynamic("composites")(composites)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isModified)) __obj.updateDynamic("isModified")(isModified)
    if (label != null) __obj.updateDynamic("label")(label)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICompositeDefinition]
  }
}

