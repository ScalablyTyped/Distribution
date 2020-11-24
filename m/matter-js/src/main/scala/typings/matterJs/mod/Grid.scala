package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Grid")
@js.native
class Grid () extends js.Object {
  
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
@JSImport("matter-js", "Grid")
@js.native
object Grid extends js.Object {
  
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  def clear(grid: Grid): Unit = js.native
  
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  def create(): Grid = js.native
  def create(options: IGridDefinition): Grid = js.native
  
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  def update(grid: Grid, bodies: js.Array[Body], engine: Engine, forceUpdate: Boolean): Unit = js.native
}
