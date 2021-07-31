package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create occurrences in batch.
  */
trait SchemaBatchCreateOccurrencesRequest extends StObject {
  
  /**
    * The occurrences to create. Max allowed length is 1000.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.undefined
}
object SchemaBatchCreateOccurrencesRequest {
  
  @scala.inline
  def apply(): SchemaBatchCreateOccurrencesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateOccurrencesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchCreateOccurrencesRequestMutableBuilder[Self <: SchemaBatchCreateOccurrencesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrences(value: js.Array[SchemaOccurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    @scala.inline
    def setOccurrencesVarargs(value: SchemaOccurrence*): Self = StObject.set(x, "occurrences", js.Array(value :_*))
  }
}
