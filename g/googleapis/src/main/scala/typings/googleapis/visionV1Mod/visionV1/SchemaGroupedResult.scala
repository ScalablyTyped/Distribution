package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the products similar to a single product in a query
  * image.
  */
trait SchemaGroupedResult extends StObject {
  
  /**
    * The bounding polygon around the product detected in the query image.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.undefined
  
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaResult]] = js.undefined
}
object SchemaGroupedResult {
  
  @scala.inline
  def apply(): SchemaGroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupedResult]
  }
  
  @scala.inline
  implicit class SchemaGroupedResultMutableBuilder[Self <: SchemaGroupedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: SchemaBoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
