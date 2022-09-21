package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudbuild.anon.AllowMissing
import typings.maximMazurokGapiClientCloudbuild.anon.Fields
import typings.maximMazurokGapiClientCloudbuild.anon.PageToken
import typings.maximMazurokGapiClientCloudbuild.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientCloudbuild.anon.QuotaUserUpdateMask
import typings.maximMazurokGapiClientCloudbuild.anon.ValidateOnly
import typings.maximMazurokGapiClientCloudbuild.anon.WorkerPoolId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerPoolsResource extends StObject {
  
  /** Creates a `WorkerPool`. */
  def create(request: ValidateOnly): Request[Operation] = js.native
  def create(request: WorkerPoolId, body: WorkerPool): Request[Operation] = js.native
  
  /** Deletes a `WorkerPool`. */
  def delete(): Request[Operation] = js.native
  def delete(request: AllowMissing): Request[Operation] = js.native
  
  /** Returns details of a `WorkerPool`. */
  def get(): Request[WorkerPool] = js.native
  def get(request: Fields): Request[WorkerPool] = js.native
  
  /** Lists `WorkerPool`s. */
  def list(): Request[ListWorkerPoolsResponse] = js.native
  def list(request: PageToken): Request[ListWorkerPoolsResponse] = js.native
  
  /** Updates a `WorkerPool`. */
  def patch(request: PrettyPrintQuotaUser): Request[Operation] = js.native
  def patch(request: QuotaUserUpdateMask, body: WorkerPool): Request[Operation] = js.native
}
