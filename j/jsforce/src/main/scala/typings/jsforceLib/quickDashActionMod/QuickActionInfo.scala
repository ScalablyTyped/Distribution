package typings
package jsforceLib.quickDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickActionInfo extends js.Object {
  /** Label of the action */
  var label: java.lang.String
  /** Name of the action */
  var name: java.lang.String
  /** Type of the action (e.g. Create, Update, Post, LogACall) */
  var `type`: java.lang.String
  /** Endpoint URL information of the action */
  var urls: js.Object
}

object QuickActionInfo {
  @scala.inline
  def apply(label: java.lang.String, name: java.lang.String, `type`: java.lang.String, urls: js.Object): QuickActionInfo = {
    val __obj = js.Dynamic.literal(label = label, name = name, urls = urls)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QuickActionInfo]
  }
}

