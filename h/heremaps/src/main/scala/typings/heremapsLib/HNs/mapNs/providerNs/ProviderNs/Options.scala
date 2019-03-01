package typings
package heremapsLib.HNs.mapNs.providerNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to initialize a Provider instance
  * @property uri {string=} - The provider's unique resource identifier which must not contain an underscore "_". If omitted an auto-generated unique Session ID is used. If a cross
  * sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property getCopyrights {(function(H.geo.Rect, number): ?Array<H.map.ICopyright>)=} - A function to replace the default implementation of H.map.provider.Provider#getCopyrights
  */
trait Options extends js.Object {
  var getCopyrights: js.UndefOr[
    js.Function2[
      /* rect */ heremapsLib.HNs.geoNs.Rect, 
      /* n */ scala.Double, 
      js.Array[heremapsLib.HNs.mapNs.ICopyright]
    ]
  ] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    getCopyrights: js.Function2[
      /* rect */ heremapsLib.HNs.geoNs.Rect, 
      /* n */ scala.Double, 
      js.Array[heremapsLib.HNs.mapNs.ICopyright]
    ] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    uri: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (getCopyrights != null) __obj.updateDynamic("getCopyrights")(getCopyrights)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Options]
  }
}

