package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicLevel extends StObject {
  
  /**
    * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the
    * `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
    */
  var combiningFunction: js.UndefOr[String] = js.native
  
  /** Required. A list of requirements for the `AccessLevel` to be granted. */
  var conditions: js.UndefOr[js.Array[Condition]] = js.native
}
object BasicLevel {
  
  @scala.inline
  def apply(): BasicLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicLevel]
  }
  
  @scala.inline
  implicit class BasicLevelMutableBuilder[Self <: BasicLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombiningFunction(value: String): Self = StObject.set(x, "combiningFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombiningFunctionUndefined: Self = StObject.set(x, "combiningFunction", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
  }
}
