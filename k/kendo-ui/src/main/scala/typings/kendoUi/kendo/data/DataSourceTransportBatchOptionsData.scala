package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransportBatchOptionsData extends StObject {
  
  var models: js.Array[Any]
}
object DataSourceTransportBatchOptionsData {
  
  inline def apply(models: js.Array[Any]): DataSourceTransportBatchOptionsData = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportBatchOptionsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceTransportBatchOptionsData] (val x: Self) extends AnyVal {
    
    inline def setModels(value: js.Array[Any]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsVarargs(value: Any*): Self = StObject.set(x, "models", js.Array(value*))
  }
}
