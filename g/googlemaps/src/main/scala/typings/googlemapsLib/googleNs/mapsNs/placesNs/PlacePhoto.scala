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
    getUrl: js.Function1[PhotoOptions, java.lang.String],
    height: scala.Double,
    html_attributions: js.Array[java.lang.String],
    width: scala.Double
  ): PlacePhoto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUrl")(getUrl)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("html_attributions")(html_attributions)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlacePhoto]
  }
}

