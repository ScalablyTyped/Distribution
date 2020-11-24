package typings.ionic.projectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPackagePathOptions extends js.Object {
  
  var emulator: js.UndefOr[Boolean] = js.native
  
  var release: js.UndefOr[Boolean] = js.native
}
object GetPackagePathOptions {
  
  @scala.inline
  def apply(): GetPackagePathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackagePathOptions]
  }
  
  @scala.inline
  implicit class GetPackagePathOptionsOps[Self <: GetPackagePathOptions] (val x: Self) extends AnyVal {
    
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
    def setEmulator(value: Boolean): Self = this.set("emulator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulator: Self = this.set("emulator", js.undefined)
    
    @scala.inline
    def setRelease(value: Boolean): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
  }
}
