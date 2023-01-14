package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credid extends StObject {
  
  var cred_id: String
  
  var revealed: Boolean
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object Credid {
  
  inline def apply(cred_id: String, revealed: Boolean): Credid = {
    val __obj = js.Dynamic.literal(cred_id = cred_id.asInstanceOf[js.Any], revealed = revealed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credid] (val x: Self) extends AnyVal {
    
    inline def setCred_id(value: String): Self = StObject.set(x, "cred_id", value.asInstanceOf[js.Any])
    
    inline def setRevealed(value: Boolean): Self = StObject.set(x, "revealed", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
