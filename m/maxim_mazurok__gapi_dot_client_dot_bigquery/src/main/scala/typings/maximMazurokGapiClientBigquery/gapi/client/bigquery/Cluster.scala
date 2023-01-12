package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /** Centroid id. */
  var centroidId: js.UndefOr[String] = js.undefined
  
  /** Count of training data rows that were assigned to this cluster. */
  var count: js.UndefOr[String] = js.undefined
  
  /** Values of highly variant features for this cluster. */
  var featureValues: js.UndefOr[js.Array[FeatureValue]] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setCentroidId(value: String): Self = StObject.set(x, "centroidId", value.asInstanceOf[js.Any])
    
    inline def setCentroidIdUndefined: Self = StObject.set(x, "centroidId", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFeatureValues(value: js.Array[FeatureValue]): Self = StObject.set(x, "featureValues", value.asInstanceOf[js.Any])
    
    inline def setFeatureValuesUndefined: Self = StObject.set(x, "featureValues", js.undefined)
    
    inline def setFeatureValuesVarargs(value: FeatureValue*): Self = StObject.set(x, "featureValues", js.Array(value*))
  }
}
