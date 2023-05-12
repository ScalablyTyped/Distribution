package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Constraint")
@js.native
open class Constraint () extends StObject {
  
  /**
    * The first possible `Body` that this constraint is attached to.
    *
    * @property bodyA
    * @type body
    * @default null
    */
  var bodyA: Body | Null = js.native
  
  /**
    * The second possible `Body` that this constraint is attached to.
    *
    * @property bodyB
    * @type body
    * @default null
    */
  var bodyB: Body | Null = js.native
  
  /**
    * A `Number` that specifies the damping of the constraint,
    * i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation.
    * Damping will only be apparent when the constraint also has a very low `stiffness`.
    * A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation.
    * A value of `0` means the constraint will apply no damping.
    *
    * @property damping
    * @type {number}
    * @default 0
    */
  var damping: Double = js.native
  
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type {number}
    */
  var id: Double = js.native
  
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type {string}
    * @default "Constraint"
    */
  var label: String = js.native
  
  /**
    * A `Number` that specifies the target resting length of the constraint.
    * It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    *
    * @property length
    * @type {number}
    */
  var length: Double = js.native
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointA
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointA: Vector = js.native
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointB
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointB: Vector = js.native
  
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type {any}
    */
  var render: IConstraintRenderDefinition = js.native
  
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`.
    * A value of `1` means the constraint should be very stiff.
    * A value of `0.2` means the constraint acts like a soft spring.
    *
    * @property stiffness
    * @type {number}
    * @default 1
    */
  var stiffness: Double = js.native
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type {string}
    * @default "constraint"
    */
  var `type`: String = js.native
}
/* static members */
object Constraint {
  
  @JSImport("matter-js", "Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @returns {constraint} constraint
    */
  inline def create(options: IConstraintDefinition): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  /**
    * Returns the world-space position of `constraint.pointA`, accounting for `constraint.bodyA`.
    * @method pointAWorld
    * @param {constraint} constraint
    * @returns {Vector} the world-space position
    */
  inline def pointAWorld(constraint: Constraint): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("pointAWorld")(constraint.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  /**
    * Returns the world-space position of `constraint.pointB`, accounting for `constraint.bodyB`.
    * @method pointBWorld
    * @param {constraint} constraint
    * @returns {Vector} the world-space position
    */
  inline def pointBWorld(constraint: Constraint): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("pointBWorld")(constraint.asInstanceOf[js.Any]).asInstanceOf[Vector]
}
