package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains profile information.
  */
/* Inlined std.Partial<{  CustomerId :string,   Name :string,   PostalCode :string,   PrimaryEmail :string}> */
trait UserProfile extends StObject {
  
  var CustomerId: js.UndefOr[String] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
  
  var PostalCode: js.UndefOr[String] = js.undefined
  
  var PrimaryEmail: js.UndefOr[String] = js.undefined
}
object UserProfile {
  
  @scala.inline
  def apply(): UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfile]
  }
  
  @scala.inline
  implicit class UserProfileMutableBuilder[Self <: UserProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "CustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "CustomerId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    @scala.inline
    def setPrimaryEmail(value: String): Self = StObject.set(x, "PrimaryEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryEmailUndefined: Self = StObject.set(x, "PrimaryEmail", js.undefined)
  }
}
