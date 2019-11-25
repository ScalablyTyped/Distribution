package typings.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  /**
    * @default '_default'
    */
  var cache: js.UndefOr[String] = js.undefined
  var segment: js.UndefOr[String] = js.undefined
}

object Anon_Cache {
  @scala.inline
  def apply(cache: String = null, segment: String = null): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cache]
  }
}

