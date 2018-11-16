package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgVideoPlayerCommercials
  extends /**
	 * Option for IgVideoPlayerCommercials
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Customizes the ad message settings of the commercial. Ad message shows the duration of the commercial and pops up when the commercial starts playing.
  	 *
  	 */
  var adMessage: js.UndefOr[IgVideoPlayerCommercialsAdMessage] = js.undefined
  /**
  	 * Gets/Sets whether the commercials will play againg during the repetitive video plays.
  	 *
  	 */
  var alwaysPlayCommercials: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets an array of embedded commercials objects. An embedded commercial is an ad that is contained in the original video file. It is suitable when you want to mark some sections of the video as commercials.
  	 *
  	 */
  var embeddedCommercials: js.UndefOr[js.Array[IgVideoPlayerCommercialsEmbeddedCommercial]] = js.undefined
  /**
  	 * Gets/Sets an array of linked commercial objects. A linked commercial is a separate video file that will be played in the specified position of the original movie clip by [startTime](ui.igvideoplayer#options:commercials.linkedCommercials.startTime). This feature is useful if you have frequently changing outside commercial sources.
  	 *
  	 */
  var linkedCommercials: js.UndefOr[js.Array[IgVideoPlayerCommercialsLinkedCommercial]] = js.undefined
  /**
  	 * Gets/Sets whether to show commercial locations or not.
  	 *
  	 */
  var showBookmarks: js.UndefOr[scala.Boolean] = js.undefined
}

