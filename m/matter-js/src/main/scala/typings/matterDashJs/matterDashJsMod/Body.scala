package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Body")
@js.native
class Body () extends js.Object {
  /**
    * A `Number` specifying the angle of the body, in radians.
    *
    * @property angle
    * @type number
    * @default 0
    */
  var angle: Double = js.native
  /**
    * A `Number` that _measures_ the current angular speed of the body after the last `Body.update`. It is read-only and always positive (it's the magnitude of `body.angularVelocity`).
    *
    * @readOnly
    * @property angularSpeed
    * @type number
    * @default 0
    */
  var angularSpeed: Double = js.native
  /**
    * A `Number` that _measures_ the current angular velocity of the body after the last `Body.update`. It is read-only.
    * If you need to modify a body's angular velocity directly, you should apply a torque or simply change the body's `angle` (as the engine uses position-Verlet integration).
    *
    * @readOnly
    * @property angularVelocity
    * @type number
    * @default 0
    */
  var angularVelocity: Double = js.native
  /**
    * A `Number` that _measures_ the area of the body's convex hull, calculated at creation by `Body.create`.
    *
    * @property area
    * @type string
    * @default
    */
  var area: Double = js.native
  /**
    * An array of unique axis vectors (edge normals) used for collision detection.
    * These are automatically calculated from the given convex hull (`vertices` array) in `Body.create`.
    * They are constantly updated by `Body.update` during the simulation.
    *
    * @property axes
    * @type vector[]
    */
  var axes: js.Array[Vector] = js.native
  /**
    * A `Bounds` object that defines the AABB region for the body.
    * It is automatically calculated from the given convex hull (`vertices` array) in `Body.create` and constantly updated by `Body.update` during simulation.
    *
    * @property bounds
    * @type bounds
    */
  var bounds: Bounds = js.native
  /**
    * An `Object` that specifies the collision filtering properties of this body.
    *
    * Collisions between two bodies will obey the following rules:
    * - If the two bodies have the same non-zero value of `collisionFilter.group`,
    *   they will always collide if the value is positive, and they will never collide
    *   if the value is negative.
    * - If the two bodies have different values of `collisionFilter.group` or if one
    *   (or both) of the bodies has a value of 0, then the category/mask rules apply as follows:
    *
    * Each body belongs to a collision category, given by `collisionFilter.category`. This
    * value is used as a bit field and the category should have only one bit set, meaning that
    * the value of this property is a power of two in the range [1, 2^31]. Thus, there are 32
    * different collision categories available.
    *
    * Each body also defines a collision bitmask, given by `collisionFilter.mask` which specifies
    * the categories it collides with (the value is the bitwise AND value of all these categories).
    *
    * Using the category/mask rules, two bodies `A` and `B` collide if each includes the other's
    * category in its mask, i.e. `(categoryA & maskB) !== 0` and `(categoryB & maskA) !== 0`
    * are both true.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: ICollisionFilter = js.native
  /**
    * A `Number` that defines the density of the body, that is its mass per unit area.
    * If you pass the density via `Body.create` the `mass` property is automatically calculated for you based on the size (area) of the object.
    * This is generally preferable to simply setting mass and allows for more intuitive definition of materials (e.g. rock has a higher density than wood).
    *
    * @property density
    * @type number
    * @default 0.001
    */
  var density: Double = js.native
  /**
    * A `Vector` that specifies the force to apply in the current step. It is zeroed after every `Body.update`. See also `Body.applyForce`.
    *
    * @property force
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var force: Vector = js.native
  /**
    * A `Number` that defines the friction of the body. The value is always positive and is in the range `(0, 1)`.
    * A value of `0` means that the body may slide indefinitely.
    * A value of `1` means the body may come to a stop almost instantly after a force is applied.
    *
    * The effects of the value may be non-linear.
    * High values may be unstable depending on the body.
    * The engine uses a Coulomb friction model including static and kinetic friction.
    * Note that collision response is based on _pairs_ of bodies, and that `friction` values are _combined_ with the following formula:
    *
    *     Math.min(bodyA.friction, bodyB.friction)
    *
    * @property friction
    * @type number
    * @default 0.1
    */
  var friction: Double = js.native
  /**
    * A `Number` that defines the air friction of the body (air resistance).
    * A value of `0` means the body will never slow as it moves through space.
    * The higher the value, the faster a body slows when moving through space.
    * The effects of the value are non-linear.
    *
    * @property frictionAir
    * @type number
    * @default 0.01
    */
  var frictionAir: Double = js.native
  /**
    * A `Number` that defines the static friction of the body (in the Coulomb friction model).
    * A value of `0` means the body will never 'stick' when it is nearly stationary and only dynamic `friction` is used.
    * The higher the value (e.g. `10`), the more force it will take to initially get the body moving when nearly stationary.
    * This value is multiplied with the `friction` property to make it easier to change `friction` and maintain an appropriate amount of static friction.
    *
    * @property frictionStatic
    * @type number
    * @default 0.5
    */
  var frictionStatic: Double = js.native
  /**
    * An integer `Number` uniquely identifying number generated in `Body.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: Double = js.native
  /**
    * A `Number` that defines the moment of inertia (i.e. second moment of area) of the body.
    * It is automatically calculated from the given convex hull (`vertices` array) and density in `Body.create`.
    * If you modify this value, you must also modify the `body.inverseInertia` property (`1 / inertia`).
    *
    * @property inertia
    * @type number
    */
  var inertia: Double = js.native
  /**
    * A `Number` that defines the inverse moment of inertia of the body (`1 / inertia`).
    * If you modify this value, you must also modify the `body.inertia` property.
    *
    * @property inverseInertia
    * @type number
    */
  var inverseInertia: Double = js.native
  /**
    * A `Number` that defines the inverse mass of the body (`1 / mass`).
    * If you modify this value, you must also modify the `body.mass` property.
    *
    * @property inverseMass
    * @type number
    */
  var inverseMass: Double = js.native
  /**
    * A flag that indicates whether a body is a sensor. Sensor triggers collision events, but doesn't react with colliding body physically.
    *
    * @property isSensor
    * @type boolean
    * @default false
    */
  var isSensor: Boolean = js.native
  /**
    * A flag that indicates whether the body is considered sleeping. A sleeping body acts similar to a static body, except it is only temporary and can be awoken.
    * If you need to set a body as sleeping, you should use `Sleeping.set` as this requires more than just setting this flag.
    *
    * @property isSleeping
    * @type boolean
    * @default false
    */
  var isSleeping: Boolean = js.native
  /**
    * A flag that indicates whether a body is considered static. A static body can never change position or angle and is completely fixed.
    * If you need to set a body as static after its creation, you should use `Body.setStatic` as this requires more than just setting this flag.
    *
    * @property isStatic
    * @type boolean
    * @default false
    */
  var isStatic: Boolean = js.native
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Body"
    */
  var label: String = js.native
  /**
    * A `Number` that defines the mass of the body, although it may be more appropriate to specify the `density` property instead.
    * If you modify this value, you must also modify the `body.inverseMass` property (`1 / mass`).
    *
    * @property mass
    * @type number
    */
  var mass: Double = js.native
  /**
    * A `Number` that _measures_ the amount of movement a body currently has (a combination of `speed` and `angularSpeed`). It is read-only and always positive.
    * It is used and updated by the `Matter.Sleeping` module during simulation to decide if a body has come to rest.
    *
    * @readOnly
    * @property motion
    * @type number
    * @default 0
    */
  var motion: Double = js.native
  /**
    * A self reference if the body is _not_ a part of another body.
    * Otherwise this is a reference to the body that this is a part of.
    * See `body.parts`.
    *
    * @property parent
    * @type body
    */
  var parent: Body = js.native
  /**
    * An array of bodies that make up this body.
    * The first body in the array must always be a self reference to the current body instance.
    * All bodies in the `parts` array together form a single rigid compound body.
    * Parts are allowed to overlap, have gaps or holes or even form concave bodies.
    * Parts themselves should never be added to a `World`, only the parent body should be.
    * Use `Body.setParts` when setting parts to ensure correct updates of all properties.
    *
    * @property parts
    * @type body[]
    */
  var parts: js.Array[Body] = js.native
  /**
    * A `Vector` that specifies the current world-space position of the body.
    *
    * @property position
    * @type vector
    * @default { x: 0, y:      */
  var position: Vector = js.native
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  var render: IBodyRenderOptions = js.native
  /**
    * A `Number` that defines the restitution (elasticity) of the body. The value is always positive and is in the range `(0, 1)`.
    * A value of `0` means collisions may be perfectly inelastic and no bouncing may occur.
    * A value of `0.8` means the body may bounce back with approximately 80% of its kinetic energy.
    * Note that collision response is based on _pairs_ of bodies, and that `restitution` values are _combined_ with the following formula:
    *
    *     Math.max(bodyA.restitution, bodyB.restitution)
    *
    * @property restitution
    * @type number
    * @default 0
    */
  var restitution: Double = js.native
  /**
    * A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping by the `Matter.Sleeping` module (if sleeping is enabled by the engine).
    *
    * @property sleepThreshold
    * @type number
    * @default 60
    */
  var sleepThreshold: Double = js.native
  /**
    * A `Number` that specifies a tolerance on how far a body is allowed to 'sink' or rotate into other bodies.
    * Avoid changing this value unless you understand the purpose of `slop` in physics engines.
    * The default should generally suffice, although very large bodies may require larger values for stable stacking.
    *
    * @property slop
    * @type number
    * @default 0.05
    */
  var slop: Double = js.native
  /**
    * A `Number` that _measures_ the current speed of the body after the last `Body.update`. It is read-only and always positive (it's the magnitude of `body.velocity`).
    *
    * @readOnly
    * @property speed
    * @type number
    * @default 0
    */
  var speed: Double = js.native
  /**
    * A `Number` that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    *
    * @property timeScale
    * @type number
    * @default 1
    */
  var timeScale: Double = js.native
  /**
    * A `Number` that specifies the torque (turning force) to apply in the current step. It is zeroed after every `Body.update`.
    *
    * @property torque
    * @type number
    * @default 0
    */
  var torque: Double = js.native
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "body"
    */
  var `type`: String = js.native
  /**
    * A `Vector` that _measures_ the current velocity of the body after the last `Body.update`. It is read-only.
    * If you need to modify a body's velocity directly, you should either apply a force or simply change the body's `position` (as the engine uses position-Verlet integration).
    *
    * @readOnly
    * @property velocity
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var velocity: Vector = js.native
  /**
    * An array of `Vector` objects that specify the convex hull of the rigid body.
    * These should be provided about the origin `(0, 0)`. E.g.
    *
    *     [{ x: 0, y: 0 }, { x: 25, y: 50 }, { x: 50, y: 0 }]
    *
    * When passed via `Body.create`, the vertices are translated relative to `body.position` (i.e. world-space, and constantly updated by `Body.update` during simulation).
    * The `Vector` objects are also augmented with additional properties required for efficient collision detection.
    *
    * Other properties such as `inertia` and `bounds` are automatically calculated from the passed vertices (unless provided via `options`).
    * Concave hulls are not currently supported. The module `Matter.Vertices` contains useful methods for working with vertices.
    *
    * @property vertices
    * @type vector[]
    */
  var vertices: js.Array[Vector] = js.native
}

