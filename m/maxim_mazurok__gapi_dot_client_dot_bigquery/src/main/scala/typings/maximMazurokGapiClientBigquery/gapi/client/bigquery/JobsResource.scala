package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquery.anon.AllUsers
import typings.maximMazurokGapiClientBigquery.anon.JobId
import typings.maximMazurokGapiClientBigquery.anon.Key
import typings.maximMazurokGapiClientBigquery.anon.Location
import typings.maximMazurokGapiClientBigquery.anon.PrettyPrint
import typings.maximMazurokGapiClientBigquery.anon.ProjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends StObject {
  
  /**
    * Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed successfully. Cancelled jobs
    * may still incur costs.
    */
  def cancel(): Request[JobCancelResponse] = js.native
  def cancel(request: JobId): Request[JobCancelResponse] = js.native
  
  /**
    * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran the job, or have the Is Owner
    * project role.
    */
  def get(): Request[Job] = js.native
  def get(request: JobId): Request[Job] = js.native
  
  /** Retrieves the results of a query job. */
  def getQueryResults(): Request[GetQueryResultsResponse] = js.native
  def getQueryResults(request: Location): Request[GetQueryResultsResponse] = js.native
  
  def insert(request: Key, body: Job): Request[Job] = js.native
  /** Starts a new asynchronous job. Requires the Can View project role. */
  def insert(request: PrettyPrint): Request[Job] = js.native
  
  /**
    * Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in reverse chronological order,
    * by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
    */
  def list(): Request[JobList] = js.native
  def list(request: AllUsers): Request[JobList] = js.native
  
  def query(request: Key, body: QueryRequest): Request[QueryResponse] = js.native
  /** Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout. */
  def query(request: ProjectId): Request[QueryResponse] = js.native
}
