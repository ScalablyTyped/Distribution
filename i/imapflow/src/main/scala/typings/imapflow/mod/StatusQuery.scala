package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusQuery extends StObject {
  
  var highestModseq: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[Boolean] = js.undefined
  
  var recent: js.UndefOr[Boolean] = js.undefined
  
  var uidNext: js.UndefOr[Boolean] = js.undefined
  
  var uidValidity: js.UndefOr[Boolean] = js.undefined
  
  var unseen: js.UndefOr[Boolean] = js.undefined
}
object StatusQuery {
  
  inline def apply(): StatusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusQuery] (val x: Self) extends AnyVal {
    
    inline def setHighestModseq(value: Boolean): Self = StObject.set(x, "highestModseq", value.asInstanceOf[js.Any])
    
    inline def setHighestModseqUndefined: Self = StObject.set(x, "highestModseq", js.undefined)
    
    inline def setMessages(value: Boolean): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setRecent(value: Boolean): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
    
    inline def setRecentUndefined: Self = StObject.set(x, "recent", js.undefined)
    
    inline def setUidNext(value: Boolean): Self = StObject.set(x, "uidNext", value.asInstanceOf[js.Any])
    
    inline def setUidNextUndefined: Self = StObject.set(x, "uidNext", js.undefined)
    
    inline def setUidValidity(value: Boolean): Self = StObject.set(x, "uidValidity", value.asInstanceOf[js.Any])
    
    inline def setUidValidityUndefined: Self = StObject.set(x, "uidValidity", js.undefined)
    
    inline def setUnseen(value: Boolean): Self = StObject.set(x, "unseen", value.asInstanceOf[js.Any])
    
    inline def setUnseenUndefined: Self = StObject.set(x, "unseen", js.undefined)
  }
}
