package typings.heredatalens.H.datalens.RasterLayer

import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and rendering options for RasterLayer.
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with RasterLayer.defaultDataToRows.
  * This behavior can be changed by defining the dataToRows callback.
  * To collect the rows for a tile including buffer, the rows must be translated to RasterLayer.TilePoint.
  * This translation must be specified with the rowToTilePoint callback. The final rendering on the tile canvas must be defined in renderTile.
  */
@js.native
trait Options extends js.Object {
  /**
    * The buffer is a value (in pixels) that defines an extra area around each tile to capture data points from.
    * This is done to avoid drawing edges between tiles. For example, if data points represented with circles with a maximum radius of 10 pixels, then the buffer must be 10 pixels.
    */
  var buffer: js.UndefOr[js.Function1[/* zoom */ Zoom, Double]] = js.native
  /** Defines how the input tile data is split by rows. You can specify this callback to define client-side aggregation and filtering. This callback is called for each tile. */
  var dataToRows: js.UndefOr[
    js.Function4[
      /* data */ Data, 
      /* x */ typings.heredatalens.H.datalens.QueryTileProvider.X, 
      /* y */ typings.heredatalens.H.datalens.QueryTileProvider.Y, 
      /* zoom */ Zoom, 
      js.Array[Row]
    ]
  ] = js.native
  /**
    * Defines how tile data is represented on a canvas. Input points for each tile are collected with respect to the buffer.
    * For progressive rendering this callback may be called more than once for the tile.
    */
  var renderTile: js.UndefOr[
    js.Function3[
      /* points */ js.Array[TilePoint], 
      /* canvas */ HTMLCanvasElement, 
      /* zoom */ Zoom, 
      Unit
    ]
  ] = js.native
  /** Defines how the row is translated to the RasterLayer.TilePoint. This callback is called for each row that is returned from dataToRows. */
  var rowToTilePoint: js.UndefOr[js.Function3[/* row */ Row, /* x */ X, /* y */ Y, TilePoint]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBuffer(value: /* zoom */ Zoom => Double): Self = this.set("buffer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setDataToRows(
      value: (/* data */ Data, /* x */ typings.heredatalens.H.datalens.QueryTileProvider.X, /* y */ typings.heredatalens.H.datalens.QueryTileProvider.Y, /* zoom */ Zoom) => js.Array[Row]
    ): Self = this.set("dataToRows", js.Any.fromFunction4(value))
    @scala.inline
    def deleteDataToRows: Self = this.set("dataToRows", js.undefined)
    @scala.inline
    def setRenderTile(value: (/* points */ js.Array[TilePoint], /* canvas */ HTMLCanvasElement, /* zoom */ Zoom) => Unit): Self = this.set("renderTile", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderTile: Self = this.set("renderTile", js.undefined)
    @scala.inline
    def setRowToTilePoint(value: (/* row */ Row, /* x */ X, /* y */ Y) => TilePoint): Self = this.set("rowToTilePoint", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRowToTilePoint: Self = this.set("rowToTilePoint", js.undefined)
  }
  
}

