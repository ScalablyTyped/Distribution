package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.cRLNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtCRLNumber
  extends StObject
     with ExtParam {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: cRLNumber
  
  var num: js.UndefOr[typings.jsrsasign.anon.Hex] = js.undefined
}
object ExtCRLNumber {
  
  inline def apply(): ExtCRLNumber = {
    val __obj = js.Dynamic.literal(extname = "cRLNumber")
    __obj.asInstanceOf[ExtCRLNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtCRLNumber] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: cRLNumber): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setNum(value: typings.jsrsasign.anon.Hex): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
  }
}
