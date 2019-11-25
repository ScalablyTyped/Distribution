package typings.jsforce.quickDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickActionInfo extends js.Object {
  /** Label of the action */
  var label: String
  /** Name of the action */
  var name: String
  /** Type of the action (e.g. Create, Update, Post, LogACall) */
  var `type`: String
  /** Endpoint URL information of the action */
  var urls: js.Object
}

object QuickActionInfo {
  @scala.inline
  def apply(label: String, name: String, `type`: String, urls: js.Object): QuickActionInfo = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickActionInfo]
  }
}

