package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendResonseObject extends StObject {
  
  var path: String
  
  var seq: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
  
  var uidValidity: js.UndefOr[js.BigInt] = js.undefined
}
object AppendResonseObject {
  
  inline def apply(path: String): AppendResonseObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendResonseObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppendResonseObject] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setSeqUndefined: Self = StObject.set(x, "seq", js.undefined)
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUidValidity(value: js.BigInt): Self = StObject.set(x, "uidValidity", value.asInstanceOf[js.Any])
    
    inline def setUidValidityUndefined: Self = StObject.set(x, "uidValidity", js.undefined)
  }
}
