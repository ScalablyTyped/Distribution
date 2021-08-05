package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Curve extends StObject {
  
  var curve: String
  
  var pub: js.UndefOr[String] = js.undefined
}
object Curve {
  
  inline def apply(curve: String): Curve = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
  
  extension [Self <: Curve](x: Self) {
    
    inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
    
    inline def setPubUndefined: Self = StObject.set(x, "pub", js.undefined)
  }
}
