package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAndroidrelease extends js.Object {
  var android_release: String
  var android_version: String
  var manufacturer: String
  var model: String
}

object AnonAndroidrelease {
  @scala.inline
  def apply(android_release: String, android_version: String, manufacturer: String, model: String): AnonAndroidrelease = {
    val __obj = js.Dynamic.literal(android_release = android_release.asInstanceOf[js.Any], android_version = android_version.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndroidrelease]
  }
}

