package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSLConfig extends js.Object {
  var cafile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var certfile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var keyfile: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object SSLConfig {
  @scala.inline
  def apply(
    cafile: java.lang.String | js.Array[java.lang.String] = null,
    certfile: java.lang.String | js.Array[java.lang.String] = null,
    keyfile: java.lang.String | js.Array[java.lang.String] = null
  ): SSLConfig = {
    val __obj = js.Dynamic.literal()
    if (cafile != null) __obj.updateDynamic("cafile")(cafile.asInstanceOf[js.Any])
    if (certfile != null) __obj.updateDynamic("certfile")(certfile.asInstanceOf[js.Any])
    if (keyfile != null) __obj.updateDynamic("keyfile")(keyfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSLConfig]
  }
}

