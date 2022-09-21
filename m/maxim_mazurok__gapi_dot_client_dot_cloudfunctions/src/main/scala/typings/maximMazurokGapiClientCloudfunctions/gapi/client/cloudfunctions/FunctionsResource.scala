package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudfunctions.anon.Accesstoken
import typings.maximMazurokGapiClientCloudfunctions.anon.Alt
import typings.maximMazurokGapiClientCloudfunctions.anon.Callback
import typings.maximMazurokGapiClientCloudfunctions.anon.Fields
import typings.maximMazurokGapiClientCloudfunctions.anon.Filter
import typings.maximMazurokGapiClientCloudfunctions.anon.Key
import typings.maximMazurokGapiClientCloudfunctions.anon.Name
import typings.maximMazurokGapiClientCloudfunctions.anon.Oauthtoken
import typings.maximMazurokGapiClientCloudfunctions.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientCloudfunctions.anon.PrettyPrint
import typings.maximMazurokGapiClientCloudfunctions.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionsResource extends StObject {
  
  /** Creates a new function. If a function with the given name already exists in the specified project, the long running operation will return `ALREADY_EXISTS` error. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, // tslint:disable-next-line:ban-types
  body: Function): Request[Operation] = js.native
  
  /** Deletes a function with the given name from the specified project. If the given function is used by some trigger, the trigger will be updated to remove this function. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  def generateDownloadUrl(request: Callback, body: GenerateDownloadUrlRequest): Request[GenerateDownloadUrlResponse] = js.native
  /**
    * Returns a signed URL for downloading deployed function source code. The URL is only valid for a limited period and should be used within 30 minutes of generation. For more
    * information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls
    */
  def generateDownloadUrl(request: Fields): Request[GenerateDownloadUrlResponse] = js.native
  
  /**
    * Returns a signed URL for uploading a function source code. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls.
    * Once the function source code upload is complete, the used signed URL should be provided in CreateFunction or UpdateFunction request as a reference to the function source code. When
    * uploading source code to the generated signed URL, please follow these restrictions: * Source file type should be a zip file. * No credentials should be attached - the signed URLs
    * provide access to the target bucket using internal service identity; if credentials were attached, the identity from the credentials would be used, but that identity does not have
    * permissions to upload files to the URL. When making a HTTP PUT request, these two headers need to be specified: * `content-type: application/zip` And this header SHOULD NOT be
    * specified: * `Authorization: Bearer YOUR_TOKEN`
    */
  def generateUploadUrl(request: Key): Request[GenerateUploadUrlResponse] = js.native
  def generateUploadUrl(request: Oauthtoken, body: GenerateUploadUrlRequest): Request[GenerateUploadUrlResponse] = js.native
  
  /** Returns a function with the given name from the requested project. */
  def get(): Request[Function] = js.native
  def get(request: Callback): Request[Function] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Returns a list of functions that belong to the requested project. */
  def list(): Request[ListFunctionsResponse] = js.native
  def list(request: Filter): Request[ListFunctionsResponse] = js.native
  
  /** Updates existing function. */
  def patch(request: Name): Request[Operation] = js.native
  def patch(request: PrettyPrint, // tslint:disable-next-line:ban-types
  body: Function): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: QuotaUser, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: QuotaUser, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
