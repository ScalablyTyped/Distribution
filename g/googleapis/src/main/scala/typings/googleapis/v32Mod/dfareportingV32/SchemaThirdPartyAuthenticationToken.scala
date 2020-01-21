package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third Party Authentication Token
  */
@js.native
trait SchemaThirdPartyAuthenticationToken extends js.Object {
  /**
    * Name of the third-party authentication token.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value of the third-party authentication token. This is a read-only,
    * auto-generated field.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaThirdPartyAuthenticationToken {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThirdPartyAuthenticationToken]
  }
}

