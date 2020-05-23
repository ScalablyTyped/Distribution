package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipAccessControl extends js.Object {
  var skipAccessControl: Boolean
}

object SkipAccessControl {
  @scala.inline
  def apply(skipAccessControl: Boolean): SkipAccessControl = {
    val __obj = js.Dynamic.literal(skipAccessControl = skipAccessControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipAccessControl]
  }
}

