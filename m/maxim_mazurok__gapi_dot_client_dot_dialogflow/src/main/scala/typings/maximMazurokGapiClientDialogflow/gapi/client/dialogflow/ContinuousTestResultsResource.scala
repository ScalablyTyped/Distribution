package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousTestResultsResource extends StObject {
  
  /** Fetches a list of continuous test results for a given environment. */
  def list(): Request[GoogleCloudDialogflowCxV3ListContinuousTestResultsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudDialogflowCxV3ListContinuousTestResultsResponse] = js.native
}
