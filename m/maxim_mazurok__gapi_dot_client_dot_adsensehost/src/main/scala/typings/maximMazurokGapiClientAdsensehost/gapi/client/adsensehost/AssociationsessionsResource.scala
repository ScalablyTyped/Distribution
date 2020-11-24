package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdsensehost.anon.CallbackUrl
import typings.maximMazurokGapiClientAdsensehost.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationsessionsResource extends js.Object {
  
  /** Create an association session for initiating an association with an AdSense user. */
  def start(): Request[AssociationSession] = js.native
  def start(request: CallbackUrl): Request[AssociationSession] = js.native
  
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(): Request[AssociationSession] = js.native
  def verify(request: QuotaUser): Request[AssociationSession] = js.native
}
