package typings.kavenegar.anon

import typings.kavenegar.kavenegarNumbers.`0`
import typings.kavenegar.kavenegarNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Isread extends StObject {
  
  var isread: `0` | `1`
  
  var linenumber: String
}
object Isread {
  
  inline def apply(isread: `0` | `1`, linenumber: String): Isread = {
    val __obj = js.Dynamic.literal(isread = isread.asInstanceOf[js.Any], linenumber = linenumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isread]
  }
  
  extension [Self <: Isread](x: Self) {
    
    inline def setIsread(value: `0` | `1`): Self = StObject.set(x, "isread", value.asInstanceOf[js.Any])
    
    inline def setLinenumber(value: String): Self = StObject.set(x, "linenumber", value.asInstanceOf[js.Any])
  }
}
