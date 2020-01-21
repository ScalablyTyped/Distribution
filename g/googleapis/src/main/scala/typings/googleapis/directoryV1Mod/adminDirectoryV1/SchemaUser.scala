package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    addresses: js.Any = null,
    agreedToTerms: js.UndefOr[Boolean] = js.undefined,
    aliases: js.Array[String] = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    changePasswordAtNextLogin: js.UndefOr[Boolean] = js.undefined,
    creationTime: String = null,
    customSchemas: StringDictionary[SchemaUserCustomProperties] = null,
    customerId: String = null,
    deletionTime: String = null,
    emails: js.Any = null,
    etag: String = null,
    externalIds: js.Any = null,
    gender: js.Any = null,
    hashFunction: String = null,
    id: String = null,
    ims: js.Any = null,
    includeInGlobalAddressList: js.UndefOr[Boolean] = js.undefined,
    ipWhitelisted: js.UndefOr[Boolean] = js.undefined,
    isAdmin: js.UndefOr[Boolean] = js.undefined,
    isDelegatedAdmin: js.UndefOr[Boolean] = js.undefined,
    isEnforcedIn2Sv: js.UndefOr[Boolean] = js.undefined,
    isEnrolledIn2Sv: js.UndefOr[Boolean] = js.undefined,
    isMailboxSetup: js.UndefOr[Boolean] = js.undefined,
    keywords: js.Any = null,
    kind: String = null,
    languages: js.Any = null,
    lastLoginTime: String = null,
    locations: js.Any = null,
    name: SchemaUserName = null,
    nonEditableAliases: js.Array[String] = null,
    notes: js.Any = null,
    orgUnitPath: String = null,
    organizations: js.Any = null,
    password: String = null,
    phones: js.Any = null,
    posixAccounts: js.Any = null,
    primaryEmail: String = null,
    relations: js.Any = null,
    sshPublicKeys: js.Any = null,
    suspended: js.UndefOr[Boolean] = js.undefined,
    suspensionReason: String = null,
    thumbnailPhotoEtag: String = null,
    thumbnailPhotoUrl: String = null,
    websites: js.Any = null
  ): SchemaUser = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (!js.isUndefined(agreedToTerms)) __obj.updateDynamic("agreedToTerms")(agreedToTerms.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (!js.isUndefined(changePasswordAtNextLogin)) __obj.updateDynamic("changePasswordAtNextLogin")(changePasswordAtNextLogin.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (customSchemas != null) __obj.updateDynamic("customSchemas")(customSchemas.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (deletionTime != null) __obj.updateDynamic("deletionTime")(deletionTime.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (externalIds != null) __obj.updateDynamic("externalIds")(externalIds.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (hashFunction != null) __obj.updateDynamic("hashFunction")(hashFunction.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ims != null) __obj.updateDynamic("ims")(ims.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInGlobalAddressList)) __obj.updateDynamic("includeInGlobalAddressList")(includeInGlobalAddressList.asInstanceOf[js.Any])
    if (!js.isUndefined(ipWhitelisted)) __obj.updateDynamic("ipWhitelisted")(ipWhitelisted.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdmin)) __obj.updateDynamic("isAdmin")(isAdmin.asInstanceOf[js.Any])
    if (!js.isUndefined(isDelegatedAdmin)) __obj.updateDynamic("isDelegatedAdmin")(isDelegatedAdmin.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnforcedIn2Sv)) __obj.updateDynamic("isEnforcedIn2Sv")(isEnforcedIn2Sv.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnrolledIn2Sv)) __obj.updateDynamic("isEnrolledIn2Sv")(isEnrolledIn2Sv.asInstanceOf[js.Any])
    if (!js.isUndefined(isMailboxSetup)) __obj.updateDynamic("isMailboxSetup")(isMailboxSetup.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (lastLoginTime != null) __obj.updateDynamic("lastLoginTime")(lastLoginTime.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nonEditableAliases != null) __obj.updateDynamic("nonEditableAliases")(nonEditableAliases.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (phones != null) __obj.updateDynamic("phones")(phones.asInstanceOf[js.Any])
    if (posixAccounts != null) __obj.updateDynamic("posixAccounts")(posixAccounts.asInstanceOf[js.Any])
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    if (sshPublicKeys != null) __obj.updateDynamic("sshPublicKeys")(sshPublicKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended.asInstanceOf[js.Any])
    if (suspensionReason != null) __obj.updateDynamic("suspensionReason")(suspensionReason.asInstanceOf[js.Any])
    if (thumbnailPhotoEtag != null) __obj.updateDynamic("thumbnailPhotoEtag")(thumbnailPhotoEtag.asInstanceOf[js.Any])
    if (thumbnailPhotoUrl != null) __obj.updateDynamic("thumbnailPhotoUrl")(thumbnailPhotoUrl.asInstanceOf[js.Any])
    if (websites != null) __obj.updateDynamic("websites")(websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUser]
  }
}

