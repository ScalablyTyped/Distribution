package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.AccesstokenAltCallbackDisk
import typings.maximMazurokGapiClientCompute.anon.AltCallbackDisk
import typings.maximMazurokGapiClientCompute.anon.AltCallbackDiskFields
import typings.maximMazurokGapiClientCompute.anon.CallbackDiskFields
import typings.maximMazurokGapiClientCompute.anon.DiskFieldsKey
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRegionResource
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRegionUploadType
import typings.maximMazurokGapiClientCompute.anon.RegionRequestId
import typings.maximMazurokGapiClientCompute.anon.RegionResource
import typings.maximMazurokGapiClientCompute.anon.RequestIdSourceImage
import typings.maximMazurokGapiClientCompute.anon.ResourceSourceImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionDisksResource extends StObject {
  
  /** Adds existing resource policies to a regional disk. You can only add one policy which will be applied to this disk for scheduling snapshot creation. */
  def addResourcePolicies(request: AltCallbackDisk): Request[Operation] = js.native
  def addResourcePolicies(request: CallbackDiskFields, body: RegionDisksAddResourcePoliciesRequest): Request[Operation] = js.native
  
  def createSnapshot(request: CallbackDiskFields, body: Snapshot): Request[Operation] = js.native
  /** Creates a snapshot of this regional disk. */
  def createSnapshot(request: DiskFieldsKey): Request[Operation] = js.native
  
  /**
    * Deletes the specified regional persistent disk. Deleting a regional disk removes all the replicas of its data permanently and is irreversible. However, deleting a disk does not
    * delete any snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: CallbackDiskFields): Request[Operation] = js.native
  
  /** Returns a specified regional persistent disk. */
  def get(): Request[Disk] = js.native
  def get(request: QuotaUserRegionUploadType): Request[Disk] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: RegionResource): Request[Policy] = js.native
  
  def insert(request: RequestIdSourceImage, body: Disk): Request[Operation] = js.native
  /** Creates a persistent regional disk in the specified project using the data included in the request. */
  def insert(request: ResourceSourceImage): Request[Operation] = js.native
  
  /** Retrieves the list of persistent disks contained within the specified region. */
  def list(): Request[DiskList] = js.native
  def list(request: Filter): Request[DiskList] = js.native
  
  /** Removes resource policies from a regional disk. */
  def removeResourcePolicies(request: AccesstokenAltCallbackDisk): Request[Operation] = js.native
  def removeResourcePolicies(request: CallbackDiskFields, body: RegionDisksRemoveResourcePoliciesRequest): Request[Operation] = js.native
  
  /** Resizes the specified regional persistent disk. */
  def resize(request: AltCallbackDiskFields): Request[Operation] = js.native
  def resize(request: CallbackDiskFields, body: RegionDisksResizeRequest): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: QuotaUserRegionResource, body: RegionSetPolicyRequest): Request[Policy] = js.native
  
  /** Sets the labels on the target regional disk. */
  def setLabels(request: RegionRequestId, body: RegionSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserRegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
