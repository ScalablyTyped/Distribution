package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTransportBatchOptionsData extends js.Object {
  
  var models: js.Array[_] = js.native
}
object DataSourceTransportBatchOptionsData {
  
  @scala.inline
  def apply(models: js.Array[_]): DataSourceTransportBatchOptionsData = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportBatchOptionsData]
  }
  
  @scala.inline
  implicit class DataSourceTransportBatchOptionsDataOps[Self <: DataSourceTransportBatchOptionsData] (val x: Self) extends AnyVal {
    
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
    def setModelsVarargs(value: js.Any*): Self = this.set("models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: js.Array[_]): Self = this.set("models", value.asInstanceOf[js.Any])
  }
}
