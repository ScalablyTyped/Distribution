package typings.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model[T] extends StObject {
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def count(): Double
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def filter(fn: js.Function2[/* v */ T, /* i */ Double, Boolean]): Model[T]
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def forEach(fn: js.Function2[/* v */ T, /* i */ Double, Unit]): Unit
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def map[U](fn: js.Function2[/* v */ T, /* i */ Double, U]): js.Array[U]
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def toArray(): js.Array[T]
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
  implicit class ModelMutableBuilder[Self <: Model[?], T] (val x: Self & Model[T]) extends AnyVal {
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilter(value: js.Function2[/* v */ T, /* i */ Double, Boolean] => Model[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* v */ T, /* i */ Double, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: js.Function2[/* v */ T, /* i */ Double, js.Any] => js.Array[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
