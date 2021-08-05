package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostalCodeGroup extends StObject {
  
  /**
    * The CLDR territory code of the country the postal code group applies to.
    * Required.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the postal code group, referred to in headers. Required.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A range of postal codes. Required.
    */
  var postalCodeRanges: js.UndefOr[js.Array[SchemaPostalCodeRange]] = js.undefined
}
object SchemaPostalCodeGroup {
  
  inline def apply(): SchemaPostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodeGroup]
  }
  
  extension [Self <: SchemaPostalCodeGroup](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPostalCodeRanges(value: js.Array[SchemaPostalCodeRange]): Self = StObject.set(x, "postalCodeRanges", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeRangesUndefined: Self = StObject.set(x, "postalCodeRanges", js.undefined)
    
    inline def setPostalCodeRangesVarargs(value: SchemaPostalCodeRange*): Self = StObject.set(x, "postalCodeRanges", js.Array(value :_*))
  }
}
