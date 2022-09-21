package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bigint extends StObject {
  
  var bigint: Double
}
object Bigint {
  
  inline def apply(bigint: Double): Bigint = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bigint]
  }
  
  extension [Self <: Bigint](x: Self) {
    
    inline def setBigint(value: Double): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
