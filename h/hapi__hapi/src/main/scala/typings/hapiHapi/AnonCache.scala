package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  /**
    * @default '_default'
    */
  var cache: js.UndefOr[String] = js.undefined
  var segment: js.UndefOr[String] = js.undefined
}

object AnonCache {
  @scala.inline
  def apply(cache: String = null, segment: String = null): AnonCache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
}

