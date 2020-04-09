package typings.jupyterlabExtensionmanager.listingsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListEntry extends js.Object {
  var creation_date: js.UndefOr[String] = js.undefined
  var last_update_date: js.UndefOr[String] = js.undefined
  /**
    * The name of the extension.
    */
  var name: String
  var reason: js.UndefOr[String] = js.undefined
  var regexp: js.UndefOr[RegExp] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IListEntry {
  @scala.inline
  def apply(
    name: String,
    creation_date: String = null,
    last_update_date: String = null,
    reason: String = null,
    regexp: RegExp = null,
    `type`: String = null
  ): IListEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (creation_date != null) __obj.updateDynamic("creation_date")(creation_date.asInstanceOf[js.Any])
    if (last_update_date != null) __obj.updateDynamic("last_update_date")(last_update_date.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListEntry]
  }
}

