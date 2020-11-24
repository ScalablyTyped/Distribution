package typings.mandrillApi

import typings.mandrillApi.anon.Id
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mandrill-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Exports protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Begins an export of your activity history. The activity will be exported to a zip archive
      * containing a single file named activity.csv in the same format as you would be able to export
      * from your account's activity view. It includes the following fields: Date, Email Address,
      * Sender, Subject, Status, Tags, Opens, Clicks, Bounce Detail. If you have configured any custom
      * metadata fields, they will be included in the exported data.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} notify_email an optional email address to notify when the export job has finished
      * @option params {String} date_from start date as a UTC string in YYYY-MM-DD HH:MM:SS format
      * @option params {String} date_to end date as a UTC string in YYYY-MM-DD HH:MM:SS format
      * @option params {Array} tags an array of tag names to narrow the export to; will match messages that contain ANY of the tags
      *      - tags[] {String} a tag name
      * @option params {Array} senders an array of senders to narrow the export to
      *      - senders[] {String} a sender address
      * @option params {Array} states an array of states to narrow the export to; messages with ANY of the states will be included
      *      - states[] {String} a message state
      * @option params {Array} api_keys an array of api keys to narrow the export to; messsagse sent with ANY of the keys will be included
      *      - api_keys[] {String} an API key associated with your account
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def activity(params: js.Any): Unit = js.native
    def activity(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def activity(params: js.Any, onsuccess: ICallback): Unit = js.native
    def activity(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Returns information about an export job. If the export job's state is 'complete',
      * the returned data will include a URL you can use to fetch the results. Every export
      * job produces a zip archive, but the format of the archive is distinct for each job
      * type. The api calls that initiate exports include more details about the output format
      * for that job type.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id an export job identifier
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Returns a list of your exports.
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Begins an export of your rejection blacklist. The blacklist will be exported to a zip archive
      * containing a single file named rejects.csv that includes the following fields: email,
      * reason, detail, created_at, expires_at, last_event_at, expires_at.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} notify_email an optional email address to notify when the export job has finished.
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def rejects(params: js.Any): Unit = js.native
    def rejects(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def rejects(params: js.Any, onsuccess: ICallback): Unit = js.native
    def rejects(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Begins an export of your rejection whitelist. The whitelist will be exported to a zip archive
      * containing a single file named whitelist.csv that includes the following fields:
      * email, detail, created_at.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} notify_email an optional email address to notify when the export job has finished.
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def whitelist(params: js.Any): Unit = js.native
    def whitelist(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def whitelist(params: js.Any, onsuccess: ICallback): Unit = js.native
    def whitelist(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
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
    def addDomain(params: js.Any): Unit = js.native
    def addDomain(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def addDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
    def addDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Add a new mailbox route to an inbound domain
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain an existing inbound domain
      * @option params {String} pattern the search pattern that the mailbox name should match
      * @option params {String} url the webhook URL where the inbound messages will be published
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def addRoute(params: js.Any): Unit = js.native
    def addRoute(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def addRoute(params: js.Any, onsuccess: ICallback): Unit = js.native
    def addRoute(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Check the MX settings for an inbound domain. The domain must have already been added with the add-domain call
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain an existing inbound domain
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def checkDomain(params: js.Any): Unit = js.native
    def checkDomain(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def checkDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
    def checkDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Delete an inbound domain from the account. All mail will stop routing for this domain immediately.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain an existing inbound domain
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def deleteDomain(params: js.Any): Unit = js.native
    def deleteDomain(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def deleteDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
    def deleteDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Delete an existing inbound mailbox route
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique identifier of an existing route
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def deleteRoute(params: js.Any): Unit = js.native
    def deleteRoute(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def deleteRoute(params: js.Any, onsuccess: ICallback): Unit = js.native
    def deleteRoute(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * List the domains that have been configured for inbound delivery
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def domains(params: js.Any): Unit = js.native
    def domains(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def domains(params: js.Any, onsuccess: ICallback): Unit = js.native
    def domains(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * List the mailbox routes defined for an inbound domain
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain the domain to check
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def routes(params: js.Any): Unit = js.native
    def routes(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def routes(params: js.Any, onsuccess: ICallback): Unit = js.native
    def routes(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
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
    def sendRaw(params: js.Any): Unit = js.native
    def sendRaw(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def sendRaw(params: js.Any, onsuccess: ICallback): Unit = js.native
    def sendRaw(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Update the pattern or webhook of an existing inbound mailbox route. If null is provided for any fields, the values will remain unchanged.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique identifier of an existing mailbox route
      * @option params {String} pattern the search pattern that the mailbox name should match
      * @option params {String} url the webhook URL where the inbound messages will be published
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def updateRoute(params: js.Any): Unit = js.native
    def updateRoute(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def updateRoute(params: js.Any, onsuccess: ICallback): Unit = js.native
    def updateRoute(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Internal protected () extends js.Object {
    def this(master: Mandrill) = this()
  }
  
  @js.native
  class Ips protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Cancels the warmup process for a dedicated IP.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} ip a dedicated ip address
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def cancelWarmup(params: js.Any): Unit = js.native
    def cancelWarmup(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def cancelWarmup(params: js.Any, onsuccess: ICallback): Unit = js.native
    def cancelWarmup(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Tests whether a domain name is valid for use as the custom reverse
      * DNS for a dedicated IP.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} ip a dedicated ip address
      * @option params {String} domain the domain name to test
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def checkCustomDns(params: js.Any): Unit = js.native
    def checkCustomDns(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def checkCustomDns(params: js.Any, onsuccess: ICallback): Unit = js.native
    def checkCustomDns(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Creates a pool and returns it. If a pool already exists with this
      * name, no action will be performed.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} pool the name of a pool to create
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def createPool(params: js.Any): Unit = js.native
    def createPool(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def createPool(params: js.Any, onsuccess: ICallback): Unit = js.native
    def createPool(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Deletes a dedicated IP. This is permanent and cannot be undone.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} ip the dedicated ip to remove from your account
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def delete(params: js.Any): Unit = js.native
    def delete(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Deletes a pool. A pool must be empty before you can delete it, and you cannot delete your default pool.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} pool the name of the pool to delete
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def deletePool(params: js.Any): Unit = js.native
    def deletePool(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def deletePool(params: js.Any, onsuccess: ICallback): Unit = js.native
    def deletePool(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Retrieves information about a single dedicated ip.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} ip a dedicated IP address
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Lists your dedicated IPs.
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Lists your dedicated IP pools.
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def listPools(params: js.Any): Unit = js.native
    def listPools(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def listPools(params: js.Any, onsuccess: ICallback): Unit = js.native
    def listPools(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Describes a single dedicated IP pool.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} pool a pool name
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def poolInfo(params: js.Any): Unit = js.native
    def poolInfo(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def poolInfo(params: js.Any, onsuccess: ICallback): Unit = js.native
    def poolInfo(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Requests an additional dedicated IP for your account. Accounts may
      * have one outstanding request at any time, and provisioning requests
      * are processed within 24 hours.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {Boolean} warmup whether to enable warmup mode for the ip
      * @option params {String} pool the id of the pool to add the dedicated ip to, or null to use your account's default pool
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def provision(params: js.Any): Unit = js.native
    def provision(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def provision(params: js.Any, onsuccess: ICallback): Unit = js.native
    def provision(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Configures the custom DNS name for a dedicated IP.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} ip a dedicated ip address
      * @option params {String} domain a domain name to set as the dedicated IP's custom dns name.
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def setCustomDns(params: js.Any): Unit = js.native
    def setCustomDns(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def setCustomDns(params: js.Any, onsuccess: ICallback): Unit = js.native
    def setCustomDns(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Moves a dedicated IP to a different pool.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} ip a dedicated ip address
      * @option params {String} pool the name of the new pool to add the dedicated ip to
      * @option params {Boolean} create_pool whether to create the pool if it does not exist; if false and the pool does not exist, an Unknown_Pool will be thrown.
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def setPool(params: js.Any): Unit = js.native
    def setPool(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def setPool(params: js.Any, onsuccess: ICallback): Unit = js.native
    def setPool(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Begins the warmup process for a dedicated IP. During the warmup process,
      * Mandrill will gradually increase the percentage of your mail that is sent over
      * the warming-up IP, over a period of roughly 30 days. The rest of your mail
      * will be sent over shared IPs or other dedicated IPs in the same pool.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} ip a dedicated ip address
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def startWarmup(params: js.Any): Unit = js.native
    def startWarmup(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def startWarmup(params: js.Any, onsuccess: ICallback): Unit = js.native
    def startWarmup(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Mandrill protected () extends js.Object {
    def this(apikey: String) = this()
    def this(apikey: String, debug: Boolean) = this()
    
    var apikey: String = js.native
    
    def call(uri: String, params: js.Any): Unit = js.native
    def call(uri: String, params: js.Any, onresult: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def call(uri: String, params: js.Any, onresult: ICallback): Unit = js.native
    def call(uri: String, params: js.Any, onresult: ICallback, onerror: ICallback): Unit = js.native
    
    var debug: Boolean = js.native
    
    var exports: Exports = js.native
    
    var inbound: Inbound = js.native
    
    var internal: Internal = js.native
    
    var ips: Ips = js.native
    
    var messages: Messages = js.native
    
    var metadata: Metadata = js.native
    
    def onerror(err: Error): Unit = js.native
    @JSName("onerror")
    var onerror_Original: IErrorCallback = js.native
    
    var rejects: Rejects = js.native
    
    var senders: Senders = js.native
    
    var subaccounts: Subaccounts = js.native
    
    var tags: Tags = js.native
    
    var templates: Templates = js.native
    
    var urls: Urls = js.native
    
    var users: Users = js.native
    
    var webhooks: Webhooks = js.native
    
    var whitelists: Whitelists = js.native
  }
  
  @js.native
  class Messages protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Cancels a scheduled email.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id a scheduled email id, as returned by any of the messages/send calls or messages/list-scheduled
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def cancelScheduled(params: js.Any): Unit = js.native
    def cancelScheduled(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def cancelScheduled(params: js.Any, onsuccess: ICallback): Unit = js.native
    def cancelScheduled(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Get the full content of a recently sent message
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique id of the message to get - passed as the "_id" field in webhooks, send calls, or search calls
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def content(params: js.Any): Unit = js.native
    def content(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def content(params: js.Any, onsuccess: ICallback): Unit = js.native
    def content(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Get the information for a single recently sent message
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique id of the message to get - passed as the "_id" field in webhooks, send calls, or search calls
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Queries your scheduled emails by sender or recipient, or both.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} to an optional recipient address to restrict results to
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def listScheduled(params: js.Any): Unit = js.native
    def listScheduled(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def listScheduled(params: js.Any, onsuccess: ICallback): Unit = js.native
    def listScheduled(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Parse the full MIME document for an email message, returning the content of the message broken into its constituent pieces
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} raw_message the full MIME document of an email message
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def parse(params: js.Any): Unit = js.native
    def parse(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def parse(params: js.Any, onsuccess: ICallback): Unit = js.native
    def parse(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Reschedules a scheduled email.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id a scheduled email id, as returned by any of the messages/send calls or messages/list-scheduled
      * @option params {String} send_at the new UTC timestamp when the message should sent. Mandrill can't time travel, so if you specify a time in past the message will be sent immediately
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def reschedule(params: js.Any): Unit = js.native
    def reschedule(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def reschedule(params: js.Any, onsuccess: ICallback): Unit = js.native
    def reschedule(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Search recently sent messages and optionally narrow by date range, tags, senders, and API keys. If no date range is specified, results within the last 7 days are returned. This method may be called up to 20 times per minute. If you need the data more often, you can use <a href="/api/docs/messages.html#method=info">/messages/info.json</a> to get the information for a single message, or <a href="http://help.mandrill.com/entries/21738186-Introduction-to-Webhooks">webhooks</a> to push activity to your own application for querying.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} query <a href="http://help.mandrill.com/entries/22211902">search terms</a> to find matching messages
      * @option params {String} date_from start date
      * @option params {String} date_to end date
      * @option params {Array} tags an array of tag names to narrow the search to, will return messages that contain ANY of the tags
      * @option params {Array} senders an array of sender addresses to narrow the search to, will return messages sent by ANY of the senders
      * @option params {Array} api_keys an array of API keys to narrow the search to, will return messages sent by ANY of the keys
      * @option params {Integer} limit the maximum number of results to return, defaults to 100, 1000 is the maximum
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def search(params: js.Any): Unit = js.native
    def search(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def search(params: js.Any, onsuccess: ICallback): Unit = js.native
    def search(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Search the content of recently sent messages and return the aggregated hourly stats for matching messages
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} query the search terms to find matching messages for
      * @option params {String} date_from start date
      * @option params {String} date_to end date
      * @option params {Array} tags an array of tag names to narrow the search to, will return messages that contain ANY of the tags
      * @option params {Array} senders an array of sender addresses to narrow the search to, will return messages sent by ANY of the senders
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def searchTimeSeries(params: js.Any): Unit = js.native
    def searchTimeSeries(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def searchTimeSeries(params: js.Any, onsuccess: ICallback): Unit = js.native
    def searchTimeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Send a new transactional message through Mandrill
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {Struct} message the information on the message to send
      * -html {String} the full HTML content to be sent
      * -text {String} optional full text content to be sent
      * -subject {String} the message subject
      * -from_email {String} the sender email address.
      * -from_name {String} optional from name to be used
      * -to {Array} an array of recipient information.
      *      -to[] {Object} a single recipient's information.
      *      -email {String} the email address of the recipient
      *      -name {String} the optional display name to use for the recipient
      *      -type {String} the header type to use for the recipient, defaults to "to" if not provided
      * -headers {Object} optional extra headers to add to the message (most headers are allowed)
      * -important {Boolean} whether or not this message is important, and should be delivered ahead of non-important messages
      * -track_opens {Boolean} whether or not to turn on open tracking for the message
      * -track_clicks {Boolean} whether or not to turn on click tracking for the message
      * -auto_text {Boolean} whether or not to automatically generate a text part for messages that are not given text
      * -auto_html {Boolean} whether or not to automatically generate an HTML part for messages that are not given HTML
      * -inline_css {Boolean} whether or not to automatically inline all CSS styles provided in the message HTML - only for HTML documents less than 256KB in size
      * -url_strip_qs {Boolean} whether or not to strip the query string from URLs when aggregating tracked URL data
      * -preserve_recipients {Boolean} whether or not to expose all recipients in to "To" header for each email
      * -view_content_link {Boolean} set to false to remove content logging for sensitive emails
      * -bcc_address {String} an optional address to receive an exact copy of each recipient's email
      * -tracking_domain {String} a custom domain to use for tracking opens and clicks instead of mandrillapp.com
      * -signing_domain {String} a custom domain to use for SPF/DKIM signing instead of mandrill (for "via" or "on behalf of" in email clients)
      * -return_path_domain {String} a custom domain to use for the messages's return-path
      * -merge {Boolean} whether to evaluate merge tags in the message. Will automatically be set to true if either merge_vars or global_merge_vars are provided.
      * -merge_language {String} the merge tag language to use when evaluating merge tags, either mailchimp or handlebars
      * -global_merge_vars {Array} global merge variables to use for all recipients. You can override these per recipient.
      *      -global_merge_vars[] {Object} a single global merge variable
      *      -name {String} the global merge variable's name. Merge variable names are case-insensitive and may not start with _
      *      -content {Mixed} the global merge variable's content
      * -merge_vars {Array} per-recipient merge variables, which override global merge variables with the same name.
      *   -merge_vars[] {Object} per-recipient merge variables
      *      -rcpt {String} the email address of the recipient that the merge variables should apply to
      *      -vars {Array} the recipient's merge variables
      *          -vars[] {Object} a single merge variable
      *          -name {String} the merge variable's name. Merge variable names are case-insensitive and may not start with _
      *          -content {Mixed} the merge variable's content
      * -tags {Array} an array of string to tag the message with.  Stats are accumulated using tags, though we only store the first 100 we see, so this should not be unique or change frequently.  Tags should be 50 characters or less.  Any tags starting with an underscore are reserved for internal use and will cause errors.
      *      -tags[] {String} a single tag - must not start with an underscore
      * -subaccount {String} the unique id of a subaccount for this message - must already exist or will fail with an error
      * -google_analytics_domains {Array} an array of strings indicating for which any matching URLs will automatically have Google Analytics parameters appended to their query string automatically.
      * -google_analytics_campaign {Array|string} optional string indicating the value to set for the utm_campaign tracking parameter. If this isn't provided the email's from address will be used instead.
      * -metadata {Array} metadata an associative array of user metadata. Mandrill will store this metadata and make it available for retrieval. In addition, you can select up to 10 metadata fields to index and make searchable using the Mandrill search api.
      * -recipient_metadata {Array} Per-recipient metadata that will override the global values specified in the metadata parameter.
      *      -recipient_metadata[] {Object} metadata for a single recipient
      *          -rcpt {String} the email address of the recipient that the metadata is associated with
      *          -values {Array} an associated array containing the recipient's unique metadata. If a key exists in both the per-recipient metadata and the global metadata, the per-recipient metadata will be used.
      * -attachments {Array} an array of supported attachments to add to the message
      *      -attachments[] {Object} a single supported attachment
      *          -type {String} the MIME type of the attachment
      *          -name {String} the file name of the attachment
      *          -content {String} the content of the attachment as a base64-encoded string
      * -images {Array} an array of embedded images to add to the message
      *      -images[] {Object} a single embedded image
      *          -type {String} the MIME type of the image - must start with "image/"
      *          -name {String} the Content ID of the image - use <img src="cid:THIS_VALUE"> to reference the image in your HTML content
      *          -content {String} the content of the image as a base64-encoded string
      * @option params {Boolean} async enable a background sending mode that is optimized for bulk sending. In async mode, messages/send will immediately return a status of "queued" for every recipient. To handle rejections when sending in async mode, set up a webhook for the 'reject' event. Defaults to false for messages with no more than 10 recipients; messages with more than 10 recipients are always sent asynchronously, regardless of the value of async.
      * @option params {String} ip_pool the name of the dedicated ip pool that should be used to send the message. If you do not have any dedicated IPs, this parameter has no effect. If you specify a pool that does not exist, your default pool will be used instead.
      * @option params {String} send_at when this message should be sent as a UTC timestamp in YYYY-MM-DD HH:MM:SS format. If you specify a time in the past, the message will be sent immediately. An additional fee applies for scheduled email, and this feature is only available to accounts with a positive balance.
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def send(params: js.Any): Unit = js.native
    def send(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def send(params: js.Any, onsuccess: ICallback): Unit = js.native
    def send(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Take a raw MIME document for a message, and send it exactly as if it were sent through Mandrill's SMTP servers
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} raw_message the full MIME document of an email message
      * @option params {String|null} from_email optionally define the sender address - otherwise we'll use the address found in the provided headers
      * @option params {String|null} from_name optionally define the sender alias
      * @option params {Array|null} to optionally define the recipients to receive the message - otherwise we'll use the To, Cc, and Bcc headers provided in the document
      * -to[] {String} the email address of the recipient
      * @option params {Boolean} async enable a background sending mode that is optimized for bulk sending. In async mode, messages/sendRaw will immediately return a status of "queued" for every recipient. To handle rejections when sending in async mode, set up a webhook for the 'reject' event. Defaults to false for messages with no more than 10 recipients; messages with more than 10 recipients are always sent asynchronously, regardless of the value of async.
      * @option params {String} ip_pool the name of the dedicated ip pool that should be used to send the message. If you do not have any dedicated IPs, this parameter has no effect. If you specify a pool that does not exist, your default pool will be used instead.
      * @option params {String} send_at when this message should be sent as a UTC timestamp in YYYY-MM-DD HH:MM:SS format. If you specify a time in the past, the message will be sent immediately.
      * @option params {String} return_path_domain a custom domain to use for the messages's return-path
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def sendRaw(params: js.Any): Unit = js.native
    def sendRaw(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def sendRaw(params: js.Any, onsuccess: ICallback): Unit = js.native
    def sendRaw(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Send a new transactional message through Mandrill using a template
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} template_name the immutable name or slug of a template that exists in the user's account. For backwards-compatibility, the template name may also be used but the immutable slug is preferred.
      * @option params {Array} template_content an array of template content to send.  Each item in the array should be a struct with two keys - name: the name of the content block to set the content for, and content: the actual content to put into the block
      * -template_content[] {Object} the injection of a single piece of content into a single editable region
      *     -name {String} the name of the mc:edit editable region to inject into
      *     -content {String} the content to inject
      * @option params {Struct} message the other information on the message to send - same as /messages/send, but without the html content
      * -html {String} optional full HTML content to be sent if not in template
      * -text {String} optional full text content to be sent
      * -subject {String} the message subject
      * -from_email {String} the sender email address.
      * -from_name {String} optional from name to be used
      * -to {Array} an array of recipient information.
      *      -to[] {Object} a single recipient's information.
      *         -email {String} the email address of the recipient
      *         -name {String} the optional display name to use for the recipient
      *         -type {String} the header type to use for the recipient, defaults to "to" if not provided
      * -headers {Object} optional extra headers to add to the message (most headers are allowed)
      * -important {Boolean} whether or not this message is important, and should be delivered ahead of non-important messages
      * -track_opens {Boolean} whether or not to turn on open tracking for the message
      * -track_clicks {Boolean} whether or not to turn on click tracking for the message
      * -auto_text {Boolean} whether or not to automatically generate a text part for messages that are not given text
      * -auto_html {Boolean} whether or not to automatically generate an HTML part for messages that are not given HTML
      * -inline_css {Boolean} whether or not to automatically inline all CSS styles provided in the message HTML - only for HTML documents less than 256KB in size
      * -url_strip_qs {Boolean} whether or not to strip the query string from URLs when aggregating tracked URL data
      * -preserve_recipients {Boolean} whether or not to expose all recipients in to "To" header for each email
      * -view_content_link {Boolean} set to false to remove content logging for sensitive emails
      * -bcc_address {String} an optional address to receive an exact copy of each recipient's email
      * -tracking_domain {String} a custom domain to use for tracking opens and clicks instead of mandrillapp.com
      * -signing_domain {String} a custom domain to use for SPF/DKIM signing instead of mandrill (for "via" or "on behalf of" in email clients)
      * -return_path_domain {String} a custom domain to use for the messages's return-path
      * -merge {Boolean} whether to evaluate merge tags in the message. Will automatically be set to true if either merge_vars or global_merge_vars are provided.
      * -merge_language {String} the merge tag language to use when evaluating merge tags, either mailchimp or handlebars
      * -global_merge_vars {Array} global merge variables to use for all recipients. You can override these per recipient.
      *      -global_merge_vars[] {Object} a single global merge variable
      *          -name {String} the global merge variable's name. Merge variable names are case-insensitive and may not start with _
      *          -content {Mixed} the global merge variable's content
      * -merge_vars {Array} per-recipient merge variables, which override global merge variables with the same name.
      *      -merge_vars[] {Object} per-recipient merge variables
      *          -rcpt {String} the email address of the recipient that the merge variables should apply to
      *          -vars {Array} the recipient's merge variables
      *              -vars[] {Object} a single merge variable
      *                  -name {String} the merge variable's name. Merge variable names are case-insensitive and may not start with _
      *                  -content {Mixed} the merge variable's content
      * -tags {Array} an array of string to tag the message with.  Stats are accumulated using tags, though we only store the first 100 we see, so this should not be unique or change frequently.  Tags should be 50 characters or less.  Any tags starting with an underscore are reserved for internal use and will cause errors.
      *      -tags[] {String} a single tag - must not start with an underscore
      * -subaccount {String} the unique id of a subaccount for this message - must already exist or will fail with an error
      * -google_analytics_domains {Array} an array of strings indicating for which any matching URLs will automatically have Google Analytics parameters appended to their query string automatically.
      * -google_analytics_campaign {Array|string} optional string indicating the value to set for the utm_campaign tracking parameter. If this isn't provided the email's from address will be used instead.
      * -metadata {Array} metadata an associative array of user metadata. Mandrill will store this metadata and make it available for retrieval. In addition, you can select up to 10 metadata fields to index and make searchable using the Mandrill search api.
      * -recipient_metadata {Array} Per-recipient metadata that will override the global values specified in the metadata parameter.
      *       -recipient_metadata[] {Object} metadata for a single recipient
      *           -rcpt {String} the email address of the recipient that the metadata is associated with
      *           -values {Array} an associated array containing the recipient's unique metadata. If a key exists in both the per-recipient metadata and the global metadata, the per-recipient metadata will be used.
      * -attachments {Array} an array of supported attachments to add to the message
      *      -attachments[] {Object} a single supported attachment
      *          -type {String} the MIME type of the attachment
      *          -name {String} the file name of the attachment
      *          -content {String} the content of the attachment as a base64-encoded string
      * -images {Array} an array of embedded images to add to the message
      *      -images[] {Object} a single embedded image
      *          -type {String} the MIME type of the image - must start with "image/"
      *          -name {String} the Content ID of the image - use <img src="cid:THIS_VALUE"> to reference the image in your HTML content
      *          -content {String} the content of the image as a base64-encoded string
      * @option params {Boolean} async enable a background sending mode that is optimized for bulk sending. In async mode, messages/send will immediately return a status of "queued" for every recipient. To handle rejections when sending in async mode, set up a webhook for the 'reject' event. Defaults to false for messages with no more than 10 recipients; messages with more than 10 recipients are always sent asynchronously, regardless of the value of async.
      * @option params {String} ip_pool the name of the dedicated ip pool that should be used to send the message. If you do not have any dedicated IPs, this parameter has no effect. If you specify a pool that does not exist, your default pool will be used instead.
      * @option params {String} send_at when this message should be sent as a UTC timestamp in YYYY-MM-DD HH:MM:SS format. If you specify a time in the past, the message will be sent immediately. An additional fee applies for scheduled email, and this feature is only available to accounts with a positive balance.
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def sendTemplate(params: js.Any): Unit = js.native
    def sendTemplate(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def sendTemplate(params: js.Any, onsuccess: ICallback): Unit = js.native
    def sendTemplate(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Metadata protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Add a new custom metadata field to be indexed for the account.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name a unique identifier for the metadata field
      * @option params {String} view_template optional Mustache template to control how the metadata is rendered in your activity log
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def add(params: js.Any): Unit = js.native
    def add(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Delete an existing custom metadata field. Deletion isn't instataneous, and /metadata/list will continue to return the field until the asynchronous deletion process is complete.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name the unique identifier of the metadata field to update
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def delete(params: js.Any): Unit = js.native
    def delete(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Get the list of custom metadata fields indexed for the account.
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Update an existing custom metadata field.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name the unique identifier of the metadata field to update
      * @option params {String} view_template optional Mustache template to control how the metadata is rendered in your activity log
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def update(params: js.Any): Unit = js.native
    def update(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def update(params: js.Any, onsuccess: ICallback): Unit = js.native
    def update(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Rejects protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Adds an email to your email rejection blacklist. Addresses that you
      * add manually will never expire and there is no reputation penalty
      * for removing them from your blacklist. Attempting to blacklist an
      * address that has been whitelisted will have no effect.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} email an email address to block
      * @option params {String} comment an optional comment describing the rejection
      * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist entry
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def add(params: js.Any): Unit = js.native
    def add(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Deletes an email rejection. There is no limit to how many rejections
      * you can remove from your blacklist, but keep in mind that each deletion
      * has an affect on your reputation.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} email an email address
      * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist deletion
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def delete(params: js.Any): Unit = js.native
    def delete(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Retrieves your email rejection blacklist. You can provide an email
      * address to limit the results. Returns up to 1000 results. By default,
      * entries that have expired are excluded from the results; set
      * include_expired to true to include them.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} email an optional email address to search by
      * @option params {Boolean} include_expired whether to include rejections that have already expired.
      * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Senders protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Adds a sender domain to your account. Sender domains are added automatically as you
      * send, but you can use this call to add them ahead of time.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain a domain name
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def addDomain(params: js.Any): Unit = js.native
    def addDomain(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def addDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
    def addDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Checks the SPF and DKIM settings for a domain. If you haven't already added this domain to your
      * account, it will be added automatically.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain a domain name
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def checkDomain(params: js.Any): Unit = js.native
    def checkDomain(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def checkDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
    def checkDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Returns the sender domains that have been added to this account.
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def domains(params: js.Any): Unit = js.native
    def domains(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def domains(params: js.Any, onsuccess: ICallback): Unit = js.native
    def domains(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return more detailed information about a single sender, including aggregates of recent stats
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} address the email address of the sender
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return the senders that have tried to use this account.
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return the recent history (hourly stats for the last 30 days) for a sender
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} address the email address of the sender
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def timeSeries(params: js.Any): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: ICallback): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Sends a verification email in order to verify ownership of a domain.
      * Domain verification is an optional step to confirm ownership of a domain. Once a
      * domain has been verified in a Mandrill account, other accounts may not have their
      * messages signed by that domain unless they also verify the domain. This prevents
      * other Mandrill accounts from sending mail signed by your domain.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain a domain name at which you can receive email
      * @option params {String} mailbox a mailbox at the domain where the verification email should be sent
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def verifyDomain(params: js.Any): Unit = js.native
    def verifyDomain(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def verifyDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
    def verifyDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Subaccounts protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Add a new subaccount
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id a unique identifier for the subaccount to be used in sending calls
      * @option params {String} name an optional display name to further identify the subaccount
      * @option params {String} notes optional extra text to associate with the subaccount
      * @option params {Integer} custom_quota an optional manual hourly quota for the subaccount. If not specified, Mandrill will manage this based on reputation
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def add(params: js.Any): Unit = js.native
    def add(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Delete an existing subaccount. Any email related to the subaccount will be saved, but stats will be removed and any future sending calls to this subaccount will fail.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique identifier of the subaccount to delete
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def delete(params: js.Any): Unit = js.native
    def delete(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Given the ID of an existing subaccount, return the data about it
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique identifier of the subaccount to query
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Get the list of subaccounts defined for the account, optionally filtered by a prefix
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} q an optional prefix to filter the subaccounts' ids and names
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Pause a subaccount's sending. Any future emails delivered to this subaccount will be queued for a maximum of 3 days until the subaccount is resumed.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique identifier of the subaccount to pause
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def pause(params: js.Any): Unit = js.native
    def pause(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def pause(params: js.Any, onsuccess: ICallback): Unit = js.native
    def pause(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Resume a paused subaccount's sending
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique identifier of the subaccount to resume
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def resume(params: js.Any): Unit = js.native
    def resume(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def resume(params: js.Any, onsuccess: ICallback): Unit = js.native
    def resume(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Update an existing subaccount
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} id the unique identifier of the subaccount to update
      * @option params {String} name an optional display name to further identify the subaccount
      * @option params {String} notes optional extra text to associate with the subaccount
      * @option params {Integer} custom_quota an optional manual hourly quota for the subaccount. If not specified, Mandrill will manage this based on reputation
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def update(params: js.Any): Unit = js.native
    def update(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def update(params: js.Any, onsuccess: ICallback): Unit = js.native
    def update(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Tags protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Return the recent history (hourly stats for the last 30 days) for all tags
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def allTimeSeries(params: js.Any): Unit = js.native
    def allTimeSeries(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def allTimeSeries(params: js.Any, onsuccess: ICallback): Unit = js.native
    def allTimeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Deletes a tag permanently. Deleting a tag removes the tag from any messages
      * that have been sent, and also deletes the tag's stats. There is no way to
      * undo this operation, so use it carefully.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} tag a tag name
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def delete(params: js.Any): Unit = js.native
    def delete(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return more detailed information about a single tag, including aggregates of recent stats
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} tag an existing tag name
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return all of the user-defined tag information
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return the recent history (hourly stats for the last 30 days) for a tag
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} tag an existing tag name
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def timeSeries(params: js.Any): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: ICallback): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Templates protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Add a new template
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name the name for the new template - must be unique
      * @option params {String} from_email a default sending address for emails sent using this template
      * @option params {String} from_name a default from name to be used
      * @option params {String} subject a default subject line to be used
      * @option params {String} code the HTML code for the template with mc:edit attributes for the editable elements
      * @option params {String} text a default text part to be used when sending with this template
      * @option params {Boolean} publish set to false to add a draft template without publishing
      * @option params {Array} labels an optional array of up to 10 labels to use for filtering templates
      *    - labels[] {String} a single label
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def add(params: js.Any): Unit = js.native
    def add(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Delete a template
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name the immutable name of an existing template
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def delete(params: js.Any): Unit = js.native
    def delete(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Get the information for an existing template
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name the immutable name of an existing template
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return a list of all the templates available to this user
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} label an optional label to filter the templates
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Publish the content for the template. Any new messages sent using this template will start using the content that was previously in draft.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name the immutable name of an existing template
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def publish(params: js.Any): Unit = js.native
    def publish(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def publish(params: js.Any, onsuccess: ICallback): Unit = js.native
    def publish(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Inject content and optionally merge fields into a template, returning the HTML that results
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} template_name the immutable name of a template that exists in the user's account
      * @option params {Array} template_content an array of template content to render.  Each item in the array should be a struct with two keys - name: the name of the content block to set the content for, and content: the actual content to put into the block
      *    - template_content[] {Object} the injection of a single piece of content into a single editable region
      *        - name {String} the name of the mc:edit editable region to inject into
      *        - content {String} the content to inject
      * @option params {Array} merge_vars optional merge variables to use for injecting merge field content.  If this is not provided, no merge fields will be replaced.
      *    - merge_vars[] {Object} a single merge variable
      *        - name {String} the merge variable's name. Merge variable names are case-insensitive and may not start with _
      *        - content {String} the merge variable's content
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def render(params: js.Any): Unit = js.native
    def render(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def render(params: js.Any, onsuccess: ICallback): Unit = js.native
    def render(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return the recent history (hourly stats for the last 30 days) for a template
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name the name of an existing template
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def timeSeries(params: js.Any): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: ICallback): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Update the code for an existing template. If null is provided for any fields, the values will remain unchanged.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} name the immutable name of an existing template
      * @option params {String} from_email the new default sending address
      * @option params {String} from_name the new default from name
      * @option params {String} subject the new default subject line
      * @option params {String} code the new code for the template
      * @option params {String} text the new default text part to be used
      * @option params {Boolean} publish set to false to update the draft version of the template without publishing
      * @option params {Array} labels an optional array of up to 10 labels to use for filtering templates
      *    - labels[] {String} a single label
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def update(params: js.Any): Unit = js.native
    def update(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def update(params: js.Any, onsuccess: ICallback): Unit = js.native
    def update(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Urls protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Add a tracking domain to your account
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain a domain name
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def addTrackingDomain(params: js.Any): Unit = js.native
    def addTrackingDomain(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def addTrackingDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
    def addTrackingDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Checks the CNAME settings for a tracking domain. The domain must have been added already with the add-tracking-domain call
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} domain an existing tracking domain name
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def checkTrackingDomain(params: js.Any): Unit = js.native
    def checkTrackingDomain(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def checkTrackingDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
    def checkTrackingDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Get the 100 most clicked URLs
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return the 100 most clicked URLs that match the search query given
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} q a search query
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def search(params: js.Any): Unit = js.native
    def search(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def search(params: js.Any, onsuccess: ICallback): Unit = js.native
    def search(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return the recent history (hourly stats for the last 30 days) for a url
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} url an existing URL
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def timeSeries(params: js.Any): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: ICallback): Unit = js.native
    def timeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Get the list of tracking domains set up for this account
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def trackingDomains(params: js.Any): Unit = js.native
    def trackingDomains(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def trackingDomains(params: js.Any, onsuccess: ICallback): Unit = js.native
    def trackingDomains(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Users protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Return the information about the API-connected user
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Validate an API key and respond to a ping
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def ping(params: js.Any): Unit = js.native
    def ping(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def ping(params: js.Any, onsuccess: ICallback): Unit = js.native
    def ping(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Validate an API key and respond to a ping (anal JSON parser version)
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def ping2(params: js.Any): Unit = js.native
    def ping2(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def ping2(params: js.Any, onsuccess: ICallback): Unit = js.native
    def ping2(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Return the senders that have tried to use this account, both verified and unverified
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def senders(params: js.Any): Unit = js.native
    def senders(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def senders(params: js.Any, onsuccess: ICallback): Unit = js.native
    def senders(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Webhooks protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Add a new webhook
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} url the URL to POST batches of events
      * @option params {String} description an optional description of the webhook
      * @option params {Array} events an optional list of events that will be posted to the webhook
      *    - events[] {String} the individual event to listen for
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def add(params: js.Any): Unit = js.native
    def add(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Delete an existing webhook
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {Integer} id the unique identifier of a webhook belonging to this account
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def delete(params: Id): Unit = js.native
    def delete(params: Id, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def delete(params: Id, onsuccess: ICallback): Unit = js.native
    def delete(params: Id, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Given the ID of an existing webhook, return the data about it
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {Integer} id the unique identifier of a webhook belonging to this account
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def info(params: js.Any): Unit = js.native
    def info(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback): Unit = js.native
    def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Get the list of all webhooks defined on the account
      * @param {Object} params the hash of the parameters to pass to the request
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Update an existing webhook
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {Integer} id the unique identifier of a webhook belonging to this account
      * @option params {String} url the URL to POST batches of events
      * @option params {String} description an optional description of the webhook
      * @option params {Array} events an optional list of events that will be posted to the webhook
      *    - events[] {String} the individual event to listen for
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def update(params: js.Any): Unit = js.native
    def update(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def update(params: js.Any, onsuccess: ICallback): Unit = js.native
    def update(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  @js.native
  class Whitelists protected () extends js.Object {
    def this(master: Mandrill) = this()
    
    /**
      * Adds an email to your email rejection whitelist. If the address is
      * currently on your blacklist, that blacklist entry will be removed
      * automatically.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} email an email address to add to the whitelist
      * @option params {String} comment an optional description of why the email was whitelisted
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def add(params: js.Any): Unit = js.native
    def add(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback): Unit = js.native
    def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Removes an email address from the whitelist.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} email the email address to remove from the whitelist
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def delete(params: js.Any): Unit = js.native
    def delete(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback): Unit = js.native
    def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
    
    /**
      * Retrieves your email rejection whitelist. You can provide an email
      * address or search prefix to limit the results. Returns up to 1000 results.
      * @param {Object} params the hash of the parameters to pass to the request
      * @option params {String} email an optional email address or prefix to search by
      * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
      * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
      */
    def list(params: js.Any): Unit = js.native
    def list(params: js.Any, onsuccess: js.UndefOr[scala.Nothing], onerror: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback): Unit = js.native
    def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  }
  
  type ICallback = js.Function1[/* json */ js.Object, Unit]
  
  type IErrorCallback = js.Function1[/* err */ Error, Unit]
}
