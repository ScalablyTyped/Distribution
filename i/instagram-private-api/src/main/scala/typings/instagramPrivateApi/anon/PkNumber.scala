package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PkNumber extends StObject {
  
  var pk: Double
}
object PkNumber {
  
  inline def apply(pk: Double): PkNumber = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkNumber]
  }
  
  extension [Self <: PkNumber](x: Self) {
    
    inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
  }
}
