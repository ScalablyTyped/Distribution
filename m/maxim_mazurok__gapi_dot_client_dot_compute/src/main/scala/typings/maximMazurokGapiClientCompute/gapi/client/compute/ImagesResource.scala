package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.CallbackFieldsImage
import typings.maximMazurokGapiClientCompute.anon.Family
import typings.maximMazurokGapiClientCompute.anon.FieldsForceCreate
import typings.maximMazurokGapiClientCompute.anon.FieldsImage
import typings.maximMazurokGapiClientCompute.anon.ForceCreate
import typings.maximMazurokGapiClientCompute.anon.ImageKey
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersionPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.UploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesResource extends StObject {
  
  /** Deletes the specified image. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.Image): Request[Operation] = js.native
  
  /** Sets the deprecation status of an image. If an empty request body is given, clears the deprecation status instead. */
  def deprecate(request: FieldsImage): Request[Operation] = js.native
  def deprecate(request: typings.maximMazurokGapiClientCompute.anon.Image, body: DeprecationStatus): Request[Operation] = js.native
  
  /** Returns the specified image. Gets a list of available images by making a list() request. */
  def get(): Request[Image] = js.native
  def get(request: ImageKey): Request[Image] = js.native
  
  /** Returns the latest image that is part of an image family and is not deprecated. */
  def getFromFamily(): Request[Image] = js.native
  def getFromFamily(request: Family): Request[Image] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersionPrettyPrint): Request[Policy] = js.native
  
  def insert(request: FieldsForceCreate, body: Image): Request[Operation] = js.native
  /** Creates an image in the specified project using the data included in the request. */
  def insert(request: ForceCreate): Request[Operation] = js.native
  
  /**
    * Retrieves the list of custom images available to the specified project. Custom images are images you create that belong to your project. This method does not get any images that
    * belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of publicly-available images, use this method to make a request to the
    * respective image project, such as debian-cloud or windows-cloud.
    */
  def list(): Request[ImageList] = js.native
  def list(request: MaxResults): Request[ImageList] = js.native
  
  /** Patches the specified image with the data included in the request. Only the following fields can be modified: family, description, deprecation status. */
  def patch(request: CallbackFieldsImage): Request[Operation] = js.native
  def patch(request: typings.maximMazurokGapiClientCompute.anon.Image, body: Image): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: UploadTypeUploadprotocol, body: GlobalSetPolicyRequest): Request[Policy] = js.native
  
  /** Sets the labels on an image. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: UploadTypeUploadprotocol, body: GlobalSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: UploadTypeUploadprotocol, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
