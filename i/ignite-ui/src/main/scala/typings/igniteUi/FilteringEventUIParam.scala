package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteringEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to array which contains expressions supported by [$.ig.DataSource](ig.datasource).
    */
  var expression: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object FilteringEventUIParam {
  
  @scala.inline
  def apply(): FilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringEventUIParam]
  }
  
  @scala.inline
  implicit class FilteringEventUIParamMutableBuilder[Self <: FilteringEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
