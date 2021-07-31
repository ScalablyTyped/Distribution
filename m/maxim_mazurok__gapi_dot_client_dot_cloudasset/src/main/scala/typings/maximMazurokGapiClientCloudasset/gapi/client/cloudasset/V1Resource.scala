package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudasset.anon.Alt
import typings.maximMazurokGapiClientCloudasset.anon.AnalysisQueryaccessSelectorpermissions
import typings.maximMazurokGapiClientCloudasset.anon.AssetNames
import typings.maximMazurokGapiClientCloudasset.anon.AssetTypes
import typings.maximMazurokGapiClientCloudasset.anon.Key
import typings.maximMazurokGapiClientCloudasset.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudasset.anon.PageSize
import typings.maximMazurokGapiClientCloudasset.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends StObject {
  
  /** Analyzes IAM policies to answer which identities have what accesses on which resources. */
  def analyzeIamPolicy(): Request[AnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(request: AnalysisQueryaccessSelectorpermissions): Request[AnalyzeIamPolicyResponse] = js.native
  
  /**
    * Analyzes IAM policies asynchronously to answer which identities have what accesses on which resources, and writes the analysis results to a Google Cloud Storage or a BigQuery
    * destination. For Cloud Storage destination, the output format is the JSON format that represents a AnalyzeIamPolicyResponse. This method implements the google.longrunning.Operation,
    * which allows you to track the operation status. We recommend intervals of at least 2 seconds with exponential backoff retry to poll the operation result. The metadata contains the
    * request to help callers to map responses to requests.
    */
  def analyzeIamPolicyLongrunning(request: Key): Request[Operation] = js.native
  def analyzeIamPolicyLongrunning(request: Oauthtoken, body: AnalyzeIamPolicyLongrunningRequest): Request[Operation] = js.native
  
  /**
    * Batch gets the update history of assets that overlap a time window. For IAM_POLICY content, this API outputs history when the asset and its attached IAM POLICY both exist. This can
    * create gaps in the output history. Otherwise, this API outputs history with asset in both non-delete or deleted status. If a specified asset does not exist, this API returns an
    * INVALID_ARGUMENT error.
    */
  def batchGetAssetsHistory(): Request[BatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(request: AssetNames): Request[BatchGetAssetsHistoryResponse] = js.native
  
  def exportAssets(request: Alt, body: ExportAssetsRequest): Request[Operation] = js.native
  /**
    * Exports assets with time and resource types to a given Cloud Storage location/BigQuery table. For Cloud Storage location destinations, the output format is newline-delimited JSON.
    * Each line represents a google.cloud.asset.v1.Asset in the JSON format; for BigQuery table destinations, the output table stores the fields in asset proto as columns. This API
    * implements the google.longrunning.Operation API , which allows you to keep track of the export. We recommend intervals of at least 2 seconds with exponential retry to poll the
    * export operation result. For regular-size resource parent, the export operation usually finishes within 5 minutes.
    */
  def exportAssets(request: Parent): Request[Operation] = js.native
  
  /**
    * Searches all IAM policies within the specified scope, such as a project, folder, or organization. The caller must be granted the `cloudasset.assets.searchAllIamPolicies` permission
    * on the desired scope, otherwise the request will be rejected.
    */
  def searchAllIamPolicies(): Request[SearchAllIamPoliciesResponse] = js.native
  def searchAllIamPolicies(request: PageSize): Request[SearchAllIamPoliciesResponse] = js.native
  
  /**
    * Searches all Cloud resources within the specified scope, such as a project, folder, or organization. The caller must be granted the `cloudasset.assets.searchAllResources` permission
    * on the desired scope, otherwise the request will be rejected.
    */
  def searchAllResources(): Request[SearchAllResourcesResponse] = js.native
  def searchAllResources(request: AssetTypes): Request[SearchAllResourcesResponse] = js.native
}
