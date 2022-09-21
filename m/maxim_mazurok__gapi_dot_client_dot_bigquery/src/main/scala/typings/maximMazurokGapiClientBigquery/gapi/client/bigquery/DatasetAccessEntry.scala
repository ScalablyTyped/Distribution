package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetAccessEntry extends StObject {
  
  /** [Required] The dataset this entry applies to. */
  var dataset: js.UndefOr[DatasetReference] = js.undefined
  
  var targetTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object DatasetAccessEntry {
  
  inline def apply(): DatasetAccessEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetAccessEntry]
  }
  
  extension [Self <: DatasetAccessEntry](x: Self) {
    
    inline def setDataset(value: DatasetReference): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setTargetTypes(value: js.Array[String]): Self = StObject.set(x, "targetTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetTypesUndefined: Self = StObject.set(x, "targetTypes", js.undefined)
    
    inline def setTargetTypesVarargs(value: String*): Self = StObject.set(x, "targetTypes", js.Array(value*))
  }
}
