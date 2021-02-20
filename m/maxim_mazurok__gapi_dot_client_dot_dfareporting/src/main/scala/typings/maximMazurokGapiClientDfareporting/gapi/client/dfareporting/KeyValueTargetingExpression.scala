package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueTargetingExpression extends StObject {
  
  /** Keyword expression being targeted by the ad. */
  var expression: js.UndefOr[String] = js.native
}
object KeyValueTargetingExpression {
  
  @scala.inline
  def apply(): KeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValueTargetingExpression]
  }
  
  @scala.inline
  implicit class KeyValueTargetingExpressionMutableBuilder[Self <: KeyValueTargetingExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
