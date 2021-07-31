package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.KeyOauthtokenPrettyPrintProfileId
import typings.maximMazurokGapiClientDfareporting.anon.QuotaUserReportId
import typings.maximMazurokGapiClientDfareporting.anon.ReportIdResource
import typings.maximMazurokGapiClientDfareporting.anon.Scope
import typings.maximMazurokGapiClientDfareporting.anon.Synchronous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  var compatibleFields: CompatibleFieldsResource = js.native
  
  /** Deletes a report by its ID. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUserReportId): Request[Unit] = js.native
  
  var files: FilesResource = js.native
  
  /** Retrieves a report by its ID. */
  def get(): Request[Report] = js.native
  def get(request: QuotaUserReportId): Request[Report] = js.native
  
  def insert(request: Callback, body: Report): Request[Report] = js.native
  /** Creates a report. */
  def insert(request: KeyOauthtokenPrettyPrintProfileId): Request[Report] = js.native
  
  /** Retrieves list of reports. */
  def list(): Request[ReportList] = js.native
  def list(request: Scope): Request[ReportList] = js.native
  
  def patch(request: QuotaUserReportId, body: Report): Request[Report] = js.native
  /** Updates an existing report. This method supports patch semantics. */
  def patch(request: ReportIdResource): Request[Report] = js.native
  
  /** Runs a report. */
  def run(): Request[File] = js.native
  def run(request: Synchronous): Request[File] = js.native
  
  def update(request: QuotaUserReportId, body: Report): Request[Report] = js.native
  /** Updates a report. */
  def update(request: ReportIdResource): Request[Report] = js.native
}
