package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.AltDisk
import typings.maximMazurokGapiClientCompute.anon.AltFieldsKey
import typings.maximMazurokGapiClientCompute.anon.DiskFields
import typings.maximMazurokGapiClientCompute.anon.Fields
import typings.maximMazurokGapiClientCompute.anon.GuestFlush
import typings.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersion
import typings.maximMazurokGapiClientCompute.anon.QuotaUserResource
import typings.maximMazurokGapiClientCompute.anon.QuotaUserUserIp
import typings.maximMazurokGapiClientCompute.anon.RequestIdSourceImage
import typings.maximMazurokGapiClientCompute.anon.ResourceUserIp
import typings.maximMazurokGapiClientCompute.anon.SourceImage
import typings.maximMazurokGapiClientCompute.anon.UserIpZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisksResource extends StObject {
  
  def addResourcePolicies(request: AltDisk, body: DisksAddResourcePoliciesRequest): Request[Operation] = js.native
  /** Adds existing resource policies to a disk. You can only add one policy which will be applied to this disk for scheduling snapshot creation. */
  def addResourcePolicies(request: typings.maximMazurokGapiClientCompute.anon.Disk): Request[Operation] = js.native
  
  /** Retrieves an aggregated list of persistent disks. */
  def aggregatedList(): Request[DiskAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[DiskAggregatedList] = js.native
  
  def createSnapshot(request: DiskFields, body: Snapshot): Request[Operation] = js.native
  /** Creates a snapshot of a specified persistent disk. */
  def createSnapshot(request: GuestFlush): Request[Operation] = js.native
  
  /**
    * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any snapshots previously made from
    * the disk. You must separately delete snapshots.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: AltDisk): Request[Operation] = js.native
  
  /** Returns a specified persistent disk. Gets a list of available persistent disks by making a list() request. */
  def get(): Request[Disk] = js.native
  def get(request: QuotaUserUserIp): Request[Disk] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  def insert(request: RequestIdSourceImage, body: Disk): Request[Operation] = js.native
  /**
    * Creates a persistent disk in the specified project using the data in the request. You can create a disk from a source (sourceImage, sourceSnapshot, or sourceDisk) or create an empty
    * 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb property.
    */
  def insert(request: SourceImage): Request[Operation] = js.native
  
  /** Retrieves a list of persistent disks contained within the specified zone. */
  def list(): Request[DiskList] = js.native
  def list(request: Fields): Request[DiskList] = js.native
  
  def removeResourcePolicies(request: AltDisk, body: DisksRemoveResourcePoliciesRequest): Request[Operation] = js.native
  /** Removes resource policies from a disk. */
  def removeResourcePolicies(request: ResourceUserIp): Request[Operation] = js.native
  
  def resize(request: AltDisk, body: DisksResizeRequest): Request[Operation] = js.native
  /** Resizes the specified persistent disk. You can only increase the size of the disk. */
  def resize(request: UserIpZone): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: QuotaUserResource, body: ZoneSetPolicyRequest): Request[Policy] = js.native
  
  /** Sets the labels on a disk. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AltFieldsKey, body: ZoneSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: QuotaUserResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
