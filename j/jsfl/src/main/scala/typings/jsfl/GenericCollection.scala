package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericCollection[T] extends StObject {
  
  def each(
    callback: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ]
  ): Any
  
  var elements: js.Array[T]
  
  def randomize(info: Any): GenericCollection[T]
  
  def rename(pattern: String): GenericCollection[T]
  
  def select(): GenericCollection[T]
  
  def toGrid(x: Double, y: Double): GenericCollection[T]
  
  def update(): GenericCollection[T]
}
object GenericCollection {
  
  inline def apply[T](
    each: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ] => Any,
    elements: js.Array[T],
    randomize: Any => GenericCollection[T],
    rename: String => GenericCollection[T],
    select: () => GenericCollection[T],
    toGrid: (Double, Double) => GenericCollection[T],
    update: () => GenericCollection[T]
  ): GenericCollection[T] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), elements = elements.asInstanceOf[js.Any], randomize = js.Any.fromFunction1(randomize), rename = js.Any.fromFunction1(rename), select = js.Any.fromFunction0(select), toGrid = js.Any.fromFunction2(toGrid), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[GenericCollection[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericCollection[?], T] (val x: Self & GenericCollection[T]) extends AnyVal {
    
    inline def setEach(
      value: js.Function3[
          /* element */ T, 
          /* index */ js.UndefOr[Double], 
          /* elements */ js.UndefOr[js.Array[T]], 
          Unit
        ] => Any
    ): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
    
    inline def setElements(value: js.Array[T]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: T*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setRandomize(value: Any => GenericCollection[T]): Self = StObject.set(x, "randomize", js.Any.fromFunction1(value))
    
    inline def setRename(value: String => GenericCollection[T]): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
    
    inline def setSelect(value: () => GenericCollection[T]): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    
    inline def setToGrid(value: (Double, Double) => GenericCollection[T]): Self = StObject.set(x, "toGrid", js.Any.fromFunction2(value))
    
    inline def setUpdate(value: () => GenericCollection[T]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
