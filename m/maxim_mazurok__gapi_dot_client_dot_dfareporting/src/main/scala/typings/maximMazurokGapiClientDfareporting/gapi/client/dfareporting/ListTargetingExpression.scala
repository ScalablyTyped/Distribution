package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetingExpression extends StObject {
  
  /** Expression describing which lists are being targeted by the ad. */
  var expression: js.UndefOr[String] = js.undefined
}
object ListTargetingExpression {
  
  @scala.inline
  def apply(): ListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetingExpression]
  }
  
  @scala.inline
  implicit class ListTargetingExpressionMutableBuilder[Self <: ListTargetingExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
