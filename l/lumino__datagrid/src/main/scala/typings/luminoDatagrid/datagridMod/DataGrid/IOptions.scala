package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.cellrendererMod.CellRenderer
import typings.luminoDatagrid.renderermapMod.RendererMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a data grid.
  */
trait IOptions extends js.Object {
  /**
    * The cell renderer map for the data grid.
    *
    * The default is an empty renderer map.
    */
  var cellRenderers: js.UndefOr[RendererMap] = js.undefined
  /**
    * The copy configuration data for the grid.
    *
    * The default is `DataGrid.defaultCopyConfig`.
    */
  var copyConfig: js.UndefOr[CopyConfig] = js.undefined
  /**
    * The default cell renderer for the data grid.
    *
    * The default is a new `TextRenderer`.
    */
  var defaultRenderer: js.UndefOr[CellRenderer] = js.undefined
  /**
    * The default sizes for the data grid.
    *
    * The default is `DataGrid.defaultSizes`.
    */
  var defaultSizes: js.UndefOr[DefaultSizes_] = js.undefined
  /**
    * The header visibility for the data grid.
    *
    * The default is `'all'`.
    */
  var headerVisibility: js.UndefOr[HeaderVisibility] = js.undefined
  /**
    * Whether to stretch the last column of the grid.
    *
    * The default is `false`.
    */
  var stretchLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to stretch the last row of the grid.
    *
    * The default is `false`.
    */
  var stretchLastRow: js.UndefOr[Boolean] = js.undefined
  /**
    * The style for the data grid.
    *
    * The default is `DataGrid.defaultStyle`.
    */
  var style: js.UndefOr[Style] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    cellRenderers: RendererMap = null,
    copyConfig: CopyConfig = null,
    defaultRenderer: CellRenderer = null,
    defaultSizes: DefaultSizes_ = null,
    headerVisibility: HeaderVisibility = null,
    stretchLastColumn: js.UndefOr[Boolean] = js.undefined,
    stretchLastRow: js.UndefOr[Boolean] = js.undefined,
    style: Style = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (cellRenderers != null) __obj.updateDynamic("cellRenderers")(cellRenderers.asInstanceOf[js.Any])
    if (copyConfig != null) __obj.updateDynamic("copyConfig")(copyConfig.asInstanceOf[js.Any])
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(defaultRenderer.asInstanceOf[js.Any])
    if (defaultSizes != null) __obj.updateDynamic("defaultSizes")(defaultSizes.asInstanceOf[js.Any])
    if (headerVisibility != null) __obj.updateDynamic("headerVisibility")(headerVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchLastColumn)) __obj.updateDynamic("stretchLastColumn")(stretchLastColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchLastRow)) __obj.updateDynamic("stretchLastRow")(stretchLastRow.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

