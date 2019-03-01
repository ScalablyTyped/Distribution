package typings
package httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachePolicy extends js.Object {
  /**
    * Returns updated, filtered set of response headers to return to clients receiving the cached response.
    * This function is necessary, because proxies MUST always remove hop-by-hop headers (such as `TE` and `Connection`)
    * and update response's `Age` to avoid doubling cache time.
    *
    * @example
    * cachedResponse.headers = cachePolicy.responseHeaders(cachedResponse);
    */
  def responseHeaders(): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Headers
  /**
    * Use this method to update the cache after receiving a new response from the origin server.
    */
  def revalidatedPolicy(
    revalidationRequest: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request,
    revalidationResponse: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Response
  ): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.RevalidationPolicy
  /**
    * Returns updated, filtered set of request headers to send to the origin server to check if the cached
    * response can be reused. These headers allow the origin server to return status 304 indicating the
    * response is still fresh. All headers unrelated to caching are passed through as-is.
    *
    * Use this method when updating cache from the origin server.
    *
    * @example
    * updateRequest.headers = cachePolicy.revalidationHeaders(updateRequest);
    */
  def revalidationHeaders(newRequest: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Headers
  /**
    * This is the most important method. Use this method to check whether the cached response is still fresh
    * in the context of the new request.
    *
    * If it returns `true`, then the given `request` matches the original response this cache policy has been
    * created with, and the response can be reused without contacting the server. Note that the old response
    * can't be returned without being updated, see `responseHeaders()`.
    *
    * If it returns `false`, then the response may not be matching at all (e.g. it's for a different URL or method),
    * or may require to be refreshed first (see `revalidationHeaders()`).
    */
  def satisfiesWithoutRevalidation(newRequest: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request): scala.Boolean
  /**
    * Returns `true` if the response can be stored in a cache.
    * If it's `false` then you MUST NOT store either the request or the response.
    */
  def storable(): scala.Boolean
  /**
    * Returns approximate time in milliseconds until the response becomes stale (i.e. not fresh).
    *
    * After that time (when `timeToLive() <= 0`) the response might not be usable without revalidation. However,
    * there are exceptions, e.g. a client can explicitly allow stale responses, so always check with
    * `satisfiesWithoutRevalidation()`.
    */
  def timeToLive(): scala.Double
  /**
    * Chances are you'll want to store the `CachePolicy` object along with the cached response.
    * `obj = policy.toObject()` gives a plain JSON-serializable object.
    */
  def toObject(): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.CachePolicyObject
}

object CachePolicy {
  @scala.inline
  def apply(
    responseHeaders: js.Function0[
      httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Headers
    ],
    revalidatedPolicy: js.Function2[
      httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request, 
      httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Response, 
      httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.RevalidationPolicy
    ],
    revalidationHeaders: js.Function1[
      httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request, 
      httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Headers
    ],
    satisfiesWithoutRevalidation: js.Function1[
      httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request, 
      scala.Boolean
    ],
    storable: js.Function0[scala.Boolean],
    timeToLive: js.Function0[scala.Double],
    toObject: js.Function0[
      httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.CachePolicyObject
    ]
  ): CachePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.updateDynamic("revalidatedPolicy")(revalidatedPolicy)
    __obj.updateDynamic("revalidationHeaders")(revalidationHeaders)
    __obj.updateDynamic("satisfiesWithoutRevalidation")(satisfiesWithoutRevalidation)
    __obj.updateDynamic("storable")(storable)
    __obj.updateDynamic("timeToLive")(timeToLive)
    __obj.updateDynamic("toObject")(toObject)
    __obj.asInstanceOf[CachePolicy]
  }
}

