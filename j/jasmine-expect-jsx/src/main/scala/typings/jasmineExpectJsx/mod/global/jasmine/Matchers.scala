package typings.jasmineExpectJsx.mod.global.jasmine

import typings.jasmine.jasmine.Expected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers[T] extends js.Object {
  
  def toEqualJSX(element: Expected[T]): Boolean = js.native
  
  def toIncludeJSX(element: Expected[T]): Boolean = js.native
}
object Matchers {
  
  @scala.inline
  def apply[T](toEqualJSX: Expected[T] => Boolean, toIncludeJSX: Expected[T] => Boolean): Matchers[T] = {
    val __obj = js.Dynamic.literal(toEqualJSX = js.Any.fromFunction1(toEqualJSX), toIncludeJSX = js.Any.fromFunction1(toIncludeJSX))
    __obj.asInstanceOf[Matchers[T]]
  }
  
  @scala.inline
  implicit class MatchersOps[Self <: Matchers[_], T] (val x: Self with Matchers[T]) extends AnyVal {
    
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
    def setToEqualJSX(value: Expected[T] => Boolean): Self = this.set("toEqualJSX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToIncludeJSX(value: Expected[T] => Boolean): Self = this.set("toIncludeJSX", js.Any.fromFunction1(value))
  }
}
