package typings.jupyterlabCells.celldragutilsMod.CellDragUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabCells.jupyterlabCellsStrings.input
  - typings.jupyterlabCells.jupyterlabCellsStrings.prompt
  - typings.jupyterlabCells.jupyterlabCellsStrings.cell
  - typings.jupyterlabCells.jupyterlabCellsStrings.unknown
*/
trait ICellTargetArea extends js.Object

object ICellTargetArea {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cell: typings.jupyterlabCells.jupyterlabCellsStrings.cell = this.cast("cell")
  @scala.inline
  def input: typings.jupyterlabCells.jupyterlabCellsStrings.input = this.cast("input")
  @scala.inline
  def prompt: typings.jupyterlabCells.jupyterlabCellsStrings.prompt = this.cast("prompt")
  @scala.inline
  def unknown: typings.jupyterlabCells.jupyterlabCellsStrings.unknown = this.cast("unknown")
}

