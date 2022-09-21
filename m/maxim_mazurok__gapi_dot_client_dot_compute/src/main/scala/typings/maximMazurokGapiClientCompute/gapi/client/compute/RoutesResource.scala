package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProjectQuotaUserRequestId
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRoute
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutesResource extends StObject {
  
  /** Deletes the specified Route resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.Route): Request[Operation] = js.native
  
  /** Returns the specified Route resource. Gets a list of available routes by making a list() request. */
  def get(): Request[Route] = js.native
  def get(request: QuotaUserRoute): Request[Route] = js.native
  
  /** Creates a Route resource in the specified project using the data included in the request. */
  def insert(request: KeyOauthtokenPrettyPrintProjectQuotaUserRequestId): Request[Operation] = js.native
  def insert(request: Xgafv, body: Route): Request[Operation] = js.native
  
  /** Retrieves the list of Route resources available to the specified project. */
  def list(): Request[RouteList] = js.native
  def list(request: MaxResults): Request[RouteList] = js.native
}
