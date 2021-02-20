package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.AltFieldsKeyOauthtoken
import typings.maximMazurokGapiClientAnalytics.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDeletionRequestResource extends StObject {
  
  /** Insert or update a user deletion requests. */
  def upsert(request: AltFieldsKeyOauthtoken): Request[UserDeletionRequest] = js.native
  def upsert(request: UserIp, body: UserDeletionRequest): Request[UserDeletionRequest] = js.native
}
