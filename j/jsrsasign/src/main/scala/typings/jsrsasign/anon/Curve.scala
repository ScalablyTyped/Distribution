package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Curve extends StObject {
  
  var curve: js.UndefOr[String] = js.undefined
  
  var prv: js.UndefOr[String] = js.undefined
  
  var pub: js.UndefOr[String] = js.undefined
}
object Curve {
  
  inline def apply(): Curve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Curve]
  }
  
  extension [Self <: Curve](x: Self) {
    
    inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setPrv(value: String): Self = StObject.set(x, "prv", value.asInstanceOf[js.Any])
    
    inline def setPrvUndefined: Self = StObject.set(x, "prv", js.undefined)
    
    inline def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
    
    inline def setPubUndefined: Self = StObject.set(x, "pub", js.undefined)
  }
}
