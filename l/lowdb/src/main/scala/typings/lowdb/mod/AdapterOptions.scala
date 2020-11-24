package typings.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterOptions[SchemaT] extends js.Object {
  
  var defaultValue: js.UndefOr[SchemaT] = js.native
  
  var deserialize: js.UndefOr[js.Function1[/* serializedData */ String, SchemaT]] = js.native
  
  var serialize: js.UndefOr[js.Function1[/* data */ SchemaT, String]] = js.native
}
object AdapterOptions {
  
  @scala.inline
  def apply[SchemaT](): AdapterOptions[SchemaT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdapterOptions[SchemaT]]
  }
  
  @scala.inline
  implicit class AdapterOptionsOps[Self <: AdapterOptions[_], SchemaT] (val x: Self with AdapterOptions[SchemaT]) extends AnyVal {
    
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
    def setDefaultValue(value: SchemaT): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDeserialize(value: /* serializedData */ String => SchemaT): Self = this.set("deserialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeserialize: Self = this.set("deserialize", js.undefined)
    
    @scala.inline
    def setSerialize(value: /* data */ SchemaT => String): Self = this.set("serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
  }
}
