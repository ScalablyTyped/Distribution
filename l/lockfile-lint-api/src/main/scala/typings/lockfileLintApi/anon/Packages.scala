package typings.lockfileLintApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Packages extends js.Object {
  
  var packages: typings.lockfileLintApi.mod.Packages = js.native
}
object Packages {
  
  @scala.inline
  def apply(packages: typings.lockfileLintApi.mod.Packages): Packages = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packages]
  }
  
  @scala.inline
  implicit class PackagesOps[Self <: Packages] (val x: Self) extends AnyVal {
    
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
    def setPackages(value: typings.lockfileLintApi.mod.Packages): Self = this.set("packages", value.asInstanceOf[js.Any])
  }
}
