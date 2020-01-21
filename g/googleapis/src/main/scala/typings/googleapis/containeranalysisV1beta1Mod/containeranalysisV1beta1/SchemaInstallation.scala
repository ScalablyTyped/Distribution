package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

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
    * Required. All of the places within the filesystem versions of this
    * package have been found.
    */
  var location: js.UndefOr[js.Array[SchemaLocation]] = js.native
  /**
    * Output only. The name of the installed package.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaInstallation {
  @scala.inline
  def apply(location: js.Array[SchemaLocation] = null, name: String = null): SchemaInstallation = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstallation]
  }
}

