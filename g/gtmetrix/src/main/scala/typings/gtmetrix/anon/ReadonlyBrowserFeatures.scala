package typings.gtmetrix.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<gtmetrix.gtmetrix.BrowserFeatures> */
@js.native
trait ReadonlyBrowserFeatures extends js.Object {
  val browser: String = js.native
  val device: js.UndefOr[String] = js.native
  val features: StringDictionary[Boolean] = js.native
  val id: Double = js.native
  val name: String = js.native
  val platform: String = js.native
}

object ReadonlyBrowserFeatures {
  @scala.inline
  def apply(browser: String, features: StringDictionary[Boolean], id: Double, name: String, platform: String): ReadonlyBrowserFeatures = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyBrowserFeatures]
  }
  @scala.inline
  implicit class ReadonlyBrowserFeaturesOps[Self <: ReadonlyBrowserFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatures(value: StringDictionary[Boolean]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
  }
  
}

