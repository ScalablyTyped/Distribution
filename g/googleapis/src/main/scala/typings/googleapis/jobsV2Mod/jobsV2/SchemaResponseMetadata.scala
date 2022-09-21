package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponseMetadata extends StObject {
  
  /**
    * Identifiers for the versions of the search algorithm used during this API invocation if multiple algorithms are used. The default value is empty. For search response only.
    */
  var experimentIdList: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * For search response only. Indicates the mode of a performed search.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique id associated with this call. This id is logged for tracking purposes.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaResponseMetadata {
  
  inline def apply(): SchemaResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseMetadata]
  }
  
  extension [Self <: SchemaResponseMetadata](x: Self) {
    
    inline def setExperimentIdList(value: js.Array[Double]): Self = StObject.set(x, "experimentIdList", value.asInstanceOf[js.Any])
    
    inline def setExperimentIdListNull: Self = StObject.set(x, "experimentIdList", null)
    
    inline def setExperimentIdListUndefined: Self = StObject.set(x, "experimentIdList", js.undefined)
    
    inline def setExperimentIdListVarargs(value: Double*): Self = StObject.set(x, "experimentIdList", js.Array(value*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
