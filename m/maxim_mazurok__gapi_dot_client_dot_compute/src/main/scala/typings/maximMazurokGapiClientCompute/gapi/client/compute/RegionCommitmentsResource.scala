package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Accesstoken
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.Oauthtoken
import typings.maximMazurokGapiClientCompute.anon.QuotaUserRegionRequestIdResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionCommitmentsResource extends StObject {
  
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(): Request[CommitmentAggregatedList] = js.native
  def aggregatedList(request: Accesstoken): Request[CommitmentAggregatedList] = js.native
  
  /** Returns the specified commitment resource. Gets a list of available commitments by making a list() request. */
  def get(): Request[Commitment] = js.native
  def get(request: typings.maximMazurokGapiClientCompute.anon.Commitment): Request[Commitment] = js.native
  
  def insert(request: Oauthtoken, body: Commitment): Request[Operation] = js.native
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: QuotaUserRegionRequestIdResource): Request[Operation] = js.native
  
  /** Retrieves a list of commitments contained within the specified region. */
  def list(): Request[CommitmentList] = js.native
  def list(request: Filter): Request[CommitmentList] = js.native
}
