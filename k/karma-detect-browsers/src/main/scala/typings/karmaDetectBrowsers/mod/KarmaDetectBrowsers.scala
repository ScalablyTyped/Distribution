package typings.karmaDetectBrowsers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KarmaDetectBrowsers extends js.Object {
  /** enable/disable, default is true */
  var enabled: js.UndefOr[Boolean] = js.native
  /** use headless mode, for browsers that support it, default is false */
  var preferHeadless: js.UndefOr[Boolean] = js.native
  /** enable/disable phantomjs support, default is true */
  var usePhantomJS: js.UndefOr[Boolean] = js.native
  /**
    * post processing of browsers list
    * here you can edit the list of browsers used by karma
    */
  def postDetection(availableBrowsers: js.Array[String]): js.Array[String] = js.native
}

object KarmaDetectBrowsers {
  @scala.inline
  def apply(postDetection: js.Array[String] => js.Array[String]): KarmaDetectBrowsers = {
    val __obj = js.Dynamic.literal(postDetection = js.Any.fromFunction1(postDetection))
    __obj.asInstanceOf[KarmaDetectBrowsers]
  }
  @scala.inline
  implicit class KarmaDetectBrowsersOps[Self <: KarmaDetectBrowsers] (val x: Self) extends AnyVal {
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
    def setPostDetection(value: js.Array[String] => js.Array[String]): Self = this.set("postDetection", js.Any.fromFunction1(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPreferHeadless(value: Boolean): Self = this.set("preferHeadless", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferHeadless: Self = this.set("preferHeadless", js.undefined)
    @scala.inline
    def setUsePhantomJS(value: Boolean): Self = this.set("usePhantomJS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePhantomJS: Self = this.set("usePhantomJS", js.undefined)
  }
  
}

