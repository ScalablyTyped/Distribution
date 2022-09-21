package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Localid extends StObject {
  
  var localid: String | js.Array[String]
}
object Localid {
  
  inline def apply(localid: String | js.Array[String]): Localid = {
    val __obj = js.Dynamic.literal(localid = localid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Localid]
  }
  
  extension [Self <: Localid](x: Self) {
    
    inline def setLocalid(value: String | js.Array[String]): Self = StObject.set(x, "localid", value.asInstanceOf[js.Any])
    
    inline def setLocalidVarargs(value: String*): Self = StObject.set(x, "localid", js.Array(value*))
  }
}
