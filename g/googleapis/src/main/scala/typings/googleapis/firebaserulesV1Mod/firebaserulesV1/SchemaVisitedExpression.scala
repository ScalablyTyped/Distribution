package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Store the position and access outcome for an expression visited in rules.
  */
@js.native
trait SchemaVisitedExpression extends js.Object {
  
  /**
    * Position in the `Source` or `Ruleset` where an expression was visited.
    */
  var sourcePosition: js.UndefOr[SchemaSourcePosition] = js.native
  
  /**
    * The evaluated value for the visited expression, e.g. true/false
    */
  var value: js.UndefOr[js.Any] = js.native
}
object SchemaVisitedExpression {
  
  @scala.inline
  def apply(): SchemaVisitedExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVisitedExpression]
  }
  
  @scala.inline
  implicit class SchemaVisitedExpressionOps[Self <: SchemaVisitedExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourcePosition(value: SchemaSourcePosition): Self = this.set("sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePosition: Self = this.set("sourcePosition", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
