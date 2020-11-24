package typings.hexo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model[T] extends js.Object {
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def count(): Double = js.native
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def filter(fn: js.Function2[/* v */ T, /* i */ Double, Boolean]): Model[T] = js.native
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def forEach(fn: js.Function2[/* v */ T, /* i */ Double, Unit]): Unit = js.native
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def map[U](fn: js.Function2[/* v */ T, /* i */ Double, U]): js.Array[U] = js.native
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def toArray(): js.Array[T] = js.native
}
object Model {
  
  @scala.inline
  def apply[T](
    count: () => Double,
    filter: js.Function2[/* v */ T, /* i */ Double, Boolean] => Model[T],
    forEach: js.Function2[/* v */ T, /* i */ Double, Unit] => Unit,
    map: js.Function2[/* v */ T, /* i */ Double, js.Any] => js.Array[js.Any],
    toArray: () => js.Array[T]
  ): Model[T] = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), map = js.Any.fromFunction1(map), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Model[T]]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model[_], T] (val x: Self with Model[T]) extends AnyVal {
    
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
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilter(value: js.Function2[/* v */ T, /* i */ Double, Boolean] => Model[T]): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* v */ T, /* i */ Double, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: js.Function2[/* v */ T, /* i */ Double, js.Any] => js.Array[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
}
