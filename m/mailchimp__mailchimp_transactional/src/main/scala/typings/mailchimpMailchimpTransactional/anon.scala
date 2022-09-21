package typings.mailchimpMailchimpTransactional

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @mailchimp/mailchimp_transactional.@mailchimp/mailchimp_transactional.MessageMetadata & {  user_id :number} */
  trait MessageMetadatauseridnumb
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var user_id: Double
  }
  object MessageMetadatauseridnumb {
    
    inline def apply(user_id: Double): MessageMetadatauseridnumb = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageMetadatauseridnumb]
    }
    
    extension [Self <: MessageMetadatauseridnumb](x: Self) {
      
      inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @mailchimp/mailchimp_transactional.@mailchimp/mailchimp_transactional.MessageMetadata & {  website :string} */
  trait MessageMetadatawebsitestr
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var website: String
  }
  object MessageMetadatawebsitestr {
    
    inline def apply(website: String): MessageMetadatawebsitestr = {
      val __obj = js.Dynamic.literal(website = website.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageMetadatawebsitestr]
    }
    
    extension [Self <: MessageMetadatawebsitestr](x: Self) {
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    }
  }
}
