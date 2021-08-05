package typings.jquery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
  */
trait JQueryEasingFunctions
  extends StObject
     with /* name */ StringDictionary[JQueryEasingFunction] {
  
  def linear(percent: Double): Double
  @JSName("linear")
  var linear_Original: JQueryEasingFunction
  
  def swing(percent: Double): Double
  @JSName("swing")
  var swing_Original: JQueryEasingFunction
}
object JQueryEasingFunctions {
  
  inline def apply(linear: /* percent */ Double => Double, swing: /* percent */ Double => Double): JQueryEasingFunctions = {
    val __obj = js.Dynamic.literal(linear = js.Any.fromFunction1(linear), swing = js.Any.fromFunction1(swing))
    __obj.asInstanceOf[JQueryEasingFunctions]
  }
  
  extension [Self <: JQueryEasingFunctions](x: Self) {
    
    inline def setLinear(value: /* percent */ Double => Double): Self = StObject.set(x, "linear", js.Any.fromFunction1(value))
    
    inline def setSwing(value: /* percent */ Double => Double): Self = StObject.set(x, "swing", js.Any.fromFunction1(value))
  }
}
