package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Field Value List Response
  */
trait SchemaCreativeFieldValuesListResponse extends StObject {
  
  /**
    * Creative field value collection.
    */
  var creativeFieldValues: js.UndefOr[js.Array[SchemaCreativeFieldValue]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldValuesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCreativeFieldValuesListResponse {
  
  @scala.inline
  def apply(): SchemaCreativeFieldValuesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeFieldValuesListResponse]
  }
  
  @scala.inline
  implicit class SchemaCreativeFieldValuesListResponseMutableBuilder[Self <: SchemaCreativeFieldValuesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeFieldValues(value: js.Array[SchemaCreativeFieldValue]): Self = StObject.set(x, "creativeFieldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldValuesUndefined: Self = StObject.set(x, "creativeFieldValues", js.undefined)
    
    @scala.inline
    def setCreativeFieldValuesVarargs(value: SchemaCreativeFieldValue*): Self = StObject.set(x, "creativeFieldValues", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
