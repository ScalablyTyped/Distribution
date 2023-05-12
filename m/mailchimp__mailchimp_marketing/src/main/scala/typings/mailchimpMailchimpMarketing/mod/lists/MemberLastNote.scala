package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberLastNote extends StObject {
  
  var created_at: String
  
  var created_by: String
  
  var note: String
  
  var note_id: Double
}
object MemberLastNote {
  
  inline def apply(created_at: String, created_by: String, note: String, note_id: Double): MemberLastNote = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_id = note_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberLastNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberLastNote] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNote_id(value: Double): Self = StObject.set(x, "note_id", value.asInstanceOf[js.Any])
  }
}
