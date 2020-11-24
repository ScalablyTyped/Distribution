package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Always use CompensationFilter.  Input only.  Filter on job
  * compensation type and amount.
  */
@js.native
trait SchemaExtendedCompensationFilter extends js.Object {
  
  /**
    * Optional.  Compensation range.
    */
  var compensationRange: js.UndefOr[SchemaExtendedCompensationInfoCompensationRange] = js.native
  
  /**
    * Required.  Specify desired `base compensation entry&#39;s`
    * ExtendedCompensationInfo.CompensationUnit.
    */
  var compensationUnits: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.  Specify currency in 3-letter [ISO
    * 4217](https://www.iso.org/iso-4217-currency-codes.html) format. If
    * unspecified, jobs are returned regardless of currency.
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * Optional.  Whether to include jobs whose compensation range is
    * unspecified.
    */
  var includeJobWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.native
  
  /**
    * Required.  Type of filter.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaExtendedCompensationFilter {
  
  @scala.inline
  def apply(): SchemaExtendedCompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationFilter]
  }
  
  @scala.inline
  implicit class SchemaExtendedCompensationFilterOps[Self <: SchemaExtendedCompensationFilter] (val x: Self) extends AnyVal {
    
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
    def setCompensationRange(value: SchemaExtendedCompensationInfoCompensationRange): Self = this.set("compensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompensationRange: Self = this.set("compensationRange", js.undefined)
    
    @scala.inline
    def setCompensationUnitsVarargs(value: String*): Self = this.set("compensationUnits", js.Array(value :_*))
    
    @scala.inline
    def setCompensationUnits(value: js.Array[String]): Self = this.set("compensationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompensationUnits: Self = this.set("compensationUnits", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setIncludeJobWithUnspecifiedCompensationRange(value: Boolean): Self = this.set("includeJobWithUnspecifiedCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeJobWithUnspecifiedCompensationRange: Self = this.set("includeJobWithUnspecifiedCompensationRange", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
