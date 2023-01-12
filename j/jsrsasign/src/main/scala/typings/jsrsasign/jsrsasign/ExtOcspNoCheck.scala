package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.ocspNoCheck
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtOcspNoCheck
  extends StObject
     with ExtParam {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: ocspNoCheck
}
object ExtOcspNoCheck {
  
  inline def apply(): ExtOcspNoCheck = {
    val __obj = js.Dynamic.literal(extname = "ocspNoCheck")
    __obj.asInstanceOf[ExtOcspNoCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtOcspNoCheck] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: ocspNoCheck): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
