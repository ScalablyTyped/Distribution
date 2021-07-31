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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminoDatagridStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with _EditorOverrideIdentifier
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait all
    extends StObject
       with ClearMode
       with HeaderVisibility
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait body
    extends StObject
       with CellRegion
       with ColumnRegion
       with RowRegion
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait boolean
    extends StObject
       with CellDataType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait bottom
    extends StObject
       with Placement
       with VerticalAlignment
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait cell
    extends StObject
       with SelectionMode
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait `cells-changed` extends StObject
  @scala.inline
  def `cells-changed`: `cells-changed` = "cells-changed".asInstanceOf[`cells-changed`]
  
  @js.native
  sealed trait center
    extends StObject
       with HorizontalAlignment
       with VerticalAlignment
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait column
    extends StObject
       with HeaderVisibility
       with SelectionMode
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait `column-header`
    extends StObject
       with CellRegion
       with RowRegion
  @scala.inline
  def `column-header`: `column-header` = "column-header".asInstanceOf[`column-header`]
  
  @js.native
  sealed trait `columns-inserted` extends StObject
  @scala.inline
  def `columns-inserted`: `columns-inserted` = "columns-inserted".asInstanceOf[`columns-inserted`]
  
  @js.native
  sealed trait `columns-moved` extends StObject
  @scala.inline
  def `columns-moved`: `columns-moved` = "columns-moved".asInstanceOf[`columns-moved`]
  
  @js.native
  sealed trait `columns-removed` extends StObject
  @scala.inline
  def `columns-removed`: `columns-removed` = "columns-removed".asInstanceOf[`columns-removed`]
  
  @js.native
  sealed trait `corner-header`
    extends StObject
       with CellRegion
  @scala.inline
  def `corner-header`: `corner-header` = "corner-header".asInstanceOf[`corner-header`]
  
  @js.native
  sealed trait current
    extends StObject
       with ClearMode
  @scala.inline
  def current: current = "current".asInstanceOf[current]
  
  @js.native
  sealed trait date
    extends StObject
       with CellDataType
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait `dateColondynamic-option`
    extends StObject
       with CellDataType
  @scala.inline
  def `dateColondynamic-option`: `dateColondynamic-option` = "date:dynamic-option".asInstanceOf[`dateColondynamic-option`]
  
  @js.native
  sealed trait dateColonoption
    extends StObject
       with CellDataType
  @scala.inline
  def dateColonoption: dateColonoption = "date:option".asInstanceOf[dateColonoption]
  
  @js.native
  sealed trait down
    extends StObject
       with CursorMoveDirection
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait integer
    extends StObject
       with CellDataType
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait `integerColondynamic-option`
    extends StObject
       with CellDataType
  @scala.inline
  def `integerColondynamic-option`: `integerColondynamic-option` = "integer:dynamic-option".asInstanceOf[`integerColondynamic-option`]
  
  @js.native
  sealed trait integerColonoption
    extends StObject
       with CellDataType
  @scala.inline
  def integerColonoption: integerColonoption = "integer:option".asInstanceOf[integerColonoption]
  
  @js.native
  sealed trait left
    extends StObject
       with CursorMoveDirection
       with HorizontalAlignment
       with Placement
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `model-reset` extends StObject
  @scala.inline
  def `model-reset`: `model-reset` = "model-reset".asInstanceOf[`model-reset`]
  
  @js.native
  sealed trait none
    extends StObject
       with ClearMode
       with CursorMoveDirection
       with HeaderVisibility
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait number
    extends StObject
       with CellDataType
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `numberColondynamic-option`
    extends StObject
       with CellDataType
  @scala.inline
  def `numberColondynamic-option`: `numberColondynamic-option` = "number:dynamic-option".asInstanceOf[`numberColondynamic-option`]
  
  @js.native
  sealed trait numberColonoption
    extends StObject
       with CellDataType
  @scala.inline
  def numberColonoption: numberColonoption = "number:option".asInstanceOf[numberColonoption]
  
  @js.native
  sealed trait right
    extends StObject
       with CursorMoveDirection
       with HorizontalAlignment
       with Placement
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait row
    extends StObject
       with HeaderVisibility
       with SelectionMode
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait `row-header`
    extends StObject
       with CellRegion
       with ColumnRegion
  @scala.inline
  def `row-header`: `row-header` = "row-header".asInstanceOf[`row-header`]
  
  @js.native
  sealed trait `rows-inserted` extends StObject
  @scala.inline
  def `rows-inserted`: `rows-inserted` = "rows-inserted".asInstanceOf[`rows-inserted`]
  
  @js.native
  sealed trait `rows-moved` extends StObject
  @scala.inline
  def `rows-moved`: `rows-moved` = "rows-moved".asInstanceOf[`rows-moved`]
  
  @js.native
  sealed trait `rows-removed` extends StObject
  @scala.inline
  def `rows-removed`: `rows-removed` = "rows-removed".asInstanceOf[`rows-removed`]
  
  @js.native
  sealed trait string
    extends StObject
       with CellDataType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait `stringColondynamic-option`
    extends StObject
       with CellDataType
  @scala.inline
  def `stringColondynamic-option`: `stringColondynamic-option` = "string:dynamic-option".asInstanceOf[`stringColondynamic-option`]
  
  @js.native
  sealed trait stringColonoption
    extends StObject
       with CellDataType
  @scala.inline
  def stringColonoption: stringColonoption = "string:option".asInstanceOf[stringColonoption]
  
  @js.native
  sealed trait top
    extends StObject
       with Placement
       with VerticalAlignment
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait up
    extends StObject
       with CursorMoveDirection
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait void extends StObject
  @scala.inline
  def void: void = "void".asInstanceOf[void]
}
