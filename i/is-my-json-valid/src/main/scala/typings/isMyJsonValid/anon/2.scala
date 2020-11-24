package typings.isMyJsonValid.anon

import typings.isMyJsonValid.mod.AnySchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */] extends js.Object {
  
  var oneOf: js.Tuple2[Schema1, Schema2] = js.native
}
object `2` {
  
  @scala.inline
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */](oneOf: js.Tuple2[Schema1, Schema2]): `2`[Schema1, Schema2] = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`[Schema1, Schema2]]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`[_, _], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */] (val x: Self with (`2`[Schema1, Schema2])) extends AnyVal {
    
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
    def setOneOf(value: js.Tuple2[Schema1, Schema2]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
  }
}
