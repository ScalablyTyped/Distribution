package typings.isMyJsonValid.anon

import typings.isMyJsonValid.mod.AnySchema
import typings.isMyJsonValid.mod.ObjectSchema
import typings.isMyJsonValid.mod.StringKeys
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneOf[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */] extends js.Object {
  
  var oneOf: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]] = js.native
}
object OneOf {
  
  @scala.inline
  def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */](oneOf: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]]): OneOf[Properties1, Required1, Properties2, Required2] = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOf[Properties1, Required1, Properties2, Required2]]
  }
  
  @scala.inline
  implicit class OneOfOps[Self <: OneOf[_, _, _, _], Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */] (val x: Self with (OneOf[Properties1, Required1, Properties2, Required2])) extends AnyVal {
    
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
    def setOneOf(value: js.Tuple2[ObjectSchema[Properties1, Required1], ObjectSchema[Properties2, Required2]]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
  }
}
