package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.anon.Avgsubrate
import typings.mailchimpMailchimpMarketing.anon.Fromemail
import typings.mailchimpMailchimpMarketing.mod.Link
import typings.mailchimpMailchimpMarketing.mod.TimeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List extends StObject {
  
  var _links: js.Array[Link]
  
  var beamer_address: String
  
  var campaign_defaults: Fromemail
  
  var contact: Contact
  
  var date_created: TimeString
  
  var double_optin: Boolean
  
  var email_type_option: Boolean
  
  var has_welcome: Boolean
  
  var id: String
  
  var list_rating: Double
  
  var marketing_permissions: Boolean
  
  var modules: js.Array[String]
  
  var name: String
  
  var notify_on_subscribe: Boolean
  
  var notify_on_unsubscribe: Boolean
  
  var permission_reminder: String
  
  var stats: Avgsubrate
  
  var subscribe_url_long: String
  
  var subscribe_url_short: String
  
  var use_archive_bar: Boolean
  
  var visibility: ListVisibility
  
  var web_id: Double
}
object List {
  
  inline def apply(
    _links: js.Array[Link],
    beamer_address: String,
    campaign_defaults: Fromemail,
    contact: Contact,
    date_created: TimeString,
    double_optin: Boolean,
    email_type_option: Boolean,
    has_welcome: Boolean,
    id: String,
    list_rating: Double,
    marketing_permissions: Boolean,
    modules: js.Array[String],
    name: String,
    notify_on_subscribe: Boolean,
    notify_on_unsubscribe: Boolean,
    permission_reminder: String,
    stats: Avgsubrate,
    subscribe_url_long: String,
    subscribe_url_short: String,
    use_archive_bar: Boolean,
    visibility: ListVisibility,
    web_id: Double
  ): typings.mailchimpMailchimpMarketing.mod.lists.List = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], beamer_address = beamer_address.asInstanceOf[js.Any], campaign_defaults = campaign_defaults.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], double_optin = double_optin.asInstanceOf[js.Any], email_type_option = email_type_option.asInstanceOf[js.Any], has_welcome = has_welcome.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], list_rating = list_rating.asInstanceOf[js.Any], marketing_permissions = marketing_permissions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notify_on_subscribe = notify_on_subscribe.asInstanceOf[js.Any], notify_on_unsubscribe = notify_on_unsubscribe.asInstanceOf[js.Any], permission_reminder = permission_reminder.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], subscribe_url_long = subscribe_url_long.asInstanceOf[js.Any], subscribe_url_short = subscribe_url_short.asInstanceOf[js.Any], use_archive_bar = use_archive_bar.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_id = web_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mailchimpMailchimpMarketing.mod.lists.List]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typings.mailchimpMailchimpMarketing.mod.lists.List] (val x: Self) extends AnyVal {
    
    inline def setBeamer_address(value: String): Self = StObject.set(x, "beamer_address", value.asInstanceOf[js.Any])
    
    inline def setCampaign_defaults(value: Fromemail): Self = StObject.set(x, "campaign_defaults", value.asInstanceOf[js.Any])
    
    inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setDate_created(value: TimeString): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
    
    inline def setDouble_optin(value: Boolean): Self = StObject.set(x, "double_optin", value.asInstanceOf[js.Any])
    
    inline def setEmail_type_option(value: Boolean): Self = StObject.set(x, "email_type_option", value.asInstanceOf[js.Any])
    
    inline def setHas_welcome(value: Boolean): Self = StObject.set(x, "has_welcome", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setList_rating(value: Double): Self = StObject.set(x, "list_rating", value.asInstanceOf[js.Any])
    
    inline def setMarketing_permissions(value: Boolean): Self = StObject.set(x, "marketing_permissions", value.asInstanceOf[js.Any])
    
    inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotify_on_subscribe(value: Boolean): Self = StObject.set(x, "notify_on_subscribe", value.asInstanceOf[js.Any])
    
    inline def setNotify_on_unsubscribe(value: Boolean): Self = StObject.set(x, "notify_on_unsubscribe", value.asInstanceOf[js.Any])
    
    inline def setPermission_reminder(value: String): Self = StObject.set(x, "permission_reminder", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Avgsubrate): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setSubscribe_url_long(value: String): Self = StObject.set(x, "subscribe_url_long", value.asInstanceOf[js.Any])
    
    inline def setSubscribe_url_short(value: String): Self = StObject.set(x, "subscribe_url_short", value.asInstanceOf[js.Any])
    
    inline def setUse_archive_bar(value: Boolean): Self = StObject.set(x, "use_archive_bar", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: ListVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setWeb_id(value: Double): Self = StObject.set(x, "web_id", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Array[Link]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    
    inline def set_linksVarargs(value: Link*): Self = StObject.set(x, "_links", js.Array(value*))
  }
}
