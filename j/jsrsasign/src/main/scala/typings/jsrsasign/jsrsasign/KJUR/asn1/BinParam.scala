package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinParam extends StObject {
  
  var bin: String
}
object BinParam {
  
  inline def apply(bin: String): BinParam = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinParam]
  }
  
  extension [Self <: BinParam](x: Self) {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
  }
}
