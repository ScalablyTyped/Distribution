package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Guest OS features.
  */
@js.native
trait SchemaGuestOsFeature extends js.Object {
  /**
    * The ID of a supported feature. Read  Enabling guest operating system
    * features to see a list of available options.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGuestOsFeature {
  @scala.inline
  def apply(`type`: String = null): SchemaGuestOsFeature = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGuestOsFeature]
  }
}

