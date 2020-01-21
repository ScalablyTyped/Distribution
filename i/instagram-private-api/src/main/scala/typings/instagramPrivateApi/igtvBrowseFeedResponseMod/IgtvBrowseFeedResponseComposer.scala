package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvBrowseFeedResponseComposer extends js.Object {
  var aspect_ratio_finished: Boolean
  var nux_finished: Boolean
}

object IgtvBrowseFeedResponseComposer {
  @scala.inline
  def apply(aspect_ratio_finished: Boolean, nux_finished: Boolean): IgtvBrowseFeedResponseComposer = {
    val __obj = js.Dynamic.literal(aspect_ratio_finished = aspect_ratio_finished.asInstanceOf[js.Any], nux_finished = nux_finished.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvBrowseFeedResponseComposer]
  }
}

