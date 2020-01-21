package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the progress of a long-running `LongRunningRecognize` call. It is
  * included in the `metadata` field of the `Operation` returned by the
  * `GetOperation` call of the `google::longrunning::Operations` service.
  */
@js.native
trait SchemaLongRunningRecognizeMetadata extends js.Object {
  /**
    * Time of the most recent processing update.
    */
  var lastUpdateTime: js.UndefOr[String] = js.native
  /**
    * Approximate percentage of audio processed thus far. Guaranteed to be 100
    * when the audio is fully processed and the results are available.
    */
  var progressPercent: js.UndefOr[Double] = js.native
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaLongRunningRecognizeMetadata {
  @scala.inline
  def apply(lastUpdateTime: String = null, progressPercent: Int | Double = null, startTime: String = null): SchemaLongRunningRecognizeMetadata = {
    val __obj = js.Dynamic.literal()
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (progressPercent != null) __obj.updateDynamic("progressPercent")(progressPercent.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLongRunningRecognizeMetadata]
  }
}

