package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "MouseConstraint")
@js.native
open class MouseConstraint () extends StObject {
  
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  var body: Body = js.native
  
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type {any}
    */
  var collisionFilter: ICollisionFilter = js.native
  
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  var constraint: Constraint = js.native
  
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @property mouse
    * @type mouse
    * @default mouse
    */
  var mouse: Mouse = js.native
  
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
object MouseConstraint {
  
  @JSImport("matter-js", "MouseConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new mouse constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {engine} engine
    * @param {} options
    * @returns {MouseConstraint} A new MouseConstraint
    */
  inline def create(engine: Engine): MouseConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(engine.asInstanceOf[js.Any]).asInstanceOf[MouseConstraint]
  inline def create(engine: Engine, options: IMouseConstraintDefinition): MouseConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(engine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MouseConstraint]
}
