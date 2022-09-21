package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.FieldsInstanceTemplate
import typings.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersionPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.UploadTypeUploadprotocol
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTemplatesResource extends StObject {
  
  /**
    * Deletes the specified instance template. Deleting an instance template is permanent and cannot be undone. It is not possible to delete templates that are already in use by a managed
    * instance group.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.InstanceTemplate): Request[Operation] = js.native
  
  /** Returns the specified instance template. Gets a list of available instance templates by making a list() request. */
  def get(): Request[InstanceTemplate] = js.native
  def get(request: FieldsInstanceTemplate): Request[InstanceTemplate] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersionPrettyPrint): Request[Policy] = js.native
  
  /**
    * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an existing instance group, your
    * new instance template must use the same network or, if applicable, the same subnetwork as the original template.
    */
  def insert(request: FieldsKeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def insert(request: Xgafv, body: InstanceTemplate): Request[Operation] = js.native
  
  /** Retrieves a list of instance templates that are contained within the specified project. */
  def list(): Request[InstanceTemplateList] = js.native
  def list(request: MaxResults): Request[InstanceTemplateList] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: UploadTypeUploadprotocol, body: GlobalSetPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: UploadTypeUploadprotocol, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
