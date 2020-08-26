package typings.licenseCheckerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dependency extends js.Object {
  var licenseName: String = js.native
  var licenseText: String = js.native
  var name: String = js.native
  var repository: String = js.native
  var version: String = js.native
}

object Dependency {
  @scala.inline
  def apply(licenseName: String, licenseText: String, name: String, repository: String, version: String): Dependency = {
    val __obj = js.Dynamic.literal(licenseName = licenseName.asInstanceOf[js.Any], licenseText = licenseText.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
  @scala.inline
  implicit class DependencyOps[Self <: Dependency] (val x: Self) extends AnyVal {
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
    def setLicenseName(value: String): Self = this.set("licenseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicenseText(value: String): Self = this.set("licenseText", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

