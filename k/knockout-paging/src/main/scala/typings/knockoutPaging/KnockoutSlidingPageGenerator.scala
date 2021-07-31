package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutSlidingPageGenerator
  extends StObject
     with KnockoutPageGenerator {
  
  def windowSize(): Double
  def windowSize(value: Double): Unit
  @JSName("windowSize")
  var windowSize_Original: KnockoutObservable[Double]
}
object KnockoutSlidingPageGenerator {
  
  @scala.inline
  def apply(
    generate: KnockoutPagedObservableArray[js.Any] => js.Array[Double],
    windowSize: KnockoutObservable[Double]
  ): KnockoutSlidingPageGenerator = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), windowSize = windowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSlidingPageGenerator]
  }
  
  @scala.inline
  implicit class KnockoutSlidingPageGeneratorMutableBuilder[Self <: KnockoutSlidingPageGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowSize(value: KnockoutObservable[Double]): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
  }
}
