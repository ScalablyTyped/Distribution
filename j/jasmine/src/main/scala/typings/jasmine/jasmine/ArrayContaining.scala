package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayContaining[T]
  extends AsymmetricMatcher[js.Any] {
  
  var `new`: js.UndefOr[js.Function1[/* sample */ ArrayLike[T], ArrayLike[T]]] = js.native
}
object ArrayContaining {
  
  @scala.inline
  def apply[T](asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => Boolean): ArrayContaining[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch))
    __obj.asInstanceOf[ArrayContaining[T]]
  }
  
  @scala.inline
  implicit class ArrayContainingOps[Self <: ArrayContaining[_], T] (val x: Self with ArrayContaining[T]) extends AnyVal {
    
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
    def setNew(value: /* sample */ ArrayLike[T] => ArrayLike[T]): Self = this.set("new", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNew: Self = this.set("new", js.undefined)
  }
}
