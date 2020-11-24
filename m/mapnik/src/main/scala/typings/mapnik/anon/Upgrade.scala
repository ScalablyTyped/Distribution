package typings.mapnik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upgrade extends js.Object {
  
  var upgrade: js.UndefOr[Boolean] = js.native
  
  var validate: js.UndefOr[Boolean] = js.native
}
object Upgrade {
  
  @scala.inline
  def apply(): Upgrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upgrade]
  }
  
  @scala.inline
  implicit class UpgradeOps[Self <: Upgrade] (val x: Self) extends AnyVal {
    
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
    def setUpgrade(value: Boolean): Self = this.set("upgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgrade: Self = this.set("upgrade", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
