package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._PolicyQualifierInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cps
  extends StObject
     with _PolicyQualifierInfo {
  
  var cps: String
}
object Cps {
  
  inline def apply(cps: String): Cps = {
    val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
  
  extension [Self <: Cps](x: Self) {
    
    inline def setCps(value: String): Self = StObject.set(x, "cps", value.asInstanceOf[js.Any])
  }
}
