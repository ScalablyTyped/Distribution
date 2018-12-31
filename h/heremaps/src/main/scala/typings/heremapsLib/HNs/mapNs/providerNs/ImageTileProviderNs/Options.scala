package typings
package heremapsLib.HNs.mapNs.providerNs.ImageTileProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to initialize an ImageTileProvider instance
  * @property uri {string=} - The provider's unique resource identifier which must not contain an underscore "_". If omitted an auto-generated unique Session ID is used. If a cross
  * sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property getCopyrights {(function(H.geo.Rect, number): ?Array<H.map.ICopyright>)=} - A function to replace the default implementation of H.map.provider.Provider#getCopyrights
  * @property tileSize {number=} - The size of a tile as edge length in pixels. It must be 2^n where n is in range [0 ... 30], default is 256
  * @property getURL {function(number, number, number)} - The function to create an URL for the specified tile. If it returns a falsy the tile is not requested.
  * @property crossOrigin {(string | boolean=)} - The CORS settings to use for the crossOrigin attribute for the image, if omitted or if the value evaluates to false no CORS settings
  * are used.
  */
trait Options extends js.Object {
  var crossOrigin: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var getCopyrights: js.UndefOr[
    js.Function2[
      /* rect */ heremapsLib.HNs.geoNs.Rect, 
      /* n */ scala.Double, 
      js.Array[heremapsLib.HNs.mapNs.ICopyright]
    ]
  ] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[scala.Double] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  def getURL(n1: scala.Double, n2: scala.Double, n3: scala.Double): java.lang.String
}

