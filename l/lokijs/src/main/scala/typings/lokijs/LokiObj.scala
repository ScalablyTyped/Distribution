package typings.lokijs

import typings.lokijs.anon.Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiObj extends js.Object {
  @JSName("$loki")
  var $loki: Double
  var meta: Created
}

object LokiObj {
  @scala.inline
  def apply($loki: Double, meta: Created): LokiObj = {
    val __obj = js.Dynamic.literal($loki = $loki.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiObj]
  }
}

