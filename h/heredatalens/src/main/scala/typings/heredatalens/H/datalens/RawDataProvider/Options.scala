package typings.heredatalens.H.datalens.RawDataProvider

import typings.heredatalens.H.datalens.ObjectLayer.Row
import typings.heredatalens.H.datalens.QueryTileProvider.X
import typings.heredatalens.H.datalens.QueryTileProvider.Y
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Defines how the input data is mapped to an array of GeoJSON features */
  var dataToFeatures: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[Feature]]] = js.native
  /** The data url to fetch */
  var dataUrl: js.UndefOr[String] = js.native
  /** Defines how GeoJSON features on a tile should be mapped to data rows, which are inputs to layers such as ObjectLayer and HeatmapLayer */
  var featuresToRows: js.UndefOr[
    js.Function6[
      /* features */ js.Array[Feature], 
      /* x */ X, 
      /* y */ Y, 
      /* z */ Zoom, 
      /* tileSize */ TileSize, 
      /* helpers */ Helpers, 
      js.Array[Row]
    ]
  ] = js.native
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
    def setDataToFeatures(value: /* obj */ js.Any => js.Array[Feature]): Self = this.set("dataToFeatures", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataToFeatures: Self = this.set("dataToFeatures", js.undefined)
    @scala.inline
    def setDataUrl(value: String): Self = this.set("dataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataUrl: Self = this.set("dataUrl", js.undefined)
    @scala.inline
    def setFeaturesToRows(
      value: (/* features */ js.Array[Feature], /* x */ X, /* y */ Y, /* z */ Zoom, /* tileSize */ TileSize, /* helpers */ Helpers) => js.Array[Row]
    ): Self = this.set("featuresToRows", js.Any.fromFunction6(value))
    @scala.inline
    def deleteFeaturesToRows: Self = this.set("featuresToRows", js.undefined)
  }
  
}

