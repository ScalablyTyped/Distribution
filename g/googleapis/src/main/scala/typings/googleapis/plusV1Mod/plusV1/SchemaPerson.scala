package typings.googleapis.plusV1Mod.plusV1

import typings.googleapis.anon.CoverInfo
import typings.googleapis.anon.Department
import typings.googleapis.anon.Formatted
import typings.googleapis.anon.IsDefault
import typings.googleapis.anon.LabelType
import typings.googleapis.anon.Max
import typings.googleapis.anon.Primary
import typings.googleapis.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerson extends StObject {
  
  /**
    * A short biography for this person.
    */
  var aboutMe: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The age range of the person. Valid ranges are 17 or younger, 18 to 20, and 21 or older. Age is determined from the user&#39;s birthday using Western age reckoning.
    */
  var ageRange: js.UndefOr[Max | Null] = js.undefined
  
  /**
    * The person&#39;s date of birth, represented as YYYY-MM-DD.
    */
  var birthday: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The &quot;bragging rights&quot; line of this person.
    */
  var braggingRights: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For followers who are visible, the number of people who have added this person or page to a circle.
    */
  var circledByCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The cover photo content.
    */
  var cover: js.UndefOr[CoverInfo | Null] = js.undefined
  
  /**
    * (this field is not currently used)
    */
  var currentLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this person, which is suitable for display.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hosted domain name for the user&#39;s Google Apps account. For instance, example.com. The plus.profile.emails.read or email scope is needed to get this domain name.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of email addresses that this person has, including their Google account email address, and the public verified email addresses on their Google+ profile. The plus.profile.emails.read scope is needed to retrieve these email addresses, or the email scope can be used to retrieve just the Google account email address.
    */
  var emails: js.UndefOr[js.Array[Value] | Null] = js.undefined
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The person&#39;s gender. Possible values include, but are not limited to, the following values:   - &quot;male&quot; - Male gender.  - &quot;female&quot; - Female gender.  - &quot;other&quot; - Other.
    */
  var gender: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of this person.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The representation of the person&#39;s profile photo.
    */
  var image: js.UndefOr[IsDefault | Null] = js.undefined
  
  /**
    * Whether this user has signed up for Google+.
    */
  var isPlusUser: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies this resource as a person. Value: &quot;plus#person&quot;.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user&#39;s preferred language for rendering.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An object representation of the individual components of a person&#39;s name.
    */
  var name: js.UndefOr[Formatted | Null] = js.undefined
  
  /**
    * The nickname of this person.
    */
  var nickname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of person within Google+. Possible values include, but are not limited to, the following values:   - &quot;person&quot; - represents an actual person.  - &quot;page&quot; - represents a page.
    */
  var objectType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The occupation of this person.
    */
  var occupation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of current or past organizations with which this person is associated.
    */
  var organizations: js.UndefOr[js.Array[Department] | Null] = js.undefined
  
  /**
    * A list of places where this person has lived.
    */
  var placesLived: js.UndefOr[js.Array[Primary] | Null] = js.undefined
  
  /**
    * If a Google+ Page, the number of people who have +1&#39;d this page.
    */
  var plusOneCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The person&#39;s relationship status. Possible values include, but are not limited to, the following values:   - &quot;single&quot; - Person is single.  - &quot;in_a_relationship&quot; - Person is in a relationship.  - &quot;engaged&quot; - Person is engaged.  - &quot;married&quot; - Person is married.  - &quot;its_complicated&quot; - The relationship is complicated.  - &quot;open_relationship&quot; - Person is in an open relationship.  - &quot;widowed&quot; - Person is widowed.  - &quot;in_domestic_partnership&quot; - Person is in a domestic partnership.  - &quot;in_civil_union&quot; - Person is in a civil union.
    */
  var relationshipStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The person&#39;s skills.
    */
  var skills: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The brief description (tagline) of this person.
    */
  var tagline: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of this person&#39;s profile.
    */
  var url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of URLs for this person.
    */
  var urls: js.UndefOr[js.Array[LabelType] | Null] = js.undefined
  
  /**
    * Whether the person or Google+ Page has been verified.
    */
  var verified: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPerson {
  
  inline def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  
  extension [Self <: SchemaPerson](x: Self) {
    
    inline def setAboutMe(value: String): Self = StObject.set(x, "aboutMe", value.asInstanceOf[js.Any])
    
    inline def setAboutMeNull: Self = StObject.set(x, "aboutMe", null)
    
    inline def setAboutMeUndefined: Self = StObject.set(x, "aboutMe", js.undefined)
    
    inline def setAgeRange(value: Max): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeNull: Self = StObject.set(x, "ageRange", null)
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    inline def setBirthdayNull: Self = StObject.set(x, "birthday", null)
    
    inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    inline def setBraggingRights(value: String): Self = StObject.set(x, "braggingRights", value.asInstanceOf[js.Any])
    
    inline def setBraggingRightsNull: Self = StObject.set(x, "braggingRights", null)
    
    inline def setBraggingRightsUndefined: Self = StObject.set(x, "braggingRights", js.undefined)
    
    inline def setCircledByCount(value: Double): Self = StObject.set(x, "circledByCount", value.asInstanceOf[js.Any])
    
    inline def setCircledByCountNull: Self = StObject.set(x, "circledByCount", null)
    
    inline def setCircledByCountUndefined: Self = StObject.set(x, "circledByCount", js.undefined)
    
    inline def setCover(value: CoverInfo): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setCoverNull: Self = StObject.set(x, "cover", null)
    
    inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
    
    inline def setCurrentLocation(value: String): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    inline def setCurrentLocationNull: Self = StObject.set(x, "currentLocation", null)
    
    inline def setCurrentLocationUndefined: Self = StObject.set(x, "currentLocation", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEmails(value: js.Array[Value]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsNull: Self = StObject.set(x, "emails", null)
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: Value*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderNull: Self = StObject.set(x, "gender", null)
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: IsDefault): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setIsPlusUser(value: Boolean): Self = StObject.set(x, "isPlusUser", value.asInstanceOf[js.Any])
    
    inline def setIsPlusUserNull: Self = StObject.set(x, "isPlusUser", null)
    
    inline def setIsPlusUserUndefined: Self = StObject.set(x, "isPlusUser", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: Formatted): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameNull: Self = StObject.set(x, "nickname", null)
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOccupation(value: String): Self = StObject.set(x, "occupation", value.asInstanceOf[js.Any])
    
    inline def setOccupationNull: Self = StObject.set(x, "occupation", null)
    
    inline def setOccupationUndefined: Self = StObject.set(x, "occupation", js.undefined)
    
    inline def setOrganizations(value: js.Array[Department]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsNull: Self = StObject.set(x, "organizations", null)
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOrganizationsVarargs(value: Department*): Self = StObject.set(x, "organizations", js.Array(value*))
    
    inline def setPlacesLived(value: js.Array[Primary]): Self = StObject.set(x, "placesLived", value.asInstanceOf[js.Any])
    
    inline def setPlacesLivedNull: Self = StObject.set(x, "placesLived", null)
    
    inline def setPlacesLivedUndefined: Self = StObject.set(x, "placesLived", js.undefined)
    
    inline def setPlacesLivedVarargs(value: Primary*): Self = StObject.set(x, "placesLived", js.Array(value*))
    
    inline def setPlusOneCount(value: Double): Self = StObject.set(x, "plusOneCount", value.asInstanceOf[js.Any])
    
    inline def setPlusOneCountNull: Self = StObject.set(x, "plusOneCount", null)
    
    inline def setPlusOneCountUndefined: Self = StObject.set(x, "plusOneCount", js.undefined)
    
    inline def setRelationshipStatus(value: String): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusNull: Self = StObject.set(x, "relationshipStatus", null)
    
    inline def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
    
    inline def setSkills(value: String): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    inline def setSkillsNull: Self = StObject.set(x, "skills", null)
    
    inline def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
    
    inline def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    
    inline def setTaglineNull: Self = StObject.set(x, "tagline", null)
    
    inline def setTaglineUndefined: Self = StObject.set(x, "tagline", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrls(value: js.Array[LabelType]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsNull: Self = StObject.set(x, "urls", null)
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: LabelType*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedNull: Self = StObject.set(x, "verified", null)
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
