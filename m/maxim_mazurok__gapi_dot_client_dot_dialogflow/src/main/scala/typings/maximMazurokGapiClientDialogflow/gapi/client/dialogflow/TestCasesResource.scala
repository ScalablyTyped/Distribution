package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDialogflow.anon.Accesstoken
import typings.maximMazurokGapiClientDialogflow.anon.AccesstokenAltCallback
import typings.maximMazurokGapiClientDialogflow.anon.Agent
import typings.maximMazurokGapiClientDialogflow.anon.AltCallbackFields
import typings.maximMazurokGapiClientDialogflow.anon.CallbackFieldsKey
import typings.maximMazurokGapiClientDialogflow.anon.FieldsKeyName
import typings.maximMazurokGapiClientDialogflow.anon.FieldsKeyOauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.KeyNameOauthtoken
import typings.maximMazurokGapiClientDialogflow.anon.KeyOauthtokenParent
import typings.maximMazurokGapiClientDialogflow.anon.PrettyPrint
import typings.maximMazurokGapiClientDialogflow.anon.UpdateMask
import typings.maximMazurokGapiClientDialogflow.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCasesResource extends StObject {
  
  /** Batch deletes test cases. */
  def batchDelete(request: AccesstokenAltCallback): Request[js.Object] = js.native
  def batchDelete(request: PrettyPrint, body: GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest): Request[js.Object] = js.native
  
  /**
    * Kicks off a batch run of test cases. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type
    * has the following method-specific fields: - `metadata`: BatchRunTestCasesMetadata - `response`: BatchRunTestCasesResponse
    */
  def batchRun(request: AltCallbackFields): Request[GoogleLongrunningOperation] = js.native
  def batchRun(request: PrettyPrint, body: GoogleCloudDialogflowCxV3BatchRunTestCasesRequest): Request[GoogleLongrunningOperation] = js.native
  
  /** Calculates the test coverage for an agent. */
  def calculateCoverage(): Request[GoogleCloudDialogflowCxV3CalculateCoverageResponse] = js.native
  def calculateCoverage(request: Agent): Request[GoogleCloudDialogflowCxV3CalculateCoverageResponse] = js.native
  
  /** Creates a test case for the given agent. */
  def create(request: CallbackFieldsKey): Request[GoogleCloudDialogflowCxV3TestCase] = js.native
  def create(request: PrettyPrint, body: GoogleCloudDialogflowCxV3TestCase): Request[GoogleCloudDialogflowCxV3TestCase] = js.native
  
  /**
    * Exports the test cases under the agent to a Cloud Storage bucket or a local file. Filter can be applied to export a subset of test cases. This method is a [long-running
    * operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`:
    * ExportTestCasesMetadata - `response`: ExportTestCasesResponse
    */
  def `export`(request: FieldsKeyOauthtoken): Request[GoogleLongrunningOperation] = js.native
  def `export`(request: PrettyPrint, body: GoogleCloudDialogflowCxV3ExportTestCasesRequest): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets a test case. */
  def get(): Request[GoogleCloudDialogflowCxV3TestCase] = js.native
  def get(request: Accesstoken): Request[GoogleCloudDialogflowCxV3TestCase] = js.native
  
  /**
    * Imports the test cases from a Cloud Storage bucket or a local file. It always creates new test cases and won't overwrite any existing ones. The provided ID in the imported test case
    * is neglected. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following
    * method-specific fields: - `metadata`: ImportTestCasesMetadata - `response`: ImportTestCasesResponse
    */
  def `import`(request: KeyOauthtokenParent): Request[GoogleLongrunningOperation] = js.native
  def `import`(request: PrettyPrint, body: GoogleCloudDialogflowCxV3ImportTestCasesRequest): Request[GoogleLongrunningOperation] = js.native
  
  /** Fetches a list of test cases for a given agent. */
  def list(): Request[GoogleCloudDialogflowCxV3ListTestCasesResponse] = js.native
  def list(request: View): Request[GoogleCloudDialogflowCxV3ListTestCasesResponse] = js.native
  
  /** Updates the specified test case. */
  def patch(request: FieldsKeyName): Request[GoogleCloudDialogflowCxV3TestCase] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDialogflowCxV3TestCase): Request[GoogleCloudDialogflowCxV3TestCase] = js.native
  
  var results: ResultsResource = js.native
  
  def run(request: Accesstoken, body: GoogleCloudDialogflowCxV3RunTestCaseRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Kicks off a test case run. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the
    * following method-specific fields: - `metadata`: RunTestCaseMetadata - `response`: RunTestCaseResponse
    */
  def run(request: KeyNameOauthtoken): Request[GoogleLongrunningOperation] = js.native
}
