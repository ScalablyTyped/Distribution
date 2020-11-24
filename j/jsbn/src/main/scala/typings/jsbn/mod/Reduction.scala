package typings.jsbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reduction extends js.Object {
  
  def convert(x: BigInteger): BigInteger = js.native
  
  def mulTo(x: BigInteger, y: BigInteger, r: BigInteger): Unit = js.native
  
  def reduce(x: BigInteger): Unit = js.native
  
  def revert(x: BigInteger): BigInteger = js.native
  
  def sqrTo(x: BigInteger, r: BigInteger): Unit = js.native
}
object Reduction {
  
  @scala.inline
  def apply(
    convert: BigInteger => BigInteger,
    mulTo: (BigInteger, BigInteger, BigInteger) => Unit,
    reduce: BigInteger => Unit,
    revert: BigInteger => BigInteger,
    sqrTo: (BigInteger, BigInteger) => Unit
  ): Reduction = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), mulTo = js.Any.fromFunction3(mulTo), reduce = js.Any.fromFunction1(reduce), revert = js.Any.fromFunction1(revert), sqrTo = js.Any.fromFunction2(sqrTo))
    __obj.asInstanceOf[Reduction]
  }
  
  @scala.inline
  implicit class ReductionOps[Self <: Reduction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConvert(value: BigInteger => BigInteger): Self = this.set("convert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMulTo(value: (BigInteger, BigInteger, BigInteger) => Unit): Self = this.set("mulTo", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReduce(value: BigInteger => Unit): Self = this.set("reduce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRevert(value: BigInteger => BigInteger): Self = this.set("revert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSqrTo(value: (BigInteger, BigInteger) => Unit): Self = this.set("sqrTo", js.Any.fromFunction2(value))
  }
}
