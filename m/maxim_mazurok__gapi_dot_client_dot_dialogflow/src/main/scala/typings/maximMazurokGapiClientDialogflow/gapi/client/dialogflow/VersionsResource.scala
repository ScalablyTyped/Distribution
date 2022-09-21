package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.AltBaseVersion
import typings.maximMazurokGapiClientDialogflow.anon.BaseVersion
import typings.maximMazurokGapiClientDialogflow.anon.KeyOauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.PageSize
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientDialogflow.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends StObject {
  
  def compareVersions(request: AltBaseVersion, body: GoogleCloudDialogflowCxV3CompareVersionsRequest): Request[GoogleCloudDialogflowCxV3CompareVersionsResponse] = js.native
  /** Compares the specified base version with target version. */
  def compareVersions(request: BaseVersion): Request[GoogleCloudDialogflowCxV3CompareVersionsResponse] = js.native
  
  /**
    * Creates a Version in the specified Flow. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation`
    * type has the following method-specific fields: - `metadata`: CreateVersionOperationMetadata - `response`: Version
    */
  def create(request: KeyOauthtoken): Request[GoogleLongrunningOperation] = js.native
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3Version): Request[GoogleLongrunningOperation] = js.native
  
  /** Deletes the specified Version. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Retrieves the specified Version. */
  def get(): Request[GoogleCloudDialogflowCxV3Version] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3Version] = js.native
  
  /** Returns the list of all versions in the specified Flow. */
  def list(): Request[GoogleCloudDialogflowCxV3ListVersionsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListVersionsResponse] = js.native
  
  def load(request: Accesstoken, body: GoogleCloudDialogflowCxV3LoadVersionRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Loads resources in the specified version to the draft flow. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The
    * returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct
    * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty
    * message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)
    */
  def load(request: OauthtokenPrettyPrint): Request[GoogleLongrunningOperation] = js.native
  
  /** Updates the specified Version. */
  def patch(request: PrettyPrintQuotaUser): Request[GoogleCloudDialogflowCxV3Version] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3Version): Request[GoogleCloudDialogflowCxV3Version] = js.native
}
