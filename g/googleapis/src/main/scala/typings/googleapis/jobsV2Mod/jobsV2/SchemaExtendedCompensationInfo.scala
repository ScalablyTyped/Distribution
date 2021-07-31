package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use CompensationInfo.  Describes job compensation.
  */
trait SchemaExtendedCompensationInfo extends StObject {
  
  /**
    * Output only.  Annualized base compensation range.
    */
  var annualizedBaseCompensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.undefined
  
  /**
    * Output only.  Indicates annualized base compensation range cannot be
    * derived, due to the job&#39;s base compensation entry cannot be
    * annualized. See CompensationEntry for explanation on annualization and
    * base compensation entry.
    */
  var annualizedBaseCompensationUnspecified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only.  Annualized total compensation range.
    */
  var annualizedTotalCompensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.undefined
  
  /**
    * Output only.  Indicates annualized total compensation range cannot be
    * derived, due to the job&#39;s all CompensationEntry cannot be annualized.
    * See CompensationEntry for explanation on annualization and base
    * compensation entry.
    */
  var annualizedTotalCompensationUnspecified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.  A 3-letter [ISO
    * 4217](https://www.iso.org/iso-4217-currency-codes.html) currency code.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  Job compensation information.  At most one entry can be of
    * type ExtendedCompensationInfo.CompensationType.BASE, which is referred as
    * ** base compensation entry ** for the job.
    */
  var entries: js.UndefOr[js.Array[SchemaExtendedCompensationInfoCompensationEntry]] = js.undefined
}
object SchemaExtendedCompensationInfo {
  
  @scala.inline
  def apply(): SchemaExtendedCompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfo]
  }
  
  @scala.inline
  implicit class SchemaExtendedCompensationInfoMutableBuilder[Self <: SchemaExtendedCompensationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnualizedBaseCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = StObject.set(x, "annualizedBaseCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnualizedBaseCompensationRangeUndefined: Self = StObject.set(x, "annualizedBaseCompensationRange", js.undefined)
    
    @scala.inline
    def setAnnualizedBaseCompensationUnspecified(value: Boolean): Self = StObject.set(x, "annualizedBaseCompensationUnspecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnualizedBaseCompensationUnspecifiedUndefined: Self = StObject.set(x, "annualizedBaseCompensationUnspecified", js.undefined)
    
    @scala.inline
    def setAnnualizedTotalCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = StObject.set(x, "annualizedTotalCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnualizedTotalCompensationRangeUndefined: Self = StObject.set(x, "annualizedTotalCompensationRange", js.undefined)
    
    @scala.inline
    def setAnnualizedTotalCompensationUnspecified(value: Boolean): Self = StObject.set(x, "annualizedTotalCompensationUnspecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnualizedTotalCompensationUnspecifiedUndefined: Self = StObject.set(x, "annualizedTotalCompensationUnspecified", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[SchemaExtendedCompensationInfoCompensationEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaExtendedCompensationInfoCompensationEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
