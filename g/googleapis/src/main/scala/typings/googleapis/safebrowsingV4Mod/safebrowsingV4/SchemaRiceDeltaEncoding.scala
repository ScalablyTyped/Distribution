package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Rice-Golomb encoded data. Used for sending compressed 4-byte hashes or
  * compressed removal indices.
  */
trait SchemaRiceDeltaEncoding extends StObject {
  
  /**
    * The encoded deltas that are encoded using the Golomb-Rice coder.
    */
  var encodedData: js.UndefOr[String] = js.undefined
  
  /**
    * The offset of the first entry in the encoded data, or, if only a single
    * integer was encoded, that single integer&#39;s value. If the field is
    * empty or missing, assume zero.
    */
  var firstValue: js.UndefOr[String] = js.undefined
  
  /**
    * The number of entries that are delta encoded in the encoded data. If only
    * a single integer was encoded, this will be zero and the single value will
    * be stored in `first_value`.
    */
  var numEntries: js.UndefOr[Double] = js.undefined
  
  /**
    * The Golomb-Rice parameter, which is a number between 2 and 28. This field
    * is missing (that is, zero) if `num_entries` is zero.
    */
  var riceParameter: js.UndefOr[Double] = js.undefined
}
object SchemaRiceDeltaEncoding {
  
  @scala.inline
  def apply(): SchemaRiceDeltaEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRiceDeltaEncoding]
  }
  
  @scala.inline
  implicit class SchemaRiceDeltaEncodingMutableBuilder[Self <: SchemaRiceDeltaEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodedData(value: String): Self = StObject.set(x, "encodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedDataUndefined: Self = StObject.set(x, "encodedData", js.undefined)
    
    @scala.inline
    def setFirstValue(value: String): Self = StObject.set(x, "firstValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstValueUndefined: Self = StObject.set(x, "firstValue", js.undefined)
    
    @scala.inline
    def setNumEntries(value: Double): Self = StObject.set(x, "numEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumEntriesUndefined: Self = StObject.set(x, "numEntries", js.undefined)
    
    @scala.inline
    def setRiceParameter(value: Double): Self = StObject.set(x, "riceParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiceParameterUndefined: Self = StObject.set(x, "riceParameter", js.undefined)
  }
}
