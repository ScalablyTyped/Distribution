package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Age extends js.Object {
  var age: js.Any
  var daemon: js.Any
  var ttlInterval: js.Any
}

object Age {
  @scala.inline
  def apply(age: js.Any, daemon: js.Any, ttlInterval: js.Any): Age = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], daemon = daemon.asInstanceOf[js.Any], ttlInterval = ttlInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
}

