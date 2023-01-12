package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostalCodeRange extends StObject {
  
  /** A postal code or a pattern of the form `prefix*` denoting the inclusive lower bound of the range defining the area. Examples values: `"94108"`, `"9410*"`, `"9*"`. Required. */
  var postalCodeRangeBegin: js.UndefOr[String] = js.undefined
  
  /**
    * A postal code or a pattern of the form `prefix*` denoting the inclusive upper bound of the range defining the area. It must have the same length as `postalCodeRangeBegin`: if
    * `postalCodeRangeBegin` is a postal code then `postalCodeRangeEnd` must be a postal code too; if `postalCodeRangeBegin` is a pattern then `postalCodeRangeEnd` must be a pattern with
    * the same prefix length. Optional: if not set, then the area is defined as being all the postal codes matching `postalCodeRangeBegin`.
    */
  var postalCodeRangeEnd: js.UndefOr[String] = js.undefined
}
object PostalCodeRange {
  
  inline def apply(): PostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCodeRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostalCodeRange] (val x: Self) extends AnyVal {
    
    inline def setPostalCodeRangeBegin(value: String): Self = StObject.set(x, "postalCodeRangeBegin", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeRangeBeginUndefined: Self = StObject.set(x, "postalCodeRangeBegin", js.undefined)
    
    inline def setPostalCodeRangeEnd(value: String): Self = StObject.set(x, "postalCodeRangeEnd", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeRangeEndUndefined: Self = StObject.set(x, "postalCodeRangeEnd", js.undefined)
  }
}
