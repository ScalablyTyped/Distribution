package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides control over how write requests are executed.
  */
@js.native
trait SchemaWriteControl extends js.Object {
  /**
    * The revision ID of the presentation required for the write request. If
    * specified and the `required_revision_id` doesn&#39;t exactly match the
    * presentation&#39;s current `revision_id`, the request will not be
    * processed and will return a 400 bad request error.
    */
  var requiredRevisionId: js.UndefOr[String] = js.native
}

object SchemaWriteControl {
  @scala.inline
  def apply(requiredRevisionId: String = null): SchemaWriteControl = {
    val __obj = js.Dynamic.literal()
    if (requiredRevisionId != null) __obj.updateDynamic("requiredRevisionId")(requiredRevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWriteControl]
  }
}

