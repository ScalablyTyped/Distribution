package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterFullScreenEventUIParam extends js.Object {
  /**
  	 * Get the url of the playing video.
  	 */
  var source: js.UndefOr[String] = js.undefined
}

object EnterFullScreenEventUIParam {
  @scala.inline
  def apply(source: String = null): EnterFullScreenEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterFullScreenEventUIParam]
  }
}

