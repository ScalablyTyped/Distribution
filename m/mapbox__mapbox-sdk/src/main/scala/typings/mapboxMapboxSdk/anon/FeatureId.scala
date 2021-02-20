package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureId extends StObject {
  
  var datasetId: String = js.native
  
  var featureId: String = js.native
}
object FeatureId {
  
  @scala.inline
  def apply(datasetId: String, featureId: String): FeatureId = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureId]
  }
  
  @scala.inline
  implicit class FeatureIdMutableBuilder[Self <: FeatureId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
  }
}
