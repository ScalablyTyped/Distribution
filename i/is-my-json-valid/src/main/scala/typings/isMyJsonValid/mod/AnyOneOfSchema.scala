package typings.isMyJsonValid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyOneOfSchema extends _AnySchema {
  
  var oneOf: js.Array[AnySchema] = js.native
}
object AnyOneOfSchema {
  
  @scala.inline
  def apply(oneOf: js.Array[AnySchema]): AnyOneOfSchema = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOneOfSchema]
  }
  
  @scala.inline
  implicit class AnyOneOfSchemaOps[Self <: AnyOneOfSchema] (val x: Self) extends AnyVal {
    
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
    def setOneOfVarargs(value: AnySchema*): Self = this.set("oneOf", js.Array(value :_*))
    
    @scala.inline
    def setOneOf(value: js.Array[AnySchema]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
  }
}
