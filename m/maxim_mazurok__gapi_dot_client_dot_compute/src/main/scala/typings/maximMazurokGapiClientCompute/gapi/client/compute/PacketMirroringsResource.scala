package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Alt
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.OauthtokenPacketMirroring
import typings.maximMazurokGapiClientCompute.anon.PacketMirroringPrettyPrint
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRegionRequestId
import typings.maximMazurokGapiClientCompute.anon.RegionResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketMirroringsResource extends StObject {
  
  /** Retrieves an aggregated list of packetMirrorings. */
  def aggregatedList(): Request[PacketMirroringAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[PacketMirroringAggregatedList] = js.native
  
  /** Deletes the specified PacketMirroring resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.PacketMirroring): Request[Operation] = js.native
  
  /** Returns the specified PacketMirroring resource. */
  def get(): Request[PacketMirroring] = js.native
  def get(request: OauthtokenPacketMirroring): Request[PacketMirroring] = js.native
  
  def insert(request: typings.maximMazurokGapiClientCompute.anon.Project, body: PacketMirroring): Request[Operation] = js.native
  /** Creates a PacketMirroring resource in the specified project and region using the data included in the request. */
  def insert(request: QuotaUserRegionRequestId): Request[Operation] = js.native
  
  /** Retrieves a list of PacketMirroring resources available to the specified project and region. */
  def list(): Request[PacketMirroringList] = js.native
  def list(request: Filter): Request[PacketMirroringList] = js.native
  
  /** Patches the specified PacketMirroring resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: PacketMirroringPrettyPrint): Request[Operation] = js.native
  def patch(request: typings.maximMazurokGapiClientCompute.anon.PacketMirroring, body: PacketMirroring): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: RegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
