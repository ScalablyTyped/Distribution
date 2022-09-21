package typings.mapboxMapboxSdk

import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.Feature
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.FeatureCollection
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.Point
import typings.mapboxMapboxSdk.mapiRequestMod.Coordinates
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geocodingMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/geocoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): GeocodeService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[GeocodeService]
  inline def default(config: typings.mapboxMapboxSdk.mod.default): GeocodeService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[GeocodeService]
  
  type BoundingBox = js.Tuple4[Double, Double, Double, Double]
  
  trait GeocodeFeature extends StObject {
    
    /**
      * A string of the house number for the returned  address feature. Note that unlike the
      * address property for  poi features, this property is outside the  properties object.
      */
    var address: js.UndefOr[String] = js.undefined
    
    /**
      * An array bounding box in the form [ minX,minY,maxX,maxY ] .
      */
    var bbox: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * An array in the form [ longitude,latitude ] at the center of the specified  bbox .
      */
    var center: js.Array[Double]
    
    /**
      * An array representing the hierarchy of encompassing parent features. Each parent feature may include any of the above properties
      */
    var context: js.Array[GeocodeFeature]
    
    /**
      * An object describing the spatial geometry of the returned feature
      */
    var geometry: Geometry
    
    /**
      * A string feature id in the form  {type}.{id} where  {type} is the lowest hierarchy feature in the  place_type field.
      * The  {id} suffix of the feature id is unstable and may change within versions.
      */
    var id: String
    
    /**
      * A string of the IETF language tag of the query's primary language.
      * Can be used to identity text and place_name properties on this object
      * in the format text_{language}, place_name_{language} and language_{language}
      */
    var language: String
    
    /**
      * A string analogous to the  place_name field that more closely matches the query than results in the specified language.
      * For example, querying "Köln, Germany" with language set to English might return a feature with the place_name "Cologne, Germany"
      * and a  matching_place_name of "Köln, North Rhine-Westphalia, Germany".
      */
    var matching_place_name: String
    
    /**
      * A string analogous to the  text field that more closely matches the query than results in the specified language.
      * For example, querying "Köln, Germany" with language set to English might return a feature with the
      * text "Cologne" and the  matching_text "Köln".
      */
    var matching_text: String
    
    /**
      * A string representing the feature in the requested language, if specified, and its full result hierarchy.
      */
    var place_name: String
    
    /**
      * An array of feature types describing the feature. Options are  country ,  region ,  postcode ,  district ,  place , locality ,  neighborhood ,
      * address ,  poi , and  poi.landmark . Most features have only one type, but if the feature has multiple types,
      * all applicable types will be listed in the array. (For example, Vatican City is a  country , region , and  place .)
      */
    var place_type: js.Array[String]
    
    /**
      * An object describing the feature. The property object is unstable and only Carmen GeoJSON properties are guaranteed.
      * Your implementation should check for the presence of these values in a response before it attempts to use them.
      */
    var properties: GeocodeProperties
    
    /**
      * A numerical score from 0 (least relevant) to 0.99 (most relevant) measuring how well each returned feature matches the query.
      * You can use the  relevance property to remove results that don't fully match the query.
      */
    var relevance: Double
    
    /**
      * A string representing the feature in the requested language, if specified.
      */
    var text: String
    
    /**
      * "Feature", a GeoJSON type from the GeoJSON specification.
      */
    var `type`: Feature
  }
  object GeocodeFeature {
    
    inline def apply(
      center: js.Array[Double],
      context: js.Array[GeocodeFeature],
      geometry: Geometry,
      id: String,
      language: String,
      matching_place_name: String,
      matching_text: String,
      place_name: String,
      place_type: js.Array[String],
      properties: GeocodeProperties,
      relevance: Double,
      text: String
    ): GeocodeFeature = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[GeocodeFeature]
    }
    
    extension [Self <: GeocodeFeature](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value*))
      
      inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setContext(value: js.Array[GeocodeFeature]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextVarargs(value: GeocodeFeature*): Self = StObject.set(x, "context", js.Array(value*))
      
      inline def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setMatching_place_name(value: String): Self = StObject.set(x, "matching_place_name", value.asInstanceOf[js.Any])
      
      inline def setMatching_text(value: String): Self = StObject.set(x, "matching_text", value.asInstanceOf[js.Any])
      
      inline def setPlace_name(value: String): Self = StObject.set(x, "place_name", value.asInstanceOf[js.Any])
      
      inline def setPlace_type(value: js.Array[String]): Self = StObject.set(x, "place_type", value.asInstanceOf[js.Any])
      
      inline def setPlace_typeVarargs(value: String*): Self = StObject.set(x, "place_type", js.Array(value*))
      
      inline def setProperties(value: GeocodeProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent`
  */
  trait GeocodeMode extends StObject
  object GeocodeMode {
    
    inline def mapboxDotplaces: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces = "mapbox.places".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces]
    
    inline def `mapboxDotplaces-permanent`: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent` = "mapbox.places-permanent".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent`]
  }
  
  trait GeocodeProperties
    extends StObject
       with GeocodeFeature {
    
    /**
      * A string of comma-separated categories for the returned  poi feature.
      */
    var category: js.UndefOr[String] = js.undefined
    
    /**
      * A boolean value indicating whether a  poi feature is a landmark. Landmarks are
      * particularly notable or long-lived features like schools, parks, museums and places of worship.
      */
    var landmark: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of a suggested Maki icon to visualize a  poi feature based on its  category .
      */
    var maki: js.UndefOr[String] = js.undefined
    
    /**
      * The ISO 3166-1 country and ISO 3166-2 region code for the returned feature.
      */
    var short_code: String
    
    /**
      * A formatted string of the telephone number for the returned  poi feature.
      */
    var tel: js.UndefOr[String] = js.undefined
    
    /**
      * The Wikidata identifier for the returned feature.
      */
    var wikidata: js.UndefOr[String] = js.undefined
  }
  object GeocodeProperties {
    
    inline def apply(
      center: js.Array[Double],
      context: js.Array[GeocodeFeature],
      geometry: Geometry,
      id: String,
      language: String,
      matching_place_name: String,
      matching_text: String,
      place_name: String,
      place_type: js.Array[String],
      properties: GeocodeProperties,
      relevance: Double,
      short_code: String,
      text: String
    ): GeocodeProperties = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[GeocodeProperties]
    }
    
    extension [Self <: GeocodeProperties](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setLandmark(value: Boolean): Self = StObject.set(x, "landmark", value.asInstanceOf[js.Any])
      
      inline def setLandmarkUndefined: Self = StObject.set(x, "landmark", js.undefined)
      
      inline def setMaki(value: String): Self = StObject.set(x, "maki", value.asInstanceOf[js.Any])
      
      inline def setMakiUndefined: Self = StObject.set(x, "maki", js.undefined)
      
      inline def setShort_code(value: String): Self = StObject.set(x, "short_code", value.asInstanceOf[js.Any])
      
      inline def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
      
      inline def setTelUndefined: Self = StObject.set(x, "tel", js.undefined)
      
      inline def setWikidata(value: String): Self = StObject.set(x, "wikidata", value.asInstanceOf[js.Any])
      
      inline def setWikidataUndefined: Self = StObject.set(x, "wikidata", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.country
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.region
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.postcode
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.district
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.place
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.locality
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.neighborhood
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.address
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poi
    - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poiDotlandmark
  */
  trait GeocodeQueryType extends StObject
  object GeocodeQueryType {
    
    inline def address: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.address = "address".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.address]
    
    inline def country: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.country = "country".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.country]
    
    inline def district: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.district = "district".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.district]
    
    inline def locality: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.locality = "locality".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.locality]
    
    inline def neighborhood: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.neighborhood = "neighborhood".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.neighborhood]
    
    inline def place: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.place = "place".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.place]
    
    inline def poi: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poi = "poi".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poi]
    
    inline def poiDotlandmark: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poiDotlandmark = "poi.landmark".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poiDotlandmark]
    
    inline def postcode: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.postcode = "postcode".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.postcode]
    
    inline def region: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.region = "region".asInstanceOf[typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.region]
  }
  
  trait GeocodeRequest extends StObject {
    
    /**
      * Forward geocoding only. Return autocomplete results or not. Options are  true or  false and the default is  true .
      */
    var autocomplete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Forward geocoding only. Limit results to a bounding box. Options are in the format  minLongitude,minLatitude,maxLongitude,maxLatitude.
      */
    var bbox: js.UndefOr[BoundingBox] = js.undefined
    
    /**
      * Limit results to one or more countries. Options are ISO 3166 alpha 2 country codes
      */
    var countries: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Specify the language to use for response text and, for forward geocoding, query result weighting.
      * Options are IETF language tags comprised of a mandatory ISO 639-1 language code and optionally one or more
      * IETF subtags for country or script.
      */
    var language: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Limit the number of results returned. The default is  5 for forward geocoding and  1 for reverse geocoding.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Either  mapbox.places for ephemeral geocoding, or  mapbox.places-permanent for storing results and batch geocoding.
      */
    var mode: js.UndefOr[GeocodeMode] = js.undefined
    
    /**
      * Bias local results based on a provided location. Options are  longitude,latitude coordinates.
      */
    var proximity: js.UndefOr[Coordinates] = js.undefined
    
    /**
      * A location. This will be a place name for forward geocoding or a coordinate pair (longitude, latitude) for reverse geocoding.
      */
    var query: String | LngLatLike
    
    /**
      * Specify whether to request additional etadat about the recommended navigation destination. Only applicable for address features.
      */
    var routing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Filter results by one or more feature types
      */
    var types: js.UndefOr[js.Array[GeocodeQueryType]] = js.undefined
  }
  object GeocodeRequest {
    
    inline def apply(query: String | LngLatLike): GeocodeRequest = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeRequest]
    }
    
    extension [Self <: GeocodeRequest](x: Self) {
      
      inline def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setBbox(value: BoundingBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setLanguage(value: js.Array[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLanguageVarargs(value: String*): Self = StObject.set(x, "language", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMode(value: GeocodeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setProximity(value: Coordinates): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
      
      inline def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
      
      inline def setQuery(value: String | LngLatLike): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRouting(value: Boolean): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
      
      inline def setTypes(value: js.Array[GeocodeQueryType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: GeocodeQueryType*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait GeocodeResponse extends StObject {
    
    /**
      * A string attributing the results of the Mapbox Geocoding API to Mapbox and links to Mapbox's terms of service and data sources.
      */
    var attribution: String
    
    /**
      * An array of feature objects.
      */
    var features: js.Array[GeocodeFeature]
    
    /**
      * An array of space and punctuation-separated strings from the original query.
      */
    var query: js.Array[String]
    
    /**
      * "Feature Collection" , a GeoJSON type from the GeoJSON specification.
      */
    var `type`: FeatureCollection
  }
  object GeocodeResponse {
    
    inline def apply(attribution: String, features: js.Array[GeocodeFeature], query: js.Array[String]): GeocodeResponse = {
      val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FeatureCollection")
      __obj.asInstanceOf[GeocodeResponse]
    }
    
    extension [Self <: GeocodeResponse](x: Self) {
      
      inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: js.Array[GeocodeFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: GeocodeFeature*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setQuery(value: js.Array[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryVarargs(value: String*): Self = StObject.set(x, "query", js.Array(value*))
      
      inline def setType(value: FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeocodeService extends StObject {
    
    def forwardGeocode(request: GeocodeRequest): MapiRequest[GeocodeResponse]
    
    def reverseGeocode(request: GeocodeRequest): MapiRequest[GeocodeResponse]
  }
  object GeocodeService {
    
    inline def apply(
      forwardGeocode: GeocodeRequest => MapiRequest[GeocodeResponse],
      reverseGeocode: GeocodeRequest => MapiRequest[GeocodeResponse]
    ): GeocodeService = {
      val __obj = js.Dynamic.literal(forwardGeocode = js.Any.fromFunction1(forwardGeocode), reverseGeocode = js.Any.fromFunction1(reverseGeocode))
      __obj.asInstanceOf[GeocodeService]
    }
    
    extension [Self <: GeocodeService](x: Self) {
      
      inline def setForwardGeocode(value: GeocodeRequest => MapiRequest[GeocodeResponse]): Self = StObject.set(x, "forwardGeocode", js.Any.fromFunction1(value))
      
      inline def setReverseGeocode(value: GeocodeRequest => MapiRequest[GeocodeResponse]): Self = StObject.set(x, "reverseGeocode", js.Any.fromFunction1(value))
    }
  }
  
  trait Geometry extends StObject {
    
    /**
      * An array in the format [ longitude,latitude ] at the center of the specified  bbox .
      */
    var coordinates: js.Array[Double]
    
    /**
      * A boolean value indicating if an  address is interpolated along a road network. This field is only present when the feature is interpolated.
      */
    var interpolated: Boolean
    
    /**
      * Point, a GeoJSON type from the GeoJSON specification .
      */
    var `type`: Point
  }
  object Geometry {
    
    inline def apply(coordinates: js.Array[Double], interpolated: Boolean): Geometry = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], interpolated = interpolated.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Geometry]
    }
    
    extension [Self <: Geometry](x: Self) {
      
      inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setInterpolated(value: Boolean): Self = StObject.set(x, "interpolated", value.asInstanceOf[js.Any])
      
      inline def setType(value: Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
