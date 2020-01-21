package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a domain.
  */
@js.native
trait SchemaDomain extends js.Object {
  /**
    * An opaque string used to identify this domain.
    */
  var legacyId: js.UndefOr[String] = js.native
  /**
    * The name of the domain, e.g. &quot;google.com&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaDomain {
  @scala.inline
  def apply(legacyId: String = null, name: String = null): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    if (legacyId != null) __obj.updateDynamic("legacyId")(legacyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomain]
  }
}

