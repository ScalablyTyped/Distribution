package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiClient extends StObject {
  
  var allowlists: AllowlistsApi
  
  var exports: ExportsApi
  
  var inbound: InboundApi
  
  var ips: IpsApi
  
  var messages: MessagesApi
  
  var metadata: MetadataApi
  
  var rejects: RejectsApi
  
  var senders: SendersApi
  
  /**
    * Updates the default HTTP request response format.
    */
  def setDefaultOutputFormat(format: OutputFormat): Unit
  
  def setDefaultTimeoutMs(timeoutMs: Double): Unit
  
  var subaccounts: SubaccountsApi
  
  var tags: TagsApi
  
  var templates: TemplatesApi
  
  var urls: UrlsApi
  
  var users: UsersApi
  
  var webhooks: WebhooksApi
  
  var whitelists: WhitelistsApi
}
object ApiClient {
  
  inline def apply(
    allowlists: AllowlistsApi,
    exports: ExportsApi,
    inbound: InboundApi,
    ips: IpsApi,
    messages: MessagesApi,
    metadata: MetadataApi,
    rejects: RejectsApi,
    senders: SendersApi,
    setDefaultOutputFormat: OutputFormat => Unit,
    setDefaultTimeoutMs: Double => Unit,
    subaccounts: SubaccountsApi,
    tags: TagsApi,
    templates: TemplatesApi,
    urls: UrlsApi,
    users: UsersApi,
    webhooks: WebhooksApi,
    whitelists: WhitelistsApi
  ): ApiClient = {
    val __obj = js.Dynamic.literal(allowlists = allowlists.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], inbound = inbound.asInstanceOf[js.Any], ips = ips.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], senders = senders.asInstanceOf[js.Any], setDefaultOutputFormat = js.Any.fromFunction1(setDefaultOutputFormat), setDefaultTimeoutMs = js.Any.fromFunction1(setDefaultTimeoutMs), subaccounts = subaccounts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any], whitelists = whitelists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiClient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiClient] (val x: Self) extends AnyVal {
    
    inline def setAllowlists(value: AllowlistsApi): Self = StObject.set(x, "allowlists", value.asInstanceOf[js.Any])
    
    inline def setExports(value: ExportsApi): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setInbound(value: InboundApi): Self = StObject.set(x, "inbound", value.asInstanceOf[js.Any])
    
    inline def setIps(value: IpsApi): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: MessagesApi): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: MetadataApi): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRejects(value: RejectsApi): Self = StObject.set(x, "rejects", value.asInstanceOf[js.Any])
    
    inline def setSenders(value: SendersApi): Self = StObject.set(x, "senders", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultOutputFormat(value: OutputFormat => Unit): Self = StObject.set(x, "setDefaultOutputFormat", js.Any.fromFunction1(value))
    
    inline def setSetDefaultTimeoutMs(value: Double => Unit): Self = StObject.set(x, "setDefaultTimeoutMs", js.Any.fromFunction1(value))
    
    inline def setSubaccounts(value: SubaccountsApi): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsApi): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTemplates(value: TemplatesApi): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: UrlsApi): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: UsersApi): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setWebhooks(value: WebhooksApi): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    
    inline def setWhitelists(value: WhitelistsApi): Self = StObject.set(x, "whitelists", value.asInstanceOf[js.Any])
  }
}
