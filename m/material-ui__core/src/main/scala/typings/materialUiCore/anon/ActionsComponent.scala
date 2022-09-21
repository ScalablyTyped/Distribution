package typings.materialUiCore.anon

import typings.materialUiCore.iconButtonIconButtonMod.IconButtonProps
import typings.materialUiCore.tablePaginationActionsMod.TablePaginationActionsProps
import typings.materialUiCore.tablePaginationTablePaginationMod.LabelDisplayedRowsArgs
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsComponent extends StObject {
  
  var ActionsComponent: js.UndefOr[ElementType[TablePaginationActionsProps]] = js.native
  
  var SelectProps: js.UndefOr[PartialSelectProps] = js.native
  
  var backIconButtonProps: js.UndefOr[
    Partial[
      IconButtonProps[
        /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.ClassKey['defaultComponent'] */ js.Any, 
        js.Object
      ]
    ]
  ] = js.native
  
  var backIconButtonText: js.UndefOr[String] = js.native
  
  var count: Double = js.native
  
  var labelDisplayedRows: js.UndefOr[js.Function1[/* paginationInfo */ LabelDisplayedRowsArgs, ReactNode]] = js.native
  
  var labelRowsPerPage: js.UndefOr[ReactNode] = js.native
  
  var nextIconButtonProps: js.UndefOr[
    Partial[
      IconButtonProps[
        /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.ClassKey['defaultComponent'] */ js.Any, 
        js.Object
      ]
    ]
  ] = js.native
  
  var nextIconButtonText: js.UndefOr[String] = js.native
  
  /**
    * Callback fired when the page is changed.
    *
    * @param {object} event The event source of the callback.
    * @param {number} page The page selected.
    * @deprecated Use the onPageChange prop instead.
    */
  var onChangePage: js.UndefOr[
    js.Function2[
      /* event */ (MouseEvent[HTMLButtonElement, NativeMouseEvent]) | Null, 
      /* page */ Double, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback fired when the number of rows per page is changed.
    *
    * @param {object} event The event source of the callback.
    * @deprecated Use the onRowsPerPageChange prop instead.
    */
  var onChangeRowsPerPage: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement | HTMLInputElement]] = js.native
  
  def onPageChange(event: Null, page: Double): Unit = js.native
  def onPageChange(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], page: Double): Unit = js.native
  
  var onRowsPerPageChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement | HTMLInputElement]] = js.native
  
  var page: Double = js.native
  
  var rowsPerPage: Double = js.native
  
  var rowsPerPageOptions: js.UndefOr[js.Array[Double | Label]] = js.native
}
