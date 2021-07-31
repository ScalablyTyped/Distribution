package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.anon.CoverInfo
import typings.googleapis.anon.Department
import typings.googleapis.anon.Formatted
import typings.googleapis.anon.IsDefault
import typings.googleapis.anon.LabelType
import typings.googleapis.anon.Primary
import typings.googleapis.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerson extends StObject {
  
  /**
    * A short biography for this person.
    */
  var aboutMe: js.UndefOr[String] = js.undefined
  
  /**
    * The person&#39;s date of birth, represented as YYYY-MM-DD.
    */
  var birthday: js.UndefOr[String] = js.undefined
  
  /**
    * The &quot;bragging rights&quot; line of this person.
    */
  var braggingRights: js.UndefOr[String] = js.undefined
  
  /**
    * For followers who are visible, the number of people who have added this
    * person or page to a circle.
    */
  var circledByCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The cover photo content.
    */
  var cover: js.UndefOr[CoverInfo] = js.undefined
  
  /**
    * (this field is not currently used)
    */
  var currentLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this person, which is suitable for display.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The hosted domain name for the user&#39;s Google Apps account. For
    * instance, example.com. The plus.profile.emails.read or email scope is
    * needed to get this domain name.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * A list of email addresses that this person has, including their Google
    * account email address, and the public verified email addresses on their
    * Google+ profile. The plus.profile.emails.read scope is needed to retrieve
    * these email addresses, or the email scope can be used to retrieve just
    * the Google account email address.
    */
  var emails: js.UndefOr[js.Array[Value]] = js.undefined
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The person&#39;s gender. Possible values include, but are not limited to,
    * the following values:   - &quot;male&quot; - Male gender.  -
    * &quot;female&quot; - Female gender.  - &quot;other&quot; - Other.
    */
  var gender: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of this person.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The representation of the person&#39;s profile photo.
    */
  var image: js.UndefOr[IsDefault] = js.undefined
  
  /**
    * Whether this user has signed up for Google+.
    */
  var isPlusUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies this resource as a person. Value: &quot;plus#person&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * An object representation of the individual components of a person&#39;s
    * name.
    */
  var name: js.UndefOr[Formatted] = js.undefined
  
  /**
    * The nickname of this person.
    */
  var nickname: js.UndefOr[String] = js.undefined
  
  /**
    * Type of person within Google+. Possible values include, but are not
    * limited to, the following values:   - &quot;person&quot; - represents an
    * actual person.  - &quot;page&quot; - represents a page.
    */
  var objectType: js.UndefOr[String] = js.undefined
  
  /**
    * The occupation of this person.
    */
  var occupation: js.UndefOr[String] = js.undefined
  
  /**
    * A list of current or past organizations with which this person is
    * associated.
    */
  var organizations: js.UndefOr[js.Array[Department]] = js.undefined
  
  /**
    * A list of places where this person has lived.
    */
  var placesLived: js.UndefOr[js.Array[Primary]] = js.undefined
  
  /**
    * If a Google+ Page, the number of people who have +1&#39;d this page.
    */
  var plusOneCount: js.UndefOr[Double] = js.undefined
  
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
  var relationshipStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The person&#39;s skills.
    */
  var skills: js.UndefOr[String] = js.undefined
  
  /**
    * The brief description (tagline) of this person.
    */
  var tagline: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of this person&#39;s profile.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * A list of URLs for this person.
    */
  var urls: js.UndefOr[js.Array[LabelType]] = js.undefined
  
  /**
    * Whether the person or Google+ Page has been verified.
    */
  var verified: js.UndefOr[Boolean] = js.undefined
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
    def setAboutMe(value: String): Self = StObject.set(x, "aboutMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutMeUndefined: Self = StObject.set(x, "aboutMe", js.undefined)
    
    @scala.inline
    def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    @scala.inline
    def setBraggingRights(value: String): Self = StObject.set(x, "braggingRights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBraggingRightsUndefined: Self = StObject.set(x, "braggingRights", js.undefined)
    
    @scala.inline
    def setCircledByCount(value: Double): Self = StObject.set(x, "circledByCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircledByCountUndefined: Self = StObject.set(x, "circledByCount", js.undefined)
    
    @scala.inline
    def setCover(value: CoverInfo): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
    
    @scala.inline
    def setCurrentLocation(value: String): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLocationUndefined: Self = StObject.set(x, "currentLocation", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmails(value: js.Array[Value]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: Value*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: IsDefault): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setIsPlusUser(value: Boolean): Self = StObject.set(x, "isPlusUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPlusUserUndefined: Self = StObject.set(x, "isPlusUser", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: Formatted): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setOccupation(value: String): Self = StObject.set(x, "occupation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupationUndefined: Self = StObject.set(x, "occupation", js.undefined)
    
    @scala.inline
    def setOrganizations(value: js.Array[Department]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    @scala.inline
    def setOrganizationsVarargs(value: Department*): Self = StObject.set(x, "organizations", js.Array(value :_*))
    
    @scala.inline
    def setPlacesLived(value: js.Array[Primary]): Self = StObject.set(x, "placesLived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesLivedUndefined: Self = StObject.set(x, "placesLived", js.undefined)
    
    @scala.inline
    def setPlacesLivedVarargs(value: Primary*): Self = StObject.set(x, "placesLived", js.Array(value :_*))
    
    @scala.inline
    def setPlusOneCount(value: Double): Self = StObject.set(x, "plusOneCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlusOneCountUndefined: Self = StObject.set(x, "plusOneCount", js.undefined)
    
    @scala.inline
    def setRelationshipStatus(value: String): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
    
    @scala.inline
    def setSkills(value: String): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
    
    @scala.inline
    def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaglineUndefined: Self = StObject.set(x, "tagline", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[LabelType]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: LabelType*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
