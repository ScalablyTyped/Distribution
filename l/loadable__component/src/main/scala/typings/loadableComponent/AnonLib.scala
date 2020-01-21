package typings.loadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLib extends js.Object {
  var lib: FnLoadFnOptions
}

object AnonLib {
  @scala.inline
  def apply(lib: FnLoadFnOptions): AnonLib = {
    val __obj = js.Dynamic.literal(lib = lib.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLib]
  }
}

