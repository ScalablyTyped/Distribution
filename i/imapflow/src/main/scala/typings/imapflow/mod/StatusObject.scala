package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusObject extends StObject {
  
  var highestModSeq: js.UndefOr[js.BigInt] = js.undefined
  
  var message: js.UndefOr[Double] = js.undefined
  
  var path: String
  
  var recent: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
  
  var uidValidity: js.UndefOr[js.BigInt] = js.undefined
  
  var unseen: js.UndefOr[Double] = js.undefined
}
object StatusObject {
  
  inline def apply(path: String): StatusObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusObject] (val x: Self) extends AnyVal {
    
    inline def setHighestModSeq(value: js.BigInt): Self = StObject.set(x, "highestModSeq", value.asInstanceOf[js.Any])
    
    inline def setHighestModSeqUndefined: Self = StObject.set(x, "highestModSeq", js.undefined)
    
    inline def setMessage(value: Double): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRecent(value: Double): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
    
    inline def setRecentUndefined: Self = StObject.set(x, "recent", js.undefined)
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUidValidity(value: js.BigInt): Self = StObject.set(x, "uidValidity", value.asInstanceOf[js.Any])
    
    inline def setUidValidityUndefined: Self = StObject.set(x, "uidValidity", js.undefined)
    
    inline def setUnseen(value: Double): Self = StObject.set(x, "unseen", value.asInstanceOf[js.Any])
    
    inline def setUnseenUndefined: Self = StObject.set(x, "unseen", js.undefined)
  }
}
