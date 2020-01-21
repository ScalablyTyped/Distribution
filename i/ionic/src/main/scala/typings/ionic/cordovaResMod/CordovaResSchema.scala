package typings.ionic.cordovaResMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaResSchema extends js.Object {
  var platform: js.UndefOr[String] = js.undefined
}

object CordovaResSchema {
  @scala.inline
  def apply(platform: String = null): CordovaResSchema = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaResSchema]
  }
}

