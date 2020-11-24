package typings.isMyJsonValid.anon

import typings.isMyJsonValid.mod.AnySchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */] extends js.Object {
  
  var oneOf: js.Tuple4[Schema1, Schema2, Schema3, Schema4] = js.native
}
object `4` {
  
  @scala.inline
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */](oneOf: js.Tuple4[Schema1, Schema2, Schema3, Schema4]): `4`[Schema1, Schema2, Schema3, Schema4] = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`[Schema1, Schema2, Schema3, Schema4]]
  }
  
  @scala.inline
  implicit class `4Ops`[Self <: `4`[_, _, _, _], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */, Schema4 /* <: AnySchema */] (val x: Self with (`4`[Schema1, Schema2, Schema3, Schema4])) extends AnyVal {
    
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
    def setOneOf(value: js.Tuple4[Schema1, Schema2, Schema3, Schema4]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
  }
}
