package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information for connecting over HTTP(s).
  */
@js.native
trait SchemaAddressable extends js.Object {
  var hostname: js.UndefOr[String] = js.native
}

object SchemaAddressable {
  @scala.inline
  def apply(hostname: String = null): SchemaAddressable = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddressable]
  }
}

