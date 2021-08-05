package typings.googleapis.plusV1Mod.plusV1

import typings.googleapis.anon.CoverInfo
import typings.googleapis.anon.Department
import typings.googleapis.anon.Formatted
import typings.googleapis.anon.IsDefault
import typings.googleapis.anon.LabelType
import typings.googleapis.anon.Min
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
    * The age range of the person. Valid ranges are 17 or younger, 18 to 20,
    * and 21 or older. Age is determined from the user&#39;s birthday using
    * Western age reckoning.
    */
  var ageRange: js.UndefOr[Min] = js.undefined
  
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
    * The user&#39;s preferred language for rendering.
    */
  var language: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  
  extension [Self <: SchemaPerson](x: Self) {
    
    inline def setAboutMe(value: String): Self = StObject.set(x, "aboutMe", value.asInstanceOf[js.Any])
    
    inline def setAboutMeUndefined: Self = StObject.set(x, "aboutMe", js.undefined)
    
    inline def setAgeRange(value: Min): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    inline def setBraggingRights(value: String): Self = StObject.set(x, "braggingRights", value.asInstanceOf[js.Any])
    
    inline def setBraggingRightsUndefined: Self = StObject.set(x, "braggingRights", js.undefined)
    
    inline def setCircledByCount(value: Double): Self = StObject.set(x, "circledByCount", value.asInstanceOf[js.Any])
    
    inline def setCircledByCountUndefined: Self = StObject.set(x, "circledByCount", js.undefined)
    
    inline def setCover(value: CoverInfo): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
    
    inline def setCurrentLocation(value: String): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    inline def setCurrentLocationUndefined: Self = StObject.set(x, "currentLocation", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEmails(value: js.Array[Value]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: Value*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: IsDefault): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setIsPlusUser(value: Boolean): Self = StObject.set(x, "isPlusUser", value.asInstanceOf[js.Any])
    
    inline def setIsPlusUserUndefined: Self = StObject.set(x, "isPlusUser", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: Formatted): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOccupation(value: String): Self = StObject.set(x, "occupation", value.asInstanceOf[js.Any])
    
    inline def setOccupationUndefined: Self = StObject.set(x, "occupation", js.undefined)
    
    inline def setOrganizations(value: js.Array[Department]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOrganizationsVarargs(value: Department*): Self = StObject.set(x, "organizations", js.Array(value :_*))
    
    inline def setPlacesLived(value: js.Array[Primary]): Self = StObject.set(x, "placesLived", value.asInstanceOf[js.Any])
    
    inline def setPlacesLivedUndefined: Self = StObject.set(x, "placesLived", js.undefined)
    
    inline def setPlacesLivedVarargs(value: Primary*): Self = StObject.set(x, "placesLived", js.Array(value :_*))
    
    inline def setPlusOneCount(value: Double): Self = StObject.set(x, "plusOneCount", value.asInstanceOf[js.Any])
    
    inline def setPlusOneCountUndefined: Self = StObject.set(x, "plusOneCount", js.undefined)
    
    inline def setRelationshipStatus(value: String): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
    
    inline def setSkills(value: String): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    inline def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
    
    inline def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    
    inline def setTaglineUndefined: Self = StObject.set(x, "tagline", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrls(value: js.Array[LabelType]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: LabelType*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
