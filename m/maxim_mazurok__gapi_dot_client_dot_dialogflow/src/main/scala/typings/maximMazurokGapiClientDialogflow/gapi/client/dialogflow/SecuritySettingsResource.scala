package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.PageSize
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.QuotaUserResourceUpdateMask
import typings.maximMazurokGapiClientDialogflow.anon.UpdateMask
import typings.maximMazurokGapiClientDialogflow.anon.UploadTypeUploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySettingsResource extends StObject {
  
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3SecuritySettings): Request[GoogleCloudDialogflowCxV3SecuritySettings] = js.native
  /** Create security settings in the specified location. */
  def create(request: UploadTypeUploadprotocolXgafv): Request[GoogleCloudDialogflowCxV3SecuritySettings] = js.native
  
  /** Deletes the specified SecuritySettings. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Retrieves the specified SecuritySettings. The returned settings may be stale by up to 1 minute. */
  def get(): Request[GoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3SecuritySettings] = js.native
  
  /** Returns the list of all security settings in the specified location. */
  def list(): Request[GoogleCloudDialogflowCxV3ListSecuritySettingsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListSecuritySettingsResponse] = js.native
  
  /** Updates the specified SecuritySettings. */
  def patch(request: QuotaUserResourceUpdateMask): Request[GoogleCloudDialogflowCxV3SecuritySettings] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3SecuritySettings): Request[GoogleCloudDialogflowCxV3SecuritySettings] = js.native
}
