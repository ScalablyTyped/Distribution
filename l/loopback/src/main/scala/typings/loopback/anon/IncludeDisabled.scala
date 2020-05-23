package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeDisabled extends js.Object {
  var includeDisabled: Boolean
}

object IncludeDisabled {
  @scala.inline
  def apply(includeDisabled: Boolean): IncludeDisabled = {
    val __obj = js.Dynamic.literal(includeDisabled = includeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeDisabled]
  }
}

