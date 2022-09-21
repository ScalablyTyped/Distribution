package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InboundApi extends StObject {
  
  /**
    * Add inbound domain
    *
    * Add an inbound domain to your account.
    */
  def addDomain(body: InboundDomainRequest): js.Promise[InboundDomainResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Add mailbox route
    *
    * Add a new mailbox route to an inbound domain.
    */
  def addRoute(body: InboundAddRouteRequest): js.Promise[InboundRouteResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Check domain settings
    *
    * Check the MX settings for an inbound domain. The domain must have already been added with the
    * add-domain call.
    */
  def checkDomain(body: InboundDomainRequest): js.Promise[InboundDomainResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete inbound domain
    *
    * Delete an inbound domain from the account. All mail will stop routing for this domain immediately.
    */
  def deleteDomain(body: InboundDomainRequest): js.Promise[InboundDomainResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete mailbox route
    *
    * Delete an existing inbound mailbox route.
    */
  def deleteRoute(body: InboundDeleteRouteRequest): js.Promise[InboundRouteResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List inbound domains
    *
    * List the domains that have been configured for inbound delivery.
    */
  def domains(): js.Promise[js.Array[InboundDomainResponse] | (AxiosError[Any, Any])] = js.native
  def domains(body: InboundDomainsRequest): js.Promise[js.Array[InboundDomainResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * List mailbox routes
    *
    * List the mailbox routes defined for an inbound domain.
    */
  def routes(body: InboundRoutesRequest): js.Promise[js.Array[InboundRouteResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Send mime document
    *
    * Take a raw MIME document destined for a domain with inbound domains set up, and send it to the
    * inbound hook exactly as if it had been sent over SMTP.
    */
  def sendRaw(body: InboundSendRawRequest): js.Promise[js.Array[InboundSendRawResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Update mailbox route
    *
    * Update the pattern or webhook of an existing inbound mailbox route. If null is provided for any
    * fields, the values will remain unchanged.
    */
  def updateRoute(body: InboundUpdateRouteRequest): js.Promise[InboundRouteResponse | (AxiosError[Any, Any])] = js.native
}
