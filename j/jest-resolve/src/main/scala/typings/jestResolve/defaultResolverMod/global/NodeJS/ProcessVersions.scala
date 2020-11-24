package typings.jestResolve.defaultResolverMod.global.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessVersions extends js.Object {
  
  var pnp: js.UndefOr[js.Any] = js.native
}
object ProcessVersions {
  
  @scala.inline
  def apply(): ProcessVersions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessVersions]
  }
  
  @scala.inline
  implicit class ProcessVersionsOps[Self <: ProcessVersions] (val x: Self) extends AnyVal {
    
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
    def setPnp(value: js.Any): Self = this.set("pnp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePnp: Self = this.set("pnp", js.undefined)
  }
}
