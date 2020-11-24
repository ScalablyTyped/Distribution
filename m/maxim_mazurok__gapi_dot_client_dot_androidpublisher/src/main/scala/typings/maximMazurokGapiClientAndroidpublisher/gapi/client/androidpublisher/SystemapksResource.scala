package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemapksResource extends js.Object {
  
  var variants: VariantsResource = js.native
}
object SystemapksResource {
  
  @scala.inline
  def apply(variants: VariantsResource): SystemapksResource = {
    val __obj = js.Dynamic.literal(variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemapksResource]
  }
  
  @scala.inline
  implicit class SystemapksResourceOps[Self <: SystemapksResource] (val x: Self) extends AnyVal {
    
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
    def setVariants(value: VariantsResource): Self = this.set("variants", value.asInstanceOf[js.Any])
  }
}
