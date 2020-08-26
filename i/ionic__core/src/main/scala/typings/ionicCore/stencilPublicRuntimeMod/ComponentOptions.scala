package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions extends js.Object {
  /**
    * @deprecated Use `assetsDirs` instead
    */
  var assetsDir: js.UndefOr[String] = js.native
  /**
    * Array of relative links to folders of assets required by the component.
    */
  var assetsDirs: js.UndefOr[js.Array[String]] = js.native
  /**
    * If `true`, the component will use scoped stylesheets. Similar to shadow-dom,
    * but without native isolation. Defaults to `false`.
    */
  var scoped: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the component will use native shadow-dom encapsulation, it will fallback to
    * `scoped` if the browser does not support shadow-dom natively. Defaults to `false`.
    * Additionally, `shadow` can also be given options when attaching the shadow root.
    */
  var shadow: js.UndefOr[Boolean | ShadowRootOptions] = js.native
  /**
    * Relative URL to some external stylesheet file. It should be a `.css` file unless some
    * external plugin is installed like `@stencil/sass`.
    */
  var styleUrl: js.UndefOr[String] = js.native
  /**
    * Similar as `styleUrl` but allows to specify different stylesheets for different modes.
    */
  var styleUrls: js.UndefOr[js.Array[String] | ModeStyles] = js.native
  /**
    * String that contains inlined CSS instead of using an external stylesheet.
    * The performance characteristics of this feature are the same as using an external stylesheet.
    *
    * Notice, you can't use sass, or less, only `css` is allowed using `styles`, use `styleUrl` is you need more advanced features.
    */
  var styles: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  /**
    * Tag name of the web component. Ideally, the tag name must be globally unique,
    * so it's recommended to choose an unique prefix for all your components within the same collection.
    *
    * In addition, tag name must contain a '-'
    */
  var tag: String = js.native
}

object ComponentOptions {
  @scala.inline
  def apply(tag: String): ComponentOptions = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self <: ComponentOptions] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetsDir(value: String): Self = this.set("assetsDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetsDir: Self = this.set("assetsDir", js.undefined)
    @scala.inline
    def setAssetsDirsVarargs(value: String*): Self = this.set("assetsDirs", js.Array(value :_*))
    @scala.inline
    def setAssetsDirs(value: js.Array[String]): Self = this.set("assetsDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetsDirs: Self = this.set("assetsDirs", js.undefined)
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoped: Self = this.set("scoped", js.undefined)
    @scala.inline
    def setShadow(value: Boolean | ShadowRootOptions): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setStyleUrl(value: String): Self = this.set("styleUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleUrl: Self = this.set("styleUrl", js.undefined)
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = this.set("styleUrls", js.Array(value :_*))
    @scala.inline
    def setStyleUrls(value: js.Array[String] | ModeStyles): Self = this.set("styleUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleUrls: Self = this.set("styleUrls", js.undefined)
    @scala.inline
    def setStyles(value: String | StringDictionary[js.Any]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

