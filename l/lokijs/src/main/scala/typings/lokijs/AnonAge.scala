package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAge extends js.Object {
  var age: js.Any
  var daemon: js.Any
  var ttlInterval: js.Any
}

object AnonAge {
  @scala.inline
  def apply(age: js.Any, daemon: js.Any, ttlInterval: js.Any): AnonAge = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], daemon = daemon.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAge]
  }
}

