package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cms extends js.Object {
  
  var cms: String = js.native
}
object Cms {
  
  @scala.inline
  def apply(cms: String): Cms = {
    val __obj = js.Dynamic.literal(cms = cms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cms]
  }
  
  @scala.inline
  implicit class CmsOps[Self <: Cms] (val x: Self) extends AnyVal {
    
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
    def setCms(value: String): Self = this.set("cms", value.asInstanceOf[js.Any])
  }
}
