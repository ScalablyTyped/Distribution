package typings.luminoDatagrid.renderermapMod.RendererMap

import typings.luminoDatagrid.cellrendererMod.CellRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a `RendererMap` values type.
  */
/* Inlined {[ R in @lumino/datagrid.@lumino/datagrid/lib/datamodel.DataModel.CellRegion ]:? @lumino/datagrid.@lumino/datagrid/lib/renderermap.RendererMap.Resolver | @lumino/datagrid.@lumino/datagrid/lib/cellrenderer.CellRenderer | undefined} */
trait Values extends js.Object {
  var body: js.UndefOr[Resolver | CellRenderer] = js.undefined
  var `column-header`: js.UndefOr[Resolver | CellRenderer] = js.undefined
  var `corner-header`: js.UndefOr[Resolver | CellRenderer] = js.undefined
  var `row-header`: js.UndefOr[Resolver | CellRenderer] = js.undefined
}

object Values {
  @scala.inline
  def apply(
    body: Resolver | CellRenderer = null,
    `column-header`: Resolver | CellRenderer = null,
    `corner-header`: Resolver | CellRenderer = null,
    `row-header`: Resolver | CellRenderer = null
  ): Values = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (`column-header` != null) __obj.updateDynamic("column-header")(`column-header`.asInstanceOf[js.Any])
    if (`corner-header` != null) __obj.updateDynamic("corner-header")(`corner-header`.asInstanceOf[js.Any])
    if (`row-header` != null) __obj.updateDynamic("row-header")(`row-header`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
}

