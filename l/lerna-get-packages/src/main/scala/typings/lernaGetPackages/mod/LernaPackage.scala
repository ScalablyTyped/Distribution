package typings.lernaGetPackages.mod

import typings.lernaGetPackages.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LernaPackage extends js.Object {
  @JSName("package")
  var _package: Config = js.native
  var location: String = js.native
}

object LernaPackage {
  @scala.inline
  def apply(_package: Config, location: String): LernaPackage = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[LernaPackage]
  }
  @scala.inline
  implicit class LernaPackageOps[Self <: LernaPackage] (val x: Self) extends AnyVal {
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
    def set_package(value: Config): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
  }
  
}

