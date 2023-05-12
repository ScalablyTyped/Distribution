package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerFieldFn[Args /* <: js.Array[Any] */] extends StObject {
  
  /**
    * Args to pass to other functions whenever this field is triggered.
    */
  var args: js.UndefOr[Args] = js.undefined
  
  /**
    * Condition to display the given field.
    */
  var condition: js.UndefOr[(js.Function1[/* args */ Args, Boolean]) | Boolean] = js.undefined
  
  /**
    * The value of the given field.
    */
  var field: (js.Function1[/* args */ Args, String]) | String
  
  /**
    * Formatting/coloring of the field.
    */
  var format: js.UndefOr[js.Function1[/* args */ Args, LoggerFormat]] = js.undefined
}
object LoggerFieldFn {
  
  inline def apply[Args /* <: js.Array[Any] */](field: (js.Function1[/* args */ Args, String]) | String): LoggerFieldFn[Args] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerFieldFn[Args]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggerFieldFn[?], Args /* <: js.Array[Any] */] (val x: Self & LoggerFieldFn[Args]) extends AnyVal {
    
    inline def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setCondition(value: (js.Function1[/* args */ Args, Boolean]) | Boolean): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionFunction1(value: /* args */ Args => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setField(value: (js.Function1[/* args */ Args, String]) | String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldFunction1(value: /* args */ Args => String): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
    
    inline def setFormat(value: /* args */ Args => LoggerFormat): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
