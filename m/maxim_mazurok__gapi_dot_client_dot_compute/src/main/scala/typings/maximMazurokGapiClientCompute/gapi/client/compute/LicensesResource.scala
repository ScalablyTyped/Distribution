package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.FieldsKey
import typings.maximMazurokGapiClientCompute.anon.KeyLicense
import typings.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.OauthtokenOptionsRequestedPolicyVersion
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRequestIdResourceUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicensesResource extends js.Object {
  
  /** Deletes the specified license.  Caution This resource is intended for use only by third-party partners who are creating Cloud Marketplace images. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.License): Request[Operation] = js.native
  
  /** Returns the specified License resource.  Caution This resource is intended for use only by third-party partners who are creating Cloud Marketplace images. */
  def get(): Request[License] = js.native
  def get(request: KeyLicense): Request[License] = js.native
  
  /**
    * Gets the access control policy for a resource. May be empty if no such policy or resource exists.  Caution This resource is intended for use only by third-party partners who are
    * creating Cloud Marketplace images.
    */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OauthtokenOptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  def insert(request: FieldsKey, body: License): Request[Operation] = js.native
  /** Create a License resource in the specified project.  Caution This resource is intended for use only by third-party partners who are creating Cloud Marketplace images. */
  def insert(request: ProjectQuotaUserRequestIdResourceUserIp): Request[Operation] = js.native
  
  /**
    * Retrieves the list of licenses available in the specified project. This method does not get any licenses that belong to other projects, including licenses attached to
    * publicly-available images, like Debian 9. If you want to get a list of publicly-available licenses, use this method to make a request to the respective image project, such as
    * debian-cloud or windows-cloud.  Caution This resource is intended for use only by third-party partners who are creating Cloud Marketplace images.
    */
  def list(): Request[LicensesListResponse] = js.native
  def list(request: MaxResults): Request[LicensesListResponse] = js.native
  
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy.  Caution This resource is intended for use only by third-party partners who are creating
    * Cloud Marketplace images.
    */
  def setIamPolicy(request: KeyOauthtokenPrettyPrint, body: GlobalSetPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource.  Caution This resource is intended for use only by third-party partners who are creating Cloud Marketplace images. */
  def testIamPermissions(request: KeyOauthtokenPrettyPrint, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
