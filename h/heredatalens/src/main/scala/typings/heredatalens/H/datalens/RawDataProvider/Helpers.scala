package typings.heredatalens.H.datalens.RawDataProvider

import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper class used in the worker thread
  * This helper class provides convenience functions you can use in the worker thread
  */
@js.native
trait Helpers extends js.Object {
  /** Translates geographical coordinates (latitude, longitude) to world pixel coordinates. */
  var latLngToPixel: js.UndefOr[
    js.Function4[
      /* latitude */ Latitude, 
      /* longitude */ Longitude, 
      /* z */ Zoom, 
      /* tileSize */ TileSize, 
      PixelCoordinates
    ]
  ] = js.native
  /** Takes CSV data as input, parses it, and return the parsed result. */
  var parseCSV: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[_]]] = js.native
  /** Translates world pixel coordinates to geographical coordinates (latitude, longitude). */
  var pixelToLatLng: js.UndefOr[
    js.Function4[/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize, GeoCoordinates]
  ] = js.native
}

object Helpers {
  @scala.inline
  def apply(): Helpers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Helpers]
  }
  @scala.inline
  implicit class HelpersOps[Self <: Helpers] (val x: Self) extends AnyVal {
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
    def setLatLngToPixel(
      value: (/* latitude */ Latitude, /* longitude */ Longitude, /* z */ Zoom, /* tileSize */ TileSize) => PixelCoordinates
    ): Self = this.set("latLngToPixel", js.Any.fromFunction4(value))
    @scala.inline
    def deleteLatLngToPixel: Self = this.set("latLngToPixel", js.undefined)
    @scala.inline
    def setParseCSV(value: /* obj */ js.Any => js.Array[_]): Self = this.set("parseCSV", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParseCSV: Self = this.set("parseCSV", js.undefined)
    @scala.inline
    def setPixelToLatLng(value: (/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize) => GeoCoordinates): Self = this.set("pixelToLatLng", js.Any.fromFunction4(value))
    @scala.inline
    def deletePixelToLatLng: Self = this.set("pixelToLatLng", js.undefined)
  }
  
}

