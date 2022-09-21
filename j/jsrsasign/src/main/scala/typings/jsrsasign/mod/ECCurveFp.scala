package typings.jsrsasign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "ECCurveFp")
@js.native
open class ECCurveFp protected ()
  extends StObject
     with typings.jsrsasign.jsrsasign.ECCurveFp {
  def this(
    q: typings.jsrsasign.jsrsasign.BigInteger,
    a: typings.jsrsasign.jsrsasign.BigInteger,
    b: typings.jsrsasign.jsrsasign.BigInteger
  ) = this()
  
  /* CompleteClass */
  var a: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  var b: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  override def decodePointHex(): typings.jsrsasign.jsrsasign.ECPointFp | Null = js.native
  
  /* CompleteClass */
  override def equals(): Boolean = js.native
  
  /* CompleteClass */
  override def fromBigInteger(): typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  override def getA(): typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  override def getB(): typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  override def getInfinity(): typings.jsrsasign.jsrsasign.ECPointFp = js.native
  
  /* CompleteClass */
  override def getQ(): typings.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* CompleteClass */
  var infinity: typings.jsrsasign.jsrsasign.ECPointFp = js.native
  
  /* CompleteClass */
  var q: typings.jsrsasign.jsrsasign.BigInteger = js.native
}
