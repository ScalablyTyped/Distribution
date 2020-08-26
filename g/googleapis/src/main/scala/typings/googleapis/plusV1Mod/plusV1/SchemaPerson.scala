package typings.googleapis.plusV1Mod.plusV1

import typings.googleapis.anon.CoverInfo
import typings.googleapis.anon.Department
import typings.googleapis.anon.Formatted
import typings.googleapis.anon.IsDefault
import typings.googleapis.anon.LabelType
import typings.googleapis.anon.Min
import typings.googleapis.anon.Primary
import typings.googleapis.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPerson extends js.Object {
  /**
    * A short biography for this person.
    */
  var aboutMe: js.UndefOr[String] = js.native
  /**
    * The age range of the person. Valid ranges are 17 or younger, 18 to 20,
    * and 21 or older. Age is determined from the user&#39;s birthday using
    * Western age reckoning.
    */
  var ageRange: js.UndefOr[Min] = js.native
  /**
    * The person&#39;s date of birth, represented as YYYY-MM-DD.
    */
  var birthday: js.UndefOr[String] = js.native
  /**
    * The &quot;bragging rights&quot; line of this person.
    */
  var braggingRights: js.UndefOr[String] = js.native
  /**
    * For followers who are visible, the number of people who have added this
    * person or page to a circle.
    */
  var circledByCount: js.UndefOr[Double] = js.native
  /**
    * The cover photo content.
    */
  var cover: js.UndefOr[CoverInfo] = js.native
  /**
    * (this field is not currently used)
    */
  var currentLocation: js.UndefOr[String] = js.native
  /**
    * The name of this person, which is suitable for display.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The hosted domain name for the user&#39;s Google Apps account. For
    * instance, example.com. The plus.profile.emails.read or email scope is
    * needed to get this domain name.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * A list of email addresses that this person has, including their Google
    * account email address, and the public verified email addresses on their
    * Google+ profile. The plus.profile.emails.read scope is needed to retrieve
    * these email addresses, or the email scope can be used to retrieve just
    * the Google account email address.
    */
  var emails: js.UndefOr[js.Array[Value]] = js.native
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The person&#39;s gender. Possible values include, but are not limited to,
    * the following values:   - &quot;male&quot; - Male gender.  -
    * &quot;female&quot; - Female gender.  - &quot;other&quot; - Other.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The ID of this person.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The representation of the person&#39;s profile photo.
    */
  var image: js.UndefOr[IsDefault] = js.native
  /**
    * Whether this user has signed up for Google+.
    */
  var isPlusUser: js.UndefOr[Boolean] = js.native
  /**
    * Identifies this resource as a person. Value: &quot;plus#person&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The user&#39;s preferred language for rendering.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * An object representation of the individual components of a person&#39;s
    * name.
    */
  var name: js.UndefOr[Formatted] = js.native
  /**
    * The nickname of this person.
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * Type of person within Google+. Possible values include, but are not
    * limited to, the following values:   - &quot;person&quot; - represents an
    * actual person.  - &quot;page&quot; - represents a page.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * The occupation of this person.
    */
  var occupation: js.UndefOr[String] = js.native
  /**
    * A list of current or past organizations with which this person is
    * associated.
    */
  var organizations: js.UndefOr[js.Array[Department]] = js.native
  /**
    * A list of places where this person has lived.
    */
  var placesLived: js.UndefOr[js.Array[Primary]] = js.native
  /**
    * If a Google+ Page, the number of people who have +1&#39;d this page.
    */
  var plusOneCount: js.UndefOr[Double] = js.native
  /**
    * The person&#39;s relationship status. Possible values include, but are
    * not limited to, the following values:   - &quot;single&quot; - Person is
    * single.  - &quot;in_a_relationship&quot; - Person is in a relationship.
    * - &quot;engaged&quot; - Person is engaged.  - &quot;married&quot; -
    * Person is married.  - &quot;its_complicated&quot; - The relationship is
    * complicated.  - &quot;open_relationship&quot; - Person is in an open
    * relationship.  - &quot;widowed&quot; - Person is widowed.  -
    * &quot;in_domestic_partnership&quot; - Person is in a domestic
    * partnership.  - &quot;in_civil_union&quot; - Person is in a civil union.
    */
  var relationshipStatus: js.UndefOr[String] = js.native
  /**
    * The person&#39;s skills.
    */
  var skills: js.UndefOr[String] = js.native
  /**
    * The brief description (tagline) of this person.
    */
  var tagline: js.UndefOr[String] = js.native
  /**
    * The URL of this person&#39;s profile.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * A list of URLs for this person.
    */
  var urls: js.UndefOr[js.Array[LabelType]] = js.native
  /**
    * Whether the person or Google+ Page has been verified.
    */
  var verified: js.UndefOr[Boolean] = js.native
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
    def setAboutMe(value: String): Self = this.set("aboutMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAboutMe: Self = this.set("aboutMe", js.undefined)
    @scala.inline
    def setAgeRange(value: Min): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeRange: Self = this.set("ageRange", js.undefined)
    @scala.inline
    def setBirthday(value: String): Self = this.set("birthday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    @scala.inline
    def setBraggingRights(value: String): Self = this.set("braggingRights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraggingRights: Self = this.set("braggingRights", js.undefined)
    @scala.inline
    def setCircledByCount(value: Double): Self = this.set("circledByCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircledByCount: Self = this.set("circledByCount", js.undefined)
    @scala.inline
    def setCover(value: CoverInfo): Self = this.set("cover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    @scala.inline
    def setCurrentLocation(value: String): Self = this.set("currentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLocation: Self = this.set("currentLocation", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEmailsVarargs(value: Value*): Self = this.set("emails", js.Array(value :_*))
    @scala.inline
    def setEmails(value: js.Array[Value]): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: IsDefault): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setIsPlusUser(value: Boolean): Self = this.set("isPlusUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPlusUser: Self = this.set("isPlusUser", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setName(value: Formatted): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setOccupation(value: String): Self = this.set("occupation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccupation: Self = this.set("occupation", js.undefined)
    @scala.inline
    def setOrganizationsVarargs(value: Department*): Self = this.set("organizations", js.Array(value :_*))
    @scala.inline
    def setOrganizations(value: js.Array[Department]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizations: Self = this.set("organizations", js.undefined)
    @scala.inline
    def setPlacesLivedVarargs(value: Primary*): Self = this.set("placesLived", js.Array(value :_*))
    @scala.inline
    def setPlacesLived(value: js.Array[Primary]): Self = this.set("placesLived", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacesLived: Self = this.set("placesLived", js.undefined)
    @scala.inline
    def setPlusOneCount(value: Double): Self = this.set("plusOneCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlusOneCount: Self = this.set("plusOneCount", js.undefined)
    @scala.inline
    def setRelationshipStatus(value: String): Self = this.set("relationshipStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipStatus: Self = this.set("relationshipStatus", js.undefined)
    @scala.inline
    def setSkills(value: String): Self = this.set("skills", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkills: Self = this.set("skills", js.undefined)
    @scala.inline
    def setTagline(value: String): Self = this.set("tagline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagline: Self = this.set("tagline", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: LabelType*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[LabelType]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
  }
  
}

