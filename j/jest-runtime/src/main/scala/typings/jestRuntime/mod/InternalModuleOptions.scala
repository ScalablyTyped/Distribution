package typings.jestRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalModuleOptions extends js.Object {
  var isInternalModule: Boolean
}

object InternalModuleOptions {
  @scala.inline
  def apply(isInternalModule: Boolean): InternalModuleOptions = {
    val __obj = js.Dynamic.literal(isInternalModule = isInternalModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalModuleOptions]
  }
}

