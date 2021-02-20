package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPostalCodeRange extends StObject {
  
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive
    * lower bound of the range defining the area. Examples values:
    * &quot;94108&quot;, &quot;9410*&quot;, &quot;9*&quot;. Required.
    */
  var postalCodeRangeBegin: js.UndefOr[String] = js.native
  
  /**
    * A postal code or a pattern of the form prefix* denoting the inclusive
    * upper bound of the range defining the area. It must have the same length
    * as postalCodeRangeBegin: if postalCodeRangeBegin is a postal code then
    * postalCodeRangeEnd must be a postal code too; if postalCodeRangeBegin is
    * a pattern then postalCodeRangeEnd must be a pattern with the same prefix
    * length. Optional: if not set, then the area is defined as being all the
    * postal codes matching postalCodeRangeBegin.
    */
  var postalCodeRangeEnd: js.UndefOr[String] = js.native
}
object SchemaPostalCodeRange {
  
  @scala.inline
  def apply(): SchemaPostalCodeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodeRange]
  }
  
  @scala.inline
  implicit class SchemaPostalCodeRangeMutableBuilder[Self <: SchemaPostalCodeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostalCodeRangeBegin(value: String): Self = StObject.set(x, "postalCodeRangeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeRangeBeginUndefined: Self = StObject.set(x, "postalCodeRangeBegin", js.undefined)
    
    @scala.inline
    def setPostalCodeRangeEnd(value: String): Self = StObject.set(x, "postalCodeRangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeRangeEndUndefined: Self = StObject.set(x, "postalCodeRangeEnd", js.undefined)
  }
}
