package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * A list of the user's addresses. The maximum allowed data size for this field is 10Kb.
    */
  var addresses: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Output only. This property is `true` if the user has completed an initial login and accepted the Terms of Service agreement.
    */
  var agreedToTerms: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. A list of the user's alias email addresses.
    */
  var aliases: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Indicates if user is archived.
    */
  var archived: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if the user is forced to change their password at next login. This setting doesn't apply when [the user signs in via a third-party identity provider](https://support.google.com/a/answer/60224).
    */
  var changePasswordAtNextLogin: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * User's G Suite account creation time. (Read-only)
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom fields of the user. The key is a `schema_name` and its values are `'field_name': 'field_value'`.
    */
  var customSchemas: js.UndefOr[StringDictionary[SchemaUserCustomProperties] | Null] = js.undefined
  
  /**
    * Output only. The customer ID to [retrieve all account users](/admin-sdk/directory/v1/guides/manage-users.html#get_all_users). You can use the alias `my_customer` to represent your account's `customerId`. As a reseller administrator, you can use the resold customer account's `customerId`. To get a `customerId`, use the account's primary domain in the `domain` parameter of a [users.list](/admin-sdk/directory/v1/reference/users/list) request.
    */
  var customerId: js.UndefOr[String | Null] = js.undefined
  
  var deletionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the user's email addresses. The maximum allowed data size for this field is 10Kb.
    */
  var emails: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Output only. ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of external IDs for the user, such as an employee or network ID. The maximum allowed data size for this field is 2Kb.
    */
  var externalIds: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * The user's gender. The maximum allowed data size for this field is 1Kb.
    */
  var gender: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Stores the hash format of the `password` property. The following `hashFunction` values are allowed: * `MD5` - Accepts simple hex-encoded values. * `SHA-1` - Accepts simple hex-encoded values. * `crypt` - Compliant with the [C crypt library](https://en.wikipedia.org/wiki/Crypt_%28C%29). Supports the DES, MD5 (hash prefix `$1$`), SHA-256 (hash prefix `$5$`), and SHA-512 (hash prefix `$6$`) hash algorithms. If rounds are specified as part of the prefix, they must be 10,000 or fewer.
    */
  var hashFunction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID for the user. A user `id` can be used as a user request URI's `userKey`.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's Instant Messenger (IM) accounts. A user account can have multiple ims properties. But, only one of these ims properties can be the primary IM contact. The maximum allowed data size for this field is 2Kb.
    */
  var ims: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Indicates if the user's profile is visible in the Google Workspace global address list when the contact sharing feature is enabled for the domain. For more information about excluding user profiles, see the [administration help center](https://support.google.com/a/answer/1285988).
    */
  var includeInGlobalAddressList: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If `true`, the user's IP address is [whitelisted](https://support.google.com/a/answer/60752).
    */
  var ipWhitelisted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates a user with super admininistrator privileges. The `isAdmin` property can only be edited in the [Make a user an administrator](/admin-sdk/directory/v1/guides/manage-users.html#make_admin) operation ( [makeAdmin](/admin-sdk/directory/v1/reference/users/makeAdmin.html) method). If edited in the user [insert](/admin-sdk/directory/v1/reference/users/insert.html) or [update](/admin-sdk/directory/v1/reference/users/update.html) methods, the edit is ignored by the API service.
    */
  var isAdmin: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates if the user is a delegated administrator. Delegated administrators are supported by the API but cannot create or undelete users, or make users administrators. These requests are ignored by the API service. Roles and privileges for administrators are assigned using the [Admin console](https://support.google.com/a/answer/33325).
    */
  var isDelegatedAdmin: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Is 2-step verification enforced (Read-only)
    */
  var isEnforcedIn2Sv: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Is enrolled in 2-step verification (Read-only)
    */
  var isEnrolledIn2Sv: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates if the user's Google mailbox is created. This property is only applicable if the user has been assigned a Gmail license.
    */
  var isMailboxSetup: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The user's keywords. The maximum allowed data size for this field is 1Kb.
    */
  var keywords: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Output only. The type of the API resource. For Users resources, the value is `admin#directory#user`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's languages. The maximum allowed data size for this field is 1Kb.
    */
  var languages: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * User's last login time. (Read-only)
    */
  var lastLoginTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's locations. The maximum allowed data size for this field is 10Kb.
    */
  var locations: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Holds the given and family names of the user, and the read-only `fullName` value. The maximum number of characters in the `givenName` and in the `familyName` values is 60. In addition, name values support unicode/UTF-8 characters, and can contain spaces, letters (a-z), numbers (0-9), dashes (-), forward slashes (/), and periods (.). For more information about character usage rules, see the [administration help center](https://support.google.com/a/answer/9193374). Maximum allowed data size for this field is 1Kb.
    */
  var name: js.UndefOr[SchemaUserName] = js.undefined
  
  /**
    * Output only. List of the user's non-editable alias email addresses. These are typically outside the account's primary domain or sub-domain.
    */
  var nonEditableAliases: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Notes for the user.
    */
  var notes: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * The full path of the parent organization associated with the user. If the parent organization is the top-level, it is represented as a forward slash (`/`).
    */
  var orgUnitPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of organizations the user belongs to. The maximum allowed data size for this field is 10Kb.
    */
  var organizations: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * User's password
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the user's phone numbers. The maximum allowed data size for this field is 1Kb.
    */
  var phones: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * A list of [POSIX](https://www.opengroup.org/austin/papers/posix_faq.html) account information for the user.
    */
  var posixAccounts: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * The user's primary email address. This property is required in a request to create a user account. The `primaryEmail` must be unique and cannot be an alias of another user.
    */
  var primaryEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Recovery email of the user.
    */
  var recoveryEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Recovery phone of the user. The phone number must be in the E.164 format, starting with the plus sign (+). Example: *+16506661212*.
    */
  var recoveryPhone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the user's relationships to other users. The maximum allowed data size for this field is 2Kb.
    */
  var relations: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * A list of SSH public keys.
    */
  var sshPublicKeys: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Indicates if user is suspended.
    */
  var suspended: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Has the reason a user account is suspended either by the administrator or by Google at the time of suspension. The property is returned only if the `suspended` property is `true`.
    */
  var suspensionReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. ETag of the user's photo (Read-only)
    */
  var thumbnailPhotoEtag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Photo Url of the user (Read-only)
    */
  var thumbnailPhotoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's websites. The maximum allowed data size for this field is 2Kb.
    */
  var websites: js.UndefOr[Any | Null] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setAddresses(value: Any): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesNull: Self = StObject.set(x, "addresses", null)
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAgreedToTerms(value: Boolean): Self = StObject.set(x, "agreedToTerms", value.asInstanceOf[js.Any])
    
    inline def setAgreedToTermsNull: Self = StObject.set(x, "agreedToTerms", null)
    
    inline def setAgreedToTermsUndefined: Self = StObject.set(x, "agreedToTerms", js.undefined)
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesNull: Self = StObject.set(x, "aliases", null)
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedNull: Self = StObject.set(x, "archived", null)
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setChangePasswordAtNextLogin(value: Boolean): Self = StObject.set(x, "changePasswordAtNextLogin", value.asInstanceOf[js.Any])
    
    inline def setChangePasswordAtNextLoginNull: Self = StObject.set(x, "changePasswordAtNextLogin", null)
    
    inline def setChangePasswordAtNextLoginUndefined: Self = StObject.set(x, "changePasswordAtNextLogin", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setCustomSchemas(value: StringDictionary[SchemaUserCustomProperties]): Self = StObject.set(x, "customSchemas", value.asInstanceOf[js.Any])
    
    inline def setCustomSchemasNull: Self = StObject.set(x, "customSchemas", null)
    
    inline def setCustomSchemasUndefined: Self = StObject.set(x, "customSchemas", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdNull: Self = StObject.set(x, "customerId", null)
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeNull: Self = StObject.set(x, "deletionTime", null)
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    inline def setEmails(value: Any): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsNull: Self = StObject.set(x, "emails", null)
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExternalIds(value: Any): Self = StObject.set(x, "externalIds", value.asInstanceOf[js.Any])
    
    inline def setExternalIdsNull: Self = StObject.set(x, "externalIds", null)
    
    inline def setExternalIdsUndefined: Self = StObject.set(x, "externalIds", js.undefined)
    
    inline def setGender(value: Any): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderNull: Self = StObject.set(x, "gender", null)
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setHashFunction(value: String): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
    
    inline def setHashFunctionNull: Self = StObject.set(x, "hashFunction", null)
    
    inline def setHashFunctionUndefined: Self = StObject.set(x, "hashFunction", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIms(value: Any): Self = StObject.set(x, "ims", value.asInstanceOf[js.Any])
    
    inline def setImsNull: Self = StObject.set(x, "ims", null)
    
    inline def setImsUndefined: Self = StObject.set(x, "ims", js.undefined)
    
    inline def setIncludeInGlobalAddressList(value: Boolean): Self = StObject.set(x, "includeInGlobalAddressList", value.asInstanceOf[js.Any])
    
    inline def setIncludeInGlobalAddressListNull: Self = StObject.set(x, "includeInGlobalAddressList", null)
    
    inline def setIncludeInGlobalAddressListUndefined: Self = StObject.set(x, "includeInGlobalAddressList", js.undefined)
    
    inline def setIpWhitelisted(value: Boolean): Self = StObject.set(x, "ipWhitelisted", value.asInstanceOf[js.Any])
    
    inline def setIpWhitelistedNull: Self = StObject.set(x, "ipWhitelisted", null)
    
    inline def setIpWhitelistedUndefined: Self = StObject.set(x, "ipWhitelisted", js.undefined)
    
    inline def setIsAdmin(value: Boolean): Self = StObject.set(x, "isAdmin", value.asInstanceOf[js.Any])
    
    inline def setIsAdminNull: Self = StObject.set(x, "isAdmin", null)
    
    inline def setIsAdminUndefined: Self = StObject.set(x, "isAdmin", js.undefined)
    
    inline def setIsDelegatedAdmin(value: Boolean): Self = StObject.set(x, "isDelegatedAdmin", value.asInstanceOf[js.Any])
    
    inline def setIsDelegatedAdminNull: Self = StObject.set(x, "isDelegatedAdmin", null)
    
    inline def setIsDelegatedAdminUndefined: Self = StObject.set(x, "isDelegatedAdmin", js.undefined)
    
    inline def setIsEnforcedIn2Sv(value: Boolean): Self = StObject.set(x, "isEnforcedIn2Sv", value.asInstanceOf[js.Any])
    
    inline def setIsEnforcedIn2SvNull: Self = StObject.set(x, "isEnforcedIn2Sv", null)
    
    inline def setIsEnforcedIn2SvUndefined: Self = StObject.set(x, "isEnforcedIn2Sv", js.undefined)
    
    inline def setIsEnrolledIn2Sv(value: Boolean): Self = StObject.set(x, "isEnrolledIn2Sv", value.asInstanceOf[js.Any])
    
    inline def setIsEnrolledIn2SvNull: Self = StObject.set(x, "isEnrolledIn2Sv", null)
    
    inline def setIsEnrolledIn2SvUndefined: Self = StObject.set(x, "isEnrolledIn2Sv", js.undefined)
    
    inline def setIsMailboxSetup(value: Boolean): Self = StObject.set(x, "isMailboxSetup", value.asInstanceOf[js.Any])
    
    inline def setIsMailboxSetupNull: Self = StObject.set(x, "isMailboxSetup", null)
    
    inline def setIsMailboxSetupUndefined: Self = StObject.set(x, "isMailboxSetup", js.undefined)
    
    inline def setKeywords(value: Any): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsNull: Self = StObject.set(x, "keywords", null)
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguages(value: Any): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesNull: Self = StObject.set(x, "languages", null)
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLastLoginTime(value: String): Self = StObject.set(x, "lastLoginTime", value.asInstanceOf[js.Any])
    
    inline def setLastLoginTimeNull: Self = StObject.set(x, "lastLoginTime", null)
    
    inline def setLastLoginTimeUndefined: Self = StObject.set(x, "lastLoginTime", js.undefined)
    
    inline def setLocations(value: Any): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setName(value: SchemaUserName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNonEditableAliases(value: js.Array[String]): Self = StObject.set(x, "nonEditableAliases", value.asInstanceOf[js.Any])
    
    inline def setNonEditableAliasesNull: Self = StObject.set(x, "nonEditableAliases", null)
    
    inline def setNonEditableAliasesUndefined: Self = StObject.set(x, "nonEditableAliases", js.undefined)
    
    inline def setNonEditableAliasesVarargs(value: String*): Self = StObject.set(x, "nonEditableAliases", js.Array(value*))
    
    inline def setNotes(value: Any): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitPathNull: Self = StObject.set(x, "orgUnitPath", null)
    
    inline def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    inline def setOrganizations(value: Any): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsNull: Self = StObject.set(x, "organizations", null)
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPhones(value: Any): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesNull: Self = StObject.set(x, "phones", null)
    
    inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    inline def setPosixAccounts(value: Any): Self = StObject.set(x, "posixAccounts", value.asInstanceOf[js.Any])
    
    inline def setPosixAccountsNull: Self = StObject.set(x, "posixAccounts", null)
    
    inline def setPosixAccountsUndefined: Self = StObject.set(x, "posixAccounts", js.undefined)
    
    inline def setPrimaryEmail(value: String): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEmailNull: Self = StObject.set(x, "primaryEmail", null)
    
    inline def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
    
    inline def setRecoveryEmail(value: String): Self = StObject.set(x, "recoveryEmail", value.asInstanceOf[js.Any])
    
    inline def setRecoveryEmailNull: Self = StObject.set(x, "recoveryEmail", null)
    
    inline def setRecoveryEmailUndefined: Self = StObject.set(x, "recoveryEmail", js.undefined)
    
    inline def setRecoveryPhone(value: String): Self = StObject.set(x, "recoveryPhone", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPhoneNull: Self = StObject.set(x, "recoveryPhone", null)
    
    inline def setRecoveryPhoneUndefined: Self = StObject.set(x, "recoveryPhone", js.undefined)
    
    inline def setRelations(value: Any): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsNull: Self = StObject.set(x, "relations", null)
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setSshPublicKeys(value: Any): Self = StObject.set(x, "sshPublicKeys", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeysNull: Self = StObject.set(x, "sshPublicKeys", null)
    
    inline def setSshPublicKeysUndefined: Self = StObject.set(x, "sshPublicKeys", js.undefined)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedNull: Self = StObject.set(x, "suspended", null)
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    inline def setSuspensionReason(value: String): Self = StObject.set(x, "suspensionReason", value.asInstanceOf[js.Any])
    
    inline def setSuspensionReasonNull: Self = StObject.set(x, "suspensionReason", null)
    
    inline def setSuspensionReasonUndefined: Self = StObject.set(x, "suspensionReason", js.undefined)
    
    inline def setThumbnailPhotoEtag(value: String): Self = StObject.set(x, "thumbnailPhotoEtag", value.asInstanceOf[js.Any])
    
    inline def setThumbnailPhotoEtagNull: Self = StObject.set(x, "thumbnailPhotoEtag", null)
    
    inline def setThumbnailPhotoEtagUndefined: Self = StObject.set(x, "thumbnailPhotoEtag", js.undefined)
    
    inline def setThumbnailPhotoUrl(value: String): Self = StObject.set(x, "thumbnailPhotoUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailPhotoUrlNull: Self = StObject.set(x, "thumbnailPhotoUrl", null)
    
    inline def setThumbnailPhotoUrlUndefined: Self = StObject.set(x, "thumbnailPhotoUrl", js.undefined)
    
    inline def setWebsites(value: Any): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
    
    inline def setWebsitesNull: Self = StObject.set(x, "websites", null)
    
    inline def setWebsitesUndefined: Self = StObject.set(x, "websites", js.undefined)
  }
}
