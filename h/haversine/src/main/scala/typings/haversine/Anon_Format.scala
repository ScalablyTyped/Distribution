package typings.haversine

import typings.haversine.haversineStrings.`[lat,lon]`
import typings.haversine.haversineStrings.`[lon,lat]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: `[lat,lon]` | `[lon,lat]`
}

object Anon_Format {
  @scala.inline
  def apply(format: `[lat,lon]` | `[lon,lat]`): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Format]
  }
}

