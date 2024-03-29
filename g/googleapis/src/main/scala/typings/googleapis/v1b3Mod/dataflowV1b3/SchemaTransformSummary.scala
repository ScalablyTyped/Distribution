package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransformSummary extends StObject {
  
  /**
    * Transform-specific display data.
    */
  var displayData: js.UndefOr[js.Array[SchemaDisplayData]] = js.undefined
  
  /**
    * SDK generated id of this transform instance.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User names for all collection inputs to this transform.
    */
  var inputCollectionName: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Type of transform.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User provided name for this transform instance.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User names for all collection outputs to this transform.
    */
  var outputCollectionName: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTransformSummary {
  
  inline def apply(): SchemaTransformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransformSummary]
  }
  
  extension [Self <: SchemaTransformSummary](x: Self) {
    
    inline def setDisplayData(value: js.Array[SchemaDisplayData]): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    inline def setDisplayDataVarargs(value: SchemaDisplayData*): Self = StObject.set(x, "displayData", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputCollectionName(value: js.Array[String]): Self = StObject.set(x, "inputCollectionName", value.asInstanceOf[js.Any])
    
    inline def setInputCollectionNameNull: Self = StObject.set(x, "inputCollectionName", null)
    
    inline def setInputCollectionNameUndefined: Self = StObject.set(x, "inputCollectionName", js.undefined)
    
    inline def setInputCollectionNameVarargs(value: String*): Self = StObject.set(x, "inputCollectionName", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputCollectionName(value: js.Array[String]): Self = StObject.set(x, "outputCollectionName", value.asInstanceOf[js.Any])
    
    inline def setOutputCollectionNameNull: Self = StObject.set(x, "outputCollectionName", null)
    
    inline def setOutputCollectionNameUndefined: Self = StObject.set(x, "outputCollectionName", js.undefined)
    
    inline def setOutputCollectionNameVarargs(value: String*): Self = StObject.set(x, "outputCollectionName", js.Array(value*))
  }
}
