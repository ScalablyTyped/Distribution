package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhenOptions extends StObject {
  
  /**
    * whether to stop applying further conditions if the condition is true.
    */
  var break: js.UndefOr[Boolean] = js.native
  
  /**
    * the required condition joi type.
    */
  var is: js.UndefOr[SchemaLike] = js.native
  
  /**
    * the negative version of `is` (`then` and `otherwise` have reverse
    * roles).
    */
  var not: js.UndefOr[SchemaLike] = js.native
  
  /**
    * the alternative schema type if the condition is false. Required if then or switch are missing.
    */
  var otherwise: js.UndefOr[SchemaLike] = js.native
  
  /**
    * the list of cases. Required if then is missing.  Required if then or otherwise are missing.
    */
  var switch: js.UndefOr[js.Array[SwitchCases | SwitchDefault]] = js.native
  
  /**
    * the alternative schema type if the condition is true. Required if otherwise or switch are missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.native
}
object WhenOptions {
  
  @scala.inline
  def apply(): WhenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenOptions]
  }
  
  @scala.inline
  implicit class WhenOptionsMutableBuilder[Self <: WhenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreak(value: Boolean): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakUndefined: Self = StObject.set(x, "break", js.undefined)
    
    @scala.inline
    def setIs(value: SchemaLike): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNull: Self = StObject.set(x, "is", null)
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setNot(value: SchemaLike): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotNull: Self = StObject.set(x, "not", null)
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setOtherwise(value: SchemaLike): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherwiseNull: Self = StObject.set(x, "otherwise", null)
    
    @scala.inline
    def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    @scala.inline
    def setSwitch(value: js.Array[SwitchCases | SwitchDefault]): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchUndefined: Self = StObject.set(x, "switch", js.undefined)
    
    @scala.inline
    def setSwitchVarargs(value: (SwitchCases | SwitchDefault)*): Self = StObject.set(x, "switch", js.Array(value :_*))
    
    @scala.inline
    def setThen(value: SchemaLike): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThenNull: Self = StObject.set(x, "then", null)
    
    @scala.inline
    def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
