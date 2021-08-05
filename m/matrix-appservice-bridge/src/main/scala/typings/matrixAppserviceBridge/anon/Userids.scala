package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Userids extends StObject {
  
  var user_ids: js.Array[String]
}
object Userids {
  
  inline def apply(user_ids: js.Array[String]): Userids = {
    val __obj = js.Dynamic.literal(user_ids = user_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userids]
  }
  
  extension [Self <: Userids](x: Self) {
    
    inline def setUser_ids(value: js.Array[String]): Self = StObject.set(x, "user_ids", value.asInstanceOf[js.Any])
    
    inline def setUser_idsVarargs(value: String*): Self = StObject.set(x, "user_ids", js.Array(value :_*))
  }
}
