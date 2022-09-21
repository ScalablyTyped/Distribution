package typings.mailgunJs.mod

import typings.mailgunJs.anon.Displayname
import typings.mailgunJs.mailgunJsStrings.false_
import typings.mailgunJs.mailgunJsStrings.true_
import typings.mailgunJs.mailgunJsStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validation {
  
  trait ParseResponse extends StObject {
    
    var parsed: js.Array[String]
    
    var unparseable: js.Array[String]
  }
  object ParseResponse {
    
    inline def apply(parsed: js.Array[String], unparseable: js.Array[String]): ParseResponse = {
      val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], unparseable = unparseable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResponse]
    }
    
    extension [Self <: ParseResponse](x: Self) {
      
      inline def setParsed(value: js.Array[String]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setParsedVarargs(value: String*): Self = StObject.set(x, "parsed", js.Array(value*))
      
      inline def setUnparseable(value: js.Array[String]): Self = StObject.set(x, "unparseable", value.asInstanceOf[js.Any])
      
      inline def setUnparseableVarargs(value: String*): Self = StObject.set(x, "unparseable", js.Array(value*))
    }
  }
  
  trait ValidateResponse extends StObject {
    
    var address: String
    
    var did_you_mean: String | Null
    
    var is_disposable_address: Boolean
    
    var is_role_address: Boolean
    
    var is_valid: Boolean
    
    var mailbox_verification: true_ | false_ | unknown | Null
    
    var parts: Displayname
  }
  object ValidateResponse {
    
    inline def apply(
      address: String,
      is_disposable_address: Boolean,
      is_role_address: Boolean,
      is_valid: Boolean,
      parts: Displayname
    ): ValidateResponse = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], is_disposable_address = is_disposable_address.asInstanceOf[js.Any], is_role_address = is_role_address.asInstanceOf[js.Any], is_valid = is_valid.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], did_you_mean = null, mailbox_verification = null)
      __obj.asInstanceOf[ValidateResponse]
    }
    
    extension [Self <: ValidateResponse](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setDid_you_mean(value: String): Self = StObject.set(x, "did_you_mean", value.asInstanceOf[js.Any])
      
      inline def setDid_you_meanNull: Self = StObject.set(x, "did_you_mean", null)
      
      inline def setIs_disposable_address(value: Boolean): Self = StObject.set(x, "is_disposable_address", value.asInstanceOf[js.Any])
      
      inline def setIs_role_address(value: Boolean): Self = StObject.set(x, "is_role_address", value.asInstanceOf[js.Any])
      
      inline def setIs_valid(value: Boolean): Self = StObject.set(x, "is_valid", value.asInstanceOf[js.Any])
      
      inline def setMailbox_verification(value: true_ | false_ | unknown): Self = StObject.set(x, "mailbox_verification", value.asInstanceOf[js.Any])
      
      inline def setMailbox_verificationNull: Self = StObject.set(x, "mailbox_verification", null)
      
      inline def setParts(value: Displayname): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    }
  }
  
  type ValidationCallback = js.Function2[/* error */ Error, /* body */ ValidateResponse, Unit]
  
  trait ValidationOptionsPrivate extends StObject {
    
    var mailbox_verification: js.UndefOr[Boolean] = js.undefined
  }
  object ValidationOptionsPrivate {
    
    inline def apply(): ValidationOptionsPrivate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptionsPrivate]
    }
    
    extension [Self <: ValidationOptionsPrivate](x: Self) {
      
      inline def setMailbox_verification(value: Boolean): Self = StObject.set(x, "mailbox_verification", value.asInstanceOf[js.Any])
      
      inline def setMailbox_verificationUndefined: Self = StObject.set(x, "mailbox_verification", js.undefined)
    }
  }
  
  trait ValidationOptionsPublic extends StObject {
    
    var api_key: js.UndefOr[String] = js.undefined
    
    var mailbox_verification: js.UndefOr[Boolean] = js.undefined
  }
  object ValidationOptionsPublic {
    
    inline def apply(): ValidationOptionsPublic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptionsPublic]
    }
    
    extension [Self <: ValidationOptionsPublic](x: Self) {
      
      inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      inline def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
      
      inline def setMailbox_verification(value: Boolean): Self = StObject.set(x, "mailbox_verification", value.asInstanceOf[js.Any])
      
      inline def setMailbox_verificationUndefined: Self = StObject.set(x, "mailbox_verification", js.undefined)
    }
  }
}
