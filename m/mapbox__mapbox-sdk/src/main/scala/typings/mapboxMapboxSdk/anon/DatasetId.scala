package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetId extends StObject {
  
  var datasetId: String
}
object DatasetId {
  
  @scala.inline
  def apply(datasetId: String): DatasetId = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetId]
  }
  
  @scala.inline
  implicit class DatasetIdMutableBuilder[Self <: DatasetId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
  }
}
