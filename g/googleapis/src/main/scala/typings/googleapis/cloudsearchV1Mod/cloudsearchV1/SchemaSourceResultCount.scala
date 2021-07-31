package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Per source result count information.
  */
trait SchemaSourceResultCount extends StObject {
  
  /**
    * Whether there are more search results for this source.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The estimated result count for this source.
    */
  var resultCountEstimate: js.UndefOr[String] = js.undefined
  
  /**
    * The exact result count for this source.
    */
  var resultCountExact: js.UndefOr[String] = js.undefined
  
  /**
    * The source the result count information is associated with.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaSourceResultCount {
  
  @scala.inline
  def apply(): SchemaSourceResultCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceResultCount]
  }
  
  @scala.inline
  implicit class SchemaSourceResultCountMutableBuilder[Self <: SchemaSourceResultCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    @scala.inline
    def setResultCountEstimate(value: String): Self = StObject.set(x, "resultCountEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCountEstimateUndefined: Self = StObject.set(x, "resultCountEstimate", js.undefined)
    
    @scala.inline
    def setResultCountExact(value: String): Self = StObject.set(x, "resultCountExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCountExactUndefined: Self = StObject.set(x, "resultCountExact", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
