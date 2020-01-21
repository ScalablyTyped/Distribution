package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A setting for Glass.
  */
@js.native
trait SchemaSetting extends js.Object {
  /**
    * The setting&#39;s ID. The following IDs are valid:   - locale - The key
    * to the user’s language/locale (BCP 47 identifier) that Glassware should
    * use to render localized content.   - timezone - The key to the user’s
    * current time zone region as defined in the tz database. Example:
    * America/Los_Angeles.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of resource. This is always mirror#setting.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The setting value, as a string.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaSetting {
  @scala.inline
  def apply(id: String = null, kind: String = null, value: String = null): SchemaSetting = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetting]
  }
}

