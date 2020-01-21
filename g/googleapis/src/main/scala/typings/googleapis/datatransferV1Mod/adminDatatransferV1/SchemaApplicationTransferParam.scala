package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for application transfer parameters.
  */
@js.native
trait SchemaApplicationTransferParam extends js.Object {
  /**
    * The type of the transfer parameter. eg: &#39;PRIVACY_LEVEL&#39;
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The value of the coressponding transfer parameter. eg: &#39;PRIVATE&#39;
    * or &#39;SHARED&#39;
    */
  var value: js.UndefOr[js.Array[String]] = js.native
}

object SchemaApplicationTransferParam {
  @scala.inline
  def apply(key: String = null, value: js.Array[String] = null): SchemaApplicationTransferParam = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplicationTransferParam]
  }
}

