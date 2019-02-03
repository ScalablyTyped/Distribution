package typings
package httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-cache-semantics", JSImport.Namespace)
@js.native
class namespaced protected () extends CachePolicy {
  def this(req: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request, res: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Response) = this()
  def this(req: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request, res: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Response, options: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Options) = this()
  /**
    * Returns updated, filtered set of response headers to return to clients receiving the cached response.
    * This function is necessary, because proxies MUST always remove hop-by-hop headers (such as `TE` and `Connection`)
    * and update response's `Age` to avoid doubling cache time.
    *
    * @example
    * cachedResponse.headers = cachePolicy.responseHeaders(cachedResponse);
    */
  /* CompleteClass */
  override def responseHeaders(): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Headers = js.native
  /**
    * Use this method to update the cache after receiving a new response from the origin server.
    */
  /* CompleteClass */
  override def revalidatedPolicy(
    revalidationRequest: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request,
    revalidationResponse: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Response
  ): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.RevalidationPolicy = js.native
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
  /* CompleteClass */
  override def revalidationHeaders(newRequest: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Headers = js.native
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
  /* CompleteClass */
  override def satisfiesWithoutRevalidation(newRequest: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Request): scala.Boolean = js.native
  /**
    * Returns `true` if the response can be stored in a cache.
    * If it's `false` then you MUST NOT store either the request or the response.
    */
  /* CompleteClass */
  override def storable(): scala.Boolean = js.native
  /**
    * Returns approximate time in milliseconds until the response becomes stale (i.e. not fresh).
    *
    * After that time (when `timeToLive() <= 0`) the response might not be usable without revalidation. However,
    * there are exceptions, e.g. a client can explicitly allow stale responses, so always check with
    * `satisfiesWithoutRevalidation()`.
    */
  /* CompleteClass */
  override def timeToLive(): scala.Double = js.native
  /**
    * Chances are you'll want to store the `CachePolicy` object along with the cached response.
    * `obj = policy.toObject()` gives a plain JSON-serializable object.
    */
  /* CompleteClass */
  override def toObject(): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.CachePolicyObject = js.native
}

/* static members */
@JSImport("http-cache-semantics", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * `policy = CachePolicy.fromObject(obj)` creates an instance from object created by `toObject()`.
    */
  def fromObject(obj: httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.CachePolicyObject): httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicy = js.native
}

