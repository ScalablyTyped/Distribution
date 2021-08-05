package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create notes in batch.
  */
trait SchemaBatchCreateNotesRequest extends StObject {
  
  /**
    * The notes to create. Max allowed length is 1000.
    */
  var notes: js.UndefOr[StringDictionary[SchemaNote]] = js.undefined
}
object SchemaBatchCreateNotesRequest {
  
  inline def apply(): SchemaBatchCreateNotesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateNotesRequest]
  }
  
  extension [Self <: SchemaBatchCreateNotesRequest](x: Self) {
    
    inline def setNotes(value: StringDictionary[SchemaNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
  }
}
