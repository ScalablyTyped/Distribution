package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compensation range.
  */
@js.native
trait SchemaCompensationRange extends js.Object {
  
  /**
    * Optional.  The maximum amount of compensation. If left empty, the value
    * is set to a maximal compensation value and the currency code is set to
    * match the currency code of min_compensation.
    */
  var maxCompensation: js.UndefOr[SchemaMoney] = js.native
  
  /**
    * Optional.  The minimum amount of compensation. If left empty, the value
    * is set to zero and the currency code is set to match the currency code of
    * max_compensation.
    */
  var minCompensation: js.UndefOr[SchemaMoney] = js.native
}
object SchemaCompensationRange {
  
  @scala.inline
  def apply(): SchemaCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationRange]
  }
  
  @scala.inline
  implicit class SchemaCompensationRangeOps[Self <: SchemaCompensationRange] (val x: Self) extends AnyVal {
    
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
    def setMaxCompensation(value: SchemaMoney): Self = this.set("maxCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCompensation: Self = this.set("maxCompensation", js.undefined)
    
    @scala.inline
    def setMinCompensation(value: SchemaMoney): Self = this.set("minCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCompensation: Self = this.set("minCompensation", js.undefined)
  }
}
