package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAndroidreleaseAndroidversion extends js.Object {
  var android_release: String
  var android_version: Double
  var manufacturer: String
  var model: String
}

object AnonAndroidreleaseAndroidversion {
  @scala.inline
  def apply(android_release: String, android_version: Double, manufacturer: String, model: String): AnonAndroidreleaseAndroidversion = {
    val __obj = js.Dynamic.literal(android_release = android_release.asInstanceOf[js.Any], android_version = android_version.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAndroidreleaseAndroidversion]
  }
}

