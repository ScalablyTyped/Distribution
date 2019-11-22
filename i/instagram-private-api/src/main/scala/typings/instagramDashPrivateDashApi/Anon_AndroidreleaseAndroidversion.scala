package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidreleaseAndroidversion extends js.Object {
  var android_release: String
  var android_version: Double
  var manufacturer: String
  var model: String
}

object Anon_AndroidreleaseAndroidversion {
  @scala.inline
  def apply(android_release: String, android_version: Double, manufacturer: String, model: String): Anon_AndroidreleaseAndroidversion = {
    val __obj = js.Dynamic.literal(android_release = android_release, android_version = android_version, manufacturer = manufacturer, model = model)
  
    __obj.asInstanceOf[Anon_AndroidreleaseAndroidversion]
  }
}

