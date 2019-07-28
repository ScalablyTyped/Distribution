package typings.loginDashWithDashAmazonDashSdkDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object loginDashWithDashAmazonDashSdkDashBrowserStrings {
  @js.native
  sealed trait access_denied extends AuthorizeRequestErrorType
  
  @js.native
  sealed trait always extends AuthorizeInteractiveOption
  
  @js.native
  sealed trait auto extends AuthorizeInteractiveOption
  
  @js.native
  sealed trait bearer extends js.Object
  
  @js.native
  sealed trait code extends AuthorizeResponseType
  
  @js.native
  sealed trait complete extends AuthorizeRequestStatus
  
  @js.native
  sealed trait in_progress extends AuthorizeRequestStatus
  
  @js.native
  sealed trait invalid_grant extends AuthorizeRequestErrorType
  
  @js.native
  sealed trait invalid_request extends AuthorizeRequestErrorType
  
  @js.native
  sealed trait invalid_scope extends AuthorizeRequestErrorType
  
  @js.native
  sealed trait never extends AuthorizeInteractiveOption
  
  @js.native
  sealed trait postal_code extends AuthorizationScopeOptions
  
  @js.native
  sealed trait profile extends AuthorizationScopeOptions
  
  @js.native
  sealed trait `profile:user_id` extends AuthorizationScopeOptions
  
  @js.native
  sealed trait queued extends AuthorizeRequestStatus
  
  @js.native
  sealed trait server_error extends AuthorizeRequestErrorType
  
  @js.native
  sealed trait temporarily_unavailable extends AuthorizeRequestErrorType
  
  @js.native
  sealed trait token extends AuthorizeResponseType
  
  @js.native
  sealed trait unauthorized_client extends AuthorizeRequestErrorType
  
  @scala.inline
  def access_denied: access_denied = "access_denied".asInstanceOf[access_denied]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def bearer: bearer = "bearer".asInstanceOf[bearer]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  @scala.inline
  def invalid_grant: invalid_grant = "invalid_grant".asInstanceOf[invalid_grant]
  @scala.inline
  def invalid_request: invalid_request = "invalid_request".asInstanceOf[invalid_request]
  @scala.inline
  def invalid_scope: invalid_scope = "invalid_scope".asInstanceOf[invalid_scope]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def postal_code: postal_code = "postal_code".asInstanceOf[postal_code]
  @scala.inline
  def profile: profile = "profile".asInstanceOf[profile]
  @scala.inline
  def `profile:user_id`: `profile:user_id` = "profile:user_id".asInstanceOf[`profile:user_id`]
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  @scala.inline
  def server_error: server_error = "server_error".asInstanceOf[server_error]
  @scala.inline
  def temporarily_unavailable: temporarily_unavailable = "temporarily_unavailable".asInstanceOf[temporarily_unavailable]
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  @scala.inline
  def unauthorized_client: unauthorized_client = "unauthorized_client".asInstanceOf[unauthorized_client]
}

