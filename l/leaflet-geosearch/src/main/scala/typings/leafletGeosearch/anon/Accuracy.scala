package typings.leafletGeosearch.anon

import typings.leafletGeosearch.leafletGeosearchStrings.centroid
import typings.leafletGeosearch.leafletGeosearchStrings.exact
import typings.leafletGeosearch.leafletGeosearchStrings.fallback
import typings.leafletGeosearch.leafletGeosearchStrings.interpolated
import typings.leafletGeosearch.leafletGeosearchStrings.point_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accuracy extends StObject {
  
  var accuracy: centroid | point_
  
  var addendum: js.UndefOr[Any] = js.undefined
  
  var borough: js.UndefOr[String] = js.undefined
  
  var borough_a: js.UndefOr[String] = js.undefined
  
  var borough_gid: js.UndefOr[String] = js.undefined
  
  var confidence: js.UndefOr[Double] = js.undefined
  
  var continent: js.UndefOr[String] = js.undefined
  
  var continent_a: js.UndefOr[String] = js.undefined
  
  var continent_gid: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  var country_a: js.UndefOr[String] = js.undefined
  
  var country_gid: js.UndefOr[String] = js.undefined
  
  var county: js.UndefOr[String] = js.undefined
  
  var county_a: js.UndefOr[String] = js.undefined
  
  var county_gid: js.UndefOr[String] = js.undefined
  
  var dependency: js.UndefOr[String] = js.undefined
  
  var dependency_a: js.UndefOr[String] = js.undefined
  
  var dependency_gid: js.UndefOr[String] = js.undefined
  
  var empire: js.UndefOr[String] = js.undefined
  
  var empire_a: js.UndefOr[String] = js.undefined
  
  var empire_gid: js.UndefOr[String] = js.undefined
  
  var gid: String
  
  var housenumber: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var label: String
  
  var layer: String
  
  var localadmin: js.UndefOr[String] = js.undefined
  
  var localadmin_a: js.UndefOr[String] = js.undefined
  
  var localadmin_gid: js.UndefOr[String] = js.undefined
  
  var locality: js.UndefOr[String] = js.undefined
  
  var locality_a: js.UndefOr[String] = js.undefined
  
  var locality_gid: js.UndefOr[String] = js.undefined
  
  var macrocounty: js.UndefOr[String] = js.undefined
  
  var macrocounty_a: js.UndefOr[String] = js.undefined
  
  var macrocounty_gid: js.UndefOr[String] = js.undefined
  
  var macroregion: js.UndefOr[String] = js.undefined
  
  var macroregion_a: js.UndefOr[String] = js.undefined
  
  var macroregion_gid: js.UndefOr[String] = js.undefined
  
  var marinearea: js.UndefOr[String] = js.undefined
  
  var marinearea_a: js.UndefOr[String] = js.undefined
  
  var marinearea_gid: js.UndefOr[String] = js.undefined
  
  var match_type: js.UndefOr[exact | interpolated | fallback] = js.undefined
  
  var name: String
  
  var neighbourhood: js.UndefOr[String] = js.undefined
  
  var neighbourhood_a: js.UndefOr[String] = js.undefined
  
  var neighbourhood_gid: js.UndefOr[String] = js.undefined
  
  var ocean: js.UndefOr[String] = js.undefined
  
  var ocean_a: js.UndefOr[String] = js.undefined
  
  var ocean_gid: js.UndefOr[String] = js.undefined
  
  var postalcode: js.UndefOr[String] = js.undefined
  
  var postalcode_a: js.UndefOr[String] = js.undefined
  
  var postalcode_gid: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var region_a: js.UndefOr[String] = js.undefined
  
  var region_gid: js.UndefOr[String] = js.undefined
  
  var source: String
  
  var source_id: String
  
  var street: js.UndefOr[String] = js.undefined
}
object Accuracy {
  
