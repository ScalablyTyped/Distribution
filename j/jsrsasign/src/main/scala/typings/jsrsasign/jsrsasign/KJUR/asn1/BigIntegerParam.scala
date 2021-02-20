package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigIntegerParam extends StObject {
  
  var bigint: BigInteger = js.native
}
object BigIntegerParam {
  
  @scala.inline
  def apply(bigint: BigInteger): BigIntegerParam = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntegerParam]
  }
  
  @scala.inline
  implicit class BigIntegerParamMutableBuilder[Self <: BigIntegerParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: BigInteger): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
