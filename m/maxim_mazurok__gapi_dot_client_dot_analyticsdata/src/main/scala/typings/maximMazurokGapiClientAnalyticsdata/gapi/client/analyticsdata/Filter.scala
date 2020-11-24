package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /** A filter for two values. */
  var betweenFilter: js.UndefOr[BetweenFilter] = js.native
  
  /** The dimension name or metric name. Must be a name defined in dimensions or metrics. */
  var fieldName: js.UndefOr[String] = js.native
  
  /** A filter for in list values. */
  var inListFilter: js.UndefOr[InListFilter] = js.native
  
  /**
    * A filter for null values. If True, a null dimension value is matched by this filter. Null filter is commonly used inside a NOT filter expression. For example, a NOT expression of a
    * null filter removes rows when a dimension is null.
    */
  var nullFilter: js.UndefOr[Boolean] = js.native
  
  /** A filter for numeric or date values. */
  var numericFilter: js.UndefOr[NumericFilter] = js.native
  
  /** Strings related filter. */
  var stringFilter: js.UndefOr[StringFilter] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setBetweenFilter(value: BetweenFilter): Self = this.set("betweenFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetweenFilter: Self = this.set("betweenFilter", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setInListFilter(value: InListFilter): Self = this.set("inListFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInListFilter: Self = this.set("inListFilter", js.undefined)
    
    @scala.inline
    def setNullFilter(value: Boolean): Self = this.set("nullFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullFilter: Self = this.set("nullFilter", js.undefined)
    
    @scala.inline
    def setNumericFilter(value: NumericFilter): Self = this.set("numericFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericFilter: Self = this.set("numericFilter", js.undefined)
    
    @scala.inline
    def setStringFilter(value: StringFilter): Self = this.set("stringFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringFilter: Self = this.set("stringFilter", js.undefined)
  }
}
