package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Inbound")
@js.native
class Inbound protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
       * Add an inbound domain to your account
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain a domain name
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def addDomain(params: js.Any): scala.Unit = js.native
  /**
       * Add an inbound domain to your account
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain a domain name
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def addDomain(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Add an inbound domain to your account
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain a domain name
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def addDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Add a new mailbox route to an inbound domain
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @option params {String} pattern the search pattern that the mailbox name should match
       * @option params {String} url the webhook URL where the inbound messages will be published
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def addRoute(params: js.Any): scala.Unit = js.native
  /**
       * Add a new mailbox route to an inbound domain
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @option params {String} pattern the search pattern that the mailbox name should match
       * @option params {String} url the webhook URL where the inbound messages will be published
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def addRoute(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Add a new mailbox route to an inbound domain
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @option params {String} pattern the search pattern that the mailbox name should match
       * @option params {String} url the webhook URL where the inbound messages will be published
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def addRoute(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Check the MX settings for an inbound domain. The domain must have already been added with the add-domain call
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def checkDomain(params: js.Any): scala.Unit = js.native
  /**
       * Check the MX settings for an inbound domain. The domain must have already been added with the add-domain call
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def checkDomain(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Check the MX settings for an inbound domain. The domain must have already been added with the add-domain call
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def checkDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Delete an inbound domain from the account. All mail will stop routing for this domain immediately.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def deleteDomain(params: js.Any): scala.Unit = js.native
  /**
       * Delete an inbound domain from the account. All mail will stop routing for this domain immediately.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def deleteDomain(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Delete an inbound domain from the account. All mail will stop routing for this domain immediately.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain an existing inbound domain
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def deleteDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Delete an existing inbound mailbox route
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of an existing route
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def deleteRoute(params: js.Any): scala.Unit = js.native
  /**
       * Delete an existing inbound mailbox route
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of an existing route
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def deleteRoute(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Delete an existing inbound mailbox route
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of an existing route
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def deleteRoute(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * List the domains that have been configured for inbound delivery
       * @param {Object} params the hash of the parameters to pass to the request
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def domains(params: js.Any): scala.Unit = js.native
  /**
       * List the domains that have been configured for inbound delivery
       * @param {Object} params the hash of the parameters to pass to the request
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def domains(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * List the domains that have been configured for inbound delivery
       * @param {Object} params the hash of the parameters to pass to the request
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def domains(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * List the mailbox routes defined for an inbound domain
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain the domain to check
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def routes(params: js.Any): scala.Unit = js.native
  /**
       * List the mailbox routes defined for an inbound domain
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain the domain to check
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def routes(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * List the mailbox routes defined for an inbound domain
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} domain the domain to check
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def routes(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Take a raw MIME document destined for a domain with inbound domains set up, and send it to the inbound hook exactly as if it had been sent over SMTP
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} raw_message the full MIME document of an email message
       * @option params {Array|null} to optionally define the recipients to receive the message - otherwise we'll use the To, Cc, and Bcc headers provided in the document
       *      - to[] {String} the email address of the recipient
       * @option params {String} mail_from the address specified in the MAIL FROM stage of the SMTP conversation. Required for the SPF check.
       * @option params {String} helo the identification provided by the client mta in the MTA state of the SMTP conversation. Required for the SPF check.
       * @option params {String} client_address the remote MTA's ip address. Optional; required for the SPF check.
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def sendRaw(params: js.Any): scala.Unit = js.native
  /**
       * Take a raw MIME document destined for a domain with inbound domains set up, and send it to the inbound hook exactly as if it had been sent over SMTP
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} raw_message the full MIME document of an email message
       * @option params {Array|null} to optionally define the recipients to receive the message - otherwise we'll use the To, Cc, and Bcc headers provided in the document
       *      - to[] {String} the email address of the recipient
       * @option params {String} mail_from the address specified in the MAIL FROM stage of the SMTP conversation. Required for the SPF check.
       * @option params {String} helo the identification provided by the client mta in the MTA state of the SMTP conversation. Required for the SPF check.
       * @option params {String} client_address the remote MTA's ip address. Optional; required for the SPF check.
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def sendRaw(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Take a raw MIME document destined for a domain with inbound domains set up, and send it to the inbound hook exactly as if it had been sent over SMTP
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} raw_message the full MIME document of an email message
       * @option params {Array|null} to optionally define the recipients to receive the message - otherwise we'll use the To, Cc, and Bcc headers provided in the document
       *      - to[] {String} the email address of the recipient
       * @option params {String} mail_from the address specified in the MAIL FROM stage of the SMTP conversation. Required for the SPF check.
       * @option params {String} helo the identification provided by the client mta in the MTA state of the SMTP conversation. Required for the SPF check.
       * @option params {String} client_address the remote MTA's ip address. Optional; required for the SPF check.
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def sendRaw(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Update the pattern or webhook of an existing inbound mailbox route. If null is provided for any fields, the values will remain unchanged.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of an existing mailbox route
       * @option params {String} pattern the search pattern that the mailbox name should match
       * @option params {String} url the webhook URL where the inbound messages will be published
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def updateRoute(params: js.Any): scala.Unit = js.native
  /**
       * Update the pattern or webhook of an existing inbound mailbox route. If null is provided for any fields, the values will remain unchanged.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of an existing mailbox route
       * @option params {String} pattern the search pattern that the mailbox name should match
       * @option params {String} url the webhook URL where the inbound messages will be published
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def updateRoute(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Update the pattern or webhook of an existing inbound mailbox route. If null is provided for any fields, the values will remain unchanged.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of an existing mailbox route
       * @option params {String} pattern the search pattern that the mailbox name should match
       * @option params {String} url the webhook URL where the inbound messages will be published
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def updateRoute(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

