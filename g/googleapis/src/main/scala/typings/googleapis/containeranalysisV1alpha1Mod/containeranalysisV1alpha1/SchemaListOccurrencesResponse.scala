package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response including listed active occurrences.
  */
trait SchemaListOccurrencesResponse extends StObject {
  
  /**
    * The next pagination token in the list response. It should be used as
    * `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The occurrences requested.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.undefined
}
object SchemaListOccurrencesResponse {
  
  @scala.inline
  def apply(): SchemaListOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOccurrencesResponse]
  }
  
  @scala.inline
  implicit class SchemaListOccurrencesResponseMutableBuilder[Self <: SchemaListOccurrencesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOccurrences(value: js.Array[SchemaOccurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    @scala.inline
    def setOccurrencesVarargs(value: SchemaOccurrence*): Self = StObject.set(x, "occurrences", js.Array(value :_*))
  }
}
