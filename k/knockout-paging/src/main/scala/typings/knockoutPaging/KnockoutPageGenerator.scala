package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutPageGenerator extends StObject {
  
  def generate[T](pagedObservable: KnockoutPagedObservableArray[T]): js.Array[Double]
}
object KnockoutPageGenerator {
  
  inline def apply(generate: KnockoutPagedObservableArray[Any] => js.Array[Double]): KnockoutPageGenerator = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[KnockoutPageGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutPageGenerator] (val x: Self) extends AnyVal {
    
    inline def setGenerate(value: KnockoutPagedObservableArray[Any] => js.Array[Double]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
  }
}
