package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key-value pair of detailed information about the client which invoked the
  * test. Examples: {&#39;Version&#39;, &#39;1.0&#39;}, {&#39;Release
  * Track&#39;, &#39;BETA&#39;}.
  */
@js.native
trait SchemaClientInfoDetail extends js.Object {
  /**
    * Required. The key of detailed client information.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Required. The value of detailed client information.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaClientInfoDetail {
  @scala.inline
  def apply(key: String = null, value: String = null): SchemaClientInfoDetail = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClientInfoDetail]
  }
}

