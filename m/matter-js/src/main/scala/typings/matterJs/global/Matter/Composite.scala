package typings.matterJs.global.Matter

import typings.matterJs.mod.ICompositeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Composite")
@js.native
open class Composite ()
  extends typings.matterJs.mod.Composite
/* static members */
object Composite {
  
  @JSGlobal("Matter.Composite")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(
    composite: typings.matterJs.mod.Composite,
    `object`: js.Array[
      typings.matterJs.mod.Body | typings.matterJs.mod.Composite | typings.matterJs.mod.Constraint | typings.matterJs.mod.MouseConstraint
    ]
  ): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  /**
    * Generic add function. Adds one or many body(s), constraint(s) or a composite(s) to the given composite.
    * Triggers `beforeAdd` and `afterAdd` events on the `composite`.
    * @method add
    * @param {Composite} composite
    * @param {any} object
    * @returns {Composite} The original composite with the objects added
    */
  inline def add(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.Body): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  inline def add(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.Composite): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  inline def add(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.Constraint): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  inline def add(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.MouseConstraint): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  
  /**
    * Returns all bodies in the given composite, including all bodies in its children, recursively.
    * @method allBodies
    * @param {Composite} composite
    * @returns {Body[]} All the bodies
    */
  inline def allBodies(composite: typings.matterJs.mod.Composite): js.Array[typings.matterJs.mod.Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("allBodies")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.matterJs.mod.Body]]
  
  /**
    * Returns all composites in the given composite, including all composites in its children, recursively.
    * @method allComposites
    * @param {Composite} composite
    * @returns {Composite[]} All the composites
    */
  inline def allComposites(composite: typings.matterJs.mod.Composite): js.Array[typings.matterJs.mod.Composite] = ^.asInstanceOf[js.Dynamic].applyDynamic("allComposites")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.matterJs.mod.Composite]]
  
  /**
    * Returns all constraints in the given composite, including all constraints in its children, recursively.
    * @method allConstraints
    * @param {Composite} composite
    * @returns {Constraint[]} All the constraints
    */
  inline def allConstraints(composite: typings.matterJs.mod.Composite): js.Array[typings.matterJs.mod.Constraint] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConstraints")(composite.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.matterJs.mod.Constraint]]
  
  /**
    * Removes all bodies, constraints and composites from the given composite.
    * Optionally clearing its children recursively.
    * @method clear
    * @param {Composite} composite
    * @param {boolean} keepStatic
    * @param {boolean} [deep=false]
    */
  inline def clear(composite: typings.matterJs.mod.Composite, keepStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(composite.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clear(composite: typings.matterJs.mod.Composite, keepStatic: Boolean, deep: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(composite.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properites section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} [options]
    * @returns {Composite} A new composite
    */
  inline def create(): typings.matterJs.mod.Composite = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.matterJs.mod.Composite]
  inline def create(options: ICompositeDefinition): typings.matterJs.mod.Composite = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Composite]
  
  /**
    * Searches the composite recursively for an object matching the type and id supplied, null if not found.
    * @method get
    * @param {Composite} composite
    * @param {number} id
    * @param {string} type
    * @returns {any} The requested object, if found
    */
  inline def get(composite: typings.matterJs.mod.Composite, id: Double, `type`: String): typings.matterJs.mod.Body | typings.matterJs.mod.Composite | typings.matterJs.mod.Constraint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(composite.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Body | typings.matterJs.mod.Composite | typings.matterJs.mod.Constraint]
  
  /**
    * Moves the given object(s) from compositeA to compositeB (equal to a remove followed by an add).
    * @method move
    * @param {compositeA} compositeA
    * @param {(Body | Composite | Constraint)[]} objects
    * @param {compositeB} compositeB
    * @returns {Composite} Returns compositeA
    */
  inline def move(
    compositeA: typings.matterJs.mod.Composite,
    objects: js.Array[
      typings.matterJs.mod.Body | typings.matterJs.mod.Composite | typings.matterJs.mod.Constraint
    ],
    compositeB: typings.matterJs.mod.Composite
  ): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(compositeA.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], compositeB.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  
  /**
    * Assigns new ids for all objects in the composite, recursively.
    * @method rebase
    * @param {Composite} composite
    * @returns {Composite} Returns composite
    */
  inline def rebase(composite: typings.matterJs.mod.Composite): typings.matterJs.mod.Composite = ^.asInstanceOf[js.Dynamic].applyDynamic("rebase")(composite.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Composite]
  
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
  inline def remove(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.Body): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  inline def remove(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.Body, deep: Boolean): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  inline def remove(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.Composite): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  inline def remove(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.Composite, deep: Boolean): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  inline def remove(composite: typings.matterJs.mod.Composite, `object`: typings.matterJs.mod.Constraint): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  inline def remove(
    composite: typings.matterJs.mod.Composite,
    `object`: typings.matterJs.mod.Constraint,
    deep: Boolean
  ): typings.matterJs.mod.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(composite.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.Composite]
  
  /**
    * Rotates all children in the composite by a given angle about the given point, without imparting any angular velocity.
    * @method rotate
    * @param {Composite} composite
    * @param {number} rotation
    * @param {Vector} point
    * @param {boolean} [recursive=true]
    */
  inline def rotate(composite: typings.matterJs.mod.Composite, rotation: Double, point: typings.matterJs.mod.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(composite.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate(
    composite: typings.matterJs.mod.Composite,
    rotation: Double,
    point: typings.matterJs.mod.Vector,
    recursive: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(composite.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], point.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Scales all children in the composite, including updating physical properties (mass, area, axes, inertia), from a world-space point.
    * @method scale
    * @param {Composite} composite
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {Vector} point
    * @param {boolean} [recursive=true]
    */
  inline def scale(
    composite: typings.matterJs.mod.Composite,
    scaleX: Double,
    scaleY: Double,
    point: typings.matterJs.mod.Vector
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(composite.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scale(
    composite: typings.matterJs.mod.Composite,
    scaleX: Double,
    scaleY: Double,
    point: typings.matterJs.mod.Vector,
    recursive: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(composite.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Translates all children in the composite by a given vector relative to their current positions,
    * without imparting any velocity.
    * @method translate
    * @param {Composite} composite
    * @param {Vector} translation
    * @param {boolean} [recursive=true]
    */
  inline def translate(composite: typings.matterJs.mod.Composite, translation: typings.matterJs.mod.Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(composite.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def translate(
    composite: typings.matterJs.mod.Composite,
    translation: typings.matterJs.mod.Vector,
    recursive: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(composite.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
