package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesApi extends StObject {
  
  /**
    * Cancel scheduled email
    *
    * Cancels a scheduled email.
    */
  def cancelScheduled(body: MessagesCancelScheduledRequest): js.Promise[js.Array[MessagesScheduledMessageResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get message content
    *
    * Get the full content of a recently sent message.
    */
  def content(body: MessagesMessageByIdRequest): js.Promise[MessagesContentResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get message info
    *
    * Get the information for a single recently sent message.
    */
  def info(body: MessagesMessageByIdRequest): js.Promise[MessagesInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List scheduled emails
    *
    * Queries your scheduled emails.
    */
  def listScheduled(): js.Promise[js.Array[MessagesScheduledMessageResponse] | (AxiosError[Any, Any])] = js.native
  def listScheduled(body: MessagesListScheduledRequest): js.Promise[js.Array[MessagesScheduledMessageResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Parse mime document
    *
    * Parse the full MIME document for an email message, returning the content of the message
    * broken into its constituent pieces.
    */
  def parse(body: MessagesParseRequest): js.Promise[MessagesParseResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Reschedule email
    *
    * Reschedules a scheduled email.
    */
  def reschedule(body: MessagesRescheduleRequest): js.Promise[js.Array[MessagesScheduledMessageResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Search messages by date
    *
    * Search recently sent messages and optionally narrow by date range, tags, senders, and API keys.
    * If no date range is specified, results within the last 7 days are returned. This method may be
    * called up to 20 times per minute. If you need the data more often, you can use /messages/info.json
    * to get the information for a single message, or webhooks to push activity to your own application
    * for querying.
    */
  def search(): js.Promise[js.Array[MessagesSearchResponse] | (AxiosError[Any, Any])] = js.native
  def search(body: MessagesSearchRequest): js.Promise[js.Array[MessagesSearchResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Search messages by hour
    *
    * Search the content of recently sent messages and return the aggregated hourly stats for matching messages.
    */
  def searchTimeSeries(): js.Promise[js.Array[SearchTimeSeriesResponse] | (AxiosError[Any, Any])] = js.native
  def searchTimeSeries(body: MessagesSearchTimeSeriesRequest): js.Promise[js.Array[SearchTimeSeriesResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Send new message
    *
    * Send a new transactional message through the Transactional API.
    */
  def send(body: MessagesSendRequest): js.Promise[js.Array[MessagesSendResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Send mime document
    *
    * Take a raw MIME document for a message, and send it exactly as if it were sent through the
    * Transactional API's SMTP servers.
    */
  def sendRaw(body: MessagesSendRawRequest): js.Promise[js.Object | (AxiosError[Any, Any])] = js.native
  
  /**
    * Send using message template
    *
    * Send a new transactional message through the Transactional API using a template.
    */
  def sendTemplate(body: MessagesSendTemplateRequest): js.Promise[js.Array[MessagesSendResponse] | (AxiosError[Any, Any])] = js.native
}
