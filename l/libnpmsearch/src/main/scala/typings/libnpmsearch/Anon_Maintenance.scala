package typings.libnpmsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maintenance extends js.Object {
  var maintenance: Double
  var popularity: Double
  var quality: Double
}

object Anon_Maintenance {
  @scala.inline
  def apply(maintenance: Double, popularity: Double, quality: Double): Anon_Maintenance = {
    val __obj = js.Dynamic.literal(maintenance = maintenance, popularity = popularity, quality = quality)
  
    __obj.asInstanceOf[Anon_Maintenance]
  }
}

