package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AccesstokenAlt
import typings.maximMazurokGapiClientCompute.anon.KeyName
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.Resource
import typings.maximMazurokGapiClientCompute.anon.Uploadprotocol
import typings.maximMazurokGapiClientCompute.anon.UserIp
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendBucketsResource extends StObject {
  
  /** Adds a key for validating requests with signed URLs for this backend bucket. */
  def addSignedUrlKey(request: typings.maximMazurokGapiClientCompute.anon.BackendBucket): Request[Operation] = js.native
  def addSignedUrlKey(request: Uploadprotocol, body: SignedUrlKey): Request[Operation] = js.native
  
  /** Deletes the specified BackendBucket resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: Uploadprotocol): Request[Operation] = js.native
  
  /** Deletes a key for validating requests with signed URLs for this backend bucket. */
  def deleteSignedUrlKey(): Request[Operation] = js.native
  def deleteSignedUrlKey(request: KeyName): Request[Operation] = js.native
  
  /** Returns the specified BackendBucket resource. Gets a list of available backend buckets by making a list() request. */
  def get(): Request[BackendBucket] = js.native
  def get(request: UserIp): Request[BackendBucket] = js.native
  
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(request: Resource): Request[Operation] = js.native
  def insert(request: Xgafv, body: BackendBucket): Request[Operation] = js.native
  
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(): Request[BackendBucketList] = js.native
  def list(request: MaxResults): Request[BackendBucketList] = js.native
  
  /** Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules. */
  def patch(request: AccesstokenAlt): Request[Operation] = js.native
  def patch(request: Uploadprotocol, body: BackendBucket): Request[Operation] = js.native
  
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(request: AccesstokenAlt): Request[Operation] = js.native
  def update(request: Uploadprotocol, body: BackendBucket): Request[Operation] = js.native
}
