package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the Video.
  */
@js.native
trait SchemaVideoProperties extends js.Object {
  /**
    * Whether to enable video autoplay when the page is displayed in present
    * mode. Defaults to false.
    */
  var autoPlay: js.UndefOr[Boolean] = js.native
  /**
    * The time at which to end playback, measured in seconds from the beginning
    * of the video. If set, the end time should be after the start time. If not
    * set or if you set this to a value that exceeds the video&#39;s length,
    * the video will be played until its end.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Whether to mute the audio during video playback. Defaults to false.
    */
  var mute: js.UndefOr[Boolean] = js.native
  /**
    * The outline of the video. The default outline matches the defaults for
    * new videos created in the Slides editor.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  /**
    * The time at which to start playback, measured in seconds from the
    * beginning of the video. If set, the start time should be before the end
    * time. If you set this to a value that exceeds the video&#39;s length in
    * seconds, the video will be played from the last second. If not set, the
    * video will be played from the beginning.
    */
  var start: js.UndefOr[Double] = js.native
}

object SchemaVideoProperties {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    mute: js.UndefOr[Boolean] = js.undefined,
    outline: SchemaOutline = null,
    start: Int | Double = null
  ): SchemaVideoProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoProperties]
  }
}

