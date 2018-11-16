package typings
package ibmDashMobilefirstLib.WLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoggerOptions extends js.Object {
  var autoSendLogs: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @deprecated since version 6.2. use filters instead.
           */
  var blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var callback: js.UndefOr[LoggerCallback] = js.undefined
  var capture: js.UndefOr[scala.Boolean] = js.undefined
  var filters: js.UndefOr[Filter] = js.undefined
  var level: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Double] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var pkg: js.UndefOr[java.lang.String] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var stacktrace: js.UndefOr[scala.Boolean] = js.undefined
  var stringify: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[Tag] = js.undefined
  /**
           * @deprecated since version 6.2. use filters instead.
           */
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

