package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  /**
    * @default '_default'
    */
  var cache: js.UndefOr[java.lang.String] = js.undefined
  var segment: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Cache {
  @scala.inline
  def apply(cache: java.lang.String = null, segment: java.lang.String = null): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    __obj.asInstanceOf[Anon_Cache]
  }
}

