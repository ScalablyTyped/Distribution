package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "World")
@js.native
class World ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.World {
  /**
    * An array of `Body` that are _direct_ children of this composite.
    * To add or remove bodies you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allBodies` method.
    *
    * @property bodies
    * @type body[]
    * @default []
    */
  /* CompleteClass */
  override var bodies: js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Body] = js.native
  /* CompleteClass */
  override var bounds: matterDashJsLib.matterDashJsMod.MatterNs.Bounds = js.native
  /**
    * An array of `Composite` that are _direct_ children of this composite.
    * To add or remove composites you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allComposites` method.
    *
    * @property composites
    * @type composite[]
    * @default []
    */
  /* CompleteClass */
  override var composites: js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Composite] = js.native
  /**
    * An array of `Constraint` that are _direct_ children of this composite.
    * To add or remove constraints you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allConstraints` method.
    *
    * @property constraints
    * @type constraint[]
    * @default []
    */
  /* CompleteClass */
  override var constraints: js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Constraint] = js.native
  /* CompleteClass */
  override var gravity: matterDashJsLib.matterDashJsMod.MatterNs.Gravity = js.native
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  /* CompleteClass */
  override var id: scala.Double = js.native
  /**
    * A flag that specifies whether the composite has been modified during the current step.
    * Most `Matter.Composite` methods will automatically set this flag to `true` to inform the engine of changes to be handled.
    * If you need to change it manually, you should use the `Composite.setModified` method.
    *
    * @property isModified
    * @type boolean
    * @default false
    */
  /* CompleteClass */
  override var isModified: scala.Boolean = js.native
  /**
    * An arbitrary `String` name to help the user identify and manage composites.
    *
    * @property label
    * @type string
    * @default "Composite"
    */
  /* CompleteClass */
  override var label: java.lang.String = js.native
  /**
    * The `Composite` that is the parent of this composite. It is automatically managed by the `Matter.Composite` methods.
    *
    * @property parent
    * @type composite
    * @default null
    */
  /* CompleteClass */
  override var parent: matterDashJsLib.matterDashJsMod.MatterNs.Composite = js.native
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "composite"
    */
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
}

@JSImport("matter-js", "World")
@js.native
object World extends js.Object {
  def add(
    world: matterDashJsLib.matterDashJsMod.MatterNs.World,
    body: js.Array[
      matterDashJsLib.matterDashJsMod.MatterNs.Body | matterDashJsLib.matterDashJsMod.MatterNs.Composite | matterDashJsLib.matterDashJsMod.MatterNs.Constraint
    ]
  ): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
  /**
    * Add objects or arrays of objects of types: Body, Constraint, Composite
    * @param world
    * @param body
    * @returns world
    */
  def add(
    world: matterDashJsLib.matterDashJsMod.MatterNs.World,
    body: matterDashJsLib.matterDashJsMod.MatterNs.Body
  ): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
  def add(
    world: matterDashJsLib.matterDashJsMod.MatterNs.World,
    body: matterDashJsLib.matterDashJsMod.MatterNs.Composite
  ): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
  def add(
    world: matterDashJsLib.matterDashJsMod.MatterNs.World,
    body: matterDashJsLib.matterDashJsMod.MatterNs.Constraint
  ): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
  def add(
    world: matterDashJsLib.matterDashJsMod.MatterNs.World,
    body: matterDashJsLib.matterDashJsMod.MatterNs.MouseConstraint
  ): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
  /**
    * An alias for Composite.addBody since World is also a Composite
    * @method addBody
    * @param {world} world
    * @param {body} body
    * @return {world} The original world with the body added
    */
  def addBody(
    world: matterDashJsLib.matterDashJsMod.MatterNs.World,
    body: matterDashJsLib.matterDashJsMod.MatterNs.Body
  ): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
  /**
    * An alias for Composite.add since World is also a Composite
    * @method addComposite
    * @param {world} world
    * @param {composite} composite
    * @return {world} The original world with the objects from composite added
    */
  def addComposite(
    world: matterDashJsLib.matterDashJsMod.MatterNs.World,
    composite: matterDashJsLib.matterDashJsMod.MatterNs.Composite
  ): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
  /**
    * An alias for Composite.addConstraint since World is also a Composite
    * @method addConstraint
    * @param {world} world
    * @param {constraint} constraint
    * @return {world} The original world with the constraint added
    */
  def addConstraint(
    world: matterDashJsLib.matterDashJsMod.MatterNs.World,
    constraint: matterDashJsLib.matterDashJsMod.MatterNs.Constraint
  ): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
  /**
    * An alias for Composite.clear since World is also a Composite
    * @method clear
    * @param {world} world
    * @param {boolean} keepStatic
    */
  def clear(world: matterDashJsLib.matterDashJsMod.MatterNs.World, keepStatic: scala.Boolean): scala.Unit = js.native
  /**
    * Creates a new world composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @constructor
    * @param {} options
    * @return {world} A new world
    */
  def create(options: matterDashJsLib.matterDashJsMod.MatterNs.IWorldDefinition): matterDashJsLib.matterDashJsMod.MatterNs.World = js.native
}

