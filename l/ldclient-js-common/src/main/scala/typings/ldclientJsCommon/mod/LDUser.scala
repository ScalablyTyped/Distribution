package typings.ldclientJsCommon.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LDUser extends js.Object {
  
  /**
    * Whether to show the user on the Users page in LaunchDarkly.
    */
  var anonymous: js.UndefOr[Boolean] = js.native
  
  /**
    * An absolute URL to an avatar image for the user.
    */
  var avatar: js.UndefOr[String] = js.native
  
  /**
    * The country associated with the user.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * Any additional attributes associated with the user.
    */
  var custom: js.UndefOr[
    StringDictionary[String | Boolean | Double | (js.Array[String | Boolean | Double])]
  ] = js.native
  
  /**
    * The user's email address.
    *
    * If an `avatar` URL is not provided, LaunchDarkly will use Gravatar
    * to try to display an avatar for the user on the Users page.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The user's first name.
    */
  var firstName: js.UndefOr[String] = js.native
  
  /**
    * The user's IP address.
    */
  var ip: js.UndefOr[String] = js.native
  
  /**
    * A unique string identifying a user.
    *
    * If you omit this property, and also set `anonymous` to `true`, the SDK will generate a UUID string
    * and use that as the key; it will attempt to persist that value in local storage if possible so the
    * next anonymous user will get the same key, but if local storage is unavailable then it will
    * generate a new key each time you specify the user.
    *
    * It is an error to omit the `key` property if `anonymous` is not set.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The user's last name.
    */
  var lastName: js.UndefOr[String] = js.native
  
  /**
    * The user's name.
    *
    * You can search for users on the User page by name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specifies a list of attribute names (either built-in or custom) which should be
    * marked as private, and not sent to LaunchDarkly in analytics events. This is in
    * addition to any private attributes designated in the global configuration
    * with [[LDOptions.privateAttributeNames]] or [[LDOptions.allAttributesPrivate]].
    */
  var privateAttributeNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An optional secondary key for a user. This affects
    * [feature flag targeting](https://docs.launchdarkly.com/docs/targeting-users#section-targeting-rules-based-on-user-attributes)
    * as follows: if you have chosen to bucket users by a specific attribute, the secondary key (if set)
    * is used to further distinguish between users who are otherwise identical according to that attribute.
    */
  var secondary: js.UndefOr[String] = js.native
}
object LDUser {
  
  @scala.inline
  def apply(): LDUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LDUser]
  }
  
  @scala.inline
  implicit class LDUserOps[Self <: LDUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    
    @scala.inline
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCustom(value: StringDictionary[String | Boolean | Double | (js.Array[String | Boolean | Double])]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrivateAttributeNamesVarargs(value: String*): Self = this.set("privateAttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setPrivateAttributeNames(value: js.Array[String]): Self = this.set("privateAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateAttributeNames: Self = this.set("privateAttributeNames", js.undefined)
    
    @scala.inline
    def setSecondary(value: String): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
}
