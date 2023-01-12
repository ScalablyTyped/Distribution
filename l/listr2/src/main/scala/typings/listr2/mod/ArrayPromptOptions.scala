package typings.listr2.mod

import typings.listr2.listr2Strings.left
import typings.listr2.listr2Strings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayPromptOptions
  extends StObject
     with BasePromptOptions {
  
  var align: js.UndefOr[left | right] = js.undefined
  
  var choices: js.Array[BasePromptOptionsWithName | String]
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var edgeLength: js.UndefOr[Double] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  @JSName("initial")
  var initial_ArrayPromptOptions: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var linebreak: js.UndefOr[Boolean] = js.undefined
  
  var maxChoices: js.UndefOr[Double] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var scroll: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
}
object ArrayPromptOptions {
  
  inline def apply(
    choices: js.Array[BasePromptOptionsWithName | String],
    message: String | (js.Function0[js.Promise[String] | String])
  ): ArrayPromptOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPromptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayPromptOptions] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChoices(value: js.Array[BasePromptOptionsWithName | String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesVarargs(value: (BasePromptOptionsWithName | String)*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEdgeLength(value: Double): Self = StObject.set(x, "edgeLength", value.asInstanceOf[js.Any])
    
    inline def setEdgeLengthUndefined: Self = StObject.set(x, "edgeLength", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setInitial(value: Double | js.Array[Double]): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInitialVarargs(value: Double*): Self = StObject.set(x, "initial", js.Array(value*))
    
    inline def setLinebreak(value: Boolean): Self = StObject.set(x, "linebreak", value.asInstanceOf[js.Any])
    
    inline def setLinebreakUndefined: Self = StObject.set(x, "linebreak", js.undefined)
    
    inline def setMaxChoices(value: Double): Self = StObject.set(x, "maxChoices", value.asInstanceOf[js.Any])
    
    inline def setMaxChoicesUndefined: Self = StObject.set(x, "maxChoices", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
