package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCivicinfo.anon.Callback
import typings.maximMazurokGapiClientCivicinfo.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepresentativesResource extends js.Object {
  
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(): Request[RepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(request: Callback): Request[RepresentativeInfoResponse] = js.native
  
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(): Request[RepresentativeInfoData] = js.native
  def representativeInfoByDivision(request: Fields): Request[RepresentativeInfoData] = js.native
}
