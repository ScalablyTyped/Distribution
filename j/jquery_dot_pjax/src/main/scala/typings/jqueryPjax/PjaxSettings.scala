package typings.jqueryPjax

import typings.jquery.JQuery.AjaxSettings
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PjaxSettings
  extends AjaxSettings[js.Any] {
  /**
    * A jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * If it is not defined, the `data-pjax` attribute of the link will be treated as container.
    * If such an attribute is not defined too, the context will be treated as container.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * CSS selector for the fragment to extract from ajax response.
    */
  var fragment: js.UndefOr[String] = js.native
  /**
    * How many requests to cache. Defaults to 20.
    */
  var maxCacheLength: js.UndefOr[Double] = js.native
  /**
    * Whether to pushState the URL. Defaults to true.
    */
  var push: js.UndefOr[Boolean] = js.native
  /**
    * Whether to replaceState the URL. Defaults to false.
    */
  var replace: js.UndefOr[Boolean] = js.native
  /**
    * Vertical position to scroll to after navigation.
    * To avoid changing scroll position, pass false.
    */
  var scrollTo: js.UndefOr[Double | Boolean] = js.native
  /**
    * Eventually the relatedTarget value for pjax events.
    */
  var target: js.UndefOr[EventTarget] = js.native
  /**
    * A string or function returning the current pjax version
    */
  var version: js.UndefOr[String | js.Function0[String]] = js.native
}

object PjaxSettings {
  @scala.inline
  def apply(): PjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PjaxSettings]
  }
  @scala.inline
  implicit class PjaxSettingsOps[Self <: PjaxSettings] (val x: Self) extends AnyVal {
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    @scala.inline
    def setMaxCacheLength(value: Double): Self = this.set("maxCacheLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCacheLength: Self = this.set("maxCacheLength", js.undefined)
    @scala.inline
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setScrollTo(value: Double | Boolean): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    @scala.inline
    def setTarget(value: EventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setVersionFunction0(value: () => String): Self = this.set("version", js.Any.fromFunction0(value))
    @scala.inline
    def setVersion(value: String | js.Function0[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

