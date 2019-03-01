package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  /**
    * State of a cache entry after the request.
    *
    * Leave out this field if the information is not available.
    */
  var afterRequest: js.UndefOr[CacheDetails | scala.Null] = js.undefined
  /**
    * State of a cache entry before the request.
    *
    * Leave out this field if the information is not available.
    */
  var beforeRequest: js.UndefOr[CacheDetails | scala.Null] = js.undefined
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
}

object Cache {
  @scala.inline
  def apply(
    afterRequest: CacheDetails = null,
    beforeRequest: CacheDetails = null,
    comment: java.lang.String = null
  ): Cache = {
    val __obj = js.Dynamic.literal()
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(afterRequest)
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(beforeRequest)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[Cache]
  }
}

