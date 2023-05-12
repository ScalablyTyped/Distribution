package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecialUseHints extends StObject {
  
  var drafts: String
  
  var junk: String
  
  var sent: String
  
  var trash: String
}
object SpecialUseHints {
  
  inline def apply(drafts: String, junk: String, sent: String, trash: String): SpecialUseHints = {
    val __obj = js.Dynamic.literal(drafts = drafts.asInstanceOf[js.Any], junk = junk.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], trash = trash.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecialUseHints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecialUseHints] (val x: Self) extends AnyVal {
    
    inline def setDrafts(value: String): Self = StObject.set(x, "drafts", value.asInstanceOf[js.Any])
    
    inline def setJunk(value: String): Self = StObject.set(x, "junk", value.asInstanceOf[js.Any])
    
    inline def setSent(value: String): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setTrash(value: String): Self = StObject.set(x, "trash", value.asInstanceOf[js.Any])
  }
}
