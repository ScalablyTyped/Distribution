package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersApi extends StObject {
  
  /**
    * Get user info
    *
    * Return the information about the API-connected user.
    */
  def info(): js.Promise[UsersInfoResponse | (AxiosError[Any, Any])] = js.native
  def info(body: UsersInfoRequest): js.Promise[UsersInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Ping
    *
    * Validate an API key and respond to a ping.
    */
  def ping(): js.Promise[UsersPingResponse | (AxiosError[Any, Any])] = js.native
  def ping(body: UsersPingRequest): js.Promise[UsersPingResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Ping 2
    *
    * Validate an API key and respond to a ping (JSON parser version).
    */
  def ping2(): js.Promise[UsersPing2Response | (AxiosError[Any, Any])] = js.native
  def ping2(body: UsersPing2Request): js.Promise[UsersPing2Response | (AxiosError[Any, Any])] = js.native
  
  /**
    * List account senders
    *
    * Return the senders that have tried to use this account, both verified and unverified.
    */
  def senders(): js.Promise[js.Array[UsersSenderResponse] | (AxiosError[Any, Any])] = js.native
  def senders(body: UsersSendersRequest): js.Promise[js.Array[UsersSenderResponse] | (AxiosError[Any, Any])] = js.native
}
