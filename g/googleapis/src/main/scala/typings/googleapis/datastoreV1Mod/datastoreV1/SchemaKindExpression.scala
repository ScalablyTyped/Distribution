package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a kind.
  */
@js.native
trait SchemaKindExpression extends js.Object {
  
  /**
    * The name of the kind.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaKindExpression {
  
  @scala.inline
  def apply(): SchemaKindExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKindExpression]
  }
  
  @scala.inline
  implicit class SchemaKindExpressionOps[Self <: SchemaKindExpression] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
