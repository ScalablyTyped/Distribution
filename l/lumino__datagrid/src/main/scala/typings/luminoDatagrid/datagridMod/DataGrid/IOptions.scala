package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.cellrendererMod.CellRenderer
import typings.luminoDatagrid.renderermapMod.RendererMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a data grid.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The cell renderer map for the data grid.
    *
    * The default is an empty renderer map.
    */
  var cellRenderers: js.UndefOr[RendererMap] = js.native
  
  /**
    * The copy configuration data for the grid.
    *
    * The default is `DataGrid.defaultCopyConfig`.
    */
  var copyConfig: js.UndefOr[CopyConfig] = js.native
  
  /**
    * The default cell renderer for the data grid.
    *
    * The default is a new `TextRenderer`.
    */
  var defaultRenderer: js.UndefOr[CellRenderer] = js.native
  
  /**
    * The default sizes for the data grid.
    *
    * The default is `DataGrid.defaultSizes`.
    */
  var defaultSizes: js.UndefOr[DefaultSizes_] = js.native
  
  /**
    * The header visibility for the data grid.
    *
    * The default is `'all'`.
    */
  var headerVisibility: js.UndefOr[HeaderVisibility] = js.native
  
  /**
    * Whether to stretch the last column of the grid.
    *
    * The default is `false`.
    */
  var stretchLastColumn: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to stretch the last row of the grid.
    *
    * The default is `false`.
    */
  var stretchLastRow: js.UndefOr[Boolean] = js.native
  
  /**
    * The style for the data grid.
    *
    * The default is `DataGrid.defaultStyle`.
    */
  var style: js.UndefOr[Style] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellRenderers(value: RendererMap): Self = this.set("cellRenderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellRenderers: Self = this.set("cellRenderers", js.undefined)
    
    @scala.inline
    def setCopyConfig(value: CopyConfig): Self = this.set("copyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyConfig: Self = this.set("copyConfig", js.undefined)
    
    @scala.inline
    def setDefaultRenderer(value: CellRenderer): Self = this.set("defaultRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRenderer: Self = this.set("defaultRenderer", js.undefined)
    
    @scala.inline
    def setDefaultSizes(value: DefaultSizes_): Self = this.set("defaultSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSizes: Self = this.set("defaultSizes", js.undefined)
    
    @scala.inline
    def setHeaderVisibility(value: HeaderVisibility): Self = this.set("headerVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderVisibility: Self = this.set("headerVisibility", js.undefined)
    
    @scala.inline
    def setStretchLastColumn(value: Boolean): Self = this.set("stretchLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretchLastColumn: Self = this.set("stretchLastColumn", js.undefined)
    
    @scala.inline
    def setStretchLastRow(value: Boolean): Self = this.set("stretchLastRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretchLastRow: Self = this.set("stretchLastRow", js.undefined)
    
    @scala.inline
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
