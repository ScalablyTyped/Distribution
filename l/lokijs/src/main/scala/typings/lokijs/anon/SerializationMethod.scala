package typings.lokijs.anon

import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializationMethod extends js.Object {
  
  var serializationMethod: js.UndefOr[normal | pretty] = js.native
}
object SerializationMethod {
  
  @scala.inline
  def apply(): SerializationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializationMethod]
  }
  
  @scala.inline
  implicit class SerializationMethodOps[Self <: SerializationMethod] (val x: Self) extends AnyVal {
    
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
    def setSerializationMethod(value: normal | pretty): Self = this.set("serializationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializationMethod: Self = this.set("serializationMethod", js.undefined)
  }
}
