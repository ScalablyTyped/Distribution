package typings.luminoDatagrid.renderermapMod.RendererMap

import typings.luminoDatagrid.cellrendererMod.CellRenderer
import typings.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a `RendererMap` values type.
  */
/* Inlined {[ R in @lumino/datagrid.@lumino/datagrid/lib/datamodel.DataModel.CellRegion ]:? @lumino/datagrid.@lumino/datagrid/lib/renderermap.RendererMap.Resolver | @lumino/datagrid.@lumino/datagrid/lib/cellrenderer.CellRenderer | undefined} */
@js.native
trait Values extends js.Object {
  var body: js.UndefOr[Resolver | CellRenderer] = js.native
  var `column-header`: js.UndefOr[Resolver | CellRenderer] = js.native
  var `corner-header`: js.UndefOr[Resolver | CellRenderer] = js.native
  var `row-header`: js.UndefOr[Resolver | CellRenderer] = js.native
}

object Values {
  @scala.inline
  def apply(): Values = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Values]
  }
  @scala.inline
  implicit class ValuesOps[Self <: Values] (val x: Self) extends AnyVal {
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
    def setBodyFunction1(value: /* config */ CellConfig => js.UndefOr[CellRenderer]): Self = this.set("body", js.Any.fromFunction1(value))
    @scala.inline
    def setBody(value: Resolver | CellRenderer): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def `setColumn-headerFunction1`(value: /* config */ CellConfig => js.UndefOr[CellRenderer]): Self = this.set("column-header", js.Any.fromFunction1(value))
    @scala.inline
    def `setColumn-header`(value: Resolver | CellRenderer): Self = this.set("column-header", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-header`: Self = this.set("column-header", js.undefined)
    @scala.inline
    def `setCorner-headerFunction1`(value: /* config */ CellConfig => js.UndefOr[CellRenderer]): Self = this.set("corner-header", js.Any.fromFunction1(value))
    @scala.inline
    def `setCorner-header`(value: Resolver | CellRenderer): Self = this.set("corner-header", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCorner-header`: Self = this.set("corner-header", js.undefined)
    @scala.inline
    def `setRow-headerFunction1`(value: /* config */ CellConfig => js.UndefOr[CellRenderer]): Self = this.set("row-header", js.Any.fromFunction1(value))
    @scala.inline
    def `setRow-header`(value: Resolver | CellRenderer): Self = this.set("row-header", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRow-header`: Self = this.set("row-header", js.undefined)
  }
  
}

