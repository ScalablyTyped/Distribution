package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
@js.native
trait SchemaHTTPHeader extends js.Object {
  /**
    * The header field name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The header field value
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaHTTPHeader {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaHTTPHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHTTPHeader]
  }
}

