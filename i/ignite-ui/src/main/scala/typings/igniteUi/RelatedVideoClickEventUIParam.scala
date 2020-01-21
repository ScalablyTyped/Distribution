package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedVideoClickEventUIParam extends js.Object {
  /**
  	 * Get the relatedVideo object from the relatedVideos array.
  	 */
  var relatedVideo: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the relatedVideo html element in the DOM.
  	 */
  var relatedVideoElement: js.UndefOr[js.Any] = js.undefined
}

object RelatedVideoClickEventUIParam {
  @scala.inline
  def apply(relatedVideo: js.Any = null, relatedVideoElement: js.Any = null): RelatedVideoClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (relatedVideo != null) __obj.updateDynamic("relatedVideo")(relatedVideo.asInstanceOf[js.Any])
    if (relatedVideoElement != null) __obj.updateDynamic("relatedVideoElement")(relatedVideoElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedVideoClickEventUIParam]
  }
}

