package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.AccountIdAltFields
import typings.maximMazurokGapiClientAnalytics.anon.FieldsKey
import typings.maximMazurokGapiClientAnalytics.anon.KeyMaxresults
import typings.maximMazurokGapiClientAnalytics.anon.UnsampledReportId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsampledReportsResource extends js.Object {
  
  /** Deletes an unsampled report. */
  def delete(): Request[Unit] = js.native
  def delete(request: UnsampledReportId): Request[Unit] = js.native
  
  /** Returns a single unsampled report. */
  def get(): Request[UnsampledReport] = js.native
  def get(request: UnsampledReportId): Request[UnsampledReport] = js.native
  
  /** Create a new unsampled report. */
  def insert(request: AccountIdAltFields): Request[UnsampledReport] = js.native
  def insert(request: FieldsKey, body: UnsampledReport): Request[UnsampledReport] = js.native
  
  /** Lists unsampled reports to which the user has access. */
  def list(): Request[UnsampledReports] = js.native
  def list(request: KeyMaxresults): Request[UnsampledReports] = js.native
}
