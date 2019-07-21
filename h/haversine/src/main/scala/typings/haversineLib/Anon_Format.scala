package typings
package haversineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: haversineLib.haversineLibStrings.`[lat,lon]` | haversineLib.haversineLibStrings.`[lon,lat]`
}

object Anon_Format {
  @scala.inline
  def apply(
    format: haversineLib.haversineLibStrings.`[lat,lon]` | haversineLib.haversineLibStrings.`[lon,lat]`
  ): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Format]
  }
}

