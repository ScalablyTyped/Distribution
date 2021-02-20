package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginWithAmazonSdkBrowserStrings {
  
  @js.native
  sealed trait access_denied extends AuthorizeRequestErrorType
  @scala.inline
  def access_denied: access_denied = "access_denied".asInstanceOf[access_denied]
  
  @js.native
  sealed trait always extends AuthorizeInteractiveOption
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait auto extends AuthorizeInteractiveOption
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bearer extends StObject
  @scala.inline
  def bearer: bearer = "bearer".asInstanceOf[bearer]
  
  @js.native
  sealed trait code extends AuthorizeResponseType
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait complete extends AuthorizeRequestStatus
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait in_progress extends AuthorizeRequestStatus
  @scala.inline
  def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  
  @js.native
  sealed trait invalid_grant extends AuthorizeRequestErrorType
  @scala.inline
  def invalid_grant: invalid_grant = "invalid_grant".asInstanceOf[invalid_grant]
  
  @js.native
  sealed trait invalid_request extends AuthorizeRequestErrorType
  @scala.inline
  def invalid_request: invalid_request = "invalid_request".asInstanceOf[invalid_request]
  
  @js.native
  sealed trait invalid_scope extends AuthorizeRequestErrorType
  @scala.inline
  def invalid_scope: invalid_scope = "invalid_scope".asInstanceOf[invalid_scope]
  
  @js.native
  sealed trait never extends AuthorizeInteractiveOption
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait postal_code extends AuthorizationScopeOptions
  @scala.inline
  def postal_code: postal_code = "postal_code".asInstanceOf[postal_code]
  
  @js.native
  sealed trait profile extends AuthorizationScopeOptions
  @scala.inline
  def profile: profile = "profile".asInstanceOf[profile]
  
  @js.native
  sealed trait profileColonuser_id extends AuthorizationScopeOptions
  @scala.inline
  def profileColonuser_id: profileColonuser_id = "profile:user_id".asInstanceOf[profileColonuser_id]
  
  @js.native
  sealed trait queued extends AuthorizeRequestStatus
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait server_error extends AuthorizeRequestErrorType
  @scala.inline
  def server_error: server_error = "server_error".asInstanceOf[server_error]
  
  @js.native
  sealed trait temporarily_unavailable extends AuthorizeRequestErrorType
  @scala.inline
  def temporarily_unavailable: temporarily_unavailable = "temporarily_unavailable".asInstanceOf[temporarily_unavailable]
  
  @js.native
  sealed trait token extends AuthorizeResponseType
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait unauthorized_client extends AuthorizeRequestErrorType
  @scala.inline
  def unauthorized_client: unauthorized_client = "unauthorized_client".asInstanceOf[unauthorized_client]
}
