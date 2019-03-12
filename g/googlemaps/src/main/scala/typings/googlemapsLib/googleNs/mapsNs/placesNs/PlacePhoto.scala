package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacePhoto extends js.Object {
  var height: scala.Double
  var html_attributions: js.Array[java.lang.String]
  var width: scala.Double
  def getUrl(opts: PhotoOptions): java.lang.String
}

object PlacePhoto {
  @scala.inline
  def apply(
    getUrl: PhotoOptions => java.lang.String,
    height: scala.Double,
    html_attributions: js.Array[java.lang.String],
    width: scala.Double
  ): PlacePhoto = {
    val __obj = js.Dynamic.literal(getUrl = js.Any.fromFunction1(getUrl), height = height, html_attributions = html_attributions, width = width)
  
    __obj.asInstanceOf[PlacePhoto]
  }
}

