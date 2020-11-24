package typings.lazyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[ElementT, OutputT /* <: js.Array[_] */] extends js.Object {
  
  var `0`: js.Array[ElementT] = js.native
  
  var `1`: js.Any = js.native
  
  var `2`: OutputT = js.native
  
  var `3`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias lazy.js.LazyJS.Tuple<ElementT, LengthT, lazy.js.LazyJS.PushFront<OutputT, ElementT>> */ js.Object = js.native
}
object `1` {
  
  @scala.inline
  def apply[ElementT, OutputT /* <: js.Array[_] */](
    `0`: js.Array[ElementT],
    `1`: js.Any,
    `2`: OutputT,
    `3`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias lazy.js.LazyJS.Tuple<ElementT, LengthT, lazy.js.LazyJS.PushFront<OutputT, ElementT>> */ js.Object
  ): `1`[ElementT, OutputT] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[ElementT, OutputT]]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_, _], ElementT, OutputT /* <: js.Array[_] */] (val x: Self with (`1`[ElementT, OutputT])) extends AnyVal {
    
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
    def set0Varargs(value: ElementT*): Self = this.set("0", js.Array(value :_*))
    
    @scala.inline
    def set0(value: js.Array[ElementT]): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1(value: js.Any): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: OutputT): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias lazy.js.LazyJS.Tuple<ElementT, LengthT, lazy.js.LazyJS.PushFront<OutputT, ElementT>> */ js.Object
    ): Self = this.set("3", value.asInstanceOf[js.Any])
  }
}
