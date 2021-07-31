package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Grid")
@js.native
class Grid () extends StObject {
  
  /**
    * The height of a single grid bucket.
    *
    * @property type
    * @type number
    */
  var bucketHeight: Double = js.native
  
  /**
    * The width of a single grid bucket.
    *
    * @property type
    * @type number
    */
  var bucketWidth: Double = js.native
}
/* static members */
object Grid {
  
  @JSImport("matter-js", "Grid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  @scala.inline
  def clear(grid: Grid): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  @scala.inline
  def create(): Grid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Grid]
  @scala.inline
  def create(options: IGridDefinition): Grid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Grid]
  
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  @scala.inline
  def update(grid: Grid, bodies: js.Array[Body], engine: Engine, forceUpdate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(grid.asInstanceOf[js.Any], bodies.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], forceUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
