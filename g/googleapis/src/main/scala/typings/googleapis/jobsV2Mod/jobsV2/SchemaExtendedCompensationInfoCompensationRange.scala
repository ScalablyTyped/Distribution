package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. See CompensationInfo.  Compensation range.
  */
@js.native
trait SchemaExtendedCompensationInfoCompensationRange extends js.Object {
  
  /**
    * Required.  Maximum value.
    */
  var max: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
  
  /**
    * Required.  Minimum value.
    */
  var min: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
}
object SchemaExtendedCompensationInfoCompensationRange {
  
  @scala.inline
  def apply(): SchemaExtendedCompensationInfoCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationRange]
  }
  
  @scala.inline
  implicit class SchemaExtendedCompensationInfoCompensationRangeOps[Self <: SchemaExtendedCompensationInfoCompensationRange] (val x: Self) extends AnyVal {
    
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
    def setMax(value: SchemaExtendedCompensationInfoDecimal): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: SchemaExtendedCompensationInfoDecimal): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
