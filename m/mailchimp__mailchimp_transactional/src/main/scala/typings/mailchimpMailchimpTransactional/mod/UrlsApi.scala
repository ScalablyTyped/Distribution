package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlsApi extends StObject {
  
  /**
    * Add tracking domains
    *
    * Add a tracking domain to your account.
    */
  def addTrackingDomain(body: UrlsFindByDomainRequest): js.Promise[UrlsTrackingDomainResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Check cname settings
    *
    * Checks the CNAME settings for a tracking domain. The domain must have been added already with
    * the add-tracking-domain call.
    */
  def checkTrackingDomain(body: UrlsFindByDomainRequest): js.Promise[UrlsTrackingDomainResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List most clicked urls
    *
    * Get the 100 most clicked URLs.
    */
  def list(): js.Promise[js.Array[UrlsStatsResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: UrlsListRequest): js.Promise[js.Array[UrlsStatsResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Search most clicked urls
    *
    * Return the 100 most clicked URLs that match the search query given.
    */
  def search(body: UrlsSearchRequest): js.Promise[js.Array[UrlsStatsResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get url history
    *
    * Return the recent history (hourly stats for the last 30 days) for a URL
    */
  def timeSeries(body: UrlsTimeSeriesRequest): js.Promise[js.Array[UrlsTimeSeriesResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * List tracking domains
    *
    * Get the list of tracking domains set up for this account.
    */
  def trackingDomains(): js.Promise[js.Array[UrlsTrackingDomainResponse] | (AxiosError[Any, Any])] = js.native
  def trackingDomains(body: UrlsTrackingDomainsRequest): js.Promise[js.Array[UrlsTrackingDomainResponse] | (AxiosError[Any, Any])] = js.native
}
