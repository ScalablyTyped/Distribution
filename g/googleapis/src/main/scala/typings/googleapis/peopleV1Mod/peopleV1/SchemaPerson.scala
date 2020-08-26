package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a person merged from various data sources such as the
  * authenticated user&#39;s contacts and profile data.  Most fields can have
  * multiple items. The items in a field have no guaranteed order, but each
  * non-empty field is guaranteed to have exactly one field with
  * `metadata.primary` set to true.
  */
@js.native
trait SchemaPerson extends js.Object {
  /**
    * The person&#39;s street addresses.
    */
  var addresses: js.UndefOr[js.Array[SchemaAddress]] = js.native
  /**
    * **DEPRECATED** (Please use `person.ageRanges` instead)**  The
    * person&#39;s read-only age range.
    */
  var ageRange: js.UndefOr[String] = js.native
  /**
    * The person&#39;s read-only age ranges.
    */
  var ageRanges: js.UndefOr[js.Array[SchemaAgeRangeType]] = js.native
  /**
    * The person&#39;s biographies.
    */
  var biographies: js.UndefOr[js.Array[SchemaBiography]] = js.native
  /**
    * The person&#39;s birthdays.
    */
  var birthdays: js.UndefOr[js.Array[SchemaBirthday]] = js.native
  /**
    * The person&#39;s bragging rights.
    */
  var braggingRights: js.UndefOr[js.Array[SchemaBraggingRights]] = js.native
  /**
    * The person&#39;s read-only cover photos.
    */
  var coverPhotos: js.UndefOr[js.Array[SchemaCoverPhoto]] = js.native
  /**
    * The person&#39;s email addresses.
    */
  var emailAddresses: js.UndefOr[js.Array[SchemaEmailAddress]] = js.native
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The person&#39;s events.
    */
  var events: js.UndefOr[js.Array[SchemaEvent]] = js.native
  /**
    * The person&#39;s genders.
    */
  var genders: js.UndefOr[js.Array[SchemaGender]] = js.native
  /**
    * The person&#39;s instant messaging clients.
    */
  var imClients: js.UndefOr[js.Array[SchemaImClient]] = js.native
  /**
    * The person&#39;s interests.
    */
  var interests: js.UndefOr[js.Array[SchemaInterest]] = js.native
  /**
    * The person&#39;s locale preferences.
    */
  var locales: js.UndefOr[js.Array[SchemaLocale]] = js.native
  /**
    * The person&#39;s read-only group memberships.
    */
  var memberships: js.UndefOr[js.Array[SchemaMembership]] = js.native
  /**
    * Read-only metadata about the person.
    */
  var metadata: js.UndefOr[SchemaPersonMetadata] = js.native
  /**
    * The person&#39;s names.
    */
  var names: js.UndefOr[js.Array[SchemaName]] = js.native
  /**
    * The person&#39;s nicknames.
    */
  var nicknames: js.UndefOr[js.Array[SchemaNickname]] = js.native
  /**
    * The person&#39;s occupations.
    */
  var occupations: js.UndefOr[js.Array[SchemaOccupation]] = js.native
  /**
    * The person&#39;s past or current organizations.
    */
  var organizations: js.UndefOr[js.Array[SchemaOrganization]] = js.native
  /**
    * The person&#39;s phone numbers.
    */
  var phoneNumbers: js.UndefOr[js.Array[SchemaPhoneNumber]] = js.native
  /**
    * The person&#39;s read-only photos.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.native
  /**
    * The person&#39;s relations.
    */
  var relations: js.UndefOr[js.Array[SchemaRelation]] = js.native
  /**
    * The person&#39;s read-only relationship interests.
    */
  var relationshipInterests: js.UndefOr[js.Array[SchemaRelationshipInterest]] = js.native
  /**
    * The person&#39;s read-only relationship statuses.
    */
  var relationshipStatuses: js.UndefOr[js.Array[SchemaRelationshipStatus]] = js.native
  /**
    * The person&#39;s residences.
    */
  var residences: js.UndefOr[js.Array[SchemaResidence]] = js.native
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The person&#39;s SIP addresses.
    */
  var sipAddresses: js.UndefOr[js.Array[SchemaSipAddress]] = js.native
  /**
    * The person&#39;s skills.
    */
  var skills: js.UndefOr[js.Array[SchemaSkill]] = js.native
  /**
    * The person&#39;s read-only taglines.
    */
  var taglines: js.UndefOr[js.Array[SchemaTagline]] = js.native
  /**
    * The person&#39;s associated URLs.
    */
  var urls: js.UndefOr[js.Array[SchemaUrl]] = js.native
  /**
    * The person&#39;s user defined data.
    */
  var userDefined: js.UndefOr[js.Array[SchemaUserDefined]] = js.native
}

