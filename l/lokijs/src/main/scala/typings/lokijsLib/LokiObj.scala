package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiObj extends js.Object {
  @JSName("$loki")
  var $loki: scala.Double
  var meta: Anon_Created
}

object LokiObj {
  @scala.inline
  def apply($loki: scala.Double, meta: Anon_Created): LokiObj = {
    val __obj = js.Dynamic.literal($loki = $loki, meta = meta)
  
    __obj.asInstanceOf[LokiObj]
  }
}

