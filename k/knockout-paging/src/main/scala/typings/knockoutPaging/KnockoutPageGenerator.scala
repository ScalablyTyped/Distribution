package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutPageGenerator extends StObject {
  
  def generate[T](pagedObservable: KnockoutPagedObservableArray[T]): js.Array[Double]
}
object KnockoutPageGenerator {
  
  inline def apply(generate: KnockoutPagedObservableArray[js.Any] => js.Array[Double]): KnockoutPageGenerator = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[KnockoutPageGenerator]
  }
  
  extension [Self <: KnockoutPageGenerator](x: Self) {
    
    inline def setGenerate(value: KnockoutPagedObservableArray[js.Any] => js.Array[Double]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
  }
}
