package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetResult extends StObject {
  
  /** FacetBuckets for values in response containing at least a single result with the corresponding filter. */
  var buckets: js.UndefOr[js.Array[FacetBucket]] = js.undefined
  
  /** Object type for which facet results are returned. Can be empty. */
  var objectType: js.UndefOr[String] = js.undefined
  
  /** The name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions */
  var operatorName: js.UndefOr[String] = js.undefined
  
  /** Source name for which facet results are returned. Will not be empty. */
  var sourceName: js.UndefOr[String] = js.undefined
}
object FacetResult {
  
  inline def apply(): FacetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FacetResult] (val x: Self) extends AnyVal {
    
    inline def setBuckets(value: js.Array[FacetBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: FacetBucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
  }
}
