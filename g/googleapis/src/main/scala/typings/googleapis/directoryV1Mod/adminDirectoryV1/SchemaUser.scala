package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for User object in Directory API.
  */
@js.native
trait SchemaUser extends StObject {
  
  var addresses: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates if user has agreed to terms (Read-only)
    */
  var agreedToTerms: js.UndefOr[Boolean] = js.native
  
  /**
    * List of aliases (Read-only)
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates if user is archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean indicating if the user should change password in next login
    */
  var changePasswordAtNextLogin: js.UndefOr[Boolean] = js.native
  
  /**
    * User&#39;s G Suite account creation time. (Read-only)
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * Custom fields of the user.
    */
  var customSchemas: js.UndefOr[StringDictionary[SchemaUserCustomProperties]] = js.native
  
  /**
    * CustomerId of User (Read-only)
    */
  var customerId: js.UndefOr[String] = js.native
  
  var deletionTime: js.UndefOr[String] = js.native
  
  var emails: js.UndefOr[js.Any] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  var externalIds: js.UndefOr[js.Any] = js.native
  
  var gender: js.UndefOr[js.Any] = js.native
  
  /**
    * Hash function name for password. Supported are MD5, SHA-1 and crypt
    */
  var hashFunction: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier of User (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  
  var ims: js.UndefOr[js.Any] = js.native
  
  /**
    * Boolean indicating if user is included in Global Address List
    */
  var includeInGlobalAddressList: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean indicating if ip is whitelisted
    */
  var ipWhitelisted: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean indicating if the user is admin (Read-only)
    */
  var isAdmin: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean indicating if the user is delegated admin (Read-only)
    */
  var isDelegatedAdmin: js.UndefOr[Boolean] = js.native
  
  /**
    * Is 2-step verification enforced (Read-only)
    */
  var isEnforcedIn2Sv: js.UndefOr[Boolean] = js.native
  
  /**
    * Is enrolled in 2-step verification (Read-only)
    */
  var isEnrolledIn2Sv: js.UndefOr[Boolean] = js.native
  
  /**
    * Is mailbox setup (Read-only)
    */
  var isMailboxSetup: js.UndefOr[Boolean] = js.native
  
  var keywords: js.UndefOr[js.Any] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  var languages: js.UndefOr[js.Any] = js.native
  
  /**
    * User&#39;s last login time. (Read-only)
    */
  var lastLoginTime: js.UndefOr[String] = js.native
  
  var locations: js.UndefOr[js.Any] = js.native
  
  /**
    * User&#39;s name
    */
  var name: js.UndefOr[SchemaUserName] = js.native
  
  /**
    * List of non editable aliases (Read-only)
    */
  var nonEditableAliases: js.UndefOr[js.Array[String]] = js.native
  
  var notes: js.UndefOr[js.Any] = js.native
  
  /**
    * OrgUnit of User
    */
  var orgUnitPath: js.UndefOr[String] = js.native
  
  var organizations: js.UndefOr[js.Any] = js.native
  
  /**
    * User&#39;s password
    */
  var password: js.UndefOr[String] = js.native
  
  var phones: js.UndefOr[js.Any] = js.native
  
  var posixAccounts: js.UndefOr[js.Any] = js.native
  
  /**
    * username of User
    */
  var primaryEmail: js.UndefOr[String] = js.native
  
  var relations: js.UndefOr[js.Any] = js.native
  
  var sshPublicKeys: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates if user is suspended.
    */
  var suspended: js.UndefOr[Boolean] = js.native
  
  /**
    * Suspension reason if user is suspended (Read-only)
    */
  var suspensionReason: js.UndefOr[String] = js.native
  
  /**
    * ETag of the user&#39;s photo (Read-only)
    */
  var thumbnailPhotoEtag: js.UndefOr[String] = js.native
  
  /**
    * Photo Url of the user (Read-only)
    */
  var thumbnailPhotoUrl: js.UndefOr[String] = js.native
  
  var websites: js.UndefOr[js.Any] = js.native
}
object SchemaUser {
  
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  @scala.inline
  implicit class SchemaUserMutableBuilder[Self <: SchemaUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Any): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAgreedToTerms(value: Boolean): Self = StObject.set(x, "agreedToTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgreedToTermsUndefined: Self = StObject.set(x, "agreedToTerms", js.undefined)
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setChangePasswordAtNextLogin(value: Boolean): Self = StObject.set(x, "changePasswordAtNextLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePasswordAtNextLoginUndefined: Self = StObject.set(x, "changePasswordAtNextLogin", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setCustomSchemas(value: StringDictionary[SchemaUserCustomProperties]): Self = StObject.set(x, "customSchemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSchemasUndefined: Self = StObject.set(x, "customSchemas", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    @scala.inline
    def setEmails(value: js.Any): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setExternalIds(value: js.Any): Self = StObject.set(x, "externalIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdsUndefined: Self = StObject.set(x, "externalIds", js.undefined)
    
    @scala.inline
    def setGender(value: js.Any): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setHashFunction(value: String): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashFunctionUndefined: Self = StObject.set(x, "hashFunction", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIms(value: js.Any): Self = StObject.set(x, "ims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImsUndefined: Self = StObject.set(x, "ims", js.undefined)
    
    @scala.inline
    def setIncludeInGlobalAddressList(value: Boolean): Self = StObject.set(x, "includeInGlobalAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInGlobalAddressListUndefined: Self = StObject.set(x, "includeInGlobalAddressList", js.undefined)
    
    @scala.inline
    def setIpWhitelisted(value: Boolean): Self = StObject.set(x, "ipWhitelisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpWhitelistedUndefined: Self = StObject.set(x, "ipWhitelisted", js.undefined)
    
    @scala.inline
    def setIsAdmin(value: Boolean): Self = StObject.set(x, "isAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdminUndefined: Self = StObject.set(x, "isAdmin", js.undefined)
    
    @scala.inline
    def setIsDelegatedAdmin(value: Boolean): Self = StObject.set(x, "isDelegatedAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDelegatedAdminUndefined: Self = StObject.set(x, "isDelegatedAdmin", js.undefined)
    
    @scala.inline
    def setIsEnforcedIn2Sv(value: Boolean): Self = StObject.set(x, "isEnforcedIn2Sv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnforcedIn2SvUndefined: Self = StObject.set(x, "isEnforcedIn2Sv", js.undefined)
    
    @scala.inline
    def setIsEnrolledIn2Sv(value: Boolean): Self = StObject.set(x, "isEnrolledIn2Sv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnrolledIn2SvUndefined: Self = StObject.set(x, "isEnrolledIn2Sv", js.undefined)
    
    @scala.inline
    def setIsMailboxSetup(value: Boolean): Self = StObject.set(x, "isMailboxSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMailboxSetupUndefined: Self = StObject.set(x, "isMailboxSetup", js.undefined)
    
    @scala.inline
    def setKeywords(value: js.Any): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLanguages(value: js.Any): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLastLoginTime(value: String): Self = StObject.set(x, "lastLoginTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLoginTimeUndefined: Self = StObject.set(x, "lastLoginTime", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Any): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setName(value: SchemaUserName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNonEditableAliases(value: js.Array[String]): Self = StObject.set(x, "nonEditableAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEditableAliasesUndefined: Self = StObject.set(x, "nonEditableAliases", js.undefined)
    
    @scala.inline
    def setNonEditableAliasesVarargs(value: String*): Self = StObject.set(x, "nonEditableAliases", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Any): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    @scala.inline
    def setOrganizations(value: js.Any): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPhones(value: js.Any): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    @scala.inline
    def setPosixAccounts(value: js.Any): Self = StObject.set(x, "posixAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosixAccountsUndefined: Self = StObject.set(x, "posixAccounts", js.undefined)
    
    @scala.inline
    def setPrimaryEmail(value: String): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
    
    @scala.inline
    def setRelations(value: js.Any): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    @scala.inline
    def setSshPublicKeys(value: js.Any): Self = StObject.set(x, "sshPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeysUndefined: Self = StObject.set(x, "sshPublicKeys", js.undefined)
    
    @scala.inline
    def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    @scala.inline
    def setSuspensionReason(value: String): Self = StObject.set(x, "suspensionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionReasonUndefined: Self = StObject.set(x, "suspensionReason", js.undefined)
    
    @scala.inline
    def setThumbnailPhotoEtag(value: String): Self = StObject.set(x, "thumbnailPhotoEtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailPhotoEtagUndefined: Self = StObject.set(x, "thumbnailPhotoEtag", js.undefined)
    
    @scala.inline
    def setThumbnailPhotoUrl(value: String): Self = StObject.set(x, "thumbnailPhotoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailPhotoUrlUndefined: Self = StObject.set(x, "thumbnailPhotoUrl", js.undefined)
    
    @scala.inline
    def setWebsites(value: js.Any): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsitesUndefined: Self = StObject.set(x, "websites", js.undefined)
  }
}
