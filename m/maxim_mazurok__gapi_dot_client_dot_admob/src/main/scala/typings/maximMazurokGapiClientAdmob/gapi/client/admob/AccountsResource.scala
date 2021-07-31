package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmob.anon.Fields
import typings.maximMazurokGapiClientAdmob.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  /** Gets information about the specified AdMob publisher account. */
  def get(): Request[PublisherAccount] = js.native
  def get(request: Fields): Request[PublisherAccount] = js.native
  
  /** Lists the AdMob publisher account accessible with the client credential. Currently, all credentials have access to at most one AdMob account. */
  def list(): Request[ListPublisherAccountsResponse] = js.native
  def list(request: Key): Request[ListPublisherAccountsResponse] = js.native
  
  var mediationReport: MediationReportResource = js.native
  
  var networkReport: NetworkReportResource = js.native
}
