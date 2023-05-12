package typings.mailchimpMailchimpMarketing

import typings.mailchimpMailchimpMarketing.mod.TimeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Avgsubrate extends StObject {
    
    var avg_sub_rate: Double
    
    var avg_unsub_rate: Double
    
    var campaign_count: Double
    
    var campaign_last_sent: TimeString
    
    var cleaned_count: Double
    
    var cleaned_count_since_send: Double
    
    var click_rate: Double
    
    var last_sub_date: TimeString
    
    var last_unsub_date: TimeString
    
    var member_count: Double
    
    var member_count_since_send: Double
    
    var merge_field_count: Double
    
    var open_rate: Double
    
    var target_sub_rate: Double
    
    var total_contacts: Double
    
    var unsubscribe_count: Double
    
    var unsubscribe_count_since_send: Double
  }
  object Avgsubrate {
    
    inline def apply(
      avg_sub_rate: Double,
      avg_unsub_rate: Double,
      campaign_count: Double,
      campaign_last_sent: TimeString,
      cleaned_count: Double,
      cleaned_count_since_send: Double,
      click_rate: Double,
      last_sub_date: TimeString,
      last_unsub_date: TimeString,
      member_count: Double,
      member_count_since_send: Double,
      merge_field_count: Double,
      open_rate: Double,
      target_sub_rate: Double,
      total_contacts: Double,
      unsubscribe_count: Double,
      unsubscribe_count_since_send: Double
    ): Avgsubrate = {
      val __obj = js.Dynamic.literal(avg_sub_rate = avg_sub_rate.asInstanceOf[js.Any], avg_unsub_rate = avg_unsub_rate.asInstanceOf[js.Any], campaign_count = campaign_count.asInstanceOf[js.Any], campaign_last_sent = campaign_last_sent.asInstanceOf[js.Any], cleaned_count = cleaned_count.asInstanceOf[js.Any], cleaned_count_since_send = cleaned_count_since_send.asInstanceOf[js.Any], click_rate = click_rate.asInstanceOf[js.Any], last_sub_date = last_sub_date.asInstanceOf[js.Any], last_unsub_date = last_unsub_date.asInstanceOf[js.Any], member_count = member_count.asInstanceOf[js.Any], member_count_since_send = member_count_since_send.asInstanceOf[js.Any], merge_field_count = merge_field_count.asInstanceOf[js.Any], open_rate = open_rate.asInstanceOf[js.Any], target_sub_rate = target_sub_rate.asInstanceOf[js.Any], total_contacts = total_contacts.asInstanceOf[js.Any], unsubscribe_count = unsubscribe_count.asInstanceOf[js.Any], unsubscribe_count_since_send = unsubscribe_count_since_send.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avgsubrate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Avgsubrate] (val x: Self) extends AnyVal {
      
      inline def setAvg_sub_rate(value: Double): Self = StObject.set(x, "avg_sub_rate", value.asInstanceOf[js.Any])
      
      inline def setAvg_unsub_rate(value: Double): Self = StObject.set(x, "avg_unsub_rate", value.asInstanceOf[js.Any])
      
      inline def setCampaign_count(value: Double): Self = StObject.set(x, "campaign_count", value.asInstanceOf[js.Any])
      
      inline def setCampaign_last_sent(value: TimeString): Self = StObject.set(x, "campaign_last_sent", value.asInstanceOf[js.Any])
      
      inline def setCleaned_count(value: Double): Self = StObject.set(x, "cleaned_count", value.asInstanceOf[js.Any])
      
      inline def setCleaned_count_since_send(value: Double): Self = StObject.set(x, "cleaned_count_since_send", value.asInstanceOf[js.Any])
      
      inline def setClick_rate(value: Double): Self = StObject.set(x, "click_rate", value.asInstanceOf[js.Any])
      
      inline def setLast_sub_date(value: TimeString): Self = StObject.set(x, "last_sub_date", value.asInstanceOf[js.Any])
      
      inline def setLast_unsub_date(value: TimeString): Self = StObject.set(x, "last_unsub_date", value.asInstanceOf[js.Any])
      
      inline def setMember_count(value: Double): Self = StObject.set(x, "member_count", value.asInstanceOf[js.Any])
      
      inline def setMember_count_since_send(value: Double): Self = StObject.set(x, "member_count_since_send", value.asInstanceOf[js.Any])
      
      inline def setMerge_field_count(value: Double): Self = StObject.set(x, "merge_field_count", value.asInstanceOf[js.Any])
      
      inline def setOpen_rate(value: Double): Self = StObject.set(x, "open_rate", value.asInstanceOf[js.Any])
      
      inline def setTarget_sub_rate(value: Double): Self = StObject.set(x, "target_sub_rate", value.asInstanceOf[js.Any])
      
      inline def setTotal_contacts(value: Double): Self = StObject.set(x, "total_contacts", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribe_count(value: Double): Self = StObject.set(x, "unsubscribe_count", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribe_count_since_send(value: Double): Self = StObject.set(x, "unsubscribe_count_since_send", value.asInstanceOf[js.Any])
    }
  }
  
  trait Choices extends StObject {
    
    var choices: js.Array[String]
    
    var date_format: String
    
    var default_country: Double
    
    var phone_format: String
    
    var size: Double
  }
  object Choices {
    
    inline def apply(
      choices: js.Array[String],
      date_format: String,
      default_country: Double,
      phone_format: String,
      size: Double
    ): Choices = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], date_format = date_format.asInstanceOf[js.Any], default_country = default_country.asInstanceOf[js.Any], phone_format = phone_format.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choices]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Choices] (val x: Self) extends AnyVal {
      
      inline def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setDate_format(value: String): Self = StObject.set(x, "date_format", value.asInstanceOf[js.Any])
      
      inline def setDefault_country(value: Double): Self = StObject.set(x, "default_country", value.asInstanceOf[js.Any])
      
      inline def setPhone_format(value: String): Self = StObject.set(x, "phone_format", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Currenttotalinstances extends StObject {
    
    var current_total_instances: Double
    
    var max_instances: Double
    
    var may_create: Boolean
  }
  object Currenttotalinstances {
    
    inline def apply(current_total_instances: Double, max_instances: Double, may_create: Boolean): Currenttotalinstances = {
      val __obj = js.Dynamic.literal(current_total_instances = current_total_instances.asInstanceOf[js.Any], max_instances = max_instances.asInstanceOf[js.Any], may_create = may_create.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currenttotalinstances]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Currenttotalinstances] (val x: Self) extends AnyVal {
      
      inline def setCurrent_total_instances(value: Double): Self = StObject.set(x, "current_total_instances", value.asInstanceOf[js.Any])
      
      inline def setMax_instances(value: Double): Self = StObject.set(x, "max_instances", value.asInstanceOf[js.Any])
      
      inline def setMay_create(value: Boolean): Self = StObject.set(x, "may_create", value.asInstanceOf[js.Any])
    }
  }
  
  trait Emailaddress extends StObject {
    
    var email_address: String
    
    var error: String
    
    var error_code: String
    
    var field: String
    
    var field_message: String
  }
  object Emailaddress {
    
    inline def apply(email_address: String, error: String, error_code: String, field: String, field_message: String): Emailaddress = {
      val __obj = js.Dynamic.literal(email_address = email_address.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], error_code = error_code.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], field_message = field_message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Emailaddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Emailaddress] (val x: Self) extends AnyVal {
      
      inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setField_message(value: String): Self = StObject.set(x, "field_message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
    
    var marketing_permission_id: String
  }
  object Enabled {
    
    inline def apply(enabled: Boolean, marketing_permission_id: String): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], marketing_permission_id = marketing_permission_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMarketing_permission_id(value: String): Self = StObject.set(x, "marketing_permission_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fromemail extends StObject {
    
    var from_email: String
    
    var from_name: String
    
    var language: String
    
    var subject: String
  }
  object Fromemail {
    
    inline def apply(from_email: String, from_name: String, language: String, subject: String): Fromemail = {
      val __obj = js.Dynamic.literal(from_email = from_email.asInstanceOf[js.Any], from_name = from_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fromemail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fromemail] (val x: Self) extends AnyVal {
      
      inline def setFrom_email(value: String): Self = StObject.set(x, "from_email", value.asInstanceOf[js.Any])
      
      inline def setFrom_name(value: String): Self = StObject.set(x, "from_name", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var logitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double, logitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], logitude = logitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLogitude(value: Double): Self = StObject.set(x, "logitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Longtitude extends StObject {
    
    var latitude: Double
    
    var longtitude: Double
  }
  object Longtitude {
    
    inline def apply(latitude: Double, longtitude: Double): Longtitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longtitude = longtitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Longtitude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Longtitude] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongtitude(value: Double): Self = StObject.set(x, "longtitude", value.asInstanceOf[js.Any])
    }
  }
}
