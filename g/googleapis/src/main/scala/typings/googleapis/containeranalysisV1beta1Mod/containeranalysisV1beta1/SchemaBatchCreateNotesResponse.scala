package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for creating notes in batch.
  */
trait SchemaBatchCreateNotesResponse extends StObject {
  
  /**
    * The notes that were created.
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.undefined
}
object SchemaBatchCreateNotesResponse {
  
  @scala.inline
  def apply(): SchemaBatchCreateNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateNotesResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchCreateNotesResponseMutableBuilder[Self <: SchemaBatchCreateNotesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(value: js.Array[SchemaNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: SchemaNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
