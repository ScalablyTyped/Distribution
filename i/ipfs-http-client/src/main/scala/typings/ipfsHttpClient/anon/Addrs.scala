package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addrs extends StObject {
  
  var Addrs: js.Array[String]
  
  var ID: String
}
object Addrs {
  
  inline def apply(Addrs: js.Array[String], ID: String): Addrs = {
    val __obj = js.Dynamic.literal(Addrs = Addrs.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Addrs] (val x: Self) extends AnyVal {
    
    inline def setAddrs(value: js.Array[String]): Self = StObject.set(x, "Addrs", value.asInstanceOf[js.Any])
    
    inline def setAddrsVarargs(value: String*): Self = StObject.set(x, "Addrs", js.Array(value*))
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
  }
}
