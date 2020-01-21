package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Universal Ad ID as per the VAST 4.0 spec. Applicable to the following
  * creative types: INSTREAM_AUDIO, INSTREAM_VIDEO and VPAID.
  */
@js.native
trait SchemaUniversalAdId extends js.Object {
  /**
    * Registry used for the Ad ID value.
    */
  var registry: js.UndefOr[String] = js.native
  /**
    * ID value for this creative. Only alphanumeric characters and the
    * following symbols are valid: &quot;_/\-&quot;. Maximum length is 64
    * characters. Read only when registry is DCM.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUniversalAdId {
  @scala.inline
  def apply(registry: String = null, value: String = null): SchemaUniversalAdId = {
    val __obj = js.Dynamic.literal()
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUniversalAdId]
  }
}

