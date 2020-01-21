package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of Page that are only relevant for pages with page_type
  * MASTER.
  */
@js.native
trait SchemaMasterProperties extends js.Object {
  /**
    * The human-readable name of the master.
    */
  var displayName: js.UndefOr[String] = js.native
}

object SchemaMasterProperties {
  @scala.inline
  def apply(displayName: String = null): SchemaMasterProperties = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMasterProperties]
  }
}

