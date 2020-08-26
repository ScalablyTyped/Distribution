package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Composite")
@js.native
class Composite () extends js.Object {
  /**
    * An array of `Body` that are _direct_ children of this composite.
    * To add or remove bodies you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allBodies` method.
    *
    * @property bodies
    * @type body[]
    * @default []
    */
  var bodies: js.Array[Body] = js.native
  /**
    * An array of `Composite` that are _direct_ children of this composite.
    * To add or remove composites you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allComposites` method.
    *
    * @property composites
    * @type composite[]
    * @default []
    */
  var composites: js.Array[Composite] = js.native
  /**
    * An array of `Constraint` that are _direct_ children of this composite.
    * To add or remove constraints you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allConstraints` method.
    *
    * @property constraints
    * @type constraint[]
    * @default []
    */
  var constraints: js.Array[Constraint] = js.native
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: Double = js.native
  /**
    * A flag that specifies whether the composite has been modified during the current step.
    * Most `Matter.Composite` methods will automatically set this flag to `true` to inform the engine of changes to be handled.
    * If you need to change it manually, you should use the `Composite.setModified` method.
    *
    * @property isModified
    * @type boolean
    * @default false
    */
  var isModified: Boolean = js.native
  /**
    * An arbitrary `String` name to help the user identify and manage composites.
    *
    * @property label
    * @type string
    * @default "Composite"
    */
  var label: String = js.native
  /**
    * The `Composite` that is the parent of this composite. It is automatically managed by the `Matter.Composite` methods.
    *
    * @property parent
    * @type composite
    * @default null
    */
  var parent: Composite = js.native
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "composite"
    */
  var `type`: String = js.native
}

/* static members */
@JSImport("matter-js", "Composite")
@js.native
object Composite extends js.Object {
  /**
    * Generic add function. Adds one or many body(s), constraint(s) or a composite(s) to the given composite.
    * Triggers `beforeAdd` and `afterAdd` events on the `composite`.
    * @method add
    * @param {composite} composite
    * @param {} object
    * @return {composite} The original composite with the objects added
    */
  def add(composite: Composite, `object`: Body): Composite = js.native
  def add(composite: Composite, `object`: Composite): Composite = js.native
  def add(composite: Composite, `object`: Constraint): Composite = js.native
  /**
    * Returns all bodies in the given composite, including all bodies in its children, recursively.
    * @method allBodies
    * @param {composite} composite
    * @return {body[]} All the bodies
    */
  def allBodies(composite: Composite): js.Array[Body] = js.native
  /**
    * Returns all composites in the given composite, including all composites in its children, recursively.
    * @method allComposites
    * @param {composite} composite
    * @return {composite[]} All the composites
    */
  def allComposites(composite: Composite): js.Array[Composite] = js.native
  /**
    * Returns all constraints in the given composite, including all constraints in its children, recursively.
    * @method allConstraints
    * @param {composite} composite
    * @return {constraint[]} All the constraints
    */
  def allConstraints(composite: Composite): js.Array[Composite] = js.native
  /**
    * Removes all bodies, constraints and composites from the given composite.
    * Optionally clearing its children recursively.
    * @method clear
    * @param {composite} composite
    * @param {boolean} keepStatic
    * @param {boolean} [deep=false]
    */
  def clear(composite: Composite, keepStatic: Boolean): Unit = js.native
  def clear(composite: Composite, keepStatic: Boolean, deep: Boolean): Unit = js.native
  /**
    * Creates a new composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properites section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} [options]
    * @return {composite} A new composite
    */
  def create(): Composite = js.native
  def create(options: ICompositeDefinition): Composite = js.native
  /**
    * Searches the composite recursively for an object matching the type and id supplied, null if not found.
    * @method get
    * @param {composite} composite
    * @param {number} id
    * @param {string} type
    * @return {object} The requested object, if found
    */
  def get(composite: Composite, id: Double, `type`: String): Body | Composite | Constraint = js.native
  /**
    * Moves the given object(s) from compositeA to compositeB (equal to a remove followed by an add).
    * @method move
    * @param {compositeA} compositeA
    * @param {object[]} objects
    * @param {compositeB} compositeB
    * @return {composite} Returns compositeA
    */
  def move(compositeA: Composite, objects: js.Array[Body | Composite | Constraint], compositeB: Composite): Composite = js.native
  /**
    * Assigns new ids for all objects in the composite, recursively.
    * @method rebase
    * @param {composite} composite
    * @return {composite} Returns composite
    */
  def rebase(composite: Composite): Composite = js.native
  /**
    * Generic remove function. Removes one or many body(s), constraint(s) or a composite(s) to the given composite.
    * Optionally searching its children recursively.
    * Triggers `beforeRemove` and `afterRemove` events on the `composite`.
    * @method remove
    * @param {composite} composite
    * @param {} object
    * @param {boolean} [deep=false]
    * @return {composite} The original composite with the objects removed
    */
  def remove(composite: Composite, `object`: Body): Composite = js.native
  def remove(composite: Composite, `object`: Body, deep: Boolean): Composite = js.native
  def remove(composite: Composite, `object`: Composite): Composite = js.native
  def remove(composite: Composite, `object`: Composite, deep: Boolean): Composite = js.native
  def remove(composite: Composite, `object`: Constraint): Composite = js.native
  def remove(composite: Composite, `object`: Constraint, deep: Boolean): Composite = js.native
  /**
    * Rotates all children in the composite by a given angle about the given point, without imparting any angular velocity.
    * @method rotate
    * @param {composite} composite
    * @param {number} rotation
    * @param {vector} point
    * @param {bool} [recursive=true]
    */
  def rotate(composite: Composite, rotation: Double, point: Vector): Unit = js.native
  def rotate(composite: Composite, rotation: Double, point: Vector, recursive: Boolean): Unit = js.native
  /**
    * Scales all children in the composite, including updating physical properties (mass, area, axes, inertia), from a world-space point.
    * @method scale
    * @param {composite} composite
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {vector} point
    * @param {bool} [recursive=true]
    */
  def scale(composite: Composite, scaleX: Double, scaleY: Double, point: Vector): Unit = js.native
  def scale(composite: Composite, scaleX: Double, scaleY: Double, point: Vector, recursive: Boolean): Unit = js.native
  /**
    * Sets the composite's `isModified` flag.
    * If `updateParents` is true, all parents will be set (default: false).
    * If `updateChildren` is true, all children will be set (default: false).
    * @method setModified
    * @param {composite} composite
    * @param {boolean} isModified
    * @param {boolean} [updateParents=false]
    * @param {boolean} [updateChildren=false]
    */
  def setModified(composite: Composite, isModified: Boolean): Unit = js.native
  def setModified(
    composite: Composite,
    isModified: Boolean,
    updateParents: js.UndefOr[scala.Nothing],
    updateChildren: Boolean
  ): Unit = js.native
  def setModified(composite: Composite, isModified: Boolean, updateParents: Boolean): Unit = js.native
  def setModified(composite: Composite, isModified: Boolean, updateParents: Boolean, updateChildren: Boolean): Unit = js.native
  /**
    * Translates all children in the composite by a given vector relative to their current positions,
    * without imparting any velocity.
    * @method translate
    * @param {composite} composite
    * @param {vector} translation
    * @param {bool} [recursive=true]
    */
  def translate(composite: Composite, translation: Vector): Unit = js.native
  def translate(composite: Composite, translation: Vector, recursive: Boolean): Unit = js.native
}

