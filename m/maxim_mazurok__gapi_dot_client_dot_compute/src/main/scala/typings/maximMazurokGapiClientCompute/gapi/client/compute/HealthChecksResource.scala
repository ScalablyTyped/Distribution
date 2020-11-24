package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.FieldsHealthCheck
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.HealthCheckKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.RequestIdResourceUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthChecksResource extends js.Object {
  
  /** Retrieves the list of all HealthCheck resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[HealthChecksAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[HealthChecksAggregatedList] = js.native
  
  /** Deletes the specified HealthCheck resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.HealthCheck): Request[Operation] = js.native
  
  /** Returns the specified HealthCheck resource. Gets a list of available health checks by making a list() request. */
  def get(): Request[HealthCheck] = js.native
  def get(request: FieldsHealthCheck): Request[HealthCheck] = js.native
  
  def insert(request: FieldsKey, body: HealthCheck): Request[Operation] = js.native
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: RequestIdResourceUserIp): Request[Operation] = js.native
  
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(): Request[HealthCheckList] = js.native
  def list(request: MaxResults): Request[HealthCheckList] = js.native
  
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and
    * processing rules.
    */
  def patch(request: HealthCheckKey): Request[Operation] = js.native
  def patch(request: typings.maximMazurokGapiClientCompute.anon.HealthCheck, body: HealthCheck): Request[Operation] = js.native
  
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: HealthCheckKey): Request[Operation] = js.native
  def update(request: typings.maximMazurokGapiClientCompute.anon.HealthCheck, body: HealthCheck): Request[Operation] = js.native
}
