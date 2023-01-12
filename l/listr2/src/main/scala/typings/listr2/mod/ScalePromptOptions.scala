package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalePromptOptions
  extends StObject
     with ArrayPromptOptions {
  
  var margin: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  
  var scale: js.Array[StringPromptOptions]
}
object ScalePromptOptions {
  
  inline def apply(
    choices: js.Array[BasePromptOptionsWithName | String],
    message: String | (js.Function0[js.Promise[String] | String]),
    scale: js.Array[StringPromptOptions]
  ): ScalePromptOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalePromptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalePromptOptions] (val x: Self) extends AnyVal {
    
    inline def setMargin(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setScale(value: js.Array[StringPromptOptions]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleVarargs(value: StringPromptOptions*): Self = StObject.set(x, "scale", js.Array(value*))
  }
}
