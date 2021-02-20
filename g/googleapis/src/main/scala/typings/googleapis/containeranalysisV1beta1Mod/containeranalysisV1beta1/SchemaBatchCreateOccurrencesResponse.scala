package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for creating occurrences in batch.
  */
@js.native
trait SchemaBatchCreateOccurrencesResponse extends StObject {
  
  /**
    * The occurrences that were created.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.native
}
object SchemaBatchCreateOccurrencesResponse {
  
  @scala.inline
  def apply(): SchemaBatchCreateOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateOccurrencesResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchCreateOccurrencesResponseMutableBuilder[Self <: SchemaBatchCreateOccurrencesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrences(value: js.Array[SchemaOccurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    @scala.inline
    def setOccurrencesVarargs(value: SchemaOccurrence*): Self = StObject.set(x, "occurrences", js.Array(value :_*))
  }
}
