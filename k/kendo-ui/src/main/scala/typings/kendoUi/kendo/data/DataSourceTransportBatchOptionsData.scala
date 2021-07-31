package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransportBatchOptionsData extends StObject {
  
  var models: js.Array[js.Any]
}
object DataSourceTransportBatchOptionsData {
  
  @scala.inline
  def apply(models: js.Array[js.Any]): DataSourceTransportBatchOptionsData = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportBatchOptionsData]
  }
  
  @scala.inline
  implicit class DataSourceTransportBatchOptionsDataMutableBuilder[Self <: DataSourceTransportBatchOptionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[js.Any]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsVarargs(value: js.Any*): Self = StObject.set(x, "models", js.Array(value :_*))
  }
}
