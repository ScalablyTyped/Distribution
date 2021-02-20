package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "World")
@js.native
class World () extends Composite {
  
  var bounds: Bounds = js.native
  
  var gravity: Gravity = js.native
}
/* static members */
object World {
  
  @JSImport("matter-js", "World.add")
  @js.native
  def add(world: World, body: js.Array[Body | Composite | Constraint]): World = js.native
  /**
    * Add objects or arrays of objects of types: Body, Constraint, Composite
    * @param world
    * @param body
    * @returns world
    */
  @JSImport("matter-js", "World.add")
  @js.native
  def add(world: World, body: Body): World = js.native
  @JSImport("matter-js", "World.add")
  @js.native
  def add(world: World, body: Composite): World = js.native
  @JSImport("matter-js", "World.add")
  @js.native
  def add(world: World, body: Constraint): World = js.native
  @JSImport("matter-js", "World.add")
  @js.native
  def add(world: World, body: MouseConstraint): World = js.native
  
  /**
    * An alias for Composite.addBody since World is also a Composite
    * @method addBody
    * @param {world} world
    * @param {body} body
    * @return {world} The original world with the body added
    */
  @JSImport("matter-js", "World.addBody")
  @js.native
  def addBody(world: World, body: Body): World = js.native
  
  /**
    * An alias for Composite.add since World is also a Composite
    * @method addComposite
    * @param {world} world
    * @param {composite} composite
    * @return {world} The original world with the objects from composite added
    */
  @JSImport("matter-js", "World.addComposite")
  @js.native
  def addComposite(world: World, composite: Composite): World = js.native
  
  /**
    * An alias for Composite.addConstraint since World is also a Composite
    * @method addConstraint
    * @param {world} world
    * @param {constraint} constraint
    * @return {world} The original world with the constraint added
    */
  @JSImport("matter-js", "World.addConstraint")
  @js.native
  def addConstraint(world: World, constraint: Constraint): World = js.native
  
  /**
    * An alias for Composite.clear since World is also a Composite
    * @method clear
    * @param {world} world
    * @param {boolean} keepStatic
    */
  @JSImport("matter-js", "World.clear")
  @js.native
  def clear(world: World, keepStatic: Boolean): Unit = js.native
  
  /**
    * Creates a new world composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @constructor
    * @param {} options
    * @return {world} A new world
    */
  @JSImport("matter-js", "World.create")
  @js.native
  def create(options: IWorldDefinition): World = js.native
}
