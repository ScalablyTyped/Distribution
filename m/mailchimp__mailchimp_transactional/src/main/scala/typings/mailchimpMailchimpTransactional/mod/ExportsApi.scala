package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportsApi extends StObject {
  
  /**
    * Export activity history
    *
    * Begins an export of your activity history. The activity will be exported to a zip archive
    * containing a single file named activity.csv in the same format as you would be able to export
    * from your account's activity view. It includes the following fields: Date, Email Address,
    * Sender, Subject, Status, Tags, Opens, Clicks, Bounce Detail. If you have configured any
    * custom metadata fields, they will be included in the exported data.
    */
  def activity(): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
  def activity(body: ExportsActivityRequest): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Export Allowlist
    *
    * Begins an export of your rejection allowlist. The allowlist will be exported to a zip archive
    * containing a single file named allowlist.csv that includes the following fields:
    * email, detail, created_at.
    */
  def allowlist(): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
  def allowlist(body: ExportsStartJobRequest): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * View export info
    *
    * Returns information about an export job. If the export job's state is 'complete', the returned
    * data will include a URL you can use to fetch the results. Every export job produces a zip archive,
    * but the format of the archive is distinct for each job type. The api calls that initiate exports
    * include more details about the output format for that job type.
    */
  def info(body: ExportsInfoRequest): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List exports
    *
    * Returns a list of your exports.
    */
  def list(): js.Promise[js.Array[ExportResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: ExportsListRequest): js.Promise[js.Array[ExportResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Export denylist
    *
    * Begins an export of your rejection denylist. The denylist will be exported to a zip archive
    * containing a single file named rejects.csv that includes the following fields:
    * email, reason, detail, created_at, expires_at, last_event_at, expires_at.
    */
  def rejects(): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
  def rejects(body: ExportsStartJobRequest): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Export Allowlist
    *
    * Begins an export of your rejection allowlist. The allowlist will be exported to a zip archive
    * containing a single file named allowlist.csv that includes the following fields:
    * email, detail, created_at.
    */
  def whitelist(): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
  def whitelist(body: ExportsStartJobRequest): js.Promise[ExportResponse | (AxiosError[Any, Any])] = js.native
}
