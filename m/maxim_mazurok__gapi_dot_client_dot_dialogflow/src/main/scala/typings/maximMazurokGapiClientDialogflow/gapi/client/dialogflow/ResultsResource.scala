package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultsResource extends StObject {
  
  /** Gets a test case result. */
  def get(): Request[GoogleCloudDialogflowCxV3TestCaseResult] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3TestCaseResult] = js.native
  
  /** Fetches a list of results for a given test case. */
  def list(): Request[GoogleCloudDialogflowCxV3ListTestCaseResultsResponse] = js.native
  def list(request: Alt): Request[GoogleCloudDialogflowCxV3ListTestCaseResultsResponse] = js.native
}
