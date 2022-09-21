package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubject extends StObject {
  
  /**
    * The "common name" of the subject.
    */
  var commonName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The country code of the subject.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The locality or city of the subject.
    */
  var locality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The organization of the subject.
    */
  var organization: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The organizational_unit of the subject.
    */
  var organizationalUnit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The postal code of the subject.
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The province, territory, or regional state of the subject.
    */
  var province: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The street address of the subject.
    */
  var streetAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubject {
  
  inline def apply(): SchemaSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubject]
  }
  
  extension [Self <: SchemaSubject](x: Self) {
    
    inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameNull: Self = StObject.set(x, "commonName", null)
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityNull: Self = StObject.set(x, "locality", null)
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNull: Self = StObject.set(x, "organization", null)
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOrganizationalUnit(value: String): Self = StObject.set(x, "organizationalUnit", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitNull: Self = StObject.set(x, "organizationalUnit", null)
    
    inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "organizationalUnit", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setProvinceNull: Self = StObject.set(x, "province", null)
    
    inline def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressNull: Self = StObject.set(x, "streetAddress", null)
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
