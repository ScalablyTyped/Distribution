package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AltBackendBucket
import typings.maximMazurokGapiClientCompute.anon.AltFields
import typings.maximMazurokGapiClientCompute.anon.BackendBucketFields
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.KeyName
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtoken
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendBucketsResource extends js.Object {
  
  def addSignedUrlKey(request: AltBackendBucket, body: SignedUrlKey): Request[Operation] = js.native
  /** Adds a key for validating requests with signed URLs for this backend bucket. */
  def addSignedUrlKey(request: typings.maximMazurokGapiClientCompute.anon.BackendBucket): Request[Operation] = js.native
  
  /** Deletes the specified BackendBucket resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: AltBackendBucket): Request[Operation] = js.native
  
  /** Deletes a key for validating requests with signed URLs for this backend bucket. */
  def deleteSignedUrlKey(): Request[Operation] = js.native
  def deleteSignedUrlKey(request: KeyName): Request[Operation] = js.native
  
  /** Returns the specified BackendBucket resource. Gets a list of available backend buckets by making a list() request. */
  def get(): Request[BackendBucket] = js.native
  def get(request: BackendBucketFields): Request[BackendBucket] = js.native
  
  /** Creates a BackendBucket resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  def insert(request: FieldsKey, body: BackendBucket): Request[Operation] = js.native
  
  /** Retrieves the list of BackendBucket resources available to the specified project. */
  def list(): Request[BackendBucketList] = js.native
  def list(request: MaxResults): Request[BackendBucketList] = js.native
  
  def patch(request: AltBackendBucket, body: BackendBucket): Request[Operation] = js.native
  /** Updates the specified BackendBucket resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules. */
  def patch(request: KeyOauthtoken): Request[Operation] = js.native
  
  def update(request: AltBackendBucket, body: BackendBucket): Request[Operation] = js.native
  /** Updates the specified BackendBucket resource with the data included in the request. */
  def update(request: KeyOauthtoken): Request[Operation] = js.native
}
