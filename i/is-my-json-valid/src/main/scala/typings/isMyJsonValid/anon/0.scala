package typings.isMyJsonValid.anon

import typings.isMyJsonValid.mod.AnySchema
import typings.isMyJsonValid.mod.ObjectSchema
import typings.isMyJsonValid.mod.StringKeys
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */] extends js.Object {
  
  var oneOf: js.Tuple3[
    ObjectSchema[Properties1, Required1], 
    ObjectSchema[Properties2, Required2], 
    ObjectSchema[Properties3, Required3]
  ] = js.native
}
object `0` {
  
  @scala.inline
  def apply[Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */](
    oneOf: js.Tuple3[
      ObjectSchema[Properties1, Required1], 
      ObjectSchema[Properties2, Required2], 
      ObjectSchema[Properties3, Required3]
    ]
  ): `0`[Properties1, Required1, Properties2, Required2, Properties3, Required3] = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[Properties1, Required1, Properties2, Required2, Properties3, Required3]]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_, _, _, _, _, _], Properties1 /* <: Record[String, AnySchema] */, Required1 /* <: StringKeys[Properties1] */, Properties2 /* <: Record[String, AnySchema] */, Required2 /* <: StringKeys[Properties2] */, Properties3 /* <: Record[String, AnySchema] */, Required3 /* <: StringKeys[Properties3] */] (val x: Self with (`0`[Properties1, Required1, Properties2, Required2, Properties3, Required3])) extends AnyVal {
    
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
    def setOneOf(
      value: js.Tuple3[
          ObjectSchema[Properties1, Required1], 
          ObjectSchema[Properties2, Required2], 
          ObjectSchema[Properties3, Required3]
        ]
    ): Self = this.set("oneOf", value.asInstanceOf[js.Any])
  }
}
