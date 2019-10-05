package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacePhoto extends js.Object {
  var height: Double
  var html_attributions: js.Array[String]
  var width: Double
  def getUrl(opts: PhotoOptions): String
}

object PlacePhoto {
  @scala.inline
  def apply(getUrl: PhotoOptions => String, height: Double, html_attributions: js.Array[String], width: Double): PlacePhoto = {
    val __obj = js.Dynamic.literal(getUrl = js.Any.fromFunction1(getUrl), height = height, html_attributions = html_attributions, width = width)
  
    __obj.asInstanceOf[PlacePhoto]
  }
}

