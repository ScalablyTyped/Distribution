package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  /** The list of top-level objects for the data source. The maximum number of elements is 10. */
  var objectDefinitions: js.UndefOr[js.Array[ObjectDefinition]] = js.undefined
  
  /** IDs of the Long Running Operations (LROs) currently running for this schema. After modifying the schema, wait for operations to complete before indexing additional content. */
  var operationIds: js.UndefOr[js.Array[String]] = js.undefined
}
object Schema {
  
  inline def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema]
  }
  
  extension [Self <: Schema](x: Self) {
    
    inline def setObjectDefinitions(value: js.Array[ObjectDefinition]): Self = StObject.set(x, "objectDefinitions", value.asInstanceOf[js.Any])
    
    inline def setObjectDefinitionsUndefined: Self = StObject.set(x, "objectDefinitions", js.undefined)
    
    inline def setObjectDefinitionsVarargs(value: ObjectDefinition*): Self = StObject.set(x, "objectDefinitions", js.Array(value :_*))
    
    inline def setOperationIds(value: js.Array[String]): Self = StObject.set(x, "operationIds", value.asInstanceOf[js.Any])
    
    inline def setOperationIdsUndefined: Self = StObject.set(x, "operationIds", js.undefined)
    
    inline def setOperationIdsVarargs(value: String*): Self = StObject.set(x, "operationIds", js.Array(value :_*))
  }
}
