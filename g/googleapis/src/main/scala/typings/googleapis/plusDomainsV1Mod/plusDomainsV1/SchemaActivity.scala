package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.anon.Attachments
import typings.googleapis.anon.ClientSpecificActorInfo
import typings.googleapis.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivity extends StObject {
  
  /**
    * Identifies who has access to see this activity.
    */
  var access: js.UndefOr[SchemaAcl] = js.undefined
  
  /**
    * The person who performed this activity.
    */
  var actor: js.UndefOr[ClientSpecificActorInfo] = js.undefined
  
  /**
    * Street address where this activity occurred.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Additional content added by the person who shared this activity,
    * applicable only when resharing an activity.
    */
  var annotation: js.UndefOr[String] = js.undefined
  
  /**
    * If this activity is a crosspost from another system, this property
    * specifies the ID of the original activity.
    */
  var crosspostSource: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Latitude and longitude where this activity occurred. Format is latitude
    * followed by longitude, space separated.
    */
  var geocode: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of this activity.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies this resource as an activity. Value:
    * &quot;plus#activity&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The location where this activity occurred.
    */
  var location: js.UndefOr[SchemaPlace] = js.undefined
  
  /**
    * The object of this activity.
    */
  var `object`: js.UndefOr[Attachments] = js.undefined
  
  /**
    * ID of the place where this activity occurred.
    */
  var placeId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the place where this activity occurred.
    */
  var placeName: js.UndefOr[String] = js.undefined
  
  /**
    * The service provider that initially published this activity.
    */
  var provider: js.UndefOr[Title] = js.undefined
  
  /**
    * The time at which this activity was initially published. Formatted as an
    * RFC 3339 timestamp.
    */
  var published: js.UndefOr[String] = js.undefined
  
  /**
    * Radius, in meters, of the region where this activity occurred, centered
    * at the latitude and longitude identified in geocode.
    */
  var radius: js.UndefOr[String] = js.undefined
  
  /**
    * Title of this activity.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which this activity was last updated. Formatted as an RFC
    * 3339 timestamp.
    */
  var updated: js.UndefOr[String] = js.undefined
  
  /**
    * The link to this activity.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * This activity&#39;s verb, which indicates the action that was performed.
    * Possible values include, but are not limited to, the following values: -
    * &quot;post&quot; - Publish content to the stream.  - &quot;share&quot; -
    * Reshare an activity.
    */
  var verb: js.UndefOr[String] = js.undefined
}
object SchemaActivity {
  
  inline def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  extension [Self <: SchemaActivity](x: Self) {
    
    inline def setAccess(value: SchemaAcl): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setActor(value: ClientSpecificActorInfo): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setCrosspostSource(value: String): Self = StObject.set(x, "crosspostSource", value.asInstanceOf[js.Any])
    
    inline def setCrosspostSourceUndefined: Self = StObject.set(x, "crosspostSource", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGeocode(value: String): Self = StObject.set(x, "geocode", value.asInstanceOf[js.Any])
    
    inline def setGeocodeUndefined: Self = StObject.set(x, "geocode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: SchemaPlace): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setObject(value: Attachments): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setPlaceName(value: String): Self = StObject.set(x, "placeName", value.asInstanceOf[js.Any])
    
    inline def setPlaceNameUndefined: Self = StObject.set(x, "placeName", js.undefined)
    
    inline def setProvider(value: Title): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
