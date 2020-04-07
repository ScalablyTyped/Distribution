package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiObj extends js.Object {
  @JSName("$loki")
  var $loki: Double
  var meta: AnonCreated
}

object LokiObj {
  @scala.inline
  def apply($loki: Double, meta: AnonCreated): LokiObj = {
    val __obj = js.Dynamic.literal($loki = $loki.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LokiObj]
  }
}

