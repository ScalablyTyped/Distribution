package typings.leafletGeosearch

import typings.leafletGeosearch.leafletGeosearchStrings.node
import typings.leafletGeosearch.leafletGeosearchStrings.relation
import typings.leafletGeosearch.leafletGeosearchStrings.way
import typings.leafletGeosearch.mod.LatLngLiteral
import typings.leafletGeosearch.mod.PointTuple
import typings.leafletGeosearch.mod.SearchResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: City
  }
  object Address {
    
    inline def apply(address: City): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: City): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdminDistrict extends StObject {
    
    var adminDistrict: String
    
    var adminDistrict2: String
    
    var countryRegion: String
    
    var formattedAddress: String
    
    var landmark: String
    
    var locality: String
    
    var neighborhood: String
  }
  object AdminDistrict {
    
    inline def apply(
      adminDistrict: String,
      adminDistrict2: String,
      countryRegion: String,
      formattedAddress: String,
      landmark: String,
      locality: String,
      neighborhood: String
    ): AdminDistrict = {
      val __obj = js.Dynamic.literal(adminDistrict = adminDistrict.asInstanceOf[js.Any], adminDistrict2 = adminDistrict2.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], landmark = landmark.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminDistrict]
    }
    
    extension [Self <: AdminDistrict](x: Self) {
      
      inline def setAdminDistrict(value: String): Self = StObject.set(x, "adminDistrict", value.asInstanceOf[js.Any])
      
      inline def setAdminDistrict2(value: String): Self = StObject.set(x, "adminDistrict2", value.asInstanceOf[js.Any])
      
      inline def setCountryRegion(value: String): Self = StObject.set(x, "countryRegion", value.asInstanceOf[js.Any])
      
      inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
      
      inline def setLandmark(value: String): Self = StObject.set(x, "landmark", value.asInstanceOf[js.Any])
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined leaflet-geosearch.leaflet-geosearch.BingProviderResultPoint & {  calculationMethod :string,   usageTypes :std.Array<string>} */
  trait BingProviderResultPointca extends StObject {
    
    var calculationMethod: String
    
    var coordinates: PointTuple
    
    var `type`: String
    
    var usageTypes: js.Array[String]
  }
  object BingProviderResultPointca {
    
    inline def apply(calculationMethod: String, coordinates: PointTuple, `type`: String, usageTypes: js.Array[String]): BingProviderResultPointca = {
      val __obj = js.Dynamic.literal(calculationMethod = calculationMethod.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], usageTypes = usageTypes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BingProviderResultPointca]
    }
    
    extension [Self <: BingProviderResultPointca](x: Self) {
      
      inline def setCalculationMethod(value: String): Self = StObject.set(x, "calculationMethod", value.asInstanceOf[js.Any])
      
      inline def setCoordinates(value: PointTuple): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUsageTypes(value: js.Array[String]): Self = StObject.set(x, "usageTypes", value.asInstanceOf[js.Any])
      
      inline def setUsageTypesVarargs(value: String*): Self = StObject.set(x, "usageTypes", js.Array(value :_*))
    }
  }
  
  trait Button extends StObject {
    
    var button: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var input: js.UndefOr[String] = js.undefined
    
    var msgbox: js.UndefOr[String] = js.undefined
    
    var resetButton: js.UndefOr[String] = js.undefined
  }
  object Button {
    
    inline def apply(): Button = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Button]
    }
    
    extension [Self <: Button](x: Self) {
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setMsgbox(value: String): Self = StObject.set(x, "msgbox", value.asInstanceOf[js.Any])
      
      inline def setMsgboxUndefined: Self = StObject.set(x, "msgbox", js.undefined)
      
      inline def setResetButton(value: String): Self = StObject.set(x, "resetButton", value.asInstanceOf[js.Any])
      
      inline def setResetButtonUndefined: Self = StObject.set(x, "resetButton", js.undefined)
    }
  }
  
  trait City extends StObject {
    
    var city: String
    
    var country: String
    
    var country_code: String
    
    var county: String
    
    var house_number: String
    
    var postcode: String
    
    var road: String
    
    var state: String
    
    var state_district: String
    
    var town: String
  }
  object City {
    
    inline def apply(
      city: String,
      country: String,
      country_code: String,
      county: String,
      house_number: String,
      postcode: String,
      road: String,
      state: String,
      state_district: String,
      town: String
    ): City = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], house_number = house_number.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], state_district = state_district.asInstanceOf[js.Any], town = town.asInstanceOf[js.Any])
      __obj.asInstanceOf[City]
    }
    
    extension [Self <: City](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
      
      inline def setHouse_number(value: String): Self = StObject.set(x, "house_number", value.asInstanceOf[js.Any])
      
      inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
      
      inline def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setState_district(value: String): Self = StObject.set(x, "state_district", value.asInstanceOf[js.Any])
      
      inline def setTown(value: String): Self = StObject.set(x, "town", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var location: LatLngLiteral
    
    var location_type: String
    
    var viewport: Northeast
  }
  object Location {
    
    inline def apply(location: LatLngLiteral, location_type: String, viewport: Northeast): Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setLocation(value: LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocation_type(value: String): Self = StObject.set(x, "location_type", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: Northeast): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  trait Northeast extends StObject {
    
    var northeast: LatLngLiteral
    
    var southwest: LatLngLiteral
  }
  object Northeast {
    
    inline def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): Northeast = {
      val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Northeast]
    }
    
    extension [Self <: Northeast](x: Self) {
      
      inline def setNortheast(value: LatLngLiteral): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
      
      inline def setSouthwest(value: LatLngLiteral): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
    }
  }
  
  trait Osmid extends StObject {
    
    var osm_id: js.UndefOr[Double] = js.undefined
    
    var osm_type: js.UndefOr[node | way | relation] = js.undefined
  }
  object Osmid {
    
    inline def apply(): Osmid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Osmid]
    }
    
    extension [Self <: Osmid](x: Self) {
      
      inline def setOsm_id(value: Double): Self = StObject.set(x, "osm_id", value.asInstanceOf[js.Any])
      
      inline def setOsm_idUndefined: Self = StObject.set(x, "osm_id", js.undefined)
      
      inline def setOsm_type(value: node | way | relation): Self = StObject.set(x, "osm_type", value.asInstanceOf[js.Any])
      
      inline def setOsm_typeUndefined: Self = StObject.set(x, "osm_type", js.undefined)
    }
  }
  
  trait Query extends StObject {
    
    var query: String
    
    var result: SearchResult[js.Object]
  }
  object Query {
    
    inline def apply(query: String, result: SearchResult[js.Object]): Query = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResult(value: SearchResult[js.Object]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Raw extends StObject {
    
    var raw: Osmid
  }
  object Raw {
    
    inline def apply(raw: Osmid): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    extension [Self <: Raw](x: Self) {
      
      inline def setRaw(value: Osmid): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
