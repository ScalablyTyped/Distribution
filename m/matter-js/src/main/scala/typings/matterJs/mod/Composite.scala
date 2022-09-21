package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Composite")
@js.native
open class Composite () extends StObject {
  
  /**
    * An array of `Body` that are _direct_ children of this composite.
    * To add or remove bodies you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allBodies` method.
    *
    * @property bodies
    * @type {Body[]}
    * @default []
    */
  var bodies: js.Array[Body] = js.native
  
  /**
    * An array of `Composite` that are _direct_ children of this composite.
    * To add or remove composites you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allComposites` method.
    *
    * @property composites
    * @type {Composite[]}
    * @default []
    */
  var composites: js.Array[Composite] = js.native
  
  /**
    * An array of `Constraint` that are _direct_ children of this composite.
    * To add or remove constraints you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allConstraints` method.
    *
    * @property constraints
    * @type {Constraint[]}
    * @default []
    */
  var constraints: js.Array[Constraint] = js.native
  
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type {number}
    */
  var id: Double = js.native
  
  /**
    * A flag that specifies whether the composite has been modified during the current step.
    * This is automatically managed when bodies, constraints or composites are added or removed.
    *
    * @property isModified
    * @type {boolean}
    * @default false
    */
  var isModified: Boolean = js.native
  
  /**
    * An arbitrary `String` name to help the user identify and manage composites.
    *
    * @property label
    * @type {string}
    * @default "Composite"
    */
  var label: String = js.native
  
  /**
    * The `Composite` that is the parent of this composite. It is automatically managed by the `Matter.Composite` methods.
    *
    * @property parent
    * @type {Composite|null}
    * @default null
    */
  var parent: Composite | Null = js.native
  
  /**
    * An object reserved for storing plugin-specific properties.
    *
    * @property plugin
    * @type {Plugin}
    */
  var plugin: Plugin = js.native
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type {string}
    * @default "composite"
    * @readOnly
    */
  val `type`: String = js.native
}
/* static members */
object Composite {
  
  @JSImport("matter-js", "Composite")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(composite: Composite, `object`: js.Array[Body | Composite | Constraint | MouseConstraint]): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Composite]
  /**
    * Generic add function. Adds one or many body(s), constraint(s) or a composite(s) to the given composite.
    * Triggers `beforeAdd` and `afterAdd` events on the `composite`.
    * @method add
    * @param {Composite} composite
    * @param {any} object
    * @returns {Composite} The original composite with the objects added
    */
  inline def add(composite: Composite, `object`: Body): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Composite]
  inline def add(composite: Composite, `object`: Composite): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Composite]
  inline def add(composite: Composite, `object`: Constraint): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Composite]
  inline def add(composite: Composite, `object`: MouseConstraint): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
  /**
    * Returns all bodies in the given composite, including all bodies in its children, recursively.
    * @method allBodies
    * @param {Composite} composite
    * @returns {Body[]} All the bodies
    */
  inline def allBodies(composite: Composite): js.Array[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("allBodies")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[Body]]
  
  /**
    * Returns all composites in the given composite, including all composites in its children, recursively.
    * @method allComposites
    * @param {Composite} composite
    * @returns {Composite[]} All the composites
    */
  inline def allComposites(composite: Composite): js.Array[Composite] = ^.asInstanceOf[js.Dynamic].applyDynamic("allComposites")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[Composite]]
  
  /**
    * Returns all constraints in the given composite, including all constraints in its children, recursively.
    * @method allConstraints
    * @param {Composite} composite
    * @returns {Constraint[]} All the constraints
    */
  inline def allConstraints(composite: Composite): js.Array[Constraint] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConstraints")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[Constraint]]
  
  /**
    * Removes all bodies, constraints and composites from the given composite.
    * Optionally clearing its children recursively.
    * @method clear
    * @param {Composite} composite
    * @param {boolean} keepStatic
    * @param {boolean} [deep=false]
    */
  inline def clear(composite: Composite, keepStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(composite.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clear(composite: Composite, keepStatic: Boolean, deep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(composite.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properites section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} [options]
    * @returns {Composite} A new composite
    */
  inline def create(): Composite = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Composite]
  inline def create(options: ICompositeDefinition): Composite = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Composite]
  
  /**
    * Searches the composite recursively for an object matching the type and id supplied, null if not found.
    * @method get
    * @param {Composite} composite
    * @param {number} id
    * @param {string} type
    * @returns {any} The requested object, if found
    */
  inline def get(composite: Composite, id: Double, `type`: String): Body | Composite | Constraint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(composite.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Body | Composite | Constraint]
  
  /**
    * Moves the given object(s) from compositeA to compositeB (equal to a remove followed by an add).
    * @method move
    * @param {compositeA} compositeA
    * @param {(Body | Composite | Constraint)[]} objects
    * @param {compositeB} compositeB
    * @returns {Composite} Returns compositeA
    */
  inline def move(compositeA: Composite, objects: js.Array[Body | Composite | Constraint], compositeB: Composite): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(compositeA.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], compositeB.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
  /**
    * Assigns new ids for all objects in the composite, recursively.
    * @method rebase
    * @param {Composite} composite
    * @returns {Composite} Returns composite
    */
  inline def rebase(composite: Composite): Composite = ^.asInstanceOf[js.Dynamic].applyDynamic("rebase")(composite.asInstanceOf[js.Any]).asInstanceOf[Composite]
  
  /**
    * Generic remove function. Removes one or many body(s), constraint(s) or a composite(s) to the given composite.
    * Optionally searching its children recursively.
    * Triggers `beforeRemove` and `afterRemove` events on the `composite`.
    * @method remove
    * @param {Composite} composite
    * @param {any} object
    * @param {boolean} [deep=false]
    * @returns {Composite} The original composite with the objects removed
    */
  inline def remove(composite: Composite, `object`: Body): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Composite]
  inline def remove(composite: Composite, `object`: Body, deep: Boolean): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Composite]
  inline def remove(composite: Composite, `object`: Composite): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Composite]
  inline def remove(composite: Composite, `object`: Composite, deep: Boolean): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Composite]
  inline def remove(composite: Composite, `object`: Constraint): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Composite]
  inline def remove(composite: Composite, `object`: Constraint, deep: Boolean): Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Composite]
  
  /**
    * Rotates all children in the composite by a given angle about the given point, without imparting any angular velocity.
    * @method rotate
    * @param {Composite} composite
    * @param {number} rotation
    * @param {Vector} point
    * @param {boolean} [recursive=true]
    */
  inline def rotate(composite: Composite, rotation: Double, point: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(composite.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate(composite: Composite, rotation: Double, point: Vector, recursive: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(composite.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], point.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Scales all children in the composite, including updating physical properties (mass, area, axes, inertia), from a world-space point.
    * @method scale
    * @param {Composite} composite
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {Vector} point
    * @param {boolean} [recursive=true]
    */
  inline def scale(composite: Composite, scaleX: Double, scaleY: Double, point: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(composite.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scale(composite: Composite, scaleX: Double, scaleY: Double, point: Vector, recursive: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(composite.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Translates all children in the composite by a given vector relative to their current positions,
    * without imparting any velocity.
    * @method translate
    * @param {Composite} composite
    * @param {Vector} translation
    * @param {boolean} [recursive=true]
    */
  inline def translate(composite: Composite, translation: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(composite.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def translate(composite: Composite, translation: Vector, recursive: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(composite.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
