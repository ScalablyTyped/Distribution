package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoricalValue extends js.Object {
  
  /**
    * Counts of all categories for the categorical feature. If there are more than ten categories, we return top ten (by count) and return one more CategoryCount with category "_OTHER_"
    * and count as aggregate counts of remaining categories.
    */
  var categoryCounts: js.UndefOr[js.Array[CategoryCount]] = js.native
}
object CategoricalValue {
  
  @scala.inline
  def apply(): CategoricalValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoricalValue]
  }
  
  @scala.inline
  implicit class CategoricalValueOps[Self <: CategoricalValue] (val x: Self) extends AnyVal {
    
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
    def setCategoryCountsVarargs(value: CategoryCount*): Self = this.set("categoryCounts", js.Array(value :_*))
    
    @scala.inline
    def setCategoryCounts(value: js.Array[CategoryCount]): Self = this.set("categoryCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryCounts: Self = this.set("categoryCounts", js.undefined)
  }
}
