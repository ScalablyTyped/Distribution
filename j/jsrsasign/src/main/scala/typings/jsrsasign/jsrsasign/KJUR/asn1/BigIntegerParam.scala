package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigIntegerParam extends StObject {
  
  var bigint: BigInteger
}
object BigIntegerParam {
  
  inline def apply(bigint: BigInteger): BigIntegerParam = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntegerParam]
  }
  
  extension [Self <: BigIntegerParam](x: Self) {
    
    inline def setBigint(value: BigInteger): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
