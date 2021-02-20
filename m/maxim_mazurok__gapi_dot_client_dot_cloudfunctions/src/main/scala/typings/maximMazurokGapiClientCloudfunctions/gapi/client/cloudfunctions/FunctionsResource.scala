package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudfunctions.anon.Accesstoken
import typings.maximMazurokGapiClientCloudfunctions.anon.Callback
import typings.maximMazurokGapiClientCloudfunctions.anon.Fields
import typings.maximMazurokGapiClientCloudfunctions.anon.Key
import typings.maximMazurokGapiClientCloudfunctions.anon.Name
import typings.maximMazurokGapiClientCloudfunctions.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudfunctions.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientCloudfunctions.anon.PageSize
import typings.maximMazurokGapiClientCloudfunctions.anon.Parent
import typings.maximMazurokGapiClientCloudfunctions.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudfunctions.anon.QuotaUser
import typings.maximMazurokGapiClientCloudfunctions.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionsResource extends StObject {
  
  def call(request: Accesstoken, body: CallFunctionRequest): Request[CallFunctionResponse] = js.native
  /**
    * Synchronously invokes a deployed Cloud Function. To be used for testing purposes as very limited traffic is allowed. For more information on the actual limits, refer to [Rate
    * Limits](https://cloud.google.com/functions/quotas#rate_limits).
    */
  def call(request: Callback): Request[CallFunctionResponse] = js.native
  
  /** Creates a new function. If a function with the given name already exists in the specified project, the long running operation will return `ALREADY_EXISTS` error. */
  def create(request: Fields): Request[Operation] = js.native
  def create(request: Key, body: CloudFunction): Request[Operation] = js.native
  
  /** Deletes a function with the given name from the specified project. If the given function is used by some trigger, the trigger will be updated to remove this function. */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  def generateDownloadUrl(request: Accesstoken, body: GenerateDownloadUrlRequest): Request[GenerateDownloadUrlResponse] = js.native
  /**
    * Returns a signed URL for downloading deployed function source code. The URL is only valid for a limited period and should be used within minutes after generation. For more
    * information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls
    */
  def generateDownloadUrl(request: Name): Request[GenerateDownloadUrlResponse] = js.native
  
  /**
    * Returns a signed URL for uploading a function source code. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls.
    * Once the function source code upload is complete, the used signed URL should be provided in CreateFunction or UpdateFunction request as a reference to the function source code. When
    * uploading source code to the generated signed URL, please follow these restrictions: * Source file type should be a zip file. * Source file size should not exceed 100MB limit. * No
    * credentials should be attached - the signed URLs provide access to the target bucket using internal service identity; if credentials were attached, the identity from the credentials
    * would be used, but that identity does not have permissions to upload files to the URL. When making a HTTP PUT request, these two headers need to be specified: * `content-type:
    * application/zip` * `x-goog-content-length-range: 0,104857600` And this header SHOULD NOT be specified: * `Authorization: Bearer YOUR_TOKEN`
    */
  def generateUploadUrl(request: Oauthtoken): Request[GenerateUploadUrlResponse] = js.native
  def generateUploadUrl(request: Parent, body: GenerateUploadUrlRequest): Request[GenerateUploadUrlResponse] = js.native
  
  /** Returns a function with the given name from the requested project. */
  def get(): Request[CloudFunction] = js.native
  def get(request: Accesstoken): Request[CloudFunction] = js.native
  
  /** Gets the IAM access control policy for a function. Returns an empty policy if the function exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Returns a list of functions that belong to the requested project. */
  def list(): Request[ListFunctionsResponse] = js.native
  def list(request: PageSize): Request[ListFunctionsResponse] = js.native
  
  /** Updates existing function. */
  def patch(request: PrettyPrint): Request[Operation] = js.native
  def patch(request: QuotaUser, body: CloudFunction): Request[Operation] = js.native
  
  /** Sets the IAM access control policy on the specified function. Replaces any existing policy. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Tests the specified permissions against the IAM access control policy for a function. If the function does not exist, this will return an empty set of permissions, not a NOT_FOUND
    * error.
    */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