/* static members */
@JSImport("matter-js", "Body")
@js.native
object Body extends js.Object {
  /**
    * Applies a force to a body from a given world-space position, including resulting torque.
    * @method applyForce
    * @param {body} body
    * @param {vector} position
    * @param {vector} force
    */
  def applyForce(body: Body, position: Vector, force: Vector): Unit = js.native
  /**
    * Creates a new rigid body model. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {body} body
    */
  def create(options: IBodyDefinition): Body = js.native
  /**
    * Returns the next unique category bitfield (starting after the initial default category `0x0001`).
    * There are 32 available. See `body.collisionFilter` for more information.
    * @method nextCategory
    * @return {Number} Unique category bitfield
    */
  def nextCategory(): Double = js.native
  /**
    * Returns the next unique group index for which bodies will collide.
    * If `isNonColliding` is `true`, returns the next unique group index for which bodies will _not_ collide.
    * See `body.collisionFilter` for more information.
    * @method nextGroup
    * @param {bool} [isNonColliding=false]
    * @return {Number} Unique group index
    */
  def nextGroup(isNonColliding: Boolean): Double = js.native
  /**
    * Rotates a body by a given angle relative to its current angle, without imparting any angular velocity.
    * @method rotate
    * @param {body} body
    * @param {number} rotation
    */
  def rotate(body: Body, rotation: Double): Unit = js.native
  /**
    * Scales the body, including updating physical properties (mass, area, axes, inertia), from a world-space point (default is body centre).
    * @method scale
    * @param {body} body
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {vector} [point]
    */
  def scale(body: Body, scaleX: Double, scaleY: Double): Unit = js.native
  def scale(body: Body, scaleX: Double, scaleY: Double, point: Vector): Unit = js.native
  /**
    * Given a property and a value (or map of), sets the property(s) on the body, using the appropriate setter functions if they exist.
    * Prefer to use the actual setter functions in performance critical situations.
    * @method set
    * @param {body} body
    * @param {} settings A property name (or map of properties and values) to set on the body.
    * @param {} value The value to set if `settings` is a single property name.
    */
  def set(body: Body, settings: js.Any): Unit = js.native
  def set(body: Body, settings: js.Any, value: js.Any): Unit = js.native
  /**
    * Sets the angle of the body instantly. Angular velocity, position, force etc. are unchanged.
    * @method setAngle
    * @param {body} body
    * @param {number} angle
    */
  def setAngle(body: Body, angle: Double): Unit = js.native
  /**
    * Sets the angular velocity of the body instantly. Position, angle, force etc. are unchanged. See also `Body.applyForce`.
    * @method setAngularVelocity
    * @param {body} body
    * @param {number} velocity
    */
  def setAngularVelocity(body: Body, velocity: Double): Unit = js.native
  /**
    * Sets the density of the body. Mass is automatically updated to reflect the change.
    * @method setDensity
    * @param {body} body
    * @param {number} density
    */
  def setDensity(body: Body, density: Double): Unit = js.native
  /**
    * Sets the moment of inertia (i.e. second moment of area) of the body of the body.
    * Inverse inertia is automatically updated to reflect the change. Mass is not changed.
    * @method setInertia
    * @param {body} body
    * @param {number} inertia
    */
  def setInertia(body: Body, interna: Double): Unit = js.native
  /**
    * Sets the mass of the body. Inverse mass and density are automatically updated to reflect the change.
    * @method setMass
    * @param {body} body
    * @param {number} mass
    */
  def setMass(body: Body, mass: Double): Unit = js.native
  /**
    * Sets the parts of the `body` and updates mass, inertia and centroid.
    * Each part will have its parent set to `body`.
    * By default the convex hull will be automatically computed and set on `body`, unless `autoHull` is set to `false.`
    * Note that this method will ensure that the first part in `body.parts` will always be the `body`.
    * @method setParts
    * @param {body} body
    * @param [body] parts
    * @param {bool} [autoHull=true]
    */
  def setParts(body: Body, parts: js.Array[Body]): Unit = js.native
  def setParts(body: Body, parts: js.Array[Body], autoHull: Boolean): Unit = js.native
  /**
    * Sets the position of the body instantly. Velocity, angle, force etc. are unchanged.
    * @method setPosition
    * @param {body} body
    * @param {vector} position
    */
  def setPosition(body: Body, position: Vector): Unit = js.native
  /**
    * Sets the body as static, including isStatic flag and setting mass and inertia to Infinity.
    * @method setStatic
    * @param {body} body
    * @param {bool} isStatic
    */
  def setStatic(body: Body, isStatic: Boolean): Unit = js.native
  /**
    * Sets the linear velocity of the body instantly. Position, angle, force etc. are unchanged. See also `Body.applyForce`.
    * @method setVelocity
    * @param {body} body
    * @param {vector} velocity
    */
  def setVelocity(body: Body, velocity: Vector): Unit = js.native
  /**
    * Sets the body's vertices and updates body properties accordingly, including inertia, area and mass (with respect to `body.density`).
    * Vertices will be automatically transformed to be orientated around their centre of mass as the origin.
    * They are then automatically translated to world space based on `body.position`.
    *
    * The `vertices` argument should be passed as an array of `Matter.Vector` points (or a `Matter.Vertices` array).
    * Vertices must form a convex hull, concave hulls are not supported.
    *
    * @method setVertices
    * @param {body} body
    * @param {vector[]} vertices
    */
  def setVertices(body: Body, vertices: js.Array[Vector]): Unit = js.native
  /**
    * Moves a body by a given vector relative to its current position, without imparting any velocity.
    * @method translate
    * @param {body} body
    * @param {vector} translation
    */
  def translate(body: Body, translation: Vector): Unit = js.native
  /**
    * Performs a simulation step for the given `body`, including updating position and angle using Verlet integration.
    * @method update
    * @param {body} body
    * @param {number} deltaTime
    * @param {number} timeScale
    * @param {number} correction
    */
  def update(body: Body, deltaTime: Double, timeScale: Double, correction: Double): Unit = js.native
}

