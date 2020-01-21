package typings.httpCacheSemantics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevalidationPolicy extends js.Object {
  var matches: Boolean
  /**
    * Boolean indicating whether the response body has changed.
    *
    * - If `false`, then a valid 304 Not Modified response has been received, and you can reuse the old
    * cached response body.
    * - If `true`, you should use new response's body (if present), or make another request to the origin
    * server without any conditional headers (i.e. don't use `revalidationHeaders()` this time) to get
    * the new resource.
    */
  var modified: Boolean
  /**
    * A new `CachePolicy` with HTTP headers updated from `revalidationResponse`. You can always replace
    * the old cached `CachePolicy` with the new one.
    */
  var policy: CachePolicy
}

object RevalidationPolicy {
  @scala.inline
  def apply(matches: Boolean, modified: Boolean, policy: CachePolicy): RevalidationPolicy = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RevalidationPolicy]
  }
}

