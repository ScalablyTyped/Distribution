package typings.gtmetrix.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<gtmetrix.gtmetrix.BrowserFeatures> */
trait ReadonlyBrowserFeatures extends js.Object {
  val browser: String
  val device: js.UndefOr[String] = js.undefined
  val features: StringDictionary[Boolean]
  val id: Double
  val name: String
  val platform: String
}

object ReadonlyBrowserFeatures {
  @scala.inline
  def apply(
    browser: String,
    features: StringDictionary[Boolean],
    id: Double,
    name: String,
    platform: String,
    device: String = null
  ): ReadonlyBrowserFeatures = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyBrowserFeatures]
  }
}

