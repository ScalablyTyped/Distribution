package typings.harDashFormat.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  /**
    * State of a cache entry after the request.
    *
    * Leave out this field if the information is not available.
    */
  var afterRequest: js.UndefOr[CacheDetails | Null] = js.undefined
  /**
    * State of a cache entry before the request.
    *
    * Leave out this field if the information is not available.
    */
  var beforeRequest: js.UndefOr[CacheDetails | Null] = js.undefined
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
}

object Cache {
  @scala.inline
  def apply(afterRequest: CacheDetails = null, beforeRequest: CacheDetails = null, comment: String = null): Cache = {
    val __obj = js.Dynamic.literal()
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(afterRequest.asInstanceOf[js.Any])
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(beforeRequest.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

