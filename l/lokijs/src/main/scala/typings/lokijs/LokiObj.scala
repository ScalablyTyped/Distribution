package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiObj extends js.Object {
  @JSName("$loki")
  var $loki: Double
  var meta: Anon_Created
}

object LokiObj {
  @scala.inline
  def apply($loki: Double, meta: Anon_Created): LokiObj = {
    val __obj = js.Dynamic.literal($loki = $loki.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LokiObj]
  }
}

