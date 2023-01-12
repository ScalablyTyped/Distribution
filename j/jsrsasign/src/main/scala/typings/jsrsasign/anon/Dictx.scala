package typings.jsrsasign.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var extname: String
}
object Dictx {
  
  inline def apply(extname: String): Dictx = {
    val __obj = js.Dynamic.literal(extname = extname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
