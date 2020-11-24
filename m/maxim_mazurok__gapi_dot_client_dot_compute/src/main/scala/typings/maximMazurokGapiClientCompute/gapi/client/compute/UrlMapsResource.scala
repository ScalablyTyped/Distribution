package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.PrettyPrintProjectString
import typings.maximMazurokGapiClientCompute.anon.QuotaUserResourceUrlMap
import typings.maximMazurokGapiClientCompute.anon.QuotaUserUrlMap
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceUrlMap
import typings.maximMazurokGapiClientCompute.anon.RequestIdUrlMap
import typings.maximMazurokGapiClientCompute.anon.ResourceUrlMapUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMapsResource extends js.Object {
  
  /** Retrieves the list of all UrlMap resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[UrlMapsAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[UrlMapsAggregatedList] = js.native
  
  /** Deletes the specified UrlMap resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdUrlMap): Request[Operation] = js.native
  
  /** Returns the specified UrlMap resource. Gets a list of available URL maps by making a list() request. */
  def get(): Request[UrlMap] = js.native
  def get(request: QuotaUserUrlMap): Request[UrlMap] = js.native
  
  def insert(request: FieldsKey, body: UrlMap): Request[Operation] = js.native
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrintProjectString): Request[Operation] = js.native
  
  /**
    * Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap.
    *
    * For more information, see [Invalidating cached content](/cdn/docs/invalidating-cached-content).
    */
  def invalidateCache(request: RequestIdResourceUrlMap): Request[Operation] = js.native
  def invalidateCache(request: RequestIdUrlMap, body: CacheInvalidationRule): Request[Operation] = js.native
  
  /** Retrieves the list of UrlMap resources available to the specified project. */
  def list(): Request[UrlMapList] = js.native
  def list(request: MaxResults): Request[UrlMapList] = js.native
  
  def patch(request: RequestIdUrlMap, body: UrlMap): Request[Operation] = js.native
  /** Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules. */
  def patch(request: ResourceUrlMapUserIp): Request[Operation] = js.native
  
  def update(request: RequestIdUrlMap, body: UrlMap): Request[Operation] = js.native
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: ResourceUrlMapUserIp): Request[Operation] = js.native
  
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: QuotaUserResourceUrlMap): Request[UrlMapsValidateResponse] = js.native
  def validate(request: QuotaUserUrlMap, body: UrlMapsValidateRequest): Request[UrlMapsValidateResponse] = js.native
}
