package typings.gtmetrix.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserFeatures extends js.Object {
  var browser: String
  var device: js.UndefOr[String] = js.undefined
  var features: StringDictionary[Boolean]
  var id: Double
  var name: String
  var platform: String
}

object BrowserFeatures {
  @scala.inline
  def apply(
    browser: String,
    features: StringDictionary[Boolean],
    id: Double,
    name: String,
    platform: String,
    device: String = null
  ): BrowserFeatures = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserFeatures]
  }
}

