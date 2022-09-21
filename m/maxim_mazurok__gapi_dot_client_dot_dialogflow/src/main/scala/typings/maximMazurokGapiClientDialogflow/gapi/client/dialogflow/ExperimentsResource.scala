package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.PageSize
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.Resource
import typings.maximMazurokGapiClientDialogflow.anon.UpdateMask
import typings.maximMazurokGapiClientDialogflow.anon.UploadType
import typings.maximMazurokGapiClientDialogflow.anon.Uploadprotocol
import typings.maximMazurokGapiClientDialogflow.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentsResource extends StObject {
  
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3Experiment): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  /** Creates an Experiment in the specified Environment. */
  def create(request: Resource): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  
  /** Deletes the specified Experiment. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Retrieves the specified Experiment. */
  def get(): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  
  /** Returns the list of all experiments in the specified Environment. */
  def list(): Request[GoogleCloudDialogflowCxV3ListExperimentsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListExperimentsResponse] = js.native
  
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3Experiment): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  /** Updates the specified Experiment. */
  def patch(request: UploadType): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  
  def start(request: Accesstoken, body: GoogleCloudDialogflowCxV3StartExperimentRequest): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  /** Starts the specified Experiment. This rpc only changes the state of experiment from PENDING to RUNNING. */
  def start(request: Uploadprotocol): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  
  def stop(request: Accesstoken, body: GoogleCloudDialogflowCxV3StopExperimentRequest): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
  /** Stops the specified Experiment. This rpc only changes the state of experiment from RUNNING to DONE. */
  def stop(request: Xgafv): Request[GoogleCloudDialogflowCxV3Experiment] = js.native
}