  inline def apply(
    accuracy: centroid | point_,
    gid: String,
    id: String,
    label: String,
    layer: String,
    name: String,
    source: String,
    source_id: String
  ): Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], source_id = source_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  
  extension [Self <: Accuracy](x: Self) {
    
    inline def setAccuracy(value: centroid | point_): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAddendum(value: Any): Self = StObject.set(x, "addendum", value.asInstanceOf[js.Any])
    
    inline def setAddendumUndefined: Self = StObject.set(x, "addendum", js.undefined)
    
    inline def setBorough(value: String): Self = StObject.set(x, "borough", value.asInstanceOf[js.Any])
    
    inline def setBoroughUndefined: Self = StObject.set(x, "borough", js.undefined)
    
    inline def setBorough_a(value: String): Self = StObject.set(x, "borough_a", value.asInstanceOf[js.Any])
    
    inline def setBorough_aUndefined: Self = StObject.set(x, "borough_a", js.undefined)
    
    inline def setBorough_gid(value: String): Self = StObject.set(x, "borough_gid", value.asInstanceOf[js.Any])
    
    inline def setBorough_gidUndefined: Self = StObject.set(x, "borough_gid", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setContinent(value: String): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    inline def setContinent_a(value: String): Self = StObject.set(x, "continent_a", value.asInstanceOf[js.Any])
    
    inline def setContinent_aUndefined: Self = StObject.set(x, "continent_a", js.undefined)
    
    inline def setContinent_gid(value: String): Self = StObject.set(x, "continent_gid", value.asInstanceOf[js.Any])
    
    inline def setContinent_gidUndefined: Self = StObject.set(x, "continent_gid", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCountry_a(value: String): Self = StObject.set(x, "country_a", value.asInstanceOf[js.Any])
    
    inline def setCountry_aUndefined: Self = StObject.set(x, "country_a", js.undefined)
    
    inline def setCountry_gid(value: String): Self = StObject.set(x, "country_gid", value.asInstanceOf[js.Any])
    
    inline def setCountry_gidUndefined: Self = StObject.set(x, "country_gid", js.undefined)
    
    inline def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
    
    inline def setCountyUndefined: Self = StObject.set(x, "county", js.undefined)
    
    inline def setCounty_a(value: String): Self = StObject.set(x, "county_a", value.asInstanceOf[js.Any])
    
    inline def setCounty_aUndefined: Self = StObject.set(x, "county_a", js.undefined)
    
    inline def setCounty_gid(value: String): Self = StObject.set(x, "county_gid", value.asInstanceOf[js.Any])
    
    inline def setCounty_gidUndefined: Self = StObject.set(x, "county_gid", js.undefined)
    
    inline def setDependency(value: String): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setDependency_a(value: String): Self = StObject.set(x, "dependency_a", value.asInstanceOf[js.Any])
    
    inline def setDependency_aUndefined: Self = StObject.set(x, "dependency_a", js.undefined)
    
    inline def setDependency_gid(value: String): Self = StObject.set(x, "dependency_gid", value.asInstanceOf[js.Any])
    
    inline def setDependency_gidUndefined: Self = StObject.set(x, "dependency_gid", js.undefined)
    
    inline def setEmpire(value: String): Self = StObject.set(x, "empire", value.asInstanceOf[js.Any])
    
    inline def setEmpireUndefined: Self = StObject.set(x, "empire", js.undefined)
    
    inline def setEmpire_a(value: String): Self = StObject.set(x, "empire_a", value.asInstanceOf[js.Any])
    
    inline def setEmpire_aUndefined: Self = StObject.set(x, "empire_a", js.undefined)
    
    inline def setEmpire_gid(value: String): Self = StObject.set(x, "empire_gid", value.asInstanceOf[js.Any])
    
    inline def setEmpire_gidUndefined: Self = StObject.set(x, "empire_gid", js.undefined)
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setHousenumber(value: String): Self = StObject.set(x, "housenumber", value.asInstanceOf[js.Any])
    
    inline def setHousenumberUndefined: Self = StObject.set(x, "housenumber", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLocaladmin(value: String): Self = StObject.set(x, "localadmin", value.asInstanceOf[js.Any])
    
    inline def setLocaladminUndefined: Self = StObject.set(x, "localadmin", js.undefined)
    
    inline def setLocaladmin_a(value: String): Self = StObject.set(x, "localadmin_a", value.asInstanceOf[js.Any])
    
    inline def setLocaladmin_aUndefined: Self = StObject.set(x, "localadmin_a", js.undefined)
    
    inline def setLocaladmin_gid(value: String): Self = StObject.set(x, "localadmin_gid", value.asInstanceOf[js.Any])
    
    inline def setLocaladmin_gidUndefined: Self = StObject.set(x, "localadmin_gid", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setLocality_a(value: String): Self = StObject.set(x, "locality_a", value.asInstanceOf[js.Any])
    
    inline def setLocality_aUndefined: Self = StObject.set(x, "locality_a", js.undefined)
    
    inline def setLocality_gid(value: String): Self = StObject.set(x, "locality_gid", value.asInstanceOf[js.Any])
    
    inline def setLocality_gidUndefined: Self = StObject.set(x, "locality_gid", js.undefined)
    
    inline def setMacrocounty(value: String): Self = StObject.set(x, "macrocounty", value.asInstanceOf[js.Any])
    
    inline def setMacrocountyUndefined: Self = StObject.set(x, "macrocounty", js.undefined)
    
    inline def setMacrocounty_a(value: String): Self = StObject.set(x, "macrocounty_a", value.asInstanceOf[js.Any])
    
    inline def setMacrocounty_aUndefined: Self = StObject.set(x, "macrocounty_a", js.undefined)
    
    inline def setMacrocounty_gid(value: String): Self = StObject.set(x, "macrocounty_gid", value.asInstanceOf[js.Any])
    
    inline def setMacrocounty_gidUndefined: Self = StObject.set(x, "macrocounty_gid", js.undefined)
    
    inline def setMacroregion(value: String): Self = StObject.set(x, "macroregion", value.asInstanceOf[js.Any])
    
    inline def setMacroregionUndefined: Self = StObject.set(x, "macroregion", js.undefined)
    
    inline def setMacroregion_a(value: String): Self = StObject.set(x, "macroregion_a", value.asInstanceOf[js.Any])
    
    inline def setMacroregion_aUndefined: Self = StObject.set(x, "macroregion_a", js.undefined)
    
    inline def setMacroregion_gid(value: String): Self = StObject.set(x, "macroregion_gid", value.asInstanceOf[js.Any])
    
    inline def setMacroregion_gidUndefined: Self = StObject.set(x, "macroregion_gid", js.undefined)
    
    inline def setMarinearea(value: String): Self = StObject.set(x, "marinearea", value.asInstanceOf[js.Any])
    
    inline def setMarineareaUndefined: Self = StObject.set(x, "marinearea", js.undefined)
    
    inline def setMarinearea_a(value: String): Self = StObject.set(x, "marinearea_a", value.asInstanceOf[js.Any])
    
    inline def setMarinearea_aUndefined: Self = StObject.set(x, "marinearea_a", js.undefined)
    
    inline def setMarinearea_gid(value: String): Self = StObject.set(x, "marinearea_gid", value.asInstanceOf[js.Any])
    
    inline def setMarinearea_gidUndefined: Self = StObject.set(x, "marinearea_gid", js.undefined)
    
    inline def setMatch_type(value: exact | interpolated | fallback): Self = StObject.set(x, "match_type", value.asInstanceOf[js.Any])
    
    inline def setMatch_typeUndefined: Self = StObject.set(x, "match_type", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNeighbourhood(value: String): Self = StObject.set(x, "neighbourhood", value.asInstanceOf[js.Any])
    
    inline def setNeighbourhoodUndefined: Self = StObject.set(x, "neighbourhood", js.undefined)
    
    inline def setNeighbourhood_a(value: String): Self = StObject.set(x, "neighbourhood_a", value.asInstanceOf[js.Any])
    
    inline def setNeighbourhood_aUndefined: Self = StObject.set(x, "neighbourhood_a", js.undefined)
    
    inline def setNeighbourhood_gid(value: String): Self = StObject.set(x, "neighbourhood_gid", value.asInstanceOf[js.Any])
    
    inline def setNeighbourhood_gidUndefined: Self = StObject.set(x, "neighbourhood_gid", js.undefined)
    
    inline def setOcean(value: String): Self = StObject.set(x, "ocean", value.asInstanceOf[js.Any])
    
    inline def setOceanUndefined: Self = StObject.set(x, "ocean", js.undefined)
    
    inline def setOcean_a(value: String): Self = StObject.set(x, "ocean_a", value.asInstanceOf[js.Any])
    
    inline def setOcean_aUndefined: Self = StObject.set(x, "ocean_a", js.undefined)
    
    inline def setOcean_gid(value: String): Self = StObject.set(x, "ocean_gid", value.asInstanceOf[js.Any])
    
    inline def setOcean_gidUndefined: Self = StObject.set(x, "ocean_gid", js.undefined)
    
    inline def setPostalcode(value: String): Self = StObject.set(x, "postalcode", value.asInstanceOf[js.Any])
    
    inline def setPostalcodeUndefined: Self = StObject.set(x, "postalcode", js.undefined)
    
    inline def setPostalcode_a(value: String): Self = StObject.set(x, "postalcode_a", value.asInstanceOf[js.Any])
    
    inline def setPostalcode_aUndefined: Self = StObject.set(x, "postalcode_a", js.undefined)
    
    inline def setPostalcode_gid(value: String): Self = StObject.set(x, "postalcode_gid", value.asInstanceOf[js.Any])
    
    inline def setPostalcode_gidUndefined: Self = StObject.set(x, "postalcode_gid", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRegion_a(value: String): Self = StObject.set(x, "region_a", value.asInstanceOf[js.Any])
    
    inline def setRegion_aUndefined: Self = StObject.set(x, "region_a", js.undefined)
    
    inline def setRegion_gid(value: String): Self = StObject.set(x, "region_gid", value.asInstanceOf[js.Any])
    
    inline def setRegion_gidUndefined: Self = StObject.set(x, "region_gid", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSource_id(value: String): Self = StObject.set(x, "source_id", value.asInstanceOf[js.Any])
    
    inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
  }
}
