package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateNotesResponse extends StObject {
  
  /**
    * The notes that were created.
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.undefined
}
object SchemaBatchCreateNotesResponse {
  
  inline def apply(): SchemaBatchCreateNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateNotesResponse]
  }
  
  extension [Self <: SchemaBatchCreateNotesResponse](x: Self) {
    
    inline def setNotes(value: js.Array[SchemaNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: SchemaNote*): Self = StObject.set(x, "notes", js.Array(value*))
  }
}
