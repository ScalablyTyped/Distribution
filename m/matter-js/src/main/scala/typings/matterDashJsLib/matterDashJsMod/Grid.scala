package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Grid")
@js.native
class Grid ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.Grid

/* static members */
@JSImport("matter-js", "Grid")
@js.native
object Grid extends js.Object {
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  def clear(grid: matterDashJsLib.matterDashJsMod.MatterNs.Grid): scala.Unit = js.native
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  def create(): matterDashJsLib.matterDashJsMod.MatterNs.Grid = js.native
  def create(options: matterDashJsLib.matterDashJsMod.MatterNs.IGridDefinition): matterDashJsLib.matterDashJsMod.MatterNs.Grid = js.native
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  def update(
    grid: matterDashJsLib.matterDashJsMod.MatterNs.Grid,
    bodies: js.Array[matterDashJsLib.matterDashJsMod.MatterNs.Body],
    engine: matterDashJsLib.matterDashJsMod.MatterNs.Engine,
    forceUpdate: scala.Boolean
  ): scala.Unit = js.native
}

