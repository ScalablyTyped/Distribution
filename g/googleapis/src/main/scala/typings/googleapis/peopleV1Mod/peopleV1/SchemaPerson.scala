package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a person merged from various data sources such as the
  * authenticated user&#39;s contacts and profile data.  Most fields can have
  * multiple items. The items in a field have no guaranteed order, but each
  * non-empty field is guaranteed to have exactly one field with
  * `metadata.primary` set to true.
  */
@js.native
trait SchemaPerson extends StObject {
  
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
  implicit class SchemaPersonMutableBuilder[Self <: SchemaPerson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[SchemaAddress]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: SchemaAddress*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    @scala.inline
    def setAgeRanges(value: js.Array[SchemaAgeRangeType]): Self = StObject.set(x, "ageRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeRangesUndefined: Self = StObject.set(x, "ageRanges", js.undefined)
    
    @scala.inline
    def setAgeRangesVarargs(value: SchemaAgeRangeType*): Self = StObject.set(x, "ageRanges", js.Array(value :_*))
    
    @scala.inline
    def setBiographies(value: js.Array[SchemaBiography]): Self = StObject.set(x, "biographies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiographiesUndefined: Self = StObject.set(x, "biographies", js.undefined)
    
    @scala.inline
    def setBiographiesVarargs(value: SchemaBiography*): Self = StObject.set(x, "biographies", js.Array(value :_*))
    
    @scala.inline
    def setBirthdays(value: js.Array[SchemaBirthday]): Self = StObject.set(x, "birthdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthdaysUndefined: Self = StObject.set(x, "birthdays", js.undefined)
    
    @scala.inline
    def setBirthdaysVarargs(value: SchemaBirthday*): Self = StObject.set(x, "birthdays", js.Array(value :_*))
    
    @scala.inline
    def setBraggingRights(value: js.Array[SchemaBraggingRights]): Self = StObject.set(x, "braggingRights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBraggingRightsUndefined: Self = StObject.set(x, "braggingRights", js.undefined)
    
    @scala.inline
    def setBraggingRightsVarargs(value: SchemaBraggingRights*): Self = StObject.set(x, "braggingRights", js.Array(value :_*))
    
    @scala.inline
    def setCoverPhotos(value: js.Array[SchemaCoverPhoto]): Self = StObject.set(x, "coverPhotos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverPhotosUndefined: Self = StObject.set(x, "coverPhotos", js.undefined)
    
    @scala.inline
    def setCoverPhotosVarargs(value: SchemaCoverPhoto*): Self = StObject.set(x, "coverPhotos", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddresses(value: js.Array[SchemaEmailAddress]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    @scala.inline
    def setEmailAddressesVarargs(value: SchemaEmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[SchemaEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: SchemaEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setGenders(value: js.Array[SchemaGender]): Self = StObject.set(x, "genders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGendersUndefined: Self = StObject.set(x, "genders", js.undefined)
    
    @scala.inline
    def setGendersVarargs(value: SchemaGender*): Self = StObject.set(x, "genders", js.Array(value :_*))
    
    @scala.inline
    def setImClients(value: js.Array[SchemaImClient]): Self = StObject.set(x, "imClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImClientsUndefined: Self = StObject.set(x, "imClients", js.undefined)
    
    @scala.inline
    def setImClientsVarargs(value: SchemaImClient*): Self = StObject.set(x, "imClients", js.Array(value :_*))
    
    @scala.inline
    def setInterests(value: js.Array[SchemaInterest]): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterestsUndefined: Self = StObject.set(x, "interests", js.undefined)
    
    @scala.inline
    def setInterestsVarargs(value: SchemaInterest*): Self = StObject.set(x, "interests", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[SchemaLocale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: SchemaLocale*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    @scala.inline
    def setMemberships(value: js.Array[SchemaMembership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    @scala.inline
    def setMembershipsVarargs(value: SchemaMembership*): Self = StObject.set(x, "memberships", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: SchemaPersonMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNames(value: js.Array[SchemaName]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: SchemaName*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setNicknames(value: js.Array[SchemaNickname]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknamesUndefined: Self = StObject.set(x, "nicknames", js.undefined)
    
    @scala.inline
    def setNicknamesVarargs(value: SchemaNickname*): Self = StObject.set(x, "nicknames", js.Array(value :_*))
    
    @scala.inline
    def setOccupations(value: js.Array[SchemaOccupation]): Self = StObject.set(x, "occupations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupationsUndefined: Self = StObject.set(x, "occupations", js.undefined)
    
    @scala.inline
    def setOccupationsVarargs(value: SchemaOccupation*): Self = StObject.set(x, "occupations", js.Array(value :_*))
    
    @scala.inline
    def setOrganizations(value: js.Array[SchemaOrganization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    @scala.inline
    def setOrganizationsVarargs(value: SchemaOrganization*): Self = StObject.set(x, "organizations", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumbers(value: js.Array[SchemaPhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    @scala.inline
    def setPhoneNumbersVarargs(value: SchemaPhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[SchemaPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: SchemaPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    @scala.inline
    def setRelations(value: js.Array[SchemaRelation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    @scala.inline
    def setRelationsVarargs(value: SchemaRelation*): Self = StObject.set(x, "relations", js.Array(value :_*))
    
    @scala.inline
    def setRelationshipInterests(value: js.Array[SchemaRelationshipInterest]): Self = StObject.set(x, "relationshipInterests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipInterestsUndefined: Self = StObject.set(x, "relationshipInterests", js.undefined)
    
    @scala.inline
    def setRelationshipInterestsVarargs(value: SchemaRelationshipInterest*): Self = StObject.set(x, "relationshipInterests", js.Array(value :_*))
    
    @scala.inline
    def setRelationshipStatuses(value: js.Array[SchemaRelationshipStatus]): Self = StObject.set(x, "relationshipStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipStatusesUndefined: Self = StObject.set(x, "relationshipStatuses", js.undefined)
    
    @scala.inline
    def setRelationshipStatusesVarargs(value: SchemaRelationshipStatus*): Self = StObject.set(x, "relationshipStatuses", js.Array(value :_*))
    
    @scala.inline
    def setResidences(value: js.Array[SchemaResidence]): Self = StObject.set(x, "residences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResidencesUndefined: Self = StObject.set(x, "residences", js.undefined)
    
    @scala.inline
    def setResidencesVarargs(value: SchemaResidence*): Self = StObject.set(x, "residences", js.Array(value :_*))
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setSipAddresses(value: js.Array[SchemaSipAddress]): Self = StObject.set(x, "sipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipAddressesUndefined: Self = StObject.set(x, "sipAddresses", js.undefined)
    
    @scala.inline
    def setSipAddressesVarargs(value: SchemaSipAddress*): Self = StObject.set(x, "sipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSkills(value: js.Array[SchemaSkill]): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
    
    @scala.inline
    def setSkillsVarargs(value: SchemaSkill*): Self = StObject.set(x, "skills", js.Array(value :_*))
    
    @scala.inline
    def setTaglines(value: js.Array[SchemaTagline]): Self = StObject.set(x, "taglines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaglinesUndefined: Self = StObject.set(x, "taglines", js.undefined)
    
    @scala.inline
    def setTaglinesVarargs(value: SchemaTagline*): Self = StObject.set(x, "taglines", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[SchemaUrl]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: SchemaUrl*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    @scala.inline
    def setUserDefined(value: js.Array[SchemaUserDefined]): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
    
    @scala.inline
    def setUserDefinedVarargs(value: SchemaUserDefined*): Self = StObject.set(x, "userDefined", js.Array(value :_*))
  }
}
