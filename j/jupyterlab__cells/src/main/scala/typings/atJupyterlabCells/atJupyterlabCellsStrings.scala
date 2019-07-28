package typings.atJupyterlabCells

import typings.atJupyterlabCells.libCelldragutilsMod.CellDragUtilsNs.ICellTargetArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atJupyterlabCellsStrings {
  @js.native
  sealed trait cell extends ICellTargetArea
  
  @js.native
  sealed trait code extends js.Object
  
  @js.native
  sealed trait input extends ICellTargetArea
  
  @js.native
  sealed trait markdown extends js.Object
  
  @js.native
  sealed trait prompt extends ICellTargetArea
  
  @js.native
  sealed trait raw extends js.Object
  
  @js.native
  sealed trait unknown extends ICellTargetArea
  
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  @scala.inline
  def prompt: prompt = "prompt".asInstanceOf[prompt]
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}

