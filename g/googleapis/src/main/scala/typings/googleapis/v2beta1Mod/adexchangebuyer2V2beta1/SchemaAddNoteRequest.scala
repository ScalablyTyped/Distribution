package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddNoteRequest extends StObject {
  
  /**
    * Details of the note to add.
    */
  var note: js.UndefOr[SchemaNote] = js.undefined
}
object SchemaAddNoteRequest {
  
  inline def apply(): SchemaAddNoteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddNoteRequest]
  }
  
  extension [Self <: SchemaAddNoteRequest](x: Self) {
    
    inline def setNote(value: SchemaNote): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
