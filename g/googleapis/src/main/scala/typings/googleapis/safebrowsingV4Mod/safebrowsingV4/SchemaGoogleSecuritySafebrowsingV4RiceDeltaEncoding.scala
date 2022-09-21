package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4RiceDeltaEncoding extends StObject {
  
  /**
    * The encoded deltas that are encoded using the Golomb-Rice coder.
    */
  var encodedData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The offset of the first entry in the encoded data, or, if only a single integer was encoded, that single integer's value. If the field is empty or missing, assume zero.
    */
  var firstValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of entries that are delta encoded in the encoded data. If only a single integer was encoded, this will be zero and the single value will be stored in `first_value`.
    */
  var numEntries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Golomb-Rice parameter, which is a number between 2 and 28. This field is missing (that is, zero) if `num_entries` is zero.
    */
  var riceParameter: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4RiceDeltaEncoding {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4RiceDeltaEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4RiceDeltaEncoding]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4RiceDeltaEncoding](x: Self) {
    
    inline def setEncodedData(value: String): Self = StObject.set(x, "encodedData", value.asInstanceOf[js.Any])
    
    inline def setEncodedDataNull: Self = StObject.set(x, "encodedData", null)
    
    inline def setEncodedDataUndefined: Self = StObject.set(x, "encodedData", js.undefined)
    
    inline def setFirstValue(value: String): Self = StObject.set(x, "firstValue", value.asInstanceOf[js.Any])
    
    inline def setFirstValueNull: Self = StObject.set(x, "firstValue", null)
    
    inline def setFirstValueUndefined: Self = StObject.set(x, "firstValue", js.undefined)
    
    inline def setNumEntries(value: Double): Self = StObject.set(x, "numEntries", value.asInstanceOf[js.Any])
    
    inline def setNumEntriesNull: Self = StObject.set(x, "numEntries", null)
    
    inline def setNumEntriesUndefined: Self = StObject.set(x, "numEntries", js.undefined)
    
    inline def setRiceParameter(value: Double): Self = StObject.set(x, "riceParameter", value.asInstanceOf[js.Any])
    
    inline def setRiceParameterNull: Self = StObject.set(x, "riceParameter", null)
    
    inline def setRiceParameterUndefined: Self = StObject.set(x, "riceParameter", js.undefined)
  }
}
