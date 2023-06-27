package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "World")
@js.native
open class World () extends Composite {
  
  var bounds: Bounds = js.native
  
  /**
    * @deprecated moved to engine.gravity
    */
  var gravity: Gravity = js.native
}
/* static members */
object World {
  
  @JSImport("matter-js", "World")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(world: World, body: js.Array[Body | Composite | Constraint | MouseConstraint]): World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[World]
  /**
    * Add objects or arrays of objects of types: Body, Constraint, Composite
    * @param world
    * @param body
    * @returns world
    */
  inline def add(world: World, body: Body): World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[World]
  inline def add(world: World, body: Composite): World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[World]
  inline def add(world: World, body: Constraint): World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[World]
  inline def add(world: World, body: MouseConstraint): World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[World]
  
  /**
    * An alias for Composite.addBody since World is also a Composite
    * @method addBody
    * @param {world} world
    * @param {Body} body
    * @returns {world} The original world with the body added
    */
  inline def addBody(world: World, body: Body): World = (^.asInstanceOf[js.Dynamic].applyDynamic("addBody")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[World]
  
  /**
    * An alias for Composite.add since World is also a Composite
    * @method addComposite
    * @param {world} world
    * @param {Composite} composite
    * @returns {world} The original world with the objects from composite added
    */
  inline def addComposite(world: World, composite: Composite): World = (^.asInstanceOf[js.Dynamic].applyDynamic("addComposite")(world.asInstanceOf[js.Any], composite.asInstanceOf[js.Any])).asInstanceOf[World]
  
  /**
    * An alias for Composite.addConstraint since World is also a Composite
    * @method addConstraint
    * @param {world} world
    * @param {constraint} constraint
    * @returns {world} The original world with the constraint added
    */
  inline def addConstraint(world: World, constraint: Constraint): World = (^.asInstanceOf[js.Dynamic].applyDynamic("addConstraint")(world.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[World]
  
  /**
    * An alias for Composite.clear since World is also a Composite
    * @method clear
    * @param {world} world
    * @param {boolean} keepStatic
    */
  inline def clear(world: World, keepStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(world.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new world composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @returns {world} A new world
    */
  inline def create(options: IWorldDefinition): World = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[World]
}
