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
  def apply(
    addresses: js.Array[SchemaAddress] = null,
    ageRange: String = null,
    ageRanges: js.Array[SchemaAgeRangeType] = null,
    biographies: js.Array[SchemaBiography] = null,
    birthdays: js.Array[SchemaBirthday] = null,
    braggingRights: js.Array[SchemaBraggingRights] = null,
    coverPhotos: js.Array[SchemaCoverPhoto] = null,
    emailAddresses: js.Array[SchemaEmailAddress] = null,
    etag: String = null,
    events: js.Array[SchemaEvent] = null,
    genders: js.Array[SchemaGender] = null,
    imClients: js.Array[SchemaImClient] = null,
    interests: js.Array[SchemaInterest] = null,
    locales: js.Array[SchemaLocale] = null,
    memberships: js.Array[SchemaMembership] = null,
    metadata: SchemaPersonMetadata = null,
    names: js.Array[SchemaName] = null,
    nicknames: js.Array[SchemaNickname] = null,
    occupations: js.Array[SchemaOccupation] = null,
    organizations: js.Array[SchemaOrganization] = null,
    phoneNumbers: js.Array[SchemaPhoneNumber] = null,
    photos: js.Array[SchemaPhoto] = null,
    relations: js.Array[SchemaRelation] = null,
    relationshipInterests: js.Array[SchemaRelationshipInterest] = null,
    relationshipStatuses: js.Array[SchemaRelationshipStatus] = null,
    residences: js.Array[SchemaResidence] = null,
    resourceName: String = null,
    sipAddresses: js.Array[SchemaSipAddress] = null,
    skills: js.Array[SchemaSkill] = null,
    taglines: js.Array[SchemaTagline] = null,
    urls: js.Array[SchemaUrl] = null,
    userDefined: js.Array[SchemaUserDefined] = null
  ): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange.asInstanceOf[js.Any])
    if (ageRanges != null) __obj.updateDynamic("ageRanges")(ageRanges.asInstanceOf[js.Any])
    if (biographies != null) __obj.updateDynamic("biographies")(biographies.asInstanceOf[js.Any])
    if (birthdays != null) __obj.updateDynamic("birthdays")(birthdays.asInstanceOf[js.Any])
    if (braggingRights != null) __obj.updateDynamic("braggingRights")(braggingRights.asInstanceOf[js.Any])
    if (coverPhotos != null) __obj.updateDynamic("coverPhotos")(coverPhotos.asInstanceOf[js.Any])
    if (emailAddresses != null) __obj.updateDynamic("emailAddresses")(emailAddresses.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (genders != null) __obj.updateDynamic("genders")(genders.asInstanceOf[js.Any])
    if (imClients != null) __obj.updateDynamic("imClients")(imClients.asInstanceOf[js.Any])
    if (interests != null) __obj.updateDynamic("interests")(interests.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (memberships != null) __obj.updateDynamic("memberships")(memberships.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (nicknames != null) __obj.updateDynamic("nicknames")(nicknames.asInstanceOf[js.Any])
    if (occupations != null) __obj.updateDynamic("occupations")(occupations.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (phoneNumbers != null) __obj.updateDynamic("phoneNumbers")(phoneNumbers.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    if (relationshipInterests != null) __obj.updateDynamic("relationshipInterests")(relationshipInterests.asInstanceOf[js.Any])
    if (relationshipStatuses != null) __obj.updateDynamic("relationshipStatuses")(relationshipStatuses.asInstanceOf[js.Any])
    if (residences != null) __obj.updateDynamic("residences")(residences.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (sipAddresses != null) __obj.updateDynamic("sipAddresses")(sipAddresses.asInstanceOf[js.Any])
    if (skills != null) __obj.updateDynamic("skills")(skills.asInstanceOf[js.Any])
    if (taglines != null) __obj.updateDynamic("taglines")(taglines.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (userDefined != null) __obj.updateDynamic("userDefined")(userDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPerson]
  }
}

