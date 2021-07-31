package typings.jsrsasign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "BigInteger")
@js.native
class BigInteger ()
  extends StObject
     with typings.jsrsasign.jsrsasign.BigInteger {
  
  /* CompleteClass */
  override def abs(): typings.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* CompleteClass */
  override def bitLength(): Double = js.native
  
  /* CompleteClass */
  override def compareTo(a: typings.jsrsasign.jsrsasign.BigInteger): Double = js.native
  
  /* CompleteClass */
  override def mod(a: typings.jsrsasign.jsrsasign.BigInteger): typings.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* CompleteClass */
  override def modPowInt(e: Double, m: typings.jsrsasign.jsrsasign.BigInteger): typings.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* CompleteClass */
  override def negate(): typings.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* CompleteClass */
  override def toString(b: Double): String = js.native
}
object BigInteger {
  
  /* static member */
  @JSImport("jsrsasign", "BigInteger.ONE")
  @js.native
  val ONE: typings.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* static member */
  @JSImport("jsrsasign", "BigInteger.ZERO")
  @js.native
  val ZERO: typings.jsrsasign.jsrsasign.BigInteger = js.native
}
