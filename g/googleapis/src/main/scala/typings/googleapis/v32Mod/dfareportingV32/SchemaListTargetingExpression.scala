package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remarketing List Targeting Expression.
  */
@js.native
trait SchemaListTargetingExpression extends StObject {
  
  /**
    * Expression describing which lists are being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.native
}
object SchemaListTargetingExpression {
  
  @scala.inline
  def apply(): SchemaListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTargetingExpression]
  }
  
  @scala.inline
  implicit class SchemaListTargetingExpressionMutableBuilder[Self <: SchemaListTargetingExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
