package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortColumn extends js.Object {
  
  /** The string name of the property in your data model you want that column to represent. Can also be a property path on your data model. 'foo.bar.myField', 'Name.First', etc.. */
  var field: String = js.native
  
  /** Sets the sort function for the column. Useful when you have data that is formatted in an unusal way or if you want to sort on an underlying data type. Example: function(a,b){return a > b} */
  var sortingAlgorithm: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
}
object SortColumn {
  
  @scala.inline
  def apply(field: String): SortColumn = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn]
  }
  
  @scala.inline
  implicit class SortColumnOps[Self <: SortColumn] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingAlgorithm(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sortingAlgorithm", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSortingAlgorithm: Self = this.set("sortingAlgorithm", js.undefined)
  }
}
