package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression_ extends StObject {
  
  def eachChild(fn: js.Function1[/* a */ this.type, Unit]): Unit
  
  def evaluate(ctx: EvaluationContext): Any
  
  /**
  	 * Statically analyze the expression, attempting to enumerate possible outputs. Returns
  	 * false if the complete set of outputs is statically undecidable, otherwise true.
  	 */
  def outputDefined(): Boolean
  
  val `type`: Type
}
object Expression_ {
  
  inline def apply(
    eachChild: js.Function1[Expression_, Unit] => Unit,
    evaluate: EvaluationContext => Any,
    outputDefined: () => Boolean,
    `type`: Type
  ): Expression_ = {
    val __obj = js.Dynamic.literal(eachChild = js.Any.fromFunction1(eachChild), evaluate = js.Any.fromFunction1(evaluate), outputDefined = js.Any.fromFunction0(outputDefined))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expression_] (val x: Self) extends AnyVal {
    
    inline def setEachChild(value: js.Function1[Expression_, Unit] => Unit): Self = StObject.set(x, "eachChild", js.Any.fromFunction1(value))
    
    inline def setEvaluate(value: EvaluationContext => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setOutputDefined(value: () => Boolean): Self = StObject.set(x, "outputDefined", js.Any.fromFunction0(value))
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
