package typings.javascriptObfuscator.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessEnv extends js.Object {
  var BUILD_TIMESTAMP: js.UndefOr[String] = js.undefined
  var VERSION: js.UndefOr[String] = js.undefined
}

object ProcessEnv {
  @scala.inline
  def apply(BUILD_TIMESTAMP: String = null, VERSION: String = null): ProcessEnv = {
    val __obj = js.Dynamic.literal()
    if (BUILD_TIMESTAMP != null) __obj.updateDynamic("BUILD_TIMESTAMP")(BUILD_TIMESTAMP.asInstanceOf[js.Any])
    if (VERSION != null) __obj.updateDynamic("VERSION")(VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEnv]
  }
}

