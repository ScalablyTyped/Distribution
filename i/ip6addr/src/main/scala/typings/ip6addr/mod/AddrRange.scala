package typings.ip6addr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddrRange extends js.Object {
  
  def contains(input: String): Boolean = js.native
  
  def first(): Addr = js.native
  
  def last(): Addr = js.native
}
object AddrRange {
  
  @scala.inline
  def apply(contains: String => Boolean, first: () => Addr, last: () => Addr): AddrRange = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last))
    __obj.asInstanceOf[AddrRange]
  }
  
  @scala.inline
  implicit class AddrRangeOps[Self <: AddrRange] (val x: Self) extends AnyVal {
    
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
    def setContains(value: String => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: () => Addr): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLast(value: () => Addr): Self = this.set("last", js.Any.fromFunction0(value))
  }
}
