package typings.jsrsasign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "ECPointFp")
@js.native
open class ECPointFp protected ()
  extends StObject
     with typings.jsrsasign.jsrsasign.ECPointFp {
  def this(
    curve: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    x: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    y: typings.jsrsasign.jsrsasign.ECFieldElementFp
  ) = this()
  def this(
    curve: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    x: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    y: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    z: typings.jsrsasign.jsrsasign.BigInteger
  ) = this()
  
  /* CompleteClass */
  var curve: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  var x: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  var y: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  var z: typings.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* CompleteClass */
  var zinv: typings.jsrsasign.jsrsasign.BigInteger | Null = js.native
}
