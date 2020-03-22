package typings.luminoDatagrid

import typings.luminoDatagrid.celleditorMod.CellDataType
import typings.luminoDatagrid.celleditorcontrollerMod._EditorOverrideIdentifier
import typings.luminoDatagrid.datagridMod.DataGrid.HeaderVisibility
import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.datamodelMod.DataModel.ColumnRegion
import typings.luminoDatagrid.datamodelMod.DataModel.RowRegion
import typings.luminoDatagrid.notificationMod.Notification.Placement
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.ClearMode
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.SelectionMode
import typings.luminoDatagrid.textrendererMod.TextRenderer.HorizontalAlignment
import typings.luminoDatagrid.textrendererMod.TextRenderer.VerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object luminoDatagridStrings {
  @js.native
  sealed trait all
    extends ClearMode
       with HeaderVisibility
  
  @js.native
  sealed trait body
    extends CellRegion
       with ColumnRegion
       with RowRegion
  
  @js.native
  sealed trait boolean extends CellDataType
  
  @js.native
  sealed trait bottom
    extends Placement
       with VerticalAlignment
  
  @js.native
  sealed trait cell extends SelectionMode
  
  @js.native
  sealed trait `cells-changed` extends js.Object
  
  @js.native
  sealed trait center
    extends HorizontalAlignment
       with VerticalAlignment
  
  @js.native
  sealed trait column
    extends HeaderVisibility
       with SelectionMode
  
  @js.native
  sealed trait `column-header`
    extends CellRegion
       with RowRegion
  
  @js.native
  sealed trait `columns-inserted` extends js.Object
  
  @js.native
  sealed trait `columns-moved` extends js.Object
  
  @js.native
  sealed trait `columns-removed` extends js.Object
  
  @js.native
  sealed trait `corner-header` extends CellRegion
  
  @js.native
  sealed trait current extends ClearMode
  
  @js.native
  sealed trait date extends CellDataType
  
  @js.native
  sealed trait `dateColondynamic-option` extends CellDataType
  
  @js.native
  sealed trait dateColonoption extends CellDataType
  
  @js.native
  sealed trait default extends _EditorOverrideIdentifier
  
  @js.native
  sealed trait down extends CursorMoveDirection
  
  @js.native
  sealed trait integer extends CellDataType
  
  @js.native
  sealed trait `integerColondynamic-option` extends CellDataType
  
  @js.native
  sealed trait integerColonoption extends CellDataType
  
  @js.native
  sealed trait left
    extends CursorMoveDirection
       with HorizontalAlignment
       with Placement
  
  @js.native
  sealed trait `model-reset` extends js.Object
  
  @js.native
  sealed trait none
    extends ClearMode
       with CursorMoveDirection
       with HeaderVisibility
  
  @js.native
  sealed trait number extends CellDataType
  
  @js.native
  sealed trait `numberColondynamic-option` extends CellDataType
  
  @js.native
  sealed trait numberColonoption extends CellDataType
  
  @js.native
  sealed trait right
    extends CursorMoveDirection
       with HorizontalAlignment
       with Placement
  
  @js.native
  sealed trait row
    extends HeaderVisibility
       with SelectionMode
  
  @js.native
  sealed trait `row-header`
    extends CellRegion
       with ColumnRegion
  
  @js.native
  sealed trait `rows-inserted` extends js.Object
  
  @js.native
  sealed trait `rows-moved` extends js.Object
  
  @js.native
  sealed trait `rows-removed` extends js.Object
  
  @js.native
  sealed trait string extends CellDataType
  
  @js.native
  sealed trait `stringColondynamic-option` extends CellDataType
  
  @js.native
  sealed trait stringColonoption extends CellDataType
  
  @js.native
  sealed trait top
    extends Placement
       with VerticalAlignment
  
  @js.native
  sealed trait up extends CursorMoveDirection
  
  @js.native
  sealed trait void extends js.Object
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  @scala.inline
  def `cells-changed`: `cells-changed` = "cells-changed".asInstanceOf[`cells-changed`]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  @scala.inline
  def `column-header`: `column-header` = "column-header".asInstanceOf[`column-header`]
  @scala.inline
  def `columns-inserted`: `columns-inserted` = "columns-inserted".asInstanceOf[`columns-inserted`]
  @scala.inline
  def `columns-moved`: `columns-moved` = "columns-moved".asInstanceOf[`columns-moved`]
  @scala.inline
  def `columns-removed`: `columns-removed` = "columns-removed".asInstanceOf[`columns-removed`]
  @scala.inline
  def `corner-header`: `corner-header` = "corner-header".asInstanceOf[`corner-header`]
  @scala.inline
  def current: current = "current".asInstanceOf[current]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def `dateColondynamic-option`: `dateColondynamic-option` = "date:dynamic-option".asInstanceOf[`dateColondynamic-option`]
  @scala.inline
  def dateColonoption: dateColonoption = "date:option".asInstanceOf[dateColonoption]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def `integerColondynamic-option`: `integerColondynamic-option` = "integer:dynamic-option".asInstanceOf[`integerColondynamic-option`]
  @scala.inline
  def integerColonoption: integerColonoption = "integer:option".asInstanceOf[integerColonoption]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `model-reset`: `model-reset` = "model-reset".asInstanceOf[`model-reset`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `numberColondynamic-option`: `numberColondynamic-option` = "number:dynamic-option".asInstanceOf[`numberColondynamic-option`]
  @scala.inline
  def numberColonoption: numberColonoption = "number:option".asInstanceOf[numberColonoption]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  @scala.inline
  def `row-header`: `row-header` = "row-header".asInstanceOf[`row-header`]
  @scala.inline
  def `rows-inserted`: `rows-inserted` = "rows-inserted".asInstanceOf[`rows-inserted`]
  @scala.inline
  def `rows-moved`: `rows-moved` = "rows-moved".asInstanceOf[`rows-moved`]
  @scala.inline
  def `rows-removed`: `rows-removed` = "rows-removed".asInstanceOf[`rows-removed`]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def `stringColondynamic-option`: `stringColondynamic-option` = "string:dynamic-option".asInstanceOf[`stringColondynamic-option`]
  @scala.inline
  def stringColonoption: stringColonoption = "string:option".asInstanceOf[stringColonoption]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  @scala.inline
  def void: void = "void".asInstanceOf[void]
}

