package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.anon.Attachments
import typings.googleapis.anon.ClientSpecificActorInfo
import typings.googleapis.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaActivity extends StObject {
  
  /**
    * Identifies who has access to see this activity.
    */
  var access: js.UndefOr[SchemaAcl] = js.native
  
  /**
    * The person who performed this activity.
    */
  var actor: js.UndefOr[ClientSpecificActorInfo] = js.native
  
  /**
    * Street address where this activity occurred.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Additional content added by the person who shared this activity,
    * applicable only when resharing an activity.
    */
  var annotation: js.UndefOr[String] = js.native
  
  /**
    * If this activity is a crosspost from another system, this property
    * specifies the ID of the original activity.
    */
  var crosspostSource: js.UndefOr[String] = js.native
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Latitude and longitude where this activity occurred. Format is latitude
    * followed by longitude, space separated.
    */
  var geocode: js.UndefOr[String] = js.native
  
  /**
    * The ID of this activity.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies this resource as an activity. Value:
    * &quot;plus#activity&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The location where this activity occurred.
    */
  var location: js.UndefOr[SchemaPlace] = js.native
  
  /**
    * The object of this activity.
    */
  var `object`: js.UndefOr[Attachments] = js.native
  
  /**
    * ID of the place where this activity occurred.
    */
  var placeId: js.UndefOr[String] = js.native
  
  /**
    * Name of the place where this activity occurred.
    */
  var placeName: js.UndefOr[String] = js.native
  
  /**
    * The service provider that initially published this activity.
    */
  var provider: js.UndefOr[Title] = js.native
  
  /**
    * The time at which this activity was initially published. Formatted as an
    * RFC 3339 timestamp.
    */
  var published: js.UndefOr[String] = js.native
  
  /**
    * Radius, in meters, of the region where this activity occurred, centered
    * at the latitude and longitude identified in geocode.
    */
  var radius: js.UndefOr[String] = js.native
  
  /**
    * Title of this activity.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The time at which this activity was last updated. Formatted as an RFC
    * 3339 timestamp.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * The link to this activity.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * This activity&#39;s verb, which indicates the action that was performed.
    * Possible values include, but are not limited to, the following values: -
    * &quot;post&quot; - Publish content to the stream.  - &quot;share&quot; -
    * Reshare an activity.
    */
  var verb: js.UndefOr[String] = js.native
}
object SchemaActivity {
  
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  @scala.inline
  implicit class SchemaActivityMutableBuilder[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: SchemaAcl): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setActor(value: ClientSpecificActorInfo): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    @scala.inline
    def setCrosspostSource(value: String): Self = StObject.set(x, "crosspostSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosspostSourceUndefined: Self = StObject.set(x, "crosspostSource", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setGeocode(value: String): Self = StObject.set(x, "geocode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocodeUndefined: Self = StObject.set(x, "geocode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaPlace): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setObject(value: Attachments): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    @scala.inline
    def setPlaceName(value: String): Self = StObject.set(x, "placeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceNameUndefined: Self = StObject.set(x, "placeName", js.undefined)
    
    @scala.inline
    def setProvider(value: Title): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    @scala.inline
    def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
