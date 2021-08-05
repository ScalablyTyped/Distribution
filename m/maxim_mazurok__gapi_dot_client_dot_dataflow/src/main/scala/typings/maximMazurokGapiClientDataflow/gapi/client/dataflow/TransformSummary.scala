package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformSummary extends StObject {
  
  /** Transform-specific display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.undefined
  
  /** SDK generated id of this transform instance. */
  var id: js.UndefOr[String] = js.undefined
  
  /** User names for all collection inputs to this transform. */
  var inputCollectionName: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Type of transform. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** User provided name for this transform instance. */
  var name: js.UndefOr[String] = js.undefined
  
  /** User names for all collection outputs to this transform. */
  var outputCollectionName: js.UndefOr[js.Array[String]] = js.undefined
}
object TransformSummary {
  
  inline def apply(): TransformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformSummary]
  }
  
  extension [Self <: TransformSummary](x: Self) {
    
    inline def setDisplayData(value: js.Array[DisplayData]): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    inline def setDisplayDataVarargs(value: DisplayData*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputCollectionName(value: js.Array[String]): Self = StObject.set(x, "inputCollectionName", value.asInstanceOf[js.Any])
    
    inline def setInputCollectionNameUndefined: Self = StObject.set(x, "inputCollectionName", js.undefined)
    
    inline def setInputCollectionNameVarargs(value: String*): Self = StObject.set(x, "inputCollectionName", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputCollectionName(value: js.Array[String]): Self = StObject.set(x, "outputCollectionName", value.asInstanceOf[js.Any])
    
    inline def setOutputCollectionNameUndefined: Self = StObject.set(x, "outputCollectionName", js.undefined)
    
    inline def setOutputCollectionNameVarargs(value: String*): Self = StObject.set(x, "outputCollectionName", js.Array(value :_*))
  }
}
