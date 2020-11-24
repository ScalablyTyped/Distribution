package typings.hapiDecorators.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICacheConfig extends js.Object {
  
  var expiresAt: js.UndefOr[Double] = js.native
  
  var expiresIn: js.UndefOr[Double] = js.native
  
  var privacy: js.UndefOr[String] = js.native
}
object ICacheConfig {
  
  @scala.inline
  def apply(): ICacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICacheConfig]
  }
  
  @scala.inline
  implicit class ICacheConfigOps[Self <: ICacheConfig] (val x: Self) extends AnyVal {
    
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
    def setExpiresAt(value: Double): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresAt: Self = this.set("expiresAt", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setPrivacy(value: String): Self = this.set("privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacy: Self = this.set("privacy", js.undefined)
  }
}
