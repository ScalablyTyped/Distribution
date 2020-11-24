package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Rice-Golomb encoded data. Used for sending compressed 4-byte hashes or
  * compressed removal indices.
  */
@js.native
trait SchemaRiceDeltaEncoding extends js.Object {
  
  /**
    * The encoded deltas that are encoded using the Golomb-Rice coder.
    */
  var encodedData: js.UndefOr[String] = js.native
  
  /**
    * The offset of the first entry in the encoded data, or, if only a single
    * integer was encoded, that single integer&#39;s value. If the field is
    * empty or missing, assume zero.
    */
  var firstValue: js.UndefOr[String] = js.native
  
  /**
    * The number of entries that are delta encoded in the encoded data. If only
    * a single integer was encoded, this will be zero and the single value will
    * be stored in `first_value`.
    */
  var numEntries: js.UndefOr[Double] = js.native
  
  /**
    * The Golomb-Rice parameter, which is a number between 2 and 28. This field
    * is missing (that is, zero) if `num_entries` is zero.
    */
  var riceParameter: js.UndefOr[Double] = js.native
}
object SchemaRiceDeltaEncoding {
  
  @scala.inline
  def apply(): SchemaRiceDeltaEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRiceDeltaEncoding]
  }
  
  @scala.inline
  implicit class SchemaRiceDeltaEncodingOps[Self <: SchemaRiceDeltaEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncodedData(value: String): Self = this.set("encodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedData: Self = this.set("encodedData", js.undefined)
    
    @scala.inline
    def setFirstValue(value: String): Self = this.set("firstValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstValue: Self = this.set("firstValue", js.undefined)
    
    @scala.inline
    def setNumEntries(value: Double): Self = this.set("numEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumEntries: Self = this.set("numEntries", js.undefined)
    
    @scala.inline
    def setRiceParameter(value: Double): Self = this.set("riceParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiceParameter: Self = this.set("riceParameter", js.undefined)
  }
}
