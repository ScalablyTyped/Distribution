package typings.mailgunJs.mod

import typings.mailgunJs.anon.Displayname
import typings.mailgunJs.mailgunJsStrings.false_
import typings.mailgunJs.mailgunJsStrings.true_
import typings.mailgunJs.mailgunJsStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validation {
  
  @js.native
  trait ParseResponse extends StObject {
    
    var parsed: js.Array[String] = js.native
    
    var unparseable: js.Array[String] = js.native
  }
  object ParseResponse {
    
    @scala.inline
    def apply(parsed: js.Array[String], unparseable: js.Array[String]): ParseResponse = {
      val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], unparseable = unparseable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResponse]
    }
    
    @scala.inline
    implicit class ParseResponseMutableBuilder[Self <: ParseResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsed(value: js.Array[String]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedVarargs(value: String*): Self = StObject.set(x, "parsed", js.Array(value :_*))
      
      @scala.inline
      def setUnparseable(value: js.Array[String]): Self = StObject.set(x, "unparseable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnparseableVarargs(value: String*): Self = StObject.set(x, "unparseable", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ValidateResponse extends StObject {
    
    var address: String = js.native
    
    var did_you_mean: String | Null = js.native
    
    var is_disposable_address: Boolean = js.native
    
    var is_role_address: Boolean = js.native
    
    var is_valid: Boolean = js.native
    
    var mailbox_verification: true_ | false_ | unknown | Null = js.native
    
    var parts: Displayname = js.native
  }
  object ValidateResponse {
    
    @scala.inline
    def apply(
      address: String,
      is_disposable_address: Boolean,
      is_role_address: Boolean,
      is_valid: Boolean,
      parts: Displayname
    ): ValidateResponse = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], is_disposable_address = is_disposable_address.asInstanceOf[js.Any], is_role_address = is_role_address.asInstanceOf[js.Any], is_valid = is_valid.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateResponse]
    }
    
    @scala.inline
    implicit class ValidateResponseMutableBuilder[Self <: ValidateResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDid_you_mean(value: String): Self = StObject.set(x, "did_you_mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDid_you_meanNull: Self = StObject.set(x, "did_you_mean", null)
      
      @scala.inline
      def setIs_disposable_address(value: Boolean): Self = StObject.set(x, "is_disposable_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_role_address(value: Boolean): Self = StObject.set(x, "is_role_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_valid(value: Boolean): Self = StObject.set(x, "is_valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailbox_verification(value: true_ | false_ | unknown): Self = StObject.set(x, "mailbox_verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailbox_verificationNull: Self = StObject.set(x, "mailbox_verification", null)
      
      @scala.inline
      def setParts(value: Displayname): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    }
  }
  
  type ValidationCallback = js.Function2[/* error */ Error, /* body */ ValidateResponse, Unit]
  
  @js.native
  trait ValidationOptionsPrivate extends StObject {
    
    var mailbox_verification: js.UndefOr[Boolean] = js.native
  }
  object ValidationOptionsPrivate {
    
    @scala.inline
    def apply(): ValidationOptionsPrivate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptionsPrivate]
    }
    
    @scala.inline
    implicit class ValidationOptionsPrivateMutableBuilder[Self <: ValidationOptionsPrivate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMailbox_verification(value: Boolean): Self = StObject.set(x, "mailbox_verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailbox_verificationUndefined: Self = StObject.set(x, "mailbox_verification", js.undefined)
    }
  }
  
  @js.native
  trait ValidationOptionsPublic extends StObject {
    
    var api_key: js.UndefOr[String] = js.native
    
    var mailbox_verification: js.UndefOr[Boolean] = js.native
  }
  object ValidationOptionsPublic {
    
    @scala.inline
    def apply(): ValidationOptionsPublic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptionsPublic]
    }
    
    @scala.inline
    implicit class ValidationOptionsPublicMutableBuilder[Self <: ValidationOptionsPublic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
      
      @scala.inline
      def setMailbox_verification(value: Boolean): Self = StObject.set(x, "mailbox_verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailbox_verificationUndefined: Self = StObject.set(x, "mailbox_verification", js.undefined)
    }
  }
}
