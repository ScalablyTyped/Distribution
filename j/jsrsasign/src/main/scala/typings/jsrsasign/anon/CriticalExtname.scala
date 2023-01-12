package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CriticalExtname extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: js.UndefOr[String] = js.undefined
}
object CriticalExtname {
  
  inline def apply(): CriticalExtname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CriticalExtname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CriticalExtname] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
  }
}
