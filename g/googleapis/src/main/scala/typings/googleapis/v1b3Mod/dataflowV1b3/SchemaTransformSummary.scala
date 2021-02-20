package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of the type, names/ids, and input/outputs for a transform.
  */
@js.native
trait SchemaTransformSummary extends StObject {
  
  /**
    * Transform-specific display data.
    */
  var displayData: js.UndefOr[js.Array[SchemaDisplayData]] = js.native
  
  /**
    * SDK generated id of this transform instance.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * User names for all collection inputs to this transform.
    */
  var inputCollectionName: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Type of transform.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * User provided name for this transform instance.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * User  names for all collection outputs to this transform.
    */
  var outputCollectionName: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTransformSummary {
  
  @scala.inline
  def apply(): SchemaTransformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransformSummary]
  }
  
  @scala.inline
  implicit class SchemaTransformSummaryMutableBuilder[Self <: SchemaTransformSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayData(value: js.Array[SchemaDisplayData]): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    @scala.inline
    def setDisplayDataVarargs(value: SchemaDisplayData*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputCollectionName(value: js.Array[String]): Self = StObject.set(x, "inputCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputCollectionNameUndefined: Self = StObject.set(x, "inputCollectionName", js.undefined)
    
    @scala.inline
    def setInputCollectionNameVarargs(value: String*): Self = StObject.set(x, "inputCollectionName", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputCollectionName(value: js.Array[String]): Self = StObject.set(x, "outputCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputCollectionNameUndefined: Self = StObject.set(x, "outputCollectionName", js.undefined)
    
    @scala.inline
    def setOutputCollectionNameVarargs(value: String*): Self = StObject.set(x, "outputCollectionName", js.Array(value :_*))
  }
}
