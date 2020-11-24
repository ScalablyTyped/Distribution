package typings.isMyJsonValid.anon

import typings.isMyJsonValid.mod.AnySchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3`[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */] extends js.Object {
  
  var oneOf: js.Tuple3[Schema1, Schema2, Schema3] = js.native
}
object `3` {
  
  @scala.inline
  def apply[Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */](oneOf: js.Tuple3[Schema1, Schema2, Schema3]): `3`[Schema1, Schema2, Schema3] = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[Schema1, Schema2, Schema3]]
  }
  
  @scala.inline
  implicit class `3Ops`[Self <: `3`[_, _, _], Schema1 /* <: AnySchema */, Schema2 /* <: AnySchema */, Schema3 /* <: AnySchema */] (val x: Self with (`3`[Schema1, Schema2, Schema3])) extends AnyVal {
    
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
    def setOneOf(value: js.Tuple3[Schema1, Schema2, Schema3]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
  }
}
