package typings
package heremapsLib.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * An interface to represent a geographic point. Every point in geo space is represented by three coordinates latitude, longitude and optional altitude.
         * @property lat {H.geo.Latitude} - The latitude coordinate.
         * @property lng {H.geo.Longitude} - The longitude coordinate.
         * @property alt {H.geo.Altitude=} - The altitude coordinate.
         * @property ctx {H.geo.AltitudeContext=} - The altitude context.
         */

trait IPoint extends js.Object {
  var alt: js.UndefOr[Altitude] = js.undefined
  var ctx: js.UndefOr[AltitudeContext] = js.undefined
  var lat: Latitude
  var lng: Longitude
}

