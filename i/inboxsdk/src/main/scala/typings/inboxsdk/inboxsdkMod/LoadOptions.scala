package typings.inboxsdk.inboxsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// // Undocummented
// var IMPL_VERSION: string;
// var LOADER_VERSION: string;
// var destroyed: boolean; //: false
// var Logger: {
//   error: () => any;
//   event: () => any;
// };
trait LoadOptions extends js.Object {
  var appIconUrl: js.UndefOr[String] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  var suppressAddonTitle: js.UndefOr[String] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(appIconUrl: String = null, appName: String = null, suppressAddonTitle: String = null): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (appIconUrl != null) __obj.updateDynamic("appIconUrl")(appIconUrl)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (suppressAddonTitle != null) __obj.updateDynamic("suppressAddonTitle")(suppressAddonTitle)
    __obj.asInstanceOf[LoadOptions]
  }
}

