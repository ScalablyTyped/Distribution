package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.AccountIdAlt
import typings.maximMazurokGapiClientAnalytics.anon.MaxresultsOauthtoken
import typings.maximMazurokGapiClientAnalytics.anon.QuotaUserRemarketingAudienceId
import typings.maximMazurokGapiClientAnalytics.anon.RemarketingAudienceId
import typings.maximMazurokGapiClientAnalytics.anon.UserIpWebPropertyId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarketingAudienceResource extends StObject {
  
  /** Delete a remarketing audience. */
  def delete(): Request[Unit] = js.native
  def delete(request: RemarketingAudienceId): Request[Unit] = js.native
  
  /** Gets a remarketing audience to which the user has access. */
  def get(): Request[RemarketingAudience] = js.native
  def get(request: RemarketingAudienceId): Request[RemarketingAudience] = js.native
  
  def insert(request: AccountIdAlt, body: RemarketingAudience): Request[RemarketingAudience] = js.native
  /** Creates a new remarketing audience. */
  def insert(request: UserIpWebPropertyId): Request[RemarketingAudience] = js.native
  
  /** Lists remarketing audiences to which the user has access. */
  def list(): Request[RemarketingAudiences] = js.native
  def list(request: MaxresultsOauthtoken): Request[RemarketingAudiences] = js.native
  
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: QuotaUserRemarketingAudienceId): Request[RemarketingAudience] = js.native
  def patch(request: RemarketingAudienceId, body: RemarketingAudience): Request[RemarketingAudience] = js.native
  
  /** Updates an existing remarketing audience. */
  def update(request: QuotaUserRemarketingAudienceId): Request[RemarketingAudience] = js.native
  def update(request: RemarketingAudienceId, body: RemarketingAudience): Request[RemarketingAudience] = js.native
}
