package typings.grpcProtoLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeDirs extends js.Object {
  var includeDirs: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonIncludeDirs {
  @scala.inline
  def apply(includeDirs: js.Array[String] = null): AnonIncludeDirs = {
    val __obj = js.Dynamic.literal()
    if (includeDirs != null) __obj.updateDynamic("includeDirs")(includeDirs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeDirs]
  }
}

