package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a HTTP Header.
  */
@js.native
trait SchemaHeader extends js.Object {
  /**
    * Header name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Header value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaHeader {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHeader]
  }
}

