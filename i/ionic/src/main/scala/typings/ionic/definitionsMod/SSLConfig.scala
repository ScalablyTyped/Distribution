package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSLConfig extends js.Object {
  var cafile: js.UndefOr[String | js.Array[String]] = js.undefined
  var certfile: js.UndefOr[String | js.Array[String]] = js.undefined
  var keyfile: js.UndefOr[String | js.Array[String]] = js.undefined
}

object SSLConfig {
  @scala.inline
  def apply(
    cafile: String | js.Array[String] = null,
    certfile: String | js.Array[String] = null,
    keyfile: String | js.Array[String] = null
  ): SSLConfig = {
    val __obj = js.Dynamic.literal()
    if (cafile != null) __obj.updateDynamic("cafile")(cafile.asInstanceOf[js.Any])
    if (certfile != null) __obj.updateDynamic("certfile")(certfile.asInstanceOf[js.Any])
    if (keyfile != null) __obj.updateDynamic("keyfile")(keyfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSLConfig]
  }
}

