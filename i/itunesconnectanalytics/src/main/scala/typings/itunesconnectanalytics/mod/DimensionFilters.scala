package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionFilters extends js.Object {
  
  var dimensionKey: dimensionFilterKey = js.native
  
  var optionKeys: js.Array[String] = js.native
}
object DimensionFilters {
  
  @scala.inline
  def apply(dimensionKey: dimensionFilterKey, optionKeys: js.Array[String]): DimensionFilters = {
    val __obj = js.Dynamic.literal(dimensionKey = dimensionKey.asInstanceOf[js.Any], optionKeys = optionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionFilters]
  }
  
  @scala.inline
  implicit class DimensionFiltersOps[Self <: DimensionFilters] (val x: Self) extends AnyVal {
    
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
    def setDimensionKey(value: dimensionFilterKey): Self = this.set("dimensionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionKeysVarargs(value: String*): Self = this.set("optionKeys", js.Array(value :_*))
    
    @scala.inline
    def setOptionKeys(value: js.Array[String]): Self = this.set("optionKeys", value.asInstanceOf[js.Any])
  }
}
