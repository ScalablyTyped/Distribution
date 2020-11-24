package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for User object in Directory API.
  */
@js.native
trait SchemaUser extends js.Object {
  
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
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
    
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
    def setAddresses(value: js.Any): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setAgreedToTerms(value: Boolean): Self = this.set("agreedToTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgreedToTerms: Self = this.set("agreedToTerms", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setChangePasswordAtNextLogin(value: Boolean): Self = this.set("changePasswordAtNextLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangePasswordAtNextLogin: Self = this.set("changePasswordAtNextLogin", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setCustomSchemas(value: StringDictionary[SchemaUserCustomProperties]): Self = this.set("customSchemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSchemas: Self = this.set("customSchemas", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setDeletionTime(value: String): Self = this.set("deletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionTime: Self = this.set("deletionTime", js.undefined)
    
    @scala.inline
    def setEmails(value: js.Any): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExternalIds(value: js.Any): Self = this.set("externalIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalIds: Self = this.set("externalIds", js.undefined)
    
    @scala.inline
    def setGender(value: js.Any): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setHashFunction(value: String): Self = this.set("hashFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashFunction: Self = this.set("hashFunction", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIms(value: js.Any): Self = this.set("ims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIms: Self = this.set("ims", js.undefined)
    
    @scala.inline
    def setIncludeInGlobalAddressList(value: Boolean): Self = this.set("includeInGlobalAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInGlobalAddressList: Self = this.set("includeInGlobalAddressList", js.undefined)
    
    @scala.inline
    def setIpWhitelisted(value: Boolean): Self = this.set("ipWhitelisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpWhitelisted: Self = this.set("ipWhitelisted", js.undefined)
    
    @scala.inline
    def setIsAdmin(value: Boolean): Self = this.set("isAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAdmin: Self = this.set("isAdmin", js.undefined)
    
    @scala.inline
    def setIsDelegatedAdmin(value: Boolean): Self = this.set("isDelegatedAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDelegatedAdmin: Self = this.set("isDelegatedAdmin", js.undefined)
    
    @scala.inline
    def setIsEnforcedIn2Sv(value: Boolean): Self = this.set("isEnforcedIn2Sv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnforcedIn2Sv: Self = this.set("isEnforcedIn2Sv", js.undefined)
    
    @scala.inline
    def setIsEnrolledIn2Sv(value: Boolean): Self = this.set("isEnrolledIn2Sv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnrolledIn2Sv: Self = this.set("isEnrolledIn2Sv", js.undefined)
    
    @scala.inline
    def setIsMailboxSetup(value: Boolean): Self = this.set("isMailboxSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMailboxSetup: Self = this.set("isMailboxSetup", js.undefined)
    
    @scala.inline
    def setKeywords(value: js.Any): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLanguages(value: js.Any): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    
    @scala.inline
    def setLastLoginTime(value: String): Self = this.set("lastLoginTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastLoginTime: Self = this.set("lastLoginTime", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Any): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setName(value: SchemaUserName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNonEditableAliasesVarargs(value: String*): Self = this.set("nonEditableAliases", js.Array(value :_*))
    
    @scala.inline
    def setNonEditableAliases(value: js.Array[String]): Self = this.set("nonEditableAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonEditableAliases: Self = this.set("nonEditableAliases", js.undefined)
    
    @scala.inline
    def setNotes(value: js.Any): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setOrgUnitPath(value: String): Self = this.set("orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitPath: Self = this.set("orgUnitPath", js.undefined)
    
    @scala.inline
    def setOrganizations(value: js.Any): Self = this.set("organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizations: Self = this.set("organizations", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPhones(value: js.Any): Self = this.set("phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
    
    @scala.inline
    def setPosixAccounts(value: js.Any): Self = this.set("posixAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosixAccounts: Self = this.set("posixAccounts", js.undefined)
    
    @scala.inline
    def setPrimaryEmail(value: String): Self = this.set("primaryEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryEmail: Self = this.set("primaryEmail", js.undefined)
    
    @scala.inline
    def setRelations(value: js.Any): Self = this.set("relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    
    @scala.inline
    def setSshPublicKeys(value: js.Any): Self = this.set("sshPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPublicKeys: Self = this.set("sshPublicKeys", js.undefined)
    
    @scala.inline
    def setSuspended(value: Boolean): Self = this.set("suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspended: Self = this.set("suspended", js.undefined)
    
    @scala.inline
    def setSuspensionReason(value: String): Self = this.set("suspensionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionReason: Self = this.set("suspensionReason", js.undefined)
    
    @scala.inline
    def setThumbnailPhotoEtag(value: String): Self = this.set("thumbnailPhotoEtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailPhotoEtag: Self = this.set("thumbnailPhotoEtag", js.undefined)
    
    @scala.inline
    def setThumbnailPhotoUrl(value: String): Self = this.set("thumbnailPhotoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailPhotoUrl: Self = this.set("thumbnailPhotoUrl", js.undefined)
    
    @scala.inline
    def setWebsites(value: js.Any): Self = this.set("websites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsites: Self = this.set("websites", js.undefined)
  }
}
