package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details about the progress of the running test.
  */
@js.native
trait SchemaTestDetails extends js.Object {
  /**
    * Output only. If the TestState is ERROR, then this string will contain
    * human-readable details about the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Output only. Human-readable, detailed descriptions of the test&#39;s
    * progress. For example: &quot;Provisioning a device&quot;, &quot;Starting
    * Test&quot;.  During the course of execution new data may be appended to
    * the end of progress_messages.
    */
  var progressMessages: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTestDetails {
  @scala.inline
  def apply(errorMessage: String = null, progressMessages: js.Array[String] = null): SchemaTestDetails = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (progressMessages != null) __obj.updateDynamic("progressMessages")(progressMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestDetails]
  }
}

