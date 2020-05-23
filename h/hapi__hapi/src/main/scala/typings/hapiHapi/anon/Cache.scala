package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  /**
    * @default '_default'
    */
  var cache: js.UndefOr[String] = js.undefined
  var segment: js.UndefOr[String] = js.undefined
}

object Cache {
  @scala.inline
  def apply(cache: String = null, segment: String = null): Cache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

