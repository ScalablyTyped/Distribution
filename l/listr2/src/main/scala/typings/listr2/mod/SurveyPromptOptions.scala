package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurveyPromptOptions
  extends StObject
     with ArrayPromptOptions {
  
  var margin: js.Tuple4[Double, Double, Double, Double]
  
  var scale: js.Array[BasePromptOptionsWithName]
}
object SurveyPromptOptions {
  
  inline def apply(
    choices: js.Array[BasePromptOptionsWithName | String],
    margin: js.Tuple4[Double, Double, Double, Double],
    message: String | (js.Function0[js.Promise[String] | String]),
    scale: js.Array[BasePromptOptionsWithName]
  ): SurveyPromptOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveyPromptOptions]
  }
  
  extension [Self <: SurveyPromptOptions](x: Self) {
    
    inline def setMargin(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setScale(value: js.Array[BasePromptOptionsWithName]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleVarargs(value: BasePromptOptionsWithName*): Self = StObject.set(x, "scale", js.Array(value*))
  }
}
