package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range of values whose location is specified by a DataFilter.
  */
@js.native
trait SchemaDataFilterValueRange extends js.Object {
  
  /**
    * The data filter describing the location of the values in the spreadsheet.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.native
  
  /**
    * The major dimension of the values.
    */
  var majorDimension: js.UndefOr[String] = js.native
  
  /**
    * The data to be written.  If the provided values exceed any of the ranges
    * matched by the data filter then the request will fail.  If the provided
    * values are less than the matched ranges only the specified values will be
    * written, existing values in the matched ranges will remain unaffected.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}
object SchemaDataFilterValueRange {
  
  @scala.inline
  def apply(): SchemaDataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataFilterValueRange]
  }
  
  @scala.inline
  implicit class SchemaDataFilterValueRangeOps[Self <: SchemaDataFilterValueRange] (val x: Self) extends AnyVal {
    
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
    def setDataFilter(value: SchemaDataFilter): Self = this.set("dataFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFilter: Self = this.set("dataFilter", js.undefined)
    
    @scala.inline
    def setMajorDimension(value: String): Self = this.set("majorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorDimension: Self = this.set("majorDimension", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
