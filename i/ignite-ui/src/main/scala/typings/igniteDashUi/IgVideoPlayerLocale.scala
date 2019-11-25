package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgVideoPlayerLocale
  extends /**
	 * Option for IgVideoPlayerLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets ad message text.
  	 *
  	 */
  var adMessage: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets long ad message text.
  	 *
  	 */
  var adMessageLong: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets ad message text when no duration is specified.
  	 *
  	 */
  var adMessageNoDuration: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets new ad window title.
  	 *
  	 */
  var adNewWindowTip: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets buffering label text.
  	 *
  	 */
  var buffering: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets enter fullscreen button title.
  	 *
  	 */
  var enterFullscreen: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets exit fullscreen button title.
  	 *
  	 */
  var exitFullscreen: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets live video title.
  	 *
  	 */
  var live: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets live stream video title.
  	 *
  	 */
  var liveStream: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets paused button title.
  	 *
  	 */
  var paused: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets play button title.
  	 *
  	 */
  var play: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets playing button title.
  	 *
  	 */
  var playing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets progress label long format.
  	 *
  	 */
  var progressLabelLongFormat: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets progress label short format.
  	 *
  	 */
  var progressLabelShortFormat: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets related videos text.
  	 *
  	 */
  var relatedVideos: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets replay button text.
  	 *
  	 */
  var replayButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets replay button tooltip.
  	 *
  	 */
  var replayTooltip: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets skip to button title.
  	 *
  	 */
  var skipTo: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets volume button title.
  	 *
  	 */
  var volume: js.UndefOr[Boolean] = js.undefined
}

object IgVideoPlayerLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgVideoPlayerLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    adMessage: js.UndefOr[Boolean] = js.undefined,
    adMessageLong: js.UndefOr[Boolean] = js.undefined,
    adMessageNoDuration: js.UndefOr[Boolean] = js.undefined,
    adNewWindowTip: js.UndefOr[Boolean] = js.undefined,
    buffering: js.UndefOr[Boolean] = js.undefined,
    enterFullscreen: js.UndefOr[Boolean] = js.undefined,
    exitFullscreen: js.UndefOr[Boolean] = js.undefined,
    live: js.UndefOr[Boolean] = js.undefined,
    liveStream: js.UndefOr[Boolean] = js.undefined,
    paused: js.UndefOr[Boolean] = js.undefined,
    play: js.UndefOr[Boolean] = js.undefined,
    playing: js.UndefOr[Boolean] = js.undefined,
    progressLabelLongFormat: js.UndefOr[Boolean] = js.undefined,
    progressLabelShortFormat: js.UndefOr[Boolean] = js.undefined,
    relatedVideos: js.UndefOr[Boolean] = js.undefined,
    replayButton: js.UndefOr[Boolean] = js.undefined,
    replayTooltip: js.UndefOr[Boolean] = js.undefined,
    skipTo: js.UndefOr[Boolean] = js.undefined,
    volume: js.UndefOr[Boolean] = js.undefined
  ): IgVideoPlayerLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(adMessage)) __obj.updateDynamic("adMessage")(adMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(adMessageLong)) __obj.updateDynamic("adMessageLong")(adMessageLong.asInstanceOf[js.Any])
    if (!js.isUndefined(adMessageNoDuration)) __obj.updateDynamic("adMessageNoDuration")(adMessageNoDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(adNewWindowTip)) __obj.updateDynamic("adNewWindowTip")(adNewWindowTip.asInstanceOf[js.Any])
    if (!js.isUndefined(buffering)) __obj.updateDynamic("buffering")(buffering.asInstanceOf[js.Any])
    if (!js.isUndefined(enterFullscreen)) __obj.updateDynamic("enterFullscreen")(enterFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(exitFullscreen)) __obj.updateDynamic("exitFullscreen")(exitFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live.asInstanceOf[js.Any])
    if (!js.isUndefined(liveStream)) __obj.updateDynamic("liveStream")(liveStream.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing.asInstanceOf[js.Any])
    if (!js.isUndefined(progressLabelLongFormat)) __obj.updateDynamic("progressLabelLongFormat")(progressLabelLongFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(progressLabelShortFormat)) __obj.updateDynamic("progressLabelShortFormat")(progressLabelShortFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(relatedVideos)) __obj.updateDynamic("relatedVideos")(relatedVideos.asInstanceOf[js.Any])
    if (!js.isUndefined(replayButton)) __obj.updateDynamic("replayButton")(replayButton.asInstanceOf[js.Any])
    if (!js.isUndefined(replayTooltip)) __obj.updateDynamic("replayTooltip")(replayTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTo)) __obj.updateDynamic("skipTo")(skipTo.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgVideoPlayerLocale]
  }
}

