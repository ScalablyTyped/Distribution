package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents how a particular software package may be installed on a
  * system.
  */
@js.native
trait SchemaInstallation extends js.Object {
  /**
    * All of the places within the filesystem versions of this package have
    * been found.
    */
  var location: js.UndefOr[js.Array[SchemaLocation]] = js.native
  /**
    * Output only. The name of the installed package.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaInstallation {
  @scala.inline
  def apply(): SchemaInstallation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallation]
  }
  @scala.inline
  implicit class SchemaInstallationOps[Self <: SchemaInstallation] (val x: Self) extends AnyVal {
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
    def setLocationVarargs(value: SchemaLocation*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: js.Array[SchemaLocation]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

