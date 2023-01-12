package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhenOptions extends StObject {
  
  /**
    * whether to stop applying further conditions if the condition is true.
    */
  var break: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the required condition joi type.
    */
  var is: js.UndefOr[SchemaLike] = js.undefined
  
  /**
    * the negative version of `is` (`then` and `otherwise` have reverse
    * roles).
    */
  var not: js.UndefOr[SchemaLike] = js.undefined
  
  /**
    * the alternative schema type if the condition is false. Required if then or switch are missing.
    */
  var otherwise: js.UndefOr[SchemaLike] = js.undefined
  
  /**
    * the list of cases. Required if then is missing.  Required if then or otherwise are missing.
    */
  var switch: js.UndefOr[js.Array[SwitchCases | SwitchDefault]] = js.undefined
  
  /**
    * the alternative schema type if the condition is true. Required if otherwise or switch are missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.undefined
}
object WhenOptions {
  
  inline def apply(): WhenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhenOptions] (val x: Self) extends AnyVal {
    
    inline def setBreak(value: Boolean): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
    
    inline def setBreakUndefined: Self = StObject.set(x, "break", js.undefined)
    
    inline def setIs(value: SchemaLike): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsNull: Self = StObject.set(x, "is", null)
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setNot(value: SchemaLike): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotNull: Self = StObject.set(x, "not", null)
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setOtherwise(value: SchemaLike): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    inline def setOtherwiseNull: Self = StObject.set(x, "otherwise", null)
    
    inline def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    inline def setSwitch(value: js.Array[SwitchCases | SwitchDefault]): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    inline def setSwitchUndefined: Self = StObject.set(x, "switch", js.undefined)
    
    inline def setSwitchVarargs(value: (SwitchCases | SwitchDefault)*): Self = StObject.set(x, "switch", js.Array(value*))
    
    inline def setThen(value: SchemaLike): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenNull: Self = StObject.set(x, "then", null)
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
