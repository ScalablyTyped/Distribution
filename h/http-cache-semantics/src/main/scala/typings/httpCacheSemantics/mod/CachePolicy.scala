package typings.httpCacheSemantics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachePolicy extends js.Object {
  /**
    * Returns updated, filtered set of response headers to return to clients receiving the cached response.
    * This function is necessary, because proxies MUST always remove hop-by-hop headers (such as `TE` and `Connection`)
    * and update response's `Age` to avoid doubling cache time.
    *
    * @example
    * cachedResponse.headers = cachePolicy.responseHeaders(cachedResponse);
    */
  def responseHeaders(): Headers = js.native
  /**
    * Use this method to update the cache after receiving a new response from the origin server.
    */
  def revalidatedPolicy(revalidationRequest: Request, revalidationResponse: Response): RevalidationPolicy = js.native
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
  def revalidationHeaders(newRequest: Request): Headers = js.native
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
  def satisfiesWithoutRevalidation(newRequest: Request): Boolean = js.native
  /**
    * Returns `true` if the response can be stored in a cache.
    * If it's `false` then you MUST NOT store either the request or the response.
    */
  def storable(): Boolean = js.native
  /**
    * Returns approximate time in milliseconds until the response becomes stale (i.e. not fresh).
    *
    * After that time (when `timeToLive() <= 0`) the response might not be usable without revalidation. However,
    * there are exceptions, e.g. a client can explicitly allow stale responses, so always check with
    * `satisfiesWithoutRevalidation()`.
    */
  def timeToLive(): Double = js.native
  /**
    * Chances are you'll want to store the `CachePolicy` object along with the cached response.
    * `obj = policy.toObject()` gives a plain JSON-serializable object.
    */
  def toObject(): CachePolicyObject = js.native
}

object CachePolicy {
  @scala.inline
  def apply(
    responseHeaders: () => Headers,
    revalidatedPolicy: (Request, Response) => RevalidationPolicy,
    revalidationHeaders: Request => Headers,
    satisfiesWithoutRevalidation: Request => Boolean,
    storable: () => Boolean,
    timeToLive: () => Double,
    toObject: () => CachePolicyObject
  ): CachePolicy = {
    val __obj = js.Dynamic.literal(responseHeaders = js.Any.fromFunction0(responseHeaders), revalidatedPolicy = js.Any.fromFunction2(revalidatedPolicy), revalidationHeaders = js.Any.fromFunction1(revalidationHeaders), satisfiesWithoutRevalidation = js.Any.fromFunction1(satisfiesWithoutRevalidation), storable = js.Any.fromFunction0(storable), timeToLive = js.Any.fromFunction0(timeToLive), toObject = js.Any.fromFunction0(toObject))
    __obj.asInstanceOf[CachePolicy]
  }
  @scala.inline
  implicit class CachePolicyOps[Self <: CachePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponseHeaders(value: () => Headers): Self = this.set("responseHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setRevalidatedPolicy(value: (Request, Response) => RevalidationPolicy): Self = this.set("revalidatedPolicy", js.Any.fromFunction2(value))
    @scala.inline
    def setRevalidationHeaders(value: Request => Headers): Self = this.set("revalidationHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setSatisfiesWithoutRevalidation(value: Request => Boolean): Self = this.set("satisfiesWithoutRevalidation", js.Any.fromFunction1(value))
    @scala.inline
    def setStorable(value: () => Boolean): Self = this.set("storable", js.Any.fromFunction0(value))
    @scala.inline
    def setTimeToLive(value: () => Double): Self = this.set("timeToLive", js.Any.fromFunction0(value))
    @scala.inline
    def setToObject(value: () => CachePolicyObject): Self = this.set("toObject", js.Any.fromFunction0(value))
  }
  
}

