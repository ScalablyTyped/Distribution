package typings
package heremapsLib.HNs.mapNs.layerNs.ITileLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize a TileLayer object.
  * @property projection {H.geo.IProjection=} - an optional projection to be used for this layer, default is H.geo.mercator
  * @property opacity {number=} - tile layer opacity, default is 1
  */
trait Options extends js.Object {
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var projection: js.UndefOr[heremapsLib.HNs.geoNs.IProjection] = js.undefined
}

