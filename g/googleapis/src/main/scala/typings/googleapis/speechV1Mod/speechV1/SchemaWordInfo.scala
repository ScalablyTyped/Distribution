package typings.googleapis.speechV1Mod.speechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Word-specific information for recognized words.
  */
@js.native
trait SchemaWordInfo extends js.Object {
  /**
    * Output only. Time offset relative to the beginning of the audio, and
    * corresponding to the end of the spoken word. This field is only set if
    * `enable_word_time_offsets=true` and only in the top hypothesis. This is
    * an experimental feature and the accuracy of the time offset can vary.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. Time offset relative to the beginning of the audio, and
    * corresponding to the start of the spoken word. This field is only set if
    * `enable_word_time_offsets=true` and only in the top hypothesis. This is
    * an experimental feature and the accuracy of the time offset can vary.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Output only. The word corresponding to this set of information.
    */
  var word: js.UndefOr[String] = js.native
}

object SchemaWordInfo {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null, word: String = null): SchemaWordInfo = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWordInfo]
  }
}

