package typings.leafletGeosearch

import org.scalablytyped.runtime.StringDictionary
import typings.leafletGeosearch.anon.Administrative
import typings.leafletGeosearch.anon.Default
import typings.leafletGeosearch.distProvidersProviderMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersAlgoliaProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/algoliaProvider", JSImport.Default)
  @js.native
  open class default () extends Provider
  
  @js.native
  trait Provider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, RawResult] {
    
    def endpoint(): String = js.native
    
    /**
      * Find index of value with best match
      * (full, fallback to partial, and then to 0)
      */
    def findBestMatchLevelIndex(vms: js.Array[ValueMatch]): Double = js.native
    
    /**
      * Algolia not provides labels for hits, so
      * we will implement that builder ourselves
      */
    def getLabel(result: RawResult): String = js.native
  }
  
  trait RawResult extends StObject {
    
    var _geoloc: LatLng
    
    var _highlightResult: Administrative
    
    var _tags: js.Array[String]
    
    var admin_level: Double
    
    var administrative: js.Array[String]
    
    var city: StringDictionary[js.Array[String]]
    
    var country: StringDictionary[String]
    
    var country_code: String
    
    var importance: Double
    
    var is_city: Boolean
    
    var is_country: Boolean
    
    var is_highway: Boolean
    
    var is_popular: Boolean
    
    var is_suburb: Boolean
    
    var locale_names: Default
    
    var objectID: String
    
    var population: Double
    
    var postcode: js.Array[String]
  }
  object RawResult {
    
    inline def apply(
      _geoloc: LatLng,
      _highlightResult: Administrative,
      _tags: js.Array[String],
      admin_level: Double,
      administrative: js.Array[String],
      city: StringDictionary[js.Array[String]],
      country: StringDictionary[String],
      country_code: String,
      importance: Double,
      is_city: Boolean,
      is_country: Boolean,
      is_highway: Boolean,
      is_popular: Boolean,
      is_suburb: Boolean,
      locale_names: Default,
      objectID: String,
      population: Double,
      postcode: js.Array[String]
    ): RawResult = {
      val __obj = js.Dynamic.literal(_geoloc = _geoloc.asInstanceOf[js.Any], _highlightResult = _highlightResult.asInstanceOf[js.Any], _tags = _tags.asInstanceOf[js.Any], admin_level = admin_level.asInstanceOf[js.Any], administrative = administrative.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], is_city = is_city.asInstanceOf[js.Any], is_country = is_country.asInstanceOf[js.Any], is_highway = is_highway.asInstanceOf[js.Any], is_popular = is_popular.asInstanceOf[js.Any], is_suburb = is_suburb.asInstanceOf[js.Any], locale_names = locale_names.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any], population = population.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    extension [Self <: RawResult](x: Self) {
      
      inline def setAdmin_level(value: Double): Self = StObject.set(x, "admin_level", value.asInstanceOf[js.Any])
      
      inline def setAdministrative(value: js.Array[String]): Self = StObject.set(x, "administrative", value.asInstanceOf[js.Any])
      
      inline def setAdministrativeVarargs(value: String*): Self = StObject.set(x, "administrative", js.Array(value*))
      
      inline def setCity(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: StringDictionary[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setImportance(value: Double): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
      
      inline def setIs_city(value: Boolean): Self = StObject.set(x, "is_city", value.asInstanceOf[js.Any])
      
      inline def setIs_country(value: Boolean): Self = StObject.set(x, "is_country", value.asInstanceOf[js.Any])
      
      inline def setIs_highway(value: Boolean): Self = StObject.set(x, "is_highway", value.asInstanceOf[js.Any])
      
      inline def setIs_popular(value: Boolean): Self = StObject.set(x, "is_popular", value.asInstanceOf[js.Any])
      
      inline def setIs_suburb(value: Boolean): Self = StObject.set(x, "is_suburb", value.asInstanceOf[js.Any])
      
      inline def setLocale_names(value: Default): Self = StObject.set(x, "locale_names", value.asInstanceOf[js.Any])
      
      inline def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
      
      inline def setPopulation(value: Double): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
      
      inline def setPostcode(value: js.Array[String]): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
      
      inline def setPostcodeVarargs(value: String*): Self = StObject.set(x, "postcode", js.Array(value*))
      
      inline def set_geoloc(value: LatLng): Self = StObject.set(x, "_geoloc", value.asInstanceOf[js.Any])
      
      inline def set_highlightResult(value: Administrative): Self = StObject.set(x, "_highlightResult", value.asInstanceOf[js.Any])
      
      inline def set_tags(value: js.Array[String]): Self = StObject.set(x, "_tags", value.asInstanceOf[js.Any])
      
      inline def set_tagsVarargs(value: String*): Self = StObject.set(x, "_tags", js.Array(value*))
    }
  }
  
  trait RequestResult extends StObject {
    
    var hits: js.Array[RawResult]
  }
  object RequestResult {
    
    inline def apply(hits: js.Array[RawResult]): RequestResult = {
      val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    extension [Self <: RequestResult](x: Self) {
      
      inline def setHits(value: js.Array[RawResult]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      inline def setHitsVarargs(value: RawResult*): Self = StObject.set(x, "hits", js.Array(value*))
    }
  }
  
  trait ValueMatch extends StObject {
    
    var fullyHighlighted: js.UndefOr[Boolean] = js.undefined
    
    var matchLevel: String
    
    var matchedWords: js.Array[String]
    
    var value: String
  }
  object ValueMatch {
    
    inline def apply(matchLevel: String, matchedWords: js.Array[String], value: String): ValueMatch = {
      val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueMatch]
    }
    
    extension [Self <: ValueMatch](x: Self) {
      
      inline def setFullyHighlighted(value: Boolean): Self = StObject.set(x, "fullyHighlighted", value.asInstanceOf[js.Any])
      
      inline def setFullyHighlightedUndefined: Self = StObject.set(x, "fullyHighlighted", js.undefined)
      
      inline def setMatchLevel(value: String): Self = StObject.set(x, "matchLevel", value.asInstanceOf[js.Any])
      
      inline def setMatchedWords(value: js.Array[String]): Self = StObject.set(x, "matchedWords", value.asInstanceOf[js.Any])
      
      inline def setMatchedWordsVarargs(value: String*): Self = StObject.set(x, "matchedWords", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
