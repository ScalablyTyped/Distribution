package typings.jsrsasign.jsrsasign

import typings.jsrsasign.anon.Caissuer
import typings.jsrsasign.anon.Ocsp
import typings.jsrsasign.jsrsasignStrings.authorityInfoAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtAuthorityInfoAccess
  extends StObject
     with ExtParam {
  
  var array: js.Array[Ocsp | Caissuer]
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: authorityInfoAccess
}
object ExtAuthorityInfoAccess {
  
  inline def apply(array: js.Array[Ocsp | Caissuer]): ExtAuthorityInfoAccess = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "authorityInfoAccess")
    __obj.asInstanceOf[ExtAuthorityInfoAccess]
  }
  
  extension [Self <: ExtAuthorityInfoAccess](x: Self) {
    
    inline def setArray(value: js.Array[Ocsp | Caissuer]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: (Ocsp | Caissuer)*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: authorityInfoAccess): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
