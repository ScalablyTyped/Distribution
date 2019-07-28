package typings.atHapiCrumb.atHapiCrumbMod.atHapiHapiMod

import typings.atHapiCrumb.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSpecificConfiguration extends js.Object {
  var crumb: js.UndefOr[Boolean | Anon_Key] = js.undefined
}

object PluginSpecificConfiguration {
  @scala.inline
  def apply(crumb: Boolean | Anon_Key = null): PluginSpecificConfiguration = {
    val __obj = js.Dynamic.literal()
    if (crumb != null) __obj.updateDynamic("crumb")(crumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSpecificConfiguration]
  }
}

