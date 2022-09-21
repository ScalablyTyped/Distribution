package typings.indySdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp extends StObject {
  
  var cred_id: String
  
  var timestamp: js.UndefOr[Double] = js.undefined
}
object Timestamp {
  
  inline def apply(cred_id: String): Timestamp = {
    val __obj = js.Dynamic.literal(cred_id = cred_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
  
  extension [Self <: Timestamp](x: Self) {
    
    inline def setCred_id(value: String): Self = StObject.set(x, "cred_id", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
