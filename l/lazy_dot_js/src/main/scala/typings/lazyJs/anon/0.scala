package typings.lazyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[T] extends js.Object {
  
  var `0`: js.Any = js.native
  
  var `1`: T = js.native
}
object `0` {
  
  @scala.inline
  def apply[T](`0`: js.Any, `1`: T): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[T]]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], T] (val x: Self with `0`[T]) extends AnyVal {
    
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
    def set0(value: js.Any): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1(value: T): Self = this.set("1", value.asInstanceOf[js.Any])
  }
}
