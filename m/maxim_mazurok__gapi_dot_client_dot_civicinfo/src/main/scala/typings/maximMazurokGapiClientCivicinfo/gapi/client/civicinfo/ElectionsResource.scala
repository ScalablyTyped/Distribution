package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCivicinfo.anon.Address
import typings.maximMazurokGapiClientCivicinfo.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElectionsResource extends js.Object {
  
  /** List of available elections to query. */
  def electionQuery(): Request[ElectionsQueryResponse] = js.native
  def electionQuery(request: Alt): Request[ElectionsQueryResponse] = js.native
  
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(): Request[VoterInfoResponse] = js.native
  def voterInfoQuery(request: Address): Request[VoterInfoResponse] = js.native
}
