package typings.heredatalens.HNs.datalensNs.RawDataProviderNs

import typings.heredatalens.HNs.datalensNs.QueryTileProviderNs.Zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper class used in the worker thread
  * This helper class provides convenience functions you can use in the worker thread
  */
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
  ] = js.undefined
  /** Takes CSV data as input, parses it, and return the parsed result. */
  var parseCSV: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[_]]] = js.undefined
  /** Translates world pixel coordinates to geographical coordinates (latitude, longitude). */
  var pixelToLatLng: js.UndefOr[
    js.Function4[/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize, GeoCoordinates]
  ] = js.undefined
}

object Helpers {
  @scala.inline
  def apply(
    latLngToPixel: (/* latitude */ Latitude, /* longitude */ Longitude, /* z */ Zoom, /* tileSize */ TileSize) => PixelCoordinates = null,
    parseCSV: /* obj */ js.Any => js.Array[_] = null,
    pixelToLatLng: (/* x */ PX, /* y */ PY, /* z */ Zoom, /* tileSize */ TileSize) => GeoCoordinates = null
  ): Helpers = {
    val __obj = js.Dynamic.literal()
    if (latLngToPixel != null) __obj.updateDynamic("latLngToPixel")(js.Any.fromFunction4(latLngToPixel))
    if (parseCSV != null) __obj.updateDynamic("parseCSV")(js.Any.fromFunction1(parseCSV))
    if (pixelToLatLng != null) __obj.updateDynamic("pixelToLatLng")(js.Any.fromFunction4(pixelToLatLng))
    __obj.asInstanceOf[Helpers]
  }
}

