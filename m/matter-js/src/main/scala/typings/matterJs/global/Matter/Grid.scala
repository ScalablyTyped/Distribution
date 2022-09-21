package typings.matterJs.global.Matter

import typings.matterJs.mod.IGridDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Grid")
@js.native
open class Grid ()
  extends typings.matterJs.mod.Grid
/* static members */
object Grid {
  
  @JSGlobal("Matter.Grid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the grid.
    * @deprecated replaced by Matter.Detector
    * @method clear
    * @param {grid} grid
    */
  inline def clear(grid: typings.matterJs.mod.Grid): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a new grid.
    * @deprecated replaced by Matter.Detector
    * @method create
    * @param {} options
    * @returns {grid} A new grid
    */
  inline def create(): typings.matterJs.mod.Grid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.matterJs.mod.Grid]
  inline def create(options: IGridDefinition): typings.matterJs.mod.Grid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Grid]
  
  /**
    * Updates the grid.
    * @method update
    * @deprecated replaced by Matter.Detector
    * @param {grid} grid
    * @param {Body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  inline def update(
    grid: typings.matterJs.mod.Grid,
    bodies: js.Array[typings.matterJs.mod.Body],
    engine: typings.matterJs.mod.Engine,
    forceUpdate: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(grid.asInstanceOf[js.Any], bodies.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], forceUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
