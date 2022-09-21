package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendersApi extends StObject {
  
  /**
    * Add sender domain
    *
    * Adds a sender domain to your account. Sender domains are added automatically as you send,
    * but you can use this call to add them ahead of time.
    */
  def addDomain(body: SendersDomainRequest): js.Promise[SendersDomainResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Check domain settings
    *
    * Checks the SPF and DKIM settings for a domain, as well the domain verification. If you
    * haven't already added this domain to your account, it will be added automatically.
    */
  def checkDomain(body: SendersDomainRequest): js.Promise[SendersDomainResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List sender domains
    *
    * Returns the sender domains that have been added to this account.
    */
  def domains(): js.Promise[js.Array[SendersDomainResponse] | (AxiosError[Any, Any])] = js.native
  def domains(body: SendersDomainsRequest): js.Promise[js.Array[SendersDomainResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get sender info
    *
    * Return more detailed information about a single sender, including aggregates of recent stats.
    */
  def info(body: SendersInfoRequest): js.Promise[SendersInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List account senders
    *
    * Return the senders that have tried to use this account.
    */
  def list(): js.Promise[js.Array[SendersListResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: SendersListRequest): js.Promise[js.Array[SendersListResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * View sender history
    *
    * Return the recent history (hourly stats for the last 30 days) for a sender.
    */
  def timeSeries(body: SendersInfoRequest): js.Promise[js.Array[TimeSeriesResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Verify domain
    *
    * Sends a verification email in order to verify ownership of a domain. Domain verification
    * is a required step to confirm ownership of a domain. Once a domain has been verified in
    * a Transactional API account, other accounts may not have their messages signed by that
    * domain unless they also verify the domain. This prevents other Transactional API accounts
    * from sending mail signed by your domain.
    */
  def verifyDomain(body: SendersVerifyDomainRequest): js.Promise[SendersVerifyDomainResponse | (AxiosError[Any, Any])] = js.native
}
