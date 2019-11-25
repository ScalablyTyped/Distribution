package typings.lightDashSdk.lightDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackResult extends js.Object {
  var data: js.Any
  var info: Info
}

object CallbackResult {
  @scala.inline
  def apply(data: js.Any, info: Info): CallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallbackResult]
  }
}

