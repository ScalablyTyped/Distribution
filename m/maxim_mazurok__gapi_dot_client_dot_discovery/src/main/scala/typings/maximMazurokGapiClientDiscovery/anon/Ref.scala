package typings.maximMazurokGapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends js.Object {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  var type_value: js.UndefOr[String] = js.native
}
object Ref {
  
  @scala.inline
  def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefOps[Self <: Ref] (val x: Self) extends AnyVal {
    
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
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    
    @scala.inline
    def setType_value(value: String): Self = this.set("type_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType_value: Self = this.set("type_value", js.undefined)
  }
}