object SchemaPerson {
  @scala.inline
  def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  @scala.inline
  implicit class SchemaPersonOps[Self <: SchemaPerson] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: SchemaAddress*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[SchemaAddress]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setAgeRange(value: String): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeRange: Self = this.set("ageRange", js.undefined)
    @scala.inline
    def setAgeRangesVarargs(value: SchemaAgeRangeType*): Self = this.set("ageRanges", js.Array(value :_*))
    @scala.inline
    def setAgeRanges(value: js.Array[SchemaAgeRangeType]): Self = this.set("ageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeRanges: Self = this.set("ageRanges", js.undefined)
    @scala.inline
    def setBiographiesVarargs(value: SchemaBiography*): Self = this.set("biographies", js.Array(value :_*))
    @scala.inline
    def setBiographies(value: js.Array[SchemaBiography]): Self = this.set("biographies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBiographies: Self = this.set("biographies", js.undefined)
    @scala.inline
    def setBirthdaysVarargs(value: SchemaBirthday*): Self = this.set("birthdays", js.Array(value :_*))
    @scala.inline
    def setBirthdays(value: js.Array[SchemaBirthday]): Self = this.set("birthdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthdays: Self = this.set("birthdays", js.undefined)
    @scala.inline
    def setBraggingRightsVarargs(value: SchemaBraggingRights*): Self = this.set("braggingRights", js.Array(value :_*))
    @scala.inline
    def setBraggingRights(value: js.Array[SchemaBraggingRights]): Self = this.set("braggingRights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraggingRights: Self = this.set("braggingRights", js.undefined)
    @scala.inline
    def setCoverPhotosVarargs(value: SchemaCoverPhoto*): Self = this.set("coverPhotos", js.Array(value :_*))
    @scala.inline
    def setCoverPhotos(value: js.Array[SchemaCoverPhoto]): Self = this.set("coverPhotos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverPhotos: Self = this.set("coverPhotos", js.undefined)
    @scala.inline
    def setEmailAddressesVarargs(value: SchemaEmailAddress*): Self = this.set("emailAddresses", js.Array(value :_*))
    @scala.inline
    def setEmailAddresses(value: js.Array[SchemaEmailAddress]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddresses: Self = this.set("emailAddresses", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setEventsVarargs(value: SchemaEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[SchemaEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setGendersVarargs(value: SchemaGender*): Self = this.set("genders", js.Array(value :_*))
    @scala.inline
    def setGenders(value: js.Array[SchemaGender]): Self = this.set("genders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenders: Self = this.set("genders", js.undefined)
    @scala.inline
    def setImClientsVarargs(value: SchemaImClient*): Self = this.set("imClients", js.Array(value :_*))
    @scala.inline
    def setImClients(value: js.Array[SchemaImClient]): Self = this.set("imClients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImClients: Self = this.set("imClients", js.undefined)
    @scala.inline
    def setInterestsVarargs(value: SchemaInterest*): Self = this.set("interests", js.Array(value :_*))
    @scala.inline
    def setInterests(value: js.Array[SchemaInterest]): Self = this.set("interests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterests: Self = this.set("interests", js.undefined)
    @scala.inline
    def setLocalesVarargs(value: SchemaLocale*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[SchemaLocale]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    @scala.inline
    def setMembershipsVarargs(value: SchemaMembership*): Self = this.set("memberships", js.Array(value :_*))
    @scala.inline
    def setMemberships(value: js.Array[SchemaMembership]): Self = this.set("memberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberships: Self = this.set("memberships", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaPersonMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setNamesVarargs(value: SchemaName*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[SchemaName]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setNicknamesVarargs(value: SchemaNickname*): Self = this.set("nicknames", js.Array(value :_*))
    @scala.inline
    def setNicknames(value: js.Array[SchemaNickname]): Self = this.set("nicknames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNicknames: Self = this.set("nicknames", js.undefined)
    @scala.inline
    def setOccupationsVarargs(value: SchemaOccupation*): Self = this.set("occupations", js.Array(value :_*))
    @scala.inline
    def setOccupations(value: js.Array[SchemaOccupation]): Self = this.set("occupations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccupations: Self = this.set("occupations", js.undefined)
    @scala.inline
    def setOrganizationsVarargs(value: SchemaOrganization*): Self = this.set("organizations", js.Array(value :_*))
    @scala.inline
    def setOrganizations(value: js.Array[SchemaOrganization]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizations: Self = this.set("organizations", js.undefined)
    @scala.inline
    def setPhoneNumbersVarargs(value: SchemaPhoneNumber*): Self = this.set("phoneNumbers", js.Array(value :_*))
    @scala.inline
    def setPhoneNumbers(value: js.Array[SchemaPhoneNumber]): Self = this.set("phoneNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumbers: Self = this.set("phoneNumbers", js.undefined)
    @scala.inline
    def setPhotosVarargs(value: SchemaPhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[SchemaPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    @scala.inline
    def setRelationsVarargs(value: SchemaRelation*): Self = this.set("relations", js.Array(value :_*))
    @scala.inline
    def setRelations(value: js.Array[SchemaRelation]): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    @scala.inline
    def setRelationshipInterestsVarargs(value: SchemaRelationshipInterest*): Self = this.set("relationshipInterests", js.Array(value :_*))
    @scala.inline
    def setRelationshipInterests(value: js.Array[SchemaRelationshipInterest]): Self = this.set("relationshipInterests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipInterests: Self = this.set("relationshipInterests", js.undefined)
    @scala.inline
    def setRelationshipStatusesVarargs(value: SchemaRelationshipStatus*): Self = this.set("relationshipStatuses", js.Array(value :_*))
    @scala.inline
    def setRelationshipStatuses(value: js.Array[SchemaRelationshipStatus]): Self = this.set("relationshipStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipStatuses: Self = this.set("relationshipStatuses", js.undefined)
    @scala.inline
    def setResidencesVarargs(value: SchemaResidence*): Self = this.set("residences", js.Array(value :_*))
    @scala.inline
    def setResidences(value: js.Array[SchemaResidence]): Self = this.set("residences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidences: Self = this.set("residences", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setSipAddressesVarargs(value: SchemaSipAddress*): Self = this.set("sipAddresses", js.Array(value :_*))
    @scala.inline
    def setSipAddresses(value: js.Array[SchemaSipAddress]): Self = this.set("sipAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSipAddresses: Self = this.set("sipAddresses", js.undefined)
    @scala.inline
    def setSkillsVarargs(value: SchemaSkill*): Self = this.set("skills", js.Array(value :_*))
    @scala.inline
    def setSkills(value: js.Array[SchemaSkill]): Self = this.set("skills", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkills: Self = this.set("skills", js.undefined)
    @scala.inline
    def setTaglinesVarargs(value: SchemaTagline*): Self = this.set("taglines", js.Array(value :_*))
    @scala.inline
    def setTaglines(value: js.Array[SchemaTagline]): Self = this.set("taglines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaglines: Self = this.set("taglines", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: SchemaUrl*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[SchemaUrl]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    @scala.inline
    def setUserDefinedVarargs(value: SchemaUserDefined*): Self = this.set("userDefined", js.Array(value :_*))
    @scala.inline
    def setUserDefined(value: js.Array[SchemaUserDefined]): Self = this.set("userDefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDefined: Self = this.set("userDefined", js.undefined)
  }
  
}

